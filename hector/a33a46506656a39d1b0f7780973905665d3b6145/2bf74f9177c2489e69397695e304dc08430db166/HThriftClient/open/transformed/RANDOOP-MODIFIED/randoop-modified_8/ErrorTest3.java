import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1501");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0.0.0.1", (int) (short) 10);
        java.lang.String str3 = cassandraHost2.getUrl();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1502");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 1);
        cassandraHost2.setLifo(true);
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray11, true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient18 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters17);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient18.equals(null)", !hThriftClient18.equals(null));
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1503");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!(hi!):194", (int) (short) 98);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1504");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):1");
        cassandraHost1.setMaxWaitTimeWhenExhausted(430L);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1505");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):10", (int) (byte) 10);
        boolean boolean3 = cassandraHost2.isPerformNameResolution();
        cassandraHost2.setUseSocketKeepalive(false);
        cassandraHost2.setUseSocketKeepalive(false);
        cassandraHost2.setCassandraThriftSocketTimeout((int) (byte) -2);
        int int10 = cassandraHost2.getPort();
        cassandraHost2.setMaxWaitTimeWhenExhausted(0L);
        int int13 = cassandraHost2.getPort();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient14 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient14.equals(null)", !hThriftClient14.equals(null));
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1506");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("hi!(hi!):296");
        cassandraHost1.setLifo(false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1507");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160:9160", 1);
        cassandraHost2.setMaxActive(414);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1508");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>:1", 99);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("10", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):100", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>:97", strArray15, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient30 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters29);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient30.equals(null)", !hThriftClient30.equals(null));
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1509");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("6", (-2));
        cassandraHost2.setMaxActive((int) (short) 296);
        cassandraHost2.setCassandraThriftSocketTimeout((int) (byte) -116);
        java.lang.String str7 = cassandraHost2.toString();
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray20, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray20, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray20, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("6:10", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0", strArray20);
        tSSLTransportParameters32.setKeyStore("hi!(hi!)(hi!(hi!)):9160", "CassandraClient<%s-%d>(CassandraClient<%s-%d>)");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient36 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters32);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient36.equals(null)", !hThriftClient36.equals(null));
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1510");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 194);
        cassandraHost2.setCassandraThriftSocketTimeout((int) (short) 500);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1511");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):10", (int) (byte) 100);
        cassandraHost2.setMaxWaitTimeWhenExhausted(12L);
        int int5 = cassandraHost2.getCassandraThriftSocketTimeout();
        java.lang.String str6 = cassandraHost2.getName();
        int int7 = cassandraHost2.getCassandraThriftSocketTimeout();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1512");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))", (int) (byte) -1);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1513");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)", (-1));
        boolean boolean4 = cassandraHost2.equals((java.lang.Object) (-3.0d));
        java.lang.String[] strArray11 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray11);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient17 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters16);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient17.equals(null)", !hThriftClient17.equals(null));
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1514");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 194);
        boolean boolean3 = cassandraHost2.getUseSocketKeepalive();
        boolean boolean4 = cassandraHost2.getUseSocketKeepalive();
        int int5 = cassandraHost2.getPort();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1515");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("33", (int) (byte) 36);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("515", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1:52", strArray15, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient31 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters30);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient31.equals(null)", !hThriftClient31.equals(null));
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1516");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) '#');
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1517");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 48);
        cassandraHost2.setMaxWaitTimeWhenExhausted(509L);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters5 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters();
        tSSLTransportParameters5.setKeyStore("(127.0.0.1):10", "(127.0.0.1)", "(127.0.0.1):10", "hi!");
        tSSLTransportParameters5.requireClientAuth(true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient13 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters5);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient13.equals(null)", !hThriftClient13.equals(null));
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1518");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)", (int) (byte) 100);
        java.lang.String str3 = cassandraHost2.getName();
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("416", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):0", strArray11);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient18 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters17);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient18.equals(null)", !hThriftClient18.equals(null));
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1519");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!:0", (int) (short) 206);
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):1", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0(0.0.0.0)", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":1", strArray13);
        tSSLTransportParameters23.setKeyStore("412", ":97", "hi!(hi!):10", "127.0.0.1(127.0.0.1):9160");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient29 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters23);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient29.equals(null)", !hThriftClient29.equals(null));
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1520");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0.0.0.0", (int) (byte) 1);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1521");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) 'a');
        boolean boolean3 = cassandraHost2.getLifo();
        int int4 = cassandraHost2.getPort();
        cassandraHost2.setUseSocketKeepalive(true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1522");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("204");
        cassandraHost1.setCassandraThriftSocketTimeout((int) (short) 206);
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray13);
        tSSLTransportParameters21.setTrustStore("416", "CassandraClient<%s-%d>(CassandraClient<%s-%d>):100", "hi!(hi!):9160", ":9160");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient27 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters21);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient27.equals(null)", !hThriftClient27.equals(null));
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1523");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):100", 0);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1524");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>");
        cassandraHost1.setUseThriftFramedTransport(false);
        java.lang.String str4 = cassandraHost1.getName();
        cassandraHost1.setLifo(false);
        int int7 = cassandraHost1.getPort();
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray20, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray20, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160:9160", strArray20, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("207", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):97", strArray20, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("194(0.0.0.194):84", strArray20);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient34 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters33);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient34.equals(null)", !hThriftClient34.equals(null));
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1525");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160(:9160)", (int) (byte) 85);
        cassandraHost2.setMaxActive((int) (short) 53);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):1", strArray18, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:10", strArray18, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0(0.0.0.0):9160", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("-2", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>:97", strArray18, true);
        tSSLTransportParameters34.setTrustStore("348", "(127.0.0.1):295");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient38 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters34);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient38.equals(null)", !hThriftClient38.equals(null));
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1526");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):0", (int) (byte) 33);
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray11);
        tSSLTransportParameters19.setKeyStore("0(0.0.0.0)", "(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1))):32");
        tSSLTransportParameters19.requireClientAuth(true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient25 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters19);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient25.equals(null)", !hThriftClient25.equals(null));
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1527");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) 'a');
        long long3 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        int int4 = cassandraHost2.getPort();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("1", (int) (short) -1);
        boolean boolean8 = cassandraHost2.equals((java.lang.Object) cassandraHost7);
        java.lang.String str9 = cassandraHost2.toString();
        cassandraHost2.setUseSocketKeepalive(false);
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray23, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray23, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray23);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray23, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray23, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray23);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):100", strArray23, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0(0.0.0.0):-1", strArray23, true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient38 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters37);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient38.equals(null)", !hThriftClient38.equals(null));
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1528");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("hi!");
        boolean boolean2 = cassandraHost1.isPerformNameResolution();
        cassandraHost1.setLifo(false);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>)", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!(hi!):10", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("10(0.0.0.10):-1", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("416", strArray14);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient23 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters22);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient23.equals(null)", !hThriftClient23.equals(null));
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1529");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):10", (int) (byte) 10);
        long long3 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1530");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):10", (int) (byte) 10);
        cassandraHost2.setMaxActive(100);
        int int5 = cassandraHost2.getPort();
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):32", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient28 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters27);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient28.equals(null)", !hThriftClient28.equals(null));
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1531");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("0(0.0.0.0):9160");
        java.lang.String str2 = cassandraHost1.getUrl();
        boolean boolean4 = cassandraHost1.equals((java.lang.Object) 192.0f);
        cassandraHost1.setLifo(false);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17, true);
        tSSLTransportParameters29.requireClientAuth(true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient32 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters29);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient32.equals(null)", !hThriftClient32.equals(null));
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1532");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 1);
        int int3 = cassandraHost2.getPort();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) 'a');
        boolean boolean7 = cassandraHost6.getLifo();
        java.lang.String str8 = cassandraHost6.toString();
        java.lang.String str9 = cassandraHost6.getIp();
        boolean boolean10 = cassandraHost2.equals((java.lang.Object) str9);
        java.lang.String str11 = cassandraHost2.getIp();
        java.lang.String str12 = cassandraHost2.getName();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient13 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient13.equals(null)", !hThriftClient13.equals(null));
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1533");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("");
        java.lang.String str2 = cassandraHost1.getUrl();
        boolean boolean3 = cassandraHost1.getUseSocketKeepalive();
        int int4 = cassandraHost1.getPort();
        boolean boolean5 = cassandraHost1.getUseSocketKeepalive();
        int int6 = cassandraHost1.getMaxActive();
        java.lang.String str7 = cassandraHost1.getHost();
        long long8 = cassandraHost1.getMaxWaitTimeWhenExhausted();
        cassandraHost1.setMaxWaitTimeWhenExhausted(720L);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient11.equals(null)", !hThriftClient11.equals(null));
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1534");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("193");
        java.lang.String[] strArray10 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray10);
        tSSLTransportParameters17.setKeyStore("hi!:35", "(127.0.0.1):9160");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient21 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters17);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient21.equals(null)", !hThriftClient21.equals(null));
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1535");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1");
        cassandraHost1.setUseThriftFramedTransport(false);
        cassandraHost1.setUseSocketKeepalive(true);
        java.lang.String str6 = cassandraHost1.getName();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1536");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!:10", (int) (short) 0);
        int int3 = cassandraHost2.getMaxActive();
        boolean boolean4 = cassandraHost2.getLifo();
        int int5 = cassandraHost2.getMaxActive();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0(0.0.0.0):-1", strArray18);
        tSSLTransportParameters33.requireClientAuth(false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient36 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters33);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient36.equals(null)", !hThriftClient36.equals(null));
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1537");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("1:52", (int) (short) 48);
        int int3 = cassandraHost2.getPort();
        int int4 = cassandraHost2.getPort();
        boolean boolean5 = cassandraHost2.isPerformNameResolution();
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, true);
        tSSLTransportParameters19.setKeyStore("(127.0.0.1)((127.0.0.1)):32", "0", ":9160(:9160):52", "1");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient25 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters19);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient25.equals(null)", !hThriftClient25.equals(null));
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1538");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):10");
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("416", strArray9, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient17 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters16);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient17.equals(null)", !hThriftClient17.equals(null));
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1539");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>:1", (int) (byte) 33);
        java.lang.String str3 = cassandraHost2.getUrl();
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>:1", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):97", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):100", strArray12, true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient22 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters21);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient22.equals(null)", !hThriftClient22.equals(null));
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1540");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):32", 406);
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0:9160", strArray11);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient18 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters17);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient18.equals(null)", !hThriftClient18.equals(null));
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1541");
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
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient15 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient15.equals(null)", !hThriftClient15.equals(null));
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1542");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160:9160", (int) ' ');
        java.lang.String str3 = cassandraHost2.getHost();
        long long4 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        java.lang.String[] strArray14 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:10", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("602", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("10(0.0.0.10)(10(0.0.0.10)):406", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("6", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray14, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient28 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters27);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient28.equals(null)", !hThriftClient28.equals(null));
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1543");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("1:52", (int) (byte) 6);
        boolean boolean3 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String str4 = cassandraHost2.toString();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1544");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        int int3 = cassandraHost2.getPort();
        cassandraHost2.setUseSocketKeepalive(true);
        java.lang.String str6 = cassandraHost2.getName();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1545");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):32", (int) (byte) 53);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1546");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0", (int) (short) -1);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1547");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("");
        java.lang.String str2 = cassandraHost1.getUrl();
        boolean boolean3 = cassandraHost1.getLifo();
        long long4 = cassandraHost1.getMaxWaitTimeWhenExhausted();
        java.lang.String str5 = cassandraHost1.getName();
        java.lang.String[] strArray11 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray11);
        tSSLTransportParameters15.setTrustStore("1", ":9160:9160", "CassandraClient<%s-%d>", "(127.0.0.1):10");
        tSSLTransportParameters15.setTrustStore("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", "hi!:10", "127.0.0.1", "");
        tSSLTransportParameters15.setTrustStore("207(0.0.0.207):16", "348");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient29 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters15);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient29.equals(null)", !hThriftClient29.equals(null));
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1548");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!(hi!):9160", 101);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1))):32", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16, true);
        tSSLTransportParameters33.setKeyStore("CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):52", "(127.0.0.1)((127.0.0.1)):9160");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient37 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters33);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient37.equals(null)", !hThriftClient37.equals(null));
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1549");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("1:52", (int) (short) 48);
        cassandraHost2.setMaxActive(0);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1:52", strArray16, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient31 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters30);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient31.equals(null)", !hThriftClient31.equals(null));
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1550");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 1);
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) (short) 100);
        cassandraHost2.setCassandraThriftSocketTimeout((int) '#');
        boolean boolean7 = cassandraHost2.getUseSocketKeepalive();
        java.lang.String str8 = cassandraHost2.getName();
        java.lang.String[] strArray22 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray22, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray22);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray22, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray22, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray22);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray22, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray22, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray22, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0(0.0.0.0):-1", strArray22);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters38 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("196", strArray22);
        tSSLTransportParameters38.setKeyStore(":1(:1):9160", "195");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient42 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters38);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient42.equals(null)", !hThriftClient42.equals(null));
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1551");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97");
        java.lang.String str2 = cassandraHost1.getUrl();
        cassandraHost1.setUseSocketKeepalive(false);
        java.lang.String str5 = cassandraHost1.getUrl();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("10", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):100", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>:97", strArray18, false);
        boolean boolean33 = cassandraHost1.equals((java.lang.Object) tSSLTransportParameters32);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient34 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient34.equals(null)", !hThriftClient34.equals(null));
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1552");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):32");
        int int2 = cassandraHost1.getCassandraThriftSocketTimeout();
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0(0.0.0.0):-1", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient34 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters33);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient34.equals(null)", !hThriftClient34.equals(null));
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1553");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):1", (int) (short) -98);
        boolean boolean3 = cassandraHost2.isPerformNameResolution();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1554");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) 'a');
        boolean boolean3 = cassandraHost2.getLifo();
        java.lang.String str4 = cassandraHost2.toString();
        cassandraHost2.setUseThriftFramedTransport(true);
        cassandraHost2.setUseThriftFramedTransport(false);
        int int9 = cassandraHost2.getMaxActive();
        java.lang.String str10 = cassandraHost2.getIp();
        cassandraHost2.setUseSocketKeepalive(true);
        java.lang.String[] strArray27 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray27, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray27, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray27);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray27, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray27);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray27, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters39 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray27, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters41 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0", strArray27, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters43 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray27, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters45 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray27, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters46 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0(0.0.0.0):-1", strArray27);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient47 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters46);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient47.equals(null)", !hThriftClient47.equals(null));
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1555");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("hi!");
        cassandraHost1.setMaxActive(206);
        boolean boolean4 = cassandraHost1.getUseSocketKeepalive();
        java.lang.String str5 = cassandraHost1.getHost();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1556");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (-2));
        long long3 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        cassandraHost2.setUseSocketKeepalive(false);
        boolean boolean6 = cassandraHost2.getLifo();
        cassandraHost2.setUseSocketKeepalive(true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1557");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):-1", (int) (short) 515);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1558");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("");
        java.lang.String str2 = cassandraHost1.getUrl();
        boolean boolean3 = cassandraHost1.getLifo();
        int int4 = cassandraHost1.getMaxActive();
        java.lang.String str5 = cassandraHost1.toString();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray17, false);
        tSSLTransportParameters31.setKeyStore("1", "", "0.0.0.1", "194");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient37 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters31);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient37.equals(null)", !hThriftClient37.equals(null));
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1559");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("hi!");
        cassandraHost1.setMaxActive(10);
        boolean boolean4 = cassandraHost1.getUseSocketKeepalive();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) 'a');
        boolean boolean8 = cassandraHost7.getLifo();
        java.lang.String str9 = cassandraHost7.toString();
        cassandraHost7.setUseThriftFramedTransport(true);
        cassandraHost7.setUseThriftFramedTransport(true);
        cassandraHost7.setCassandraThriftSocketTimeout(50);
        java.lang.String str16 = cassandraHost7.getHost();
        boolean boolean17 = cassandraHost1.equals((java.lang.Object) cassandraHost7);
        long long18 = cassandraHost7.getMaxWaitTimeWhenExhausted();
        int int19 = cassandraHost7.getMaxActive();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient20 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost7);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient20.equals(null)", !hThriftClient20.equals(null));
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1560");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        cassandraHost2.setUseSocketKeepalive(false);
        boolean boolean5 = cassandraHost2.getLifo();
        cassandraHost2.setMaxWaitTimeWhenExhausted(13L);
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray20, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray20, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray20, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("11", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("-4(-4):0", strArray20);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient33 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters32);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient33.equals(null)", !hThriftClient33.equals(null));
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1561");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):10");
        java.lang.String str2 = cassandraHost1.getHost();
        boolean boolean3 = cassandraHost1.isPerformNameResolution();
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>)", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("194(0.0.0.194):84", strArray13, false);
        boolean boolean24 = cassandraHost1.equals((java.lang.Object) "194(0.0.0.194):84");
        java.lang.String[] strArray35 = new java.lang.String[] { "(127.0.0.1):1", "(127.0.0.1):10", "(127.0.0.1)((127.0.0.1)):32", "1:52", "10" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):32", strArray35, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters39 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("6:10", strArray35, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters40 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray35);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters41 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("6:10", strArray35);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters42 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!(hi!):9160", strArray35);
        tSSLTransportParameters42.setTrustStore("CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):97", "-4");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient46 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters42);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient46.equals(null)", !hThriftClient46.equals(null));
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1562");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 1);
        cassandraHost2.setLifo(true);
        java.lang.String str5 = cassandraHost2.getIp();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, false);
        tSSLTransportParameters12.requireClientAuth(false);
        tSSLTransportParameters12.setKeyStore("9160", "6");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient18 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters12);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient18.equals(null)", !hThriftClient18.equals(null));
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1563");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):35", 84);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!(hi!)", strArray12, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient22 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters21);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient22.equals(null)", !hThriftClient22.equals(null));
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1564");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("10");
        int int2 = cassandraHost1.getCassandraThriftSocketTimeout();
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):32", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":10", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient24 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters23);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient24.equals(null)", !hThriftClient24.equals(null));
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1565");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97");
        java.lang.String str2 = cassandraHost1.getUrl();
        cassandraHost1.setUseSocketKeepalive(false);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("416", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient20 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters19);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient20.equals(null)", !hThriftClient20.equals(null));
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1566");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        cassandraHost2.setUseSocketKeepalive(false);
        java.lang.String str5 = cassandraHost2.toString();
        cassandraHost2.setCassandraThriftSocketTimeout((int) (byte) 0);
        boolean boolean8 = cassandraHost2.getUseSocketKeepalive();
        boolean boolean9 = cassandraHost2.getUseThriftFramedTransport();
        int int10 = cassandraHost2.getCassandraThriftSocketTimeout();
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray20, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray20, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray20, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray20, false);
        tSSLTransportParameters30.setTrustStore(":9160:9160", "CassandraClient<%s-%d>(CassandraClient<%s-%d>):100", "(127.0.0.1):10", ":9160:9160");
        tSSLTransportParameters30.setTrustStore("-2", "(127.0.0.1):10");
        tSSLTransportParameters30.setKeyStore(":9160(:9160):296", "97");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient42 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters30);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient42.equals(null)", !hThriftClient42.equals(null));
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1567");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        int int3 = cassandraHost2.getPort();
        cassandraHost2.setLifo(false);
        boolean boolean6 = cassandraHost2.getUseSocketKeepalive();
        java.lang.String[] strArray15 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>:1", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):97", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))", strArray15);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient24 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters23);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient24.equals(null)", !hThriftClient24.equals(null));
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1568");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("10(0.0.0.10):-1", (int) (short) 106);
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("11", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("126", strArray10, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient18 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters17);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient18.equals(null)", !hThriftClient18.equals(null));
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1569");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160", (int) ' ');
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1570");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>");
        cassandraHost1.setUseThriftFramedTransport(false);
        java.lang.String str4 = cassandraHost1.getName();
        java.lang.String str5 = cassandraHost1.toString();
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160:9160", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160(:9160):52", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):35", strArray15, false);
        tSSLTransportParameters25.setKeyStore("1(0.0.0.1):9160", "(127.0.0.1)((127.0.0.1)):10", "504", "CassandraClient<%s-%d>:2");
        tSSLTransportParameters25.setTrustStore("-69", "126", "", ":9160(:197");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient36 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters25);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient36.equals(null)", !hThriftClient36.equals(null));
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1571");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("10(0.0.0.10):-1");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = new me.prettyprint.cassandra.service.CassandraHost("", (int) '4');
        java.lang.String str5 = cassandraHost4.getUrl();
        cassandraHost4.setMaxActive((int) (byte) -55);
        boolean boolean8 = cassandraHost4.isPerformNameResolution();
        boolean boolean9 = cassandraHost1.equals((java.lang.Object) boolean8);
        int int10 = cassandraHost1.getPort();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient11.equals(null)", !hThriftClient11.equals(null));
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1572");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):1", (int) (byte) -3);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1573");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>:97", (int) (short) 60);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1574");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("10:-1", 462);
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray11, false);
        tSSLTransportParameters20.setTrustStore("", "");
        tSSLTransportParameters20.setTrustStore("416", "(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1))):32");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient27 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters20);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient27.equals(null)", !hThriftClient27.equals(null));
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1575");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):10", (int) (byte) 100);
        cassandraHost2.setMaxWaitTimeWhenExhausted(12L);
        cassandraHost2.setMaxWaitTimeWhenExhausted(100L);
        cassandraHost2.setMaxActive((int) (byte) 97);
        java.lang.String str9 = cassandraHost2.getUrl();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1576");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) '#');
        cassandraHost2.setCassandraThriftSocketTimeout(6);
        cassandraHost2.setUseSocketKeepalive(true);
        cassandraHost2.setUseSocketKeepalive(false);
        int int9 = cassandraHost2.getCassandraThriftSocketTimeout();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1577");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!(hi!)(hi!(hi!)):9160", (int) (byte) 85);
        java.lang.String str3 = cassandraHost2.getIp();
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):32", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!(hi!)(hi!(hi!)):9160", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":10(:10):9160", strArray15);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient28 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters27);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient28.equals(null)", !hThriftClient28.equals(null));
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1578");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) 'a');
        boolean boolean3 = cassandraHost2.getLifo();
        java.lang.String str4 = cassandraHost2.toString();
        java.lang.String str5 = cassandraHost2.getIp();
        cassandraHost2.setLifo(false);
        int int8 = cassandraHost2.getMaxActive();
        boolean boolean9 = cassandraHost2.getUseThriftFramedTransport();
        int int10 = cassandraHost2.getCassandraThriftSocketTimeout();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient11.equals(null)", !hThriftClient11.equals(null));
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1579");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) 'a');
        boolean boolean3 = cassandraHost2.getLifo();
        cassandraHost2.setCassandraThriftSocketTimeout(1);
        cassandraHost2.setMaxActive(406);
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) 123);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1580");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        cassandraHost2.setUseSocketKeepalive(false);
        boolean boolean5 = cassandraHost2.getLifo();
        java.lang.String[] strArray9 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        tSSLTransportParameters10.setTrustStore("hi!", "", "hi!", "hi!");
        boolean boolean16 = cassandraHost2.equals((java.lang.Object) "hi!");
        cassandraHost2.setLifo(true);
        java.lang.String str19 = cassandraHost2.toString();
        boolean boolean20 = cassandraHost2.getLifo();
        cassandraHost2.setLifo(false);
        java.lang.String[] strArray34 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray34, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray34);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters39 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray34, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters41 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray34, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters42 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray34);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters43 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("97", strArray34);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters45 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("196", strArray34, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters46 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":48", strArray34);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient47 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters46);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient47.equals(null)", !hThriftClient47.equals(null));
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1581");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("10", 207);
        cassandraHost2.setUseThriftFramedTransport(true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1582");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("207(0.0.0.207):16", 101);
        long long3 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1583");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("0");
        java.lang.String str2 = cassandraHost1.getName();
        boolean boolean3 = cassandraHost1.getUseThriftFramedTransport();
        cassandraHost1.setMaxWaitTimeWhenExhausted((-3L));
        boolean boolean6 = cassandraHost1.getUseSocketKeepalive();
        cassandraHost1.setUseThriftFramedTransport(false);
        long long9 = cassandraHost1.getMaxWaitTimeWhenExhausted();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("10", strArray18);
        tSSLTransportParameters26.setTrustStore("194", "(127.0.0.1)((127.0.0.1)):32");
        tSSLTransportParameters26.requireClientAuth(false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient32 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters26);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient32.equals(null)", !hThriftClient32.equals(null));
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1584");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) 'a');
        cassandraHost2.setUseThriftFramedTransport(false);
        boolean boolean5 = cassandraHost2.getUseThriftFramedTransport();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1585");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (byte) 10);
        boolean boolean3 = cassandraHost2.isPerformNameResolution();
        java.lang.String str4 = cassandraHost2.getHost();
        int int5 = cassandraHost2.getPort();
        java.lang.String str6 = cassandraHost2.getHost();
        boolean boolean7 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray18, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":97", strArray18, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient30 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters29);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient30.equals(null)", !hThriftClient30.equals(null));
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1586");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160:296", 206);
        java.lang.String[] strArray11 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray11);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient19 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters18);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient19.equals(null)", !hThriftClient19.equals(null));
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1587");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("602", (int) (short) 416);
        boolean boolean3 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:10", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>:1", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0.0.0.194", strArray12);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient21 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters20);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient21.equals(null)", !hThriftClient21.equals(null));
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1588");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):0", 414);
        int int3 = cassandraHost2.getCassandraThriftSocketTimeout();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1589");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!:10", (int) (short) 0);
        java.lang.String str3 = cassandraHost2.getIp();
        cassandraHost2.setCassandraThriftSocketTimeout((int) (short) 100);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:10", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0(0.0.0.0):9160", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):100", strArray17, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":0", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":10(:10):9160", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):52", strArray17, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient31 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters30);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient31.equals(null)", !hThriftClient31.equals(null));
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1590");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):9160", 369);
        java.lang.String str3 = cassandraHost2.getName();
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0", strArray15, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient29 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters28);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient29.equals(null)", !hThriftClient29.equals(null));
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1591");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1))):32");
        java.lang.String str2 = cassandraHost1.getUrl();
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("10(0.0.0.10):-1", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":1:9160", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("6(0.0.0.6):10", strArray13);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient24 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters23);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient24.equals(null)", !hThriftClient24.equals(null));
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1592");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))", (int) (byte) 36);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1593");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost(":9160");
        java.lang.String str2 = cassandraHost1.getUrl();
        cassandraHost1.setUseSocketKeepalive(false);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):35", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160(:9160)(:9160(:9160)):-1", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1(0.0.0.1):9160", strArray17);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient33 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters32);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient33.equals(null)", !hThriftClient33.equals(null));
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1594");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0.0.0.6", (int) (short) 101);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1595");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        cassandraHost2.setUseSocketKeepalive(false);
        boolean boolean5 = cassandraHost2.getUseSocketKeepalive();
        boolean boolean6 = cassandraHost2.getLifo();
        java.lang.String str7 = cassandraHost2.getUrl();
        java.lang.String str8 = cassandraHost2.toString();
        boolean boolean9 = cassandraHost2.getUseThriftFramedTransport();
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) 216);
        int int12 = cassandraHost2.getMaxActive();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient13 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient13.equals(null)", !hThriftClient13.equals(null));
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1596");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-104");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient2 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient2.equals(null)", !hThriftClient2.equals(null));
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1597");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        java.util.concurrent.atomic.AtomicLong atomicLong3 = new java.util.concurrent.atomic.AtomicLong();
        long long5 = atomicLong3.addAndGet((long) (byte) -1);
        boolean boolean6 = cassandraHost2.equals((java.lang.Object) (byte) -1);
        boolean boolean7 = cassandraHost2.getUseSocketKeepalive();
        cassandraHost2.setLifo(false);
        long long10 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient11.equals(null)", !hThriftClient11.equals(null));
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1598");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("194", 99);
        java.lang.String str3 = cassandraHost2.getHost();
        boolean boolean4 = cassandraHost2.getLifo();
        java.lang.String[] strArray9 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray9, true);
        tSSLTransportParameters12.setTrustStore("10", "CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", "", "0");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient18 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters12);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient18.equals(null)", !hThriftClient18.equals(null));
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1599");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (byte) 10);
        boolean boolean3 = cassandraHost2.isPerformNameResolution();
        java.lang.String str4 = cassandraHost2.getHost();
        int int5 = cassandraHost2.getPort();
        java.lang.String str6 = cassandraHost2.getHost();
        int int7 = cassandraHost2.getCassandraThriftSocketTimeout();
        java.util.concurrent.atomic.AtomicLong atomicLong9 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long10 = atomicLong9.getAndIncrement();
        long long11 = atomicLong9.longValue();
        int int12 = atomicLong9.intValue();
        long long14 = atomicLong9.getAndAdd(12L);
        boolean boolean15 = cassandraHost2.equals((java.lang.Object) long14);
        boolean boolean16 = cassandraHost2.getUseSocketKeepalive();
        int int17 = cassandraHost2.getCassandraThriftSocketTimeout();
        int int18 = cassandraHost2.getPort();
        java.lang.String[] strArray31 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray31, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray31, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray31);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters38 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray31, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters39 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray31);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters41 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray31, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters42 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1:52", strArray31);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters44 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray31, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters46 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))((127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))):36", strArray31, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient47 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters46);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient47.equals(null)", !hThriftClient47.equals(null));
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1600");
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
        java.lang.String[] strArray29 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray29, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray29);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray29, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray29, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray29);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters39 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray29, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters40 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("10", strArray29);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters42 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("194", strArray29, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters44 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray29, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient45 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters44);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient45.equals(null)", !hThriftClient45.equals(null));
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1601");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) '#');
        cassandraHost2.setCassandraThriftSocketTimeout(6);
        cassandraHost2.setUseSocketKeepalive(true);
        java.lang.String str7 = cassandraHost2.getHost();
        java.lang.String str8 = cassandraHost2.getIp();
        int int9 = cassandraHost2.getPort();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1602");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)", (int) ' ');
        cassandraHost2.setMaxActive((int) (short) 611);
        java.lang.String[] strArray10 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":1(:1):-60", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("54(0.0.0.54):-1", strArray10);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient16 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters15);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient16.equals(null)", !hThriftClient16.equals(null));
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1603");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("");
        java.lang.String str2 = cassandraHost1.getUrl();
        boolean boolean3 = cassandraHost1.getUseSocketKeepalive();
        int int4 = cassandraHost1.getPort();
        boolean boolean5 = cassandraHost1.getUseSocketKeepalive();
        int int6 = cassandraHost1.getCassandraThriftSocketTimeout();
        boolean boolean7 = cassandraHost1.getUseSocketKeepalive();
        boolean boolean8 = cassandraHost1.getLifo();
        java.lang.String str9 = cassandraHost1.toString();
        java.util.concurrent.atomic.AtomicLong atomicLong11 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 0);
        long long12 = atomicLong11.incrementAndGet();
        boolean boolean15 = atomicLong11.compareAndSet((long) (short) 12, (long) (byte) -1);
        boolean boolean16 = cassandraHost1.equals((java.lang.Object) (byte) -1);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient17 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient17.equals(null)", !hThriftClient17.equals(null));
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1604");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (short) 10);
        int int3 = cassandraHost2.getPort();
        boolean boolean4 = cassandraHost2.getLifo();
        int int5 = cassandraHost2.getMaxActive();
        java.lang.String str6 = cassandraHost2.getIp();
        cassandraHost2.setCassandraThriftSocketTimeout((int) ' ');
        java.lang.String str9 = cassandraHost2.getHost();
        cassandraHost2.setCassandraThriftSocketTimeout((int) '#');
        boolean boolean12 = cassandraHost2.getUseSocketKeepalive();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient13 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient13.equals(null)", !hThriftClient13.equals(null));
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1605");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):97", (int) (short) 399);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):0", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160(:9160):296", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("199", strArray14);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient28 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters27);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient28.equals(null)", !hThriftClient28.equals(null));
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1606");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("1(0.0.0.1):6");
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("97", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):5", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("812", strArray14, true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient29 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters28);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient29.equals(null)", !hThriftClient29.equals(null));
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1607");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("1:0");
        int int2 = cassandraHost1.getMaxActive();
        cassandraHost1.setUseSocketKeepalive(false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1608");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("0(0.0.0.0)");
        int int2 = cassandraHost1.getMaxActive();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1609");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", 1);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1610");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>))(CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>))):97");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient2 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient2.equals(null)", !hThriftClient2.equals(null));
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1611");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0.0.0.1", (int) (short) 2);
        boolean boolean3 = cassandraHost2.getUseThriftFramedTransport();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1612");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("1:52", (int) (byte) 6);
        boolean boolean3 = cassandraHost2.getUseThriftFramedTransport();
        int int4 = cassandraHost2.getMaxActive();
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray11, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient17 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters16);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient17.equals(null)", !hThriftClient17.equals(null));
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1613");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):-1", 242);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1614");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97");
        java.lang.String str2 = cassandraHost1.getUrl();
        boolean boolean3 = cassandraHost1.getUseSocketKeepalive();
        long long4 = cassandraHost1.getMaxWaitTimeWhenExhausted();
        cassandraHost1.setUseThriftFramedTransport(true);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        cassandraHost9.setUseSocketKeepalive(false);
        boolean boolean12 = cassandraHost9.getLifo();
        java.lang.String[] strArray16 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16);
        tSSLTransportParameters17.setTrustStore("hi!", "", "hi!", "hi!");
        boolean boolean23 = cassandraHost9.equals((java.lang.Object) "hi!");
        cassandraHost9.setLifo(true);
        boolean boolean26 = cassandraHost9.getUseThriftFramedTransport();
        java.lang.String[] strArray36 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters38 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray36, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters39 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray36);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters40 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray36);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters41 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray36);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters43 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray36, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters44 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray36);
        tSSLTransportParameters44.setTrustStore("416", "CassandraClient<%s-%d>(CassandraClient<%s-%d>):100", "hi!(hi!):9160", ":9160");
        boolean boolean50 = cassandraHost9.equals((java.lang.Object) "CassandraClient<%s-%d>(CassandraClient<%s-%d>):100");
        boolean boolean51 = cassandraHost1.equals((java.lang.Object) "CassandraClient<%s-%d>(CassandraClient<%s-%d>):100");
        java.lang.String[] strArray65 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters67 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray65, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters69 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray65, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters70 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray65);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters72 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray65, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters73 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray65);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters74 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160:9160", strArray65);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters75 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("-1", strArray65);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters76 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray65);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters78 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":1(:1):85", strArray65, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters80 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("207(0.0.0.207):16", strArray65, true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient81 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters80);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient81.equals(null)", !hThriftClient81.equals(null));
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1615");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("hi!");
        boolean boolean2 = cassandraHost1.isPerformNameResolution();
        boolean boolean3 = cassandraHost1.getLifo();
        boolean boolean4 = cassandraHost1.getUseSocketKeepalive();
        cassandraHost1.setLifo(true);
        java.lang.String str7 = cassandraHost1.getName();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1616");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("0");
        java.lang.String str2 = cassandraHost1.getName();
        boolean boolean3 = cassandraHost1.getUseThriftFramedTransport();
        cassandraHost1.setMaxWaitTimeWhenExhausted((-3L));
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray18, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("207", strArray18, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("204", strArray18, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient34 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters33);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient34.equals(null)", !hThriftClient34.equals(null));
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1617");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("-2", 9161);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1618");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("96", (int) (short) 500);
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient21 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters20);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient21.equals(null)", !hThriftClient21.equals(null));
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1619");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        cassandraHost2.setUseSocketKeepalive(false);
        boolean boolean5 = cassandraHost2.getLifo();
        java.lang.String[] strArray9 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        tSSLTransportParameters10.setTrustStore("hi!", "", "hi!", "hi!");
        boolean boolean16 = cassandraHost2.equals((java.lang.Object) "hi!");
        cassandraHost2.setLifo(true);
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) (short) 405);
        boolean boolean21 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String[] strArray32 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray32, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray32);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray32, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters39 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray32, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters41 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0", strArray32, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters42 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160(:9160)", strArray32);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters44 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("23", strArray32, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient45 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters44);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient45.equals(null)", !hThriftClient45.equals(null));
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1620");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (short) 10);
        java.lang.String str3 = cassandraHost2.getIp();
        cassandraHost2.setUseThriftFramedTransport(false);
        long long6 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        cassandraHost2.setLifo(true);
        cassandraHost2.setUseThriftFramedTransport(false);
        cassandraHost2.setMaxWaitTimeWhenExhausted(349L);
        cassandraHost2.setUseThriftFramedTransport(false);
        java.lang.String str15 = cassandraHost2.getIp();
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray23, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray23);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray23);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray23, true);
        tSSLTransportParameters29.setKeyStore("(127.0.0.1)((127.0.0.1)):32", "0", ":9160(:9160):52", "1");
        tSSLTransportParameters29.setKeyStore("(127.0.0.1):10", "(127.0.0.1)((127.0.0.1)):32", "6", "(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1))):32");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient40 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters29);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient40.equals(null)", !hThriftClient40.equals(null));
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1621");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        boolean boolean3 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String str4 = cassandraHost2.toString();
        boolean boolean5 = cassandraHost2.isPerformNameResolution();
        int int6 = cassandraHost2.getMaxActive();
        java.lang.String[] strArray16 = new java.lang.String[] { "(127.0.0.1):1", "(127.0.0.1):10", "(127.0.0.1)((127.0.0.1)):32", "1:52", "10" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):32", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0:-1", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("10", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("236", strArray16);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient23 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters22);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient23.equals(null)", !hThriftClient23.equals(null));
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1622");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0", (int) (short) -1);
        boolean boolean3 = cassandraHost2.getUseSocketKeepalive();
        int int4 = cassandraHost2.getMaxActive();
        int int5 = cassandraHost2.getPort();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1623");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1))):0", 8);
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray11);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient20 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters19);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient20.equals(null)", !hThriftClient20.equals(null));
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1624");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("");
        java.lang.String str2 = cassandraHost1.getUrl();
        boolean boolean3 = cassandraHost1.getUseSocketKeepalive();
        int int4 = cassandraHost1.getPort();
        boolean boolean5 = cassandraHost1.getUseSocketKeepalive();
        int int6 = cassandraHost1.getCassandraThriftSocketTimeout();
        long long7 = cassandraHost1.getMaxWaitTimeWhenExhausted();
        int int8 = cassandraHost1.getPort();
        boolean boolean9 = cassandraHost1.getUseSocketKeepalive();
        java.lang.String[] strArray21 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray21, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray21);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray21, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray21, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray21);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray21, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray21, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray21, false);
        tSSLTransportParameters35.setKeyStore("(127.0.0.1):10", ":9160:9160");
        tSSLTransportParameters35.setKeyStore("(127.0.0.1)((127.0.0.1)):32", "0(0.0.0.0):-1", "CassandraClient<%s-%d>(CassandraClient<%s-%d>):9160", "CassandraClient<%s-%d>:97");
        tSSLTransportParameters35.setKeyStore("127.0.0.1(127.0.0.1)", "416(0.0.1.160)(416(0.0.1.160)):11", "CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):206", "61");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient49 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters35);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient49.equals(null)", !hThriftClient49.equals(null));
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1625");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        boolean boolean3 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String str4 = cassandraHost2.getName();
        cassandraHost2.setUseThriftFramedTransport(true);
        java.lang.String[] strArray13 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>:1", strArray13);
        tSSLTransportParameters18.setTrustStore("236", "");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient22 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters18);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient22.equals(null)", !hThriftClient22.equals(null));
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1626");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160:9160", 50);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (byte) 10);
        boolean boolean6 = cassandraHost5.isPerformNameResolution();
        java.lang.String str7 = cassandraHost5.getHost();
        int int8 = cassandraHost5.getPort();
        java.lang.String str9 = cassandraHost5.getHost();
        boolean boolean10 = cassandraHost2.equals((java.lang.Object) str9);
        cassandraHost2.setCassandraThriftSocketTimeout((int) (short) 100);
        boolean boolean13 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray23, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray23);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray23, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):1", strArray23);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0.0.0.0", strArray23, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>:9160", strArray23);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient33 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters32);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient33.equals(null)", !hThriftClient33.equals(null));
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1627");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1))", (int) (byte) 0);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1628");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 1);
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) (short) 100);
        cassandraHost2.setCassandraThriftSocketTimeout((int) '#');
        java.lang.String str7 = cassandraHost2.getName();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1629");
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
        java.lang.String str27 = cassandraHost2.getIp();
        cassandraHost2.setUseSocketKeepalive(false);
        java.lang.String str30 = cassandraHost2.getName();
        java.lang.String[] strArray40 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters42 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray40, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters44 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray40, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters45 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray40);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters47 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray40, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters48 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):32", strArray40);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters49 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("194", strArray40);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient50 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters49);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient50.equals(null)", !hThriftClient50.equals(null));
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1630");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("207", (int) (byte) 16);
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) '4');
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("0.0.0.0");
        boolean boolean7 = cassandraHost2.equals((java.lang.Object) "0.0.0.0");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1631");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1))", (int) (byte) 0);
        java.lang.String str3 = cassandraHost2.toString();
        cassandraHost2.setMaxActive((int) (short) -98);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray18, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray18, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1:52", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):100", strArray18);
        boolean boolean34 = cassandraHost2.equals((java.lang.Object) strArray18);
        cassandraHost2.setUseSocketKeepalive(true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient37 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient37.equals(null)", !hThriftClient37.equals(null));
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1632");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 1);
        int int3 = cassandraHost2.getPort();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) 'a');
        boolean boolean7 = cassandraHost6.getLifo();
        java.lang.String str8 = cassandraHost6.toString();
        java.lang.String str9 = cassandraHost6.getIp();
        boolean boolean10 = cassandraHost2.equals((java.lang.Object) str9);
        int int11 = cassandraHost2.getCassandraThriftSocketTimeout();
        java.lang.String[] strArray19 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray19, true);
        tSSLTransportParameters26.setKeyStore("CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):0", "194", "(127.0.0.1):10", "194");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient32 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters26);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient32.equals(null)", !hThriftClient32.equals(null));
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1633");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1(127.0.0.1):52", 2);
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
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("204", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0.0.0.1:10", strArray18, true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient38 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters37);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient38.equals(null)", !hThriftClient38.equals(null));
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1634");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 49);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1635");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):10", (int) (short) 84);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1636");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (short) 10);
        int int3 = cassandraHost2.getPort();
        boolean boolean4 = cassandraHost2.getLifo();
        int int5 = cassandraHost2.getMaxActive();
        java.lang.String str6 = cassandraHost2.getIp();
        cassandraHost2.setCassandraThriftSocketTimeout((int) ' ');
        boolean boolean9 = cassandraHost2.getLifo();
        boolean boolean10 = cassandraHost2.getLifo();
        cassandraHost2.setMaxActive(11);
        long long13 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient14 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient14.equals(null)", !hThriftClient14.equals(null));
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1637");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("12", (int) (short) 98);
        cassandraHost2.setUseThriftFramedTransport(true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1638");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        boolean boolean3 = cassandraHost2.getLifo();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1639");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1))", (int) (byte) 33);
        long long3 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        long long4 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        java.lang.String[] strArray11 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1:0", strArray11);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient17 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters16);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient17.equals(null)", !hThriftClient17.equals(null));
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1640");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        boolean boolean3 = cassandraHost2.getUseThriftFramedTransport();
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) 10);
        java.lang.String str6 = cassandraHost2.getIp();
        int int7 = cassandraHost2.getPort();
        cassandraHost2.setCassandraThriftSocketTimeout((int) (short) 707);
        java.lang.String str10 = cassandraHost2.getHost();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient11.equals(null)", !hThriftClient11.equals(null));
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1641");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):32");
        java.lang.String str2 = cassandraHost1.toString();
        java.lang.String[] strArray9 = new java.lang.String[] { "127.0.0.1", "", "CassandraClient<%s-%d>", "0" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1", strArray9);
        tSSLTransportParameters11.setKeyStore("(127.0.0.1)((127.0.0.1)):10", "-2");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient15 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters11);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient15.equals(null)", !hThriftClient15.equals(null));
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1642");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) 'a');
        long long3 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        cassandraHost2.setUseThriftFramedTransport(true);
        boolean boolean6 = cassandraHost2.isPerformNameResolution();
        boolean boolean7 = cassandraHost2.getUseSocketKeepalive();
        java.lang.String str8 = cassandraHost2.getUrl();
        cassandraHost2.setCassandraThriftSocketTimeout((int) (byte) 100);
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray23, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray23, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray23);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray23, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray23);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray23, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray23);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("97", strArray23, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0(0.0.0.0):9160", strArray23);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient38 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters37);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient38.equals(null)", !hThriftClient38.equals(null));
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1643");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 414);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("-2(-2):9160", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("606", strArray14, true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient27 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters26);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient27.equals(null)", !hThriftClient27.equals(null));
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1644");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("");
        java.lang.String str2 = cassandraHost1.getUrl();
        boolean boolean3 = cassandraHost1.getUseSocketKeepalive();
        int int4 = cassandraHost1.getPort();
        int int5 = cassandraHost1.getMaxActive();
        int int6 = cassandraHost1.getMaxActive();
        int int7 = cassandraHost1.getPort();
        cassandraHost1.setUseSocketKeepalive(false);
        java.lang.String str10 = cassandraHost1.getUrl();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient11.equals(null)", !hThriftClient11.equals(null));
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1645");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>:33", (int) (short) 15);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1646");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):10", (int) (byte) 0);
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
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray19, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters39 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("97", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters40 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters42 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1(0.0.0.1):0", strArray19, true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient43 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters42);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient43.equals(null)", !hThriftClient43.equals(null));
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1647");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("416(0.0.1.160):11", 405);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("10(0.0.0.10):-1", strArray8);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient13 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters12);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient13.equals(null)", !hThriftClient13.equals(null));
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1648");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("1(0.0.0.1):48");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1))):32", 9160);
        boolean boolean5 = cassandraHost1.equals((java.lang.Object) cassandraHost4);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1649");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        int int3 = cassandraHost2.getPort();
        long long4 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        int int5 = cassandraHost2.getPort();
        java.lang.String str6 = cassandraHost2.getUrl();
        java.lang.String str7 = cassandraHost2.getName();
        java.lang.String str8 = cassandraHost2.getHost();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray17, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:10", strArray17, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):32", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1(0.0.0.1):9160", strArray17, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient27 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters26);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient27.equals(null)", !hThriftClient27.equals(null));
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1650");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) 'a');
        boolean boolean3 = cassandraHost2.getLifo();
        java.lang.String str4 = cassandraHost2.getIp();
        java.lang.String str5 = cassandraHost2.getIp();
        int int6 = cassandraHost2.getPort();
        java.lang.String[] strArray25 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray25, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray25, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray25);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray25, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray25);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray25, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray25, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters39 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0", strArray25, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters41 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray25, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters43 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray25, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters44 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0(0.0.0.0):-1", strArray25);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters46 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:10", strArray25, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters48 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("6(0.0.0.6):9160", strArray25, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters49 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):5", strArray25);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters50 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("29", strArray25);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient51 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters50);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient51.equals(null)", !hThriftClient51.equals(null));
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1651");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("194", (int) (byte) 84);
        java.lang.String str3 = cassandraHost2.getName();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("hi!:10", 100);
        cassandraHost6.setMaxWaitTimeWhenExhausted(201L);
        boolean boolean9 = cassandraHost2.equals((java.lang.Object) 201L);
        java.lang.String[] strArray22 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray22, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray22);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray22, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray22, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray22);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray22, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("10", strArray22);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):100", strArray22);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>:97", strArray22, false);
        tSSLTransportParameters36.setTrustStore("CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):1", "0(0.0.0.0)", "204(0.0.0.204):69", "0(0.0.0.0)");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient42 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters36);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient42.equals(null)", !hThriftClient42.equals(null));
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1652");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("10(0.0.0.10)(10(0.0.0.10))", 9396);
        int int3 = cassandraHost2.getCassandraThriftSocketTimeout();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1653");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("106");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient2 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient2.equals(null)", !hThriftClient2.equals(null));
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1654");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        boolean boolean3 = cassandraHost2.getUseThriftFramedTransport();
        cassandraHost2.setLifo(true);
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) (-1));
        java.lang.String str8 = cassandraHost2.getName();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("10(0.0.0.10):-1", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0.0.0.1:10", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160(:9160)", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray17);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient27 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters26);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient27.equals(null)", !hThriftClient27.equals(null));
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1655");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("602", (int) (short) 416);
        boolean boolean3 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):35", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160(:9160)(:9160(:9160)):-1", strArray15, false);
        tSSLTransportParameters29.setKeyStore(":9160(:9160):52", ":10(:10)(:10(:10)):84");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient33 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters29);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient33.equals(null)", !hThriftClient33.equals(null));
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1656");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):100", (int) 'a');
        cassandraHost2.setCassandraThriftSocketTimeout((int) ' ');
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("9160", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0.0.0.1", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):97", strArray14, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient25 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters24);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient25.equals(null)", !hThriftClient25.equals(null));
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1657");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0(0.0.0.0):9160", 100);
        boolean boolean3 = cassandraHost2.getLifo();
        java.lang.String[] strArray13 = new java.lang.String[] { "127.0.0.1", "", "CassandraClient<%s-%d>", "0" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("606", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):10", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        tSSLTransportParameters18.setKeyStore("0:-1", "0.0.0.194");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient22 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters18);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient22.equals(null)", !hThriftClient22.equals(null));
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1658");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) 'a');
        long long3 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        long long4 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        java.lang.String str5 = cassandraHost2.getIp();
        cassandraHost2.setCassandraThriftSocketTimeout(0);
        cassandraHost2.setMaxActive(406);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:10", strArray18, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>:1", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0.0.0.194", strArray18);
        tSSLTransportParameters26.setTrustStore("hi!(hi!)", "127.0.0.1(127.0.0.1):52", "CassandraClient<%s-%d>:2", "1:52");
        tSSLTransportParameters26.setKeyStore("hi!:0", "hi!");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient35 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters26);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient35.equals(null)", !hThriftClient35.equals(null));
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1659");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        cassandraHost2.setUseSocketKeepalive(true);
        int int5 = cassandraHost2.getCassandraThriftSocketTimeout();
        boolean boolean6 = cassandraHost2.getUseSocketKeepalive();
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!(hi!):10", strArray16);
        tSSLTransportParameters25.setKeyStore("127.0.0.1(127.0.0.1):52", "(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))", ":48", "hi!:35");
        tSSLTransportParameters25.setTrustStore("", "", "0(0.0.0.0):9160", "10(0.0.0.10):-1");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient36 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters25);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient36.equals(null)", !hThriftClient36.equals(null));
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1660");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) 'a');
        boolean boolean3 = cassandraHost2.getLifo();
        cassandraHost2.setCassandraThriftSocketTimeout(1);
        int int6 = cassandraHost2.getMaxActive();
        int int7 = cassandraHost2.getCassandraThriftSocketTimeout();
        cassandraHost2.setUseThriftFramedTransport(true);
        java.lang.String str10 = cassandraHost2.getHost();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient11.equals(null)", !hThriftClient11.equals(null));
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1661");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 97);
        boolean boolean3 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String str4 = cassandraHost2.toString();
        java.lang.String str5 = cassandraHost2.getName();
        cassandraHost2.setUseSocketKeepalive(true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1662");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("");
        java.lang.String str2 = cassandraHost1.getUrl();
        long long3 = cassandraHost1.getMaxWaitTimeWhenExhausted();
        boolean boolean4 = cassandraHost1.isPerformNameResolution();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray10);
        boolean boolean14 = cassandraHost1.equals((java.lang.Object) tSSLTransportParameters13);
        java.lang.String[] strArray28 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray28, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray28);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray28, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray28, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray28);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters38 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray28, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters39 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("10", strArray28);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters41 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("194", strArray28, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters43 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray28, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters44 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":10(:10)(:10(:10)):84", strArray28);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient45 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters44);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient45.equals(null)", !hThriftClient45.equals(null));
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1663");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("");
        int int2 = cassandraHost1.getCassandraThriftSocketTimeout();
        java.lang.String str3 = cassandraHost1.getIp();
        java.lang.String str4 = cassandraHost1.getIp();
        cassandraHost1.setUseSocketKeepalive(false);
        java.lang.String[] strArray24 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray24, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray24, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray24);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray24, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray24);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray24, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray24, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters38 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0", strArray24, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters40 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray24, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters42 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray24, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters43 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0(0.0.0.0):-1", strArray24);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters45 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:10", strArray24, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters47 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("6(0.0.0.6):9160", strArray24, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters48 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("3", strArray24);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient49 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters48);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient49.equals(null)", !hThriftClient49.equals(null));
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1664");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160:296", (int) (byte) 16);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1665");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) 'a');
        long long3 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        cassandraHost2.setUseThriftFramedTransport(true);
        cassandraHost2.setCassandraThriftSocketTimeout((int) '#');
        cassandraHost2.setLifo(true);
        java.lang.String str10 = cassandraHost2.getHost();
        cassandraHost2.setLifo(false);
        java.lang.String str13 = cassandraHost2.getHost();
        java.lang.String[] strArray29 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray29, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray29, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray29);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray29, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray29);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters39 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray29, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters41 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray29, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters43 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0", strArray29, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters45 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray29, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters47 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray29, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters49 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray29, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters50 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0(0.0.0.0)", strArray29);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient51 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters50);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient51.equals(null)", !hThriftClient51.equals(null));
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1666");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost(":9160(:9160):206");
        cassandraHost1.setMaxWaitTimeWhenExhausted(247L);
        java.lang.String str4 = cassandraHost1.getName();
        boolean boolean5 = cassandraHost1.getUseSocketKeepalive();
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
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters39 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray21, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters40 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray21);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters42 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!(hi!):296", strArray21, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient43 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters42);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient43.equals(null)", !hThriftClient43.equals(null));
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1667");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("");
        java.lang.String str2 = cassandraHost1.getUrl();
        boolean boolean3 = cassandraHost1.getUseSocketKeepalive();
        int int4 = cassandraHost1.getPort();
        boolean boolean5 = cassandraHost1.getUseSocketKeepalive();
        int int6 = cassandraHost1.getMaxActive();
        java.lang.String str7 = cassandraHost1.getHost();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1668");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):10", 0);
        java.lang.String[] strArray7 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters8 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray7);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray7, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters10);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient11.equals(null)", !hThriftClient11.equals(null));
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1669");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("602", (int) (byte) 6);
        cassandraHost2.setUseThriftFramedTransport(true);
        int int5 = cassandraHost2.getMaxActive();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("196", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160(:9160):52", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):35", strArray17);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient29 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters28);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient29.equals(null)", !hThriftClient29.equals(null));
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1670");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 0);
        int int3 = cassandraHost2.getMaxActive();
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) 52);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1671");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        cassandraHost2.setUseSocketKeepalive(false);
        int int5 = cassandraHost2.getCassandraThriftSocketTimeout();
        boolean boolean6 = cassandraHost2.isPerformNameResolution();
        cassandraHost2.setLifo(true);
        java.lang.String str9 = cassandraHost2.getIp();
        java.lang.String[] strArray19 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("10", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":10(:10):9160", strArray19, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):32", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):1", strArray19, false);
        boolean boolean31 = cassandraHost2.equals((java.lang.Object) tSSLTransportParameters30);
        boolean boolean32 = cassandraHost2.isPerformNameResolution();
        java.lang.String[] strArray41 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters43 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray41, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters44 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray41);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters46 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray41, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters48 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("-2", strArray41, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters49 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("9(0.0.0.9):9160", strArray41);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient50 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters49);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient50.equals(null)", !hThriftClient50.equals(null));
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1672");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":10", (-1));
        long long3 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        java.lang.String str4 = cassandraHost2.toString();
        java.lang.String[] strArray15 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1:52", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1:6", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":52", strArray15);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient26 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters25);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient26.equals(null)", !hThriftClient26.equals(null));
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1673");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("10:-1", (int) (short) 96);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:10", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0(0.0.0.0):9160", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):100", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))", strArray12);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient23 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters22);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient23.equals(null)", !hThriftClient23.equals(null));
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1674");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) '4');
        long long3 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        int int4 = cassandraHost2.getCassandraThriftSocketTimeout();
        cassandraHost2.setUseThriftFramedTransport(false);
        cassandraHost2.setUseThriftFramedTransport(true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1675");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("1", (int) (byte) 3);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1:0", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):0", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("11", strArray15, true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient29 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters28);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient29.equals(null)", !hThriftClient29.equals(null));
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1676");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("");
        java.lang.String str2 = cassandraHost1.getUrl();
        boolean boolean3 = cassandraHost1.getUseSocketKeepalive();
        int int4 = cassandraHost1.getMaxActive();
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("416", strArray11, true);
        tSSLTransportParameters16.setKeyStore("0.0.0.194", "(127.0.0.1)((127.0.0.1)):100");
        tSSLTransportParameters16.setTrustStore("0.0.0.196", "25(0.0.0.25):84");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient23 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters16);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient23.equals(null)", !hThriftClient23.equals(null));
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1677");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":0", (int) (short) 203);
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):9160", strArray10, true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient18 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters17);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient18.equals(null)", !hThriftClient18.equals(null));
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1678");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0(0.0.0.0):-1", (int) (short) 10);
        cassandraHost2.setUseSocketKeepalive(true);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("10", (int) (byte) -1);
        cassandraHost7.setMaxActive((int) '4');
        boolean boolean10 = cassandraHost2.equals((java.lang.Object) cassandraHost7);
        boolean boolean11 = cassandraHost2.getLifo();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient12 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient12.equals(null)", !hThriftClient12.equals(null));
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1679");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):10", (int) (byte) 10);
        cassandraHost2.setCassandraThriftSocketTimeout(9160);
        java.lang.String str5 = cassandraHost2.getIp();
        java.lang.String str6 = cassandraHost2.getName();
        cassandraHost2.setMaxActive((int) (short) 9159);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1680");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!:10", (int) (byte) 100);
        java.lang.String str3 = cassandraHost2.getHost();
        boolean boolean4 = cassandraHost2.getLifo();
        boolean boolean5 = cassandraHost2.isPerformNameResolution();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1681");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost(":10");
        cassandraHost1.setMaxActive((int) (short) 9159);
        long long4 = cassandraHost1.getMaxWaitTimeWhenExhausted();
        cassandraHost1.setUseSocketKeepalive(false);
        java.lang.String str7 = cassandraHost1.getName();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1682");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        cassandraHost2.setUseSocketKeepalive(false);
        java.lang.String str5 = cassandraHost2.toString();
        cassandraHost2.setLifo(true);
        int int8 = cassandraHost2.getMaxActive();
        int int9 = cassandraHost2.getCassandraThriftSocketTimeout();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1683");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", (int) (short) 5);
        boolean boolean3 = cassandraHost2.getLifo();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1684");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160(:9160)", 197);
        long long3 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        int int4 = cassandraHost2.getMaxActive();
        java.lang.String[] strArray13 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray13);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient21 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters20);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient21.equals(null)", !hThriftClient21.equals(null));
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1685");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) 'a');
        boolean boolean3 = cassandraHost2.getLifo();
        java.lang.String str4 = cassandraHost2.toString();
        java.lang.String str5 = cassandraHost2.getIp();
        cassandraHost2.setLifo(false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1686");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):-1", 299);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1687");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):100", (int) (short) 194);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0.0.0.1", strArray16);
        tSSLTransportParameters31.setTrustStore("CassandraClient<%s-%d>", "(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1))):32", "0(0.0.0.0):-1", "(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))((127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))):36");
        tSSLTransportParameters31.setTrustStore("hi!(hi!):9160", "127.0.0.1(127.0.0.1)", "196", "CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>))(CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>))):-95");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient42 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters31);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient42.equals(null)", !hThriftClient42.equals(null));
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1688");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("");
        int int2 = cassandraHost1.getCassandraThriftSocketTimeout();
        boolean boolean3 = cassandraHost1.getLifo();
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):1", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0.0.0.0", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>:9160", strArray13);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient23 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters22);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient23.equals(null)", !hThriftClient23.equals(null));
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1689");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 1);
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) (short) 100);
        cassandraHost2.setLifo(false);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":1", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray15);
        tSSLTransportParameters22.setTrustStore(":9160:1", "357");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient26 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters22);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient26.equals(null)", !hThriftClient26.equals(null));
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1690");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (short) 10);
        java.lang.String str3 = cassandraHost2.getIp();
        boolean boolean4 = cassandraHost2.getLifo();
        int int5 = cassandraHost2.getCassandraThriftSocketTimeout();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):1", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1:6", strArray18);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient32 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters31);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient32.equals(null)", !hThriftClient32.equals(null));
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1691");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient2 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient2.equals(null)", !hThriftClient2.equals(null));
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1692");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):52", (int) (byte) 84);
        java.lang.String[] strArray11 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):97", strArray11);
        tSSLTransportParameters19.setKeyStore("515", "hi!");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient23 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters19);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient23.equals(null)", !hThriftClient23.equals(null));
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1693");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) 'a');
        boolean boolean3 = cassandraHost2.getLifo();
        java.lang.String str4 = cassandraHost2.toString();
        boolean boolean5 = cassandraHost2.getUseSocketKeepalive();
        long long6 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        boolean boolean7 = cassandraHost2.isPerformNameResolution();
        cassandraHost2.setUseThriftFramedTransport(true);
        cassandraHost2.setUseSocketKeepalive(false);
        int int12 = cassandraHost2.getPort();
        java.lang.String[] strArray27 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray27, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray27, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray27);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray27, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray27);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray27, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters39 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("10", strArray27, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters41 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("3", strArray27, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters43 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray27, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters45 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0", strArray27, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters46 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0.0.0.6", strArray27);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient47 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters46);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient47.equals(null)", !hThriftClient47.equals(null));
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1694");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", 100);
        java.lang.String str3 = cassandraHost2.toString();
        boolean boolean4 = cassandraHost2.getUseSocketKeepalive();
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray15, true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient29 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters28);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient29.equals(null)", !hThriftClient29.equals(null));
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1695");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("1:52", (int) (short) 48);
        int int3 = cassandraHost2.getMaxActive();
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("504", strArray13, true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient24 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters23);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient24.equals(null)", !hThriftClient24.equals(null));
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1696");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160(:9160):52", (int) (byte) 0);
        boolean boolean3 = cassandraHost2.getLifo();
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):100", strArray14, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient27 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters26);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient27.equals(null)", !hThriftClient27.equals(null));
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1697");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("29", (int) (byte) 11);
        int int3 = cassandraHost2.getPort();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1698");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("6", (int) (byte) 10);
        cassandraHost2.setLifo(true);
        java.lang.String str5 = cassandraHost2.getUrl();
        java.lang.String str6 = cassandraHost2.getName();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1699");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        java.util.concurrent.atomic.AtomicLong atomicLong3 = new java.util.concurrent.atomic.AtomicLong();
        long long5 = atomicLong3.addAndGet((long) (byte) -1);
        boolean boolean6 = cassandraHost2.equals((java.lang.Object) (byte) -1);
        java.lang.String str7 = cassandraHost2.toString();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1700");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (short) 10);
        java.lang.String str3 = cassandraHost2.getIp();
        cassandraHost2.setUseThriftFramedTransport(false);
        cassandraHost2.setUseThriftFramedTransport(false);
        int int8 = cassandraHost2.getPort();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1701");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("");
        java.lang.String str2 = cassandraHost1.getUrl();
        boolean boolean3 = cassandraHost1.getLifo();
        int int4 = cassandraHost1.getMaxActive();
        int int5 = cassandraHost1.getPort();
        cassandraHost1.setMaxActive((int) (short) 106);
        java.lang.String str8 = cassandraHost1.toString();
        cassandraHost1.setUseThriftFramedTransport(false);
        boolean boolean11 = cassandraHost1.getUseThriftFramedTransport();
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray23, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray23);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray23, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray23, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray23);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray23, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray23, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray23, false);
        tSSLTransportParameters37.setKeyStore("(127.0.0.1):10", ":9160:9160");
        tSSLTransportParameters37.setKeyStore("(127.0.0.1)((127.0.0.1)):32", "0(0.0.0.0):-1", "CassandraClient<%s-%d>(CassandraClient<%s-%d>):9160", "CassandraClient<%s-%d>:97");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient46 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters37);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient46.equals(null)", !hThriftClient46.equals(null));
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1702");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0(0.0.0.0):9160", 406);
        int int3 = cassandraHost2.getCassandraThriftSocketTimeout();
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0.0.0.1(0.0.0.1):48", strArray13, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient24 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters23);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient24.equals(null)", !hThriftClient24.equals(null));
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1703");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("hi!");
        cassandraHost1.setUseThriftFramedTransport(true);
        java.lang.String str4 = cassandraHost1.getUrl();
        java.lang.String[] strArray14 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):1", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!(hi!):9160", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):97", strArray14, true);
        tSSLTransportParameters23.setKeyStore("0.0.0.6", "602", "hi!(hi!):9160", "(127.0.0.1):35");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient29 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters23);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient29.equals(null)", !hThriftClient29.equals(null));
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1704");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))", 296);
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):1", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!(hi!):194", strArray13, true);
        tSSLTransportParameters25.requireClientAuth(false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient28 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters25);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient28.equals(null)", !hThriftClient28.equals(null));
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1705");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)", (int) ' ');
        java.lang.String[] strArray7 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray7, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray7);
        boolean boolean11 = cassandraHost2.equals((java.lang.Object) tSSLTransportParameters10);
        boolean boolean12 = cassandraHost2.getUseSocketKeepalive();
        int int13 = cassandraHost2.getMaxActive();
        boolean boolean15 = cassandraHost2.equals((java.lang.Object) (short) 135);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient16 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient16.equals(null)", !hThriftClient16.equals(null));
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1706");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (short) 10);
        java.lang.String str3 = cassandraHost2.getIp();
        cassandraHost2.setLifo(true);
        java.lang.String str6 = cassandraHost2.getUrl();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1707");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 100);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray12);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient23 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters22);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient23.equals(null)", !hThriftClient23.equals(null));
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1708");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("1");
        int int2 = cassandraHost1.getCassandraThriftSocketTimeout();
        cassandraHost1.setCassandraThriftSocketTimeout((int) (short) 60);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1709");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("10", (int) (byte) -1);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1710");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>:1", (int) (byte) 33);
        java.lang.String str3 = cassandraHost2.getUrl();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1711");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 1);
        cassandraHost2.setLifo(true);
        java.lang.String str5 = cassandraHost2.getIp();
        cassandraHost2.setMaxWaitTimeWhenExhausted(84L);
        long long8 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        int int9 = cassandraHost2.getPort();
        java.lang.String[] strArray24 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray24, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray24, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray24);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray24, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray24);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray24, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray24, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters38 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0", strArray24, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters40 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray24, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters42 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray24, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters44 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray24, true);
        tSSLTransportParameters44.setTrustStore("0(0.0.0.0):9160", "CassandraClient<%s-%d>:97");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient48 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters44);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient48.equals(null)", !hThriftClient48.equals(null));
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1712");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0.0.0.207", (int) (byte) -60);
        int int3 = cassandraHost2.getCassandraThriftSocketTimeout();
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
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient39 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters38);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient39.equals(null)", !hThriftClient39.equals(null));
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1713");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", 1);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1:52", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient21 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters20);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient21.equals(null)", !hThriftClient21.equals(null));
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1714");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160", (int) '4');
        java.lang.String str3 = cassandraHost2.getName();
        int int4 = cassandraHost2.getMaxActive();
        boolean boolean5 = cassandraHost2.getLifo();
        java.lang.String str6 = cassandraHost2.getIp();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1715");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", (int) (short) 12);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1716");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("hi!");
        cassandraHost1.setMaxActive(10);
        boolean boolean4 = cassandraHost1.getUseSocketKeepalive();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) 'a');
        boolean boolean8 = cassandraHost7.getLifo();
        java.lang.String str9 = cassandraHost7.toString();
        cassandraHost7.setUseThriftFramedTransport(true);
        cassandraHost7.setUseThriftFramedTransport(true);
        cassandraHost7.setCassandraThriftSocketTimeout(50);
        java.lang.String str16 = cassandraHost7.getHost();
        boolean boolean17 = cassandraHost1.equals((java.lang.Object) cassandraHost7);
        long long18 = cassandraHost7.getMaxWaitTimeWhenExhausted();
        boolean boolean19 = cassandraHost7.getUseSocketKeepalive();
        cassandraHost7.setMaxWaitTimeWhenExhausted(432L);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient22 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost7);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient22.equals(null)", !hThriftClient22.equals(null));
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1717");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("3", (int) '4');
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1718");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):10", (int) (byte) 10);
        cassandraHost2.setCassandraThriftSocketTimeout(9160);
        java.lang.String str5 = cassandraHost2.getIp();
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("416", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160(:9160):206", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>:50", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("131", strArray15);
        tSSLTransportParameters24.setTrustStore(":1:1", "105");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient28 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters24);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient28.equals(null)", !hThriftClient28.equals(null));
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1719");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!(hi!):10", 206);
        cassandraHost2.setUseThriftFramedTransport(true);
        java.lang.String[] strArray12 = new java.lang.String[] { "(127.0.0.1):1", "(127.0.0.1):10", "(127.0.0.1)((127.0.0.1)):32", "1:52", "10" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):32", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("194", strArray12);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient16 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters15);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient16.equals(null)", !hThriftClient16.equals(null));
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1720");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("83", (int) (byte) 87);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters3 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters();
        tSSLTransportParameters3.setTrustStore("hi!", "CassandraClient<%s-%d>");
        tSSLTransportParameters3.setTrustStore("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", "CassandraClient<%s-%d>");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters3);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1721");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-60");
        java.lang.String[] strArray7 = new java.lang.String[] { "6:10", "196", "416" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):1", strArray7, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):52", strArray7, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient12 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters11);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient12.equals(null)", !hThriftClient12.equals(null));
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1722");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160", (int) '4');
        java.lang.String str3 = cassandraHost2.getName();
        int int4 = cassandraHost2.getMaxActive();
        int int5 = cassandraHost2.getPort();
        cassandraHost2.setUseThriftFramedTransport(false);
        cassandraHost2.setUseThriftFramedTransport(false);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):0", strArray16);
        tSSLTransportParameters21.setTrustStore("85", "127.0.0.1(127.0.0.1)", "1:5", "");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient27 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters21);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient27.equals(null)", !hThriftClient27.equals(null));
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1723");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("hi!");
        cassandraHost1.setMaxActive(10);
        boolean boolean4 = cassandraHost1.getUseSocketKeepalive();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) 'a');
        boolean boolean8 = cassandraHost7.getLifo();
        java.lang.String str9 = cassandraHost7.toString();
        cassandraHost7.setUseThriftFramedTransport(true);
        cassandraHost7.setUseThriftFramedTransport(true);
        cassandraHost7.setCassandraThriftSocketTimeout(50);
        java.lang.String str16 = cassandraHost7.getHost();
        boolean boolean17 = cassandraHost1.equals((java.lang.Object) cassandraHost7);
        cassandraHost1.setCassandraThriftSocketTimeout(52);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient20 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient20.equals(null)", !hThriftClient20.equals(null));
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1724");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("1", 100);
        boolean boolean3 = cassandraHost2.isPerformNameResolution();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1725");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("416", 11);
        java.lang.String str3 = cassandraHost2.toString();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1726");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) '#');
        cassandraHost2.setCassandraThriftSocketTimeout(6);
        cassandraHost2.setUseSocketKeepalive(true);
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) (byte) 53);
        cassandraHost2.setMaxActive(50);
        java.lang.String[] strArray24 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray24, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray24);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray24, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray24, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray24);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):1", strArray24, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:10", strArray24, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0(0.0.0.0):9160", strArray24);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters39 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray24, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters41 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray24, true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient42 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters41);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient42.equals(null)", !hThriftClient42.equals(null));
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1727");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("6(0.0.0.6):-2", (int) (byte) -43);
        java.lang.String[] strArray13 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("114", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1", strArray13, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient26 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters25);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient26.equals(null)", !hThriftClient26.equals(null));
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1728");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):10");
        java.lang.String str2 = cassandraHost1.getHost();
        java.lang.String str3 = cassandraHost1.getName();
        long long4 = cassandraHost1.getMaxWaitTimeWhenExhausted();
        java.lang.String str5 = cassandraHost1.getName();
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray14);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient23 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters22);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient23.equals(null)", !hThriftClient23.equals(null));
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1729");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("209", (int) (byte) 35);
        cassandraHost2.setMaxActive((int) (short) 5);
        java.util.concurrent.atomic.AtomicLong atomicLong6 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 0);
        long long7 = atomicLong6.getAndIncrement();
        double double8 = atomicLong6.doubleValue();
        long long9 = atomicLong6.decrementAndGet();
        double double10 = atomicLong6.doubleValue();
        long long11 = atomicLong6.incrementAndGet();
        boolean boolean14 = atomicLong6.compareAndSet(0L, 0L);
        atomicLong6.set((long) 193);
        boolean boolean17 = cassandraHost2.equals((java.lang.Object) atomicLong6);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient18 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient18.equals(null)", !hThriftClient18.equals(null));
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1730");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) 'a');
        boolean boolean3 = cassandraHost2.getLifo();
        java.lang.String str4 = cassandraHost2.toString();
        boolean boolean5 = cassandraHost2.getUseSocketKeepalive();
        cassandraHost2.setUseThriftFramedTransport(false);
        cassandraHost2.setCassandraThriftSocketTimeout((int) (short) 194);
        java.lang.String[] strArray19 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0(0.0.0.0):-1", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0(0.0.0.0):5", strArray19);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient28 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters27);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient28.equals(null)", !hThriftClient28.equals(null));
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1731");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160(:9160):206", (int) ' ');
        java.lang.String[] strArray10 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>:1", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):97", strArray10, false);
        tSSLTransportParameters17.setKeyStore("101", "1(0.0.0.1)(1(0.0.0.1)):48");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient21 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters17);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient21.equals(null)", !hThriftClient21.equals(null));
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1732");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):10", (int) (byte) 10);
        boolean boolean3 = cassandraHost2.isPerformNameResolution();
        cassandraHost2.setUseSocketKeepalive(false);
        cassandraHost2.setUseSocketKeepalive(false);
        java.lang.String str8 = cassandraHost2.getHost();
        int int9 = cassandraHost2.getPort();
        cassandraHost2.setCassandraThriftSocketTimeout(21);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient12 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient12.equals(null)", !hThriftClient12.equals(null));
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1733");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        cassandraHost2.setUseSocketKeepalive(false);
        java.lang.String str5 = cassandraHost2.toString();
        int int6 = cassandraHost2.getPort();
        cassandraHost2.setUseThriftFramedTransport(true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1734");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):32", 0);
        cassandraHost2.setCassandraThriftSocketTimeout(52);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1735");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) 'a');
        boolean boolean3 = cassandraHost2.getLifo();
        java.lang.String str4 = cassandraHost2.toString();
        cassandraHost2.setUseThriftFramedTransport(true);
        cassandraHost2.setUseThriftFramedTransport(true);
        boolean boolean9 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray23, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray23);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray23, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray23, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray23);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray23, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray23, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray23, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters38 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0(0.0.0.0):-1", strArray23);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters40 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("815", strArray23, true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient41 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters40);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient41.equals(null)", !hThriftClient41.equals(null));
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1736");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 1);
        int int3 = cassandraHost2.getPort();
        java.lang.String str4 = cassandraHost2.toString();
        cassandraHost2.setMaxActive(0);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>:1", strArray12);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient17 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters16);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient17.equals(null)", !hThriftClient17.equals(null));
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1737");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("97", (int) (byte) 11);
        java.lang.String str3 = cassandraHost2.getHost();
        int int4 = cassandraHost2.getCassandraThriftSocketTimeout();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1738");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!(hi!)(hi!(hi!)):9160", (int) (byte) 85);
        boolean boolean3 = cassandraHost2.isPerformNameResolution();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1739");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("1(0.0.0.1):48", 285);
        java.lang.String[] strArray7 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters8 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray7);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray7);
        tSSLTransportParameters9.setKeyStore("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", "");
        tSSLTransportParameters9.setKeyStore("CassandraClient<%s-%d>", ":9160", "(127.0.0.1):10", "0");
        tSSLTransportParameters9.setKeyStore("CassandraClient<%s-%d>", "0", "CassandraClient<%s-%d>", "0");
        tSSLTransportParameters9.setTrustStore(":9160", "");
        tSSLTransportParameters9.setKeyStore("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1))):32", ":9160", ":52", ":9160");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient31 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters9);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient31.equals(null)", !hThriftClient31.equals(null));
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1740");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        java.util.concurrent.atomic.AtomicLong atomicLong3 = new java.util.concurrent.atomic.AtomicLong();
        long long5 = atomicLong3.addAndGet((long) (byte) -1);
        boolean boolean6 = cassandraHost2.equals((java.lang.Object) (byte) -1);
        boolean boolean7 = cassandraHost2.getUseSocketKeepalive();
        cassandraHost2.setLifo(false);
        java.lang.String str10 = cassandraHost2.getIp();
        long long11 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        java.lang.String str12 = cassandraHost2.getIp();
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray23, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray23);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray23, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray23, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray23);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray23, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:10", strArray23, false);
        tSSLTransportParameters35.setKeyStore("", "(127.0.0.1):100");
        tSSLTransportParameters35.setTrustStore("6:10", "CassandraClient<%s-%d>(CassandraClient<%s-%d>)");
        tSSLTransportParameters35.setTrustStore(":10", "399");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient45 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters35);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient45.equals(null)", !hThriftClient45.equals(null));
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1741");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("515", 101);
        java.lang.String str3 = cassandraHost2.getUrl();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1742");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("1:0", 0);
        boolean boolean3 = cassandraHost2.getUseSocketKeepalive();
        cassandraHost2.setMaxActive((int) (byte) 100);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:10", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:10", strArray14);
        tSSLTransportParameters21.setTrustStore("0(0.0.0.0):9160", "(127.0.0.1):1");
        tSSLTransportParameters21.setKeyStore("1(0.0.0.1):206", "12");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient28 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters21);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient28.equals(null)", !hThriftClient28.equals(null));
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1743");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160:296", 97);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160:9160", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160(:9160):52", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0:9160", strArray12);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient22 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters21);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient22.equals(null)", !hThriftClient22.equals(null));
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1744");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0:9160", 97);
        cassandraHost2.setUseSocketKeepalive(true);
        boolean boolean5 = cassandraHost2.isPerformNameResolution();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1745");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>)", 10);
        boolean boolean3 = cassandraHost2.getLifo();
        java.lang.String[] strArray7 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters8 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray7);
        tSSLTransportParameters8.setTrustStore("hi!", "", "hi!", "hi!");
        tSSLTransportParameters8.setKeyStore("CassandraClient<%s-%d>", "");
        tSSLTransportParameters8.setTrustStore("", "CassandraClient<%s-%d>(CassandraClient<%s-%d>):100", ":9160", "");
        tSSLTransportParameters8.setTrustStore("0:9160", "hi!:0");
        tSSLTransportParameters8.setKeyStore("0(0.0.0.0):5", "(127.0.0.1)((127.0.0.1)):32");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient28 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters8);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient28.equals(null)", !hThriftClient28.equals(null));
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1746");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):9160", (int) (short) 340);
        cassandraHost2.setUseSocketKeepalive(false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1747");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost(":9160(:9160):32");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient2 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient2.equals(null)", !hThriftClient2.equals(null));
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1748");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("126", 0);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):1", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:10", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0(0.0.0.0):9160", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("-2", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("194", strArray16);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient32 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters31);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient32.equals(null)", !hThriftClient32.equals(null));
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1749");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":1", (int) (byte) 85);
        java.lang.String str3 = cassandraHost2.getName();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):100", strArray17, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>:2", strArray17);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient34 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters33);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient34.equals(null)", !hThriftClient34.equals(null));
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1750");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) '4');
        cassandraHost2.setMaxWaitTimeWhenExhausted(407L);
        cassandraHost2.setUseThriftFramedTransport(false);
        cassandraHost2.setCassandraThriftSocketTimeout((int) (byte) 49);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray17, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("6(0.0.0.6):-2", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("101", strArray17, false);
        tSSLTransportParameters26.setTrustStore("504", "", "-2", ":9160");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient32 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters26);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient32.equals(null)", !hThriftClient32.equals(null));
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1751");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160(:9160):52", (int) (byte) 0);
        int int3 = cassandraHost2.getMaxActive();
        cassandraHost2.setUseSocketKeepalive(false);
        java.lang.String[] strArray24 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray24, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray24);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray24, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray24, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray24);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):1", strArray24, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:10", strArray24, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0(0.0.0.0):9160", strArray24);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters39 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray24, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters41 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray24, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters42 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):194", strArray24);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters44 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("10(0.0.0.10):-1", strArray24, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters45 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):0", strArray24);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters47 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("105", strArray24, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters49 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray24, true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient50 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters49);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient50.equals(null)", !hThriftClient50.equals(null));
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1752");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) '4');
        java.lang.String str3 = cassandraHost2.getHost();
        java.lang.String str4 = cassandraHost2.getIp();
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>:97", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):-56", strArray16, true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient31 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters30);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient31.equals(null)", !hThriftClient31.equals(null));
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1753");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("1:52", (int) (byte) 6);
        boolean boolean3 = cassandraHost2.getUseThriftFramedTransport();
        cassandraHost2.setCassandraThriftSocketTimeout((int) (short) 216);
        java.lang.String str6 = cassandraHost2.toString();
        java.lang.String[] strArray19 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):100", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>)", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("-1", strArray19);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient33 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters32);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient33.equals(null)", !hThriftClient33.equals(null));
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1754");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        cassandraHost2.setUseSocketKeepalive(false);
        int int5 = cassandraHost2.getCassandraThriftSocketTimeout();
        int int6 = cassandraHost2.getCassandraThriftSocketTimeout();
        cassandraHost2.setMaxActive((int) (short) 101);
        cassandraHost2.setMaxWaitTimeWhenExhausted(352L);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient11.equals(null)", !hThriftClient11.equals(null));
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1755");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("-1", (int) (byte) 98);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1756");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160(:9160):52", (int) (byte) 0);
        int int3 = cassandraHost2.getMaxActive();
        boolean boolean4 = cassandraHost2.isPerformNameResolution();
        boolean boolean5 = cassandraHost2.isPerformNameResolution();
        int int6 = cassandraHost2.getCassandraThriftSocketTimeout();
        java.lang.String[] strArray19 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):1", strArray19, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:10", strArray19, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("196", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray19, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient36 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters35);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient36.equals(null)", !hThriftClient36.equals(null));
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1757");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("602", (int) (short) 416);
        java.lang.String str3 = cassandraHost2.getName();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1758");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("194(0.0.0.194):84", 84);
        int int3 = cassandraHost2.getMaxActive();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1759");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("96", 599);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1760");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("8");
        cassandraHost1.setUseThriftFramedTransport(true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1761");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("");
        java.lang.String str2 = cassandraHost1.getUrl();
        boolean boolean3 = cassandraHost1.getUseSocketKeepalive();
        int int4 = cassandraHost1.getPort();
        boolean boolean5 = cassandraHost1.getUseSocketKeepalive();
        cassandraHost1.setMaxWaitTimeWhenExhausted(194L);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1762");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("hi!(hi!):296");
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters2 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters();
        tSSLTransportParameters2.setKeyStore("(127.0.0.1):10", "(127.0.0.1)", "(127.0.0.1):10", "hi!");
        tSSLTransportParameters2.setKeyStore("hi!", "");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient11.equals(null)", !hThriftClient11.equals(null));
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1763");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):10", (int) (byte) 10);
        boolean boolean3 = cassandraHost2.isPerformNameResolution();
        cassandraHost2.setUseSocketKeepalive(false);
        cassandraHost2.setUseSocketKeepalive(false);
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray20, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray20, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray20, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray20, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("515", strArray20, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("-1", strArray20, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient36 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters35);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient36.equals(null)", !hThriftClient36.equals(null));
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1764");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost(":9160(:9160):206");
        cassandraHost1.setMaxWaitTimeWhenExhausted(247L);
        java.lang.String str4 = cassandraHost1.getName();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1765");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160(:9160)(:9160(:9160)):-1", (int) (byte) -46);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):97", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>))", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters38 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!(hi!):206", strArray18, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient39 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters38);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient39.equals(null)", !hThriftClient39.equals(null));
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1766");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) '4');
        java.lang.String str3 = cassandraHost2.getHost();
        cassandraHost2.setUseSocketKeepalive(true);
        boolean boolean6 = cassandraHost2.getLifo();
        java.lang.String[] strArray19 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray19, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1", strArray19, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1:0", strArray19, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient34 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters33);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient34.equals(null)", !hThriftClient34.equals(null));
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1767");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160", (int) '4');
        java.lang.String str3 = cassandraHost2.getName();
        int int4 = cassandraHost2.getMaxActive();
        boolean boolean5 = cassandraHost2.getLifo();
        boolean boolean6 = cassandraHost2.getUseSocketKeepalive();
        cassandraHost2.setUseSocketKeepalive(false);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient19 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters18);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient19.equals(null)", !hThriftClient19.equals(null));
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1768");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (short) 10);
        int int3 = cassandraHost2.getPort();
        boolean boolean4 = cassandraHost2.getLifo();
        int int5 = cassandraHost2.getMaxActive();
        java.lang.String str6 = cassandraHost2.getIp();
        cassandraHost2.setCassandraThriftSocketTimeout((int) ' ');
        boolean boolean9 = cassandraHost2.getLifo();
        boolean boolean10 = cassandraHost2.getLifo();
        cassandraHost2.setMaxActive(11);
        long long13 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        java.lang.String[] strArray22 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray22);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray22);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray22, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0", strArray22);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1", strArray22, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0(0.0.0.0):0", strArray22);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient31 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters30);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient31.equals(null)", !hThriftClient31.equals(null));
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1769");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):-1");
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0(0.0.0.0):-1", strArray16);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient36 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters35);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient36.equals(null)", !hThriftClient36.equals(null));
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1770");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):10");
        java.lang.String str2 = cassandraHost1.getHost();
        java.lang.String str3 = cassandraHost1.getName();
        int int4 = cassandraHost1.getPort();
        boolean boolean5 = cassandraHost1.getLifo();
        int int6 = cassandraHost1.getCassandraThriftSocketTimeout();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1771");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("1", (int) (short) 5);
        boolean boolean3 = cassandraHost2.getLifo();
        java.lang.String str4 = cassandraHost2.getName();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1772");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("114", (int) (short) 1);
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>)", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1:0", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("3", strArray13);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient24 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters23);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient24.equals(null)", !hThriftClient24.equals(null));
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1773");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("");
        java.lang.String str2 = cassandraHost1.getUrl();
        boolean boolean3 = cassandraHost1.getUseSocketKeepalive();
        cassandraHost1.setUseSocketKeepalive(true);
        cassandraHost1.setMaxWaitTimeWhenExhausted((long) (byte) -55);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1774");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", 100);
        java.lang.String str3 = cassandraHost2.toString();
        boolean boolean4 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):1", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):100", strArray13);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient21 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters20);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient21.equals(null)", !hThriftClient21.equals(null));
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1775");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1776");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 194);
        boolean boolean3 = cassandraHost2.getUseSocketKeepalive();
        java.lang.String str4 = cassandraHost2.getIp();
        int int5 = cassandraHost2.getMaxActive();
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) 50);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("10", strArray18);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient30 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters29);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient30.equals(null)", !hThriftClient30.equals(null));
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1777");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("9160", 48);
        int int3 = cassandraHost2.getCassandraThriftSocketTimeout();
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("11", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":0", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":1", strArray12, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient21 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters20);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient21.equals(null)", !hThriftClient21.equals(null));
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1778");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):32");
        java.lang.String str2 = cassandraHost1.toString();
        java.lang.String str3 = cassandraHost1.getName();
        long long4 = cassandraHost1.getMaxWaitTimeWhenExhausted();
        cassandraHost1.setCassandraThriftSocketTimeout((int) (byte) 1);
        cassandraHost1.setUseThriftFramedTransport(true);
        cassandraHost1.setLifo(true);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient21 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters20);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient21.equals(null)", !hThriftClient21.equals(null));
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1779");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("101", 50);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("9160", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):1", strArray15);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient28 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters27);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient28.equals(null)", !hThriftClient28.equals(null));
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1780");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("504");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient2 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient2.equals(null)", !hThriftClient2.equals(null));
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1781");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("0.0.0.6");
        boolean boolean2 = cassandraHost1.isPerformNameResolution();
        long long3 = cassandraHost1.getMaxWaitTimeWhenExhausted();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1782");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        cassandraHost2.setUseSocketKeepalive(false);
        int int5 = cassandraHost2.getCassandraThriftSocketTimeout();
        boolean boolean6 = cassandraHost2.getLifo();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = new me.prettyprint.cassandra.service.CassandraHost("0");
        boolean boolean9 = cassandraHost8.isPerformNameResolution();
        cassandraHost8.setCassandraThriftSocketTimeout(50);
        cassandraHost8.setCassandraThriftSocketTimeout((int) (short) 1);
        boolean boolean14 = cassandraHost2.equals((java.lang.Object) cassandraHost8);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient15 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient15.equals(null)", !hThriftClient15.equals(null));
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1783");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):100", (-2));
        int int3 = cassandraHost2.getCassandraThriftSocketTimeout();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1784");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("hi!(hi!):100");
        boolean boolean2 = cassandraHost1.getLifo();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1785");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", 0);
        java.lang.String str3 = cassandraHost2.getIp();
        java.lang.String str4 = cassandraHost2.getIp();
        int int5 = cassandraHost2.getPort();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1786");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("1", (int) (byte) -40);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters7 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6);
        tSSLTransportParameters7.setTrustStore("hi!", "", "hi!", "hi!");
        tSSLTransportParameters7.requireClientAuth(true);
        tSSLTransportParameters7.setTrustStore("(127.0.0.1)", "CassandraClient<%s-%d>");
        tSSLTransportParameters7.setKeyStore("127.0.0.1", "127.0.0.1");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient21 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters7);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient21.equals(null)", !hThriftClient21.equals(null));
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1787");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160", (int) (short) 10);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("97", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):5", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("812", strArray15, true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient30 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters29);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient30.equals(null)", !hThriftClient30.equals(null));
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1788");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0.0.0.1(0.0.0.1)(0.0.0.1(0.0.0.1)):84", (int) (byte) -102);
        int int3 = cassandraHost2.getCassandraThriftSocketTimeout();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1789");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):10");
        long long2 = cassandraHost1.getMaxWaitTimeWhenExhausted();
        boolean boolean3 = cassandraHost1.isPerformNameResolution();
        java.lang.String str4 = cassandraHost1.toString();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1790");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!(hi!)(hi!(hi!)):9160", (int) (byte) 85);
        cassandraHost2.setUseSocketKeepalive(false);
        java.lang.String[] strArray13 = new java.lang.String[] { "9160", "0(0.0.0.0):9160", "-2", "1:0", "(127.0.0.1):97" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160:9160", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":52", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):1", strArray13);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient17 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters16);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient17.equals(null)", !hThriftClient17.equals(null));
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1791");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):10", (int) (byte) 100);
        cassandraHost2.setMaxWaitTimeWhenExhausted(12L);
        boolean boolean5 = cassandraHost2.isPerformNameResolution();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1792");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        cassandraHost2.setUseSocketKeepalive(false);
        java.lang.String str5 = cassandraHost2.toString();
        cassandraHost2.setLifo(true);
        java.lang.String str8 = cassandraHost2.getUrl();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1793");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!(hi!):10", 194);
        java.lang.String str3 = cassandraHost2.getUrl();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1794");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 1);
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) (short) 100);
        cassandraHost2.setCassandraThriftSocketTimeout((int) '#');
        java.lang.String[] strArray19 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):1", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):206", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1(127.0.0.1)", strArray19, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":1:9160", strArray19, true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient36 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters35);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient36.equals(null)", !hThriftClient36.equals(null));
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1795");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):0", 84);
        java.lang.String str3 = cassandraHost2.toString();
        java.lang.String str4 = cassandraHost2.toString();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1796");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 1);
        cassandraHost2.setLifo(true);
        java.lang.String str5 = cassandraHost2.getHost();
        java.lang.String[] strArray12 = new java.lang.String[] { "(127.0.0.1):1", "(127.0.0.1):10", "(127.0.0.1)((127.0.0.1)):32", "1:52", "10" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):32", strArray12, true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient15 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters14);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient15.equals(null)", !hThriftClient15.equals(null));
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1797");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("399");
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160:9160", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("207", strArray12);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient23 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters22);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient23.equals(null)", !hThriftClient23.equals(null));
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1798");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("9176", (int) (short) -1);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1799");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("6", (int) (byte) 10);
        cassandraHost2.setLifo(true);
        int int5 = cassandraHost2.getMaxActive();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1800");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("0(0.0.0.0):9160");
        java.lang.String str2 = cassandraHost1.getUrl();
        boolean boolean3 = cassandraHost1.getUseThriftFramedTransport();
        boolean boolean4 = cassandraHost1.getLifo();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1801");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)", (int) ' ');
        java.lang.String str3 = cassandraHost2.toString();
        cassandraHost2.setUseSocketKeepalive(true);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("194", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1))", strArray15);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient26 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters25);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient26.equals(null)", !hThriftClient26.equals(null));
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1802");
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
        java.lang.String[] strArray50 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters52 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray50, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters54 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray50, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters55 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray50);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters57 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray50, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters58 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):32", strArray50);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters60 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray50, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters62 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("9", strArray50, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters63 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160(:9160):1", strArray50);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters64 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("10:9160", strArray50);
        tSSLTransportParameters64.setKeyStore("", "9160(0.0.35.200)");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient68 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters64);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient68.equals(null)", !hThriftClient68.equals(null));
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1803");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):32", 501);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1804");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("10:-1");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient2 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient2.equals(null)", !hThriftClient2.equals(null));
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1805");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("207", (int) (byte) 16);
        java.lang.String str3 = cassandraHost2.getName();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))((127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))):36", 54);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        int int10 = cassandraHost9.getPort();
        cassandraHost9.setLifo(false);
        boolean boolean13 = cassandraHost9.getUseSocketKeepalive();
        boolean boolean14 = cassandraHost6.equals((java.lang.Object) cassandraHost9);
        boolean boolean15 = cassandraHost2.equals((java.lang.Object) cassandraHost6);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient16 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost6);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient16.equals(null)", !hThriftClient16.equals(null));
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1806");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("515(0.0.2.3):101");
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):97", strArray8, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient15 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters14);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient15.equals(null)", !hThriftClient15.equals(null));
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1807");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 0);
        cassandraHost2.setMaxWaitTimeWhenExhausted(207L);
        cassandraHost2.setUseSocketKeepalive(true);
        java.lang.String[] strArray19 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray19, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1", strArray19, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1:0", strArray19, false);
        tSSLTransportParameters33.setKeyStore("513", ":1:85", "1(0.0.0.1):-40", "(127.0.0.1)((127.0.0.1)):35");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient39 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters33);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient39.equals(null)", !hThriftClient39.equals(null));
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1808");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("1", 100);
        cassandraHost2.setMaxWaitTimeWhenExhausted(199L);
        long long5 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        cassandraHost2.setCassandraThriftSocketTimeout((int) (byte) 1);
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray23, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray23, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray23);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray23, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray23);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray23, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray23, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0", strArray23, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters39 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray23, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters41 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray23, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters43 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray23, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters44 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0:9160", strArray23);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient45 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters44);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient45.equals(null)", !hThriftClient45.equals(null));
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1809");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("31");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient2 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient2.equals(null)", !hThriftClient2.equals(null));
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1810");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):100", 0);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("515", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1:52", strArray15, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient31 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters30);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient31.equals(null)", !hThriftClient31.equals(null));
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1811");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("504", 597);
        boolean boolean3 = cassandraHost2.getUseSocketKeepalive();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1812");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)", (int) ' ');
        long long3 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1813");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        cassandraHost2.setUseSocketKeepalive(false);
        boolean boolean5 = cassandraHost2.getLifo();
        java.lang.String[] strArray9 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        tSSLTransportParameters10.setTrustStore("hi!", "", "hi!", "hi!");
        boolean boolean16 = cassandraHost2.equals((java.lang.Object) "hi!");
        int int17 = cassandraHost2.getCassandraThriftSocketTimeout();
        java.lang.String str18 = cassandraHost2.getIp();
        java.lang.String str19 = cassandraHost2.getName();
        int int20 = cassandraHost2.getMaxActive();
        java.lang.String[] strArray24 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray24);
        tSSLTransportParameters25.setTrustStore("hi!", "", "hi!", "hi!");
        tSSLTransportParameters25.requireClientAuth(false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient33 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters25);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient33.equals(null)", !hThriftClient33.equals(null));
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1814");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("1", (int) '4');
        java.lang.String str3 = cassandraHost2.getUrl();
        long long4 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8);
        tSSLTransportParameters9.setTrustStore("hi!", "", "hi!", "hi!");
        tSSLTransportParameters9.setKeyStore("CassandraClient<%s-%d>", "");
        tSSLTransportParameters9.setTrustStore("", "CassandraClient<%s-%d>(CassandraClient<%s-%d>):100", ":9160", "");
        tSSLTransportParameters9.setKeyStore(":9160:9160", "(127.0.0.1)", "0(0.0.0.0):9160", "CassandraClient<%s-%d>");
        tSSLTransportParameters9.setTrustStore("(127.0.0.1)((127.0.0.1)):100", "127.0.0.1(127.0.0.1):52");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient31 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters9);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient31.equals(null)", !hThriftClient31.equals(null));
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1815");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        java.util.concurrent.atomic.AtomicLong atomicLong3 = new java.util.concurrent.atomic.AtomicLong();
        long long5 = atomicLong3.addAndGet((long) (byte) -1);
        boolean boolean6 = cassandraHost2.equals((java.lang.Object) (byte) -1);
        boolean boolean7 = cassandraHost2.getUseSocketKeepalive();
        cassandraHost2.setLifo(false);
        java.lang.String str10 = cassandraHost2.getIp();
        int int11 = cassandraHost2.getPort();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):100", strArray18, true);
        tSSLTransportParameters23.requireClientAuth(false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient26 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters23);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient26.equals(null)", !hThriftClient26.equals(null));
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1816");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", 1);
        boolean boolean3 = cassandraHost2.getLifo();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1817");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("194", (int) (byte) 84);
        java.lang.String str3 = cassandraHost2.getName();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("hi!:10", 100);
        cassandraHost6.setMaxWaitTimeWhenExhausted(201L);
        boolean boolean9 = cassandraHost2.equals((java.lang.Object) 201L);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1818");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):10");
        java.lang.String str2 = cassandraHost1.getUrl();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1819");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (short) 10);
        int int3 = cassandraHost2.getPort();
        boolean boolean4 = cassandraHost2.getLifo();
        int int5 = cassandraHost2.getMaxActive();
        cassandraHost2.setMaxActive(52);
        int int8 = cassandraHost2.getCassandraThriftSocketTimeout();
        long long9 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        int int10 = cassandraHost2.getCassandraThriftSocketTimeout();
        java.lang.String str11 = cassandraHost2.getName();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient12 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient12.equals(null)", !hThriftClient12.equals(null));
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1820");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("194(0.0.0.194):84", 84);
        int int3 = cassandraHost2.getMaxActive();
        boolean boolean4 = cassandraHost2.isPerformNameResolution();
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("11", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):84", strArray14, true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient26 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters25);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient26.equals(null)", !hThriftClient26.equals(null));
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1821");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("111", 16);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1822");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        java.util.concurrent.atomic.AtomicLong atomicLong3 = new java.util.concurrent.atomic.AtomicLong();
        long long5 = atomicLong3.addAndGet((long) (byte) -1);
        boolean boolean6 = cassandraHost2.equals((java.lang.Object) (byte) -1);
        boolean boolean7 = cassandraHost2.getUseSocketKeepalive();
        cassandraHost2.setLifo(false);
        cassandraHost2.setMaxWaitTimeWhenExhausted(11L);
        int int12 = cassandraHost2.getCassandraThriftSocketTimeout();
        java.lang.String[] strArray25 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray25, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray25);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray25, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray25, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray25);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray25, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("10", strArray25);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):100", strArray25);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters39 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray25, true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient40 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters39);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient40.equals(null)", !hThriftClient40.equals(null));
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1823");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("hi!");
        boolean boolean2 = cassandraHost1.isPerformNameResolution();
        boolean boolean3 = cassandraHost1.isPerformNameResolution();
        java.lang.String str4 = cassandraHost1.getHost();
        boolean boolean5 = cassandraHost1.getUseSocketKeepalive();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray17, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160:9160", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!(hi!)", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("7", strArray17, true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient30 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters29);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient30.equals(null)", !hThriftClient30.equals(null));
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1824");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160", (int) '4');
        java.lang.String str3 = cassandraHost2.getName();
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):32", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("194", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>)", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160:9160", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):100", strArray16);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient29 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters28);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient29.equals(null)", !hThriftClient29.equals(null));
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1825");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (short) 10);
        int int3 = cassandraHost2.getPort();
        boolean boolean4 = cassandraHost2.getLifo();
        int int5 = cassandraHost2.getMaxActive();
        java.lang.String str6 = cassandraHost2.getIp();
        cassandraHost2.setCassandraThriftSocketTimeout((int) ' ');
        boolean boolean9 = cassandraHost2.getLifo();
        boolean boolean10 = cassandraHost2.getLifo();
        java.lang.String[] strArray22 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray22, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray22);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray22, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray22, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray22);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray22, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):100", strArray22);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":10", strArray22, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient36 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters35);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient36.equals(null)", !hThriftClient36.equals(null));
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1826");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        boolean boolean3 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String str4 = cassandraHost2.getName();
        int int5 = cassandraHost2.getPort();
        int int6 = cassandraHost2.getCassandraThriftSocketTimeout();
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
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters42 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray22, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters43 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0:9160", strArray22);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient44 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters43);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient44.equals(null)", !hThriftClient44.equals(null));
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1827");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (short) 10);
        int int3 = cassandraHost2.getPort();
        boolean boolean4 = cassandraHost2.getLifo();
        int int5 = cassandraHost2.getMaxActive();
        cassandraHost2.setMaxActive(52);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1828");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("25(0.0.0.25):84", (int) (short) 5);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):97", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1))):32", strArray17, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("9160(0.0.35.200):16", strArray17);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient35 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters34);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient35.equals(null)", !hThriftClient35.equals(null));
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1829");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) (short) -1);
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) (byte) 3);
        boolean boolean5 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray23, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray23, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray23);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray23, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray23);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray23, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray23, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0", strArray23, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters39 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray23, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters41 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray23, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters43 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray23, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters44 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0:9160", strArray23);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters45 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("196", strArray23);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters46 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray23);
        tSSLTransportParameters46.setTrustStore("25", "10");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient50 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters46);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient50.equals(null)", !hThriftClient50.equals(null));
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1830");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):10", (int) (byte) -1);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1831");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("193", 10);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("97", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0.0.0.6", strArray12, false);
        tSSLTransportParameters21.setTrustStore("9", "(127.0.0.1)((127.0.0.1)):35", "(127.0.0.1):52", "(127.0.0.1)((127.0.0.1))");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient27 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters21);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient27.equals(null)", !hThriftClient27.equals(null));
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1832");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("");
        java.lang.String str2 = cassandraHost1.getUrl();
        boolean boolean3 = cassandraHost1.getUseSocketKeepalive();
        int int4 = cassandraHost1.getMaxActive();
        boolean boolean5 = cassandraHost1.getUseSocketKeepalive();
        cassandraHost1.setUseSocketKeepalive(true);
        int int8 = cassandraHost1.getCassandraThriftSocketTimeout();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1833");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("hi!(hi!):296");
        cassandraHost1.setLifo(false);
        cassandraHost1.setUseThriftFramedTransport(true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1834");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0", (-1));
        cassandraHost2.setCassandraThriftSocketTimeout(0);
        boolean boolean5 = cassandraHost2.getUseThriftFramedTransport();
        cassandraHost2.setUseSocketKeepalive(false);
        java.lang.String[] strArray22 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray22, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray22, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray22);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray22, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray22);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray22);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray22);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):1", strArray22, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1:0", strArray22, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1))):0", strArray22);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters39 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("55", strArray22, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient40 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters39);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient40.equals(null)", !hThriftClient40.equals(null));
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1835");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("0");
        java.lang.String str2 = cassandraHost1.getName();
        boolean boolean3 = cassandraHost1.getUseThriftFramedTransport();
        cassandraHost1.setLifo(false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1836");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!:10", (int) (short) 1);
        boolean boolean3 = cassandraHost2.getUseSocketKeepalive();
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):32", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!(hi!):9160", strArray16, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient31 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters30);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient31.equals(null)", !hThriftClient31.equals(null));
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1837");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        cassandraHost2.setUseSocketKeepalive(false);
        java.lang.String str5 = cassandraHost2.toString();
        cassandraHost2.setCassandraThriftSocketTimeout((int) (byte) 0);
        cassandraHost2.setLifo(true);
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray23, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray23);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray23, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray23, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray23);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):1", strArray23, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:10", strArray23, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0(0.0.0.0):9160", strArray23);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160:9160", strArray23);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters38 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):9160", strArray23);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient39 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters38);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient39.equals(null)", !hThriftClient39.equals(null));
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1838");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) '4');
        java.lang.String str3 = cassandraHost2.getUrl();
        cassandraHost2.setMaxActive((int) (byte) -55);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1839");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) (short) 293);
        java.lang.String[] strArray11 = new java.lang.String[] { "(127.0.0.1):1", "(127.0.0.1):10", "(127.0.0.1)((127.0.0.1)):32", "1:52", "10" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):32", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("6:10", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("196", strArray11);
        tSSLTransportParameters16.requireClientAuth(true);
        tSSLTransportParameters16.setKeyStore("12", "8");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient22 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters16);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient22.equals(null)", !hThriftClient22.equals(null));
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1840");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!:0", (int) (short) 206);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1841");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("-1", (int) (byte) 98);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray14, false);
        tSSLTransportParameters27.setTrustStore("(127.0.0.1):399", "0:9160", "CassandraClient<%s-%d>:1", "(127.0.0.1):16");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient33 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters27);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient33.equals(null)", !hThriftClient33.equals(null));
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1842");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0", (int) (byte) 35);
        java.util.concurrent.atomic.AtomicLong atomicLong4 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 3);
        boolean boolean5 = cassandraHost2.equals((java.lang.Object) atomicLong4);
        int int6 = cassandraHost2.getPort();
        java.lang.String str7 = cassandraHost2.getUrl();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1843");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160:9160", 9160);
        int int3 = cassandraHost2.getMaxActive();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1844");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":1", (int) (short) 52);
        boolean boolean3 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String[] strArray7 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters8 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray7);
        tSSLTransportParameters8.setTrustStore("hi!", "", "hi!", "hi!");
        tSSLTransportParameters8.setKeyStore("CassandraClient<%s-%d>", "");
        tSSLTransportParameters8.setKeyStore("(127.0.0.1)", "(127.0.0.1):1", "(127.0.0.1):1", "CassandraClient<%s-%d>(CassandraClient<%s-%d>):100");
        tSSLTransportParameters8.setTrustStore("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))((127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))):36", "(127.0.0.1)((127.0.0.1)):1", "hi!:35", "CassandraClient<%s-%d>(CassandraClient<%s-%d>):100");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient27 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters8);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient27.equals(null)", !hThriftClient27.equals(null));
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1845");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        boolean boolean3 = cassandraHost2.getUseThriftFramedTransport();
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) 10);
        int int6 = cassandraHost2.getCassandraThriftSocketTimeout();
        cassandraHost2.setLifo(true);
        java.lang.String str9 = cassandraHost2.getIp();
        boolean boolean10 = cassandraHost2.getUseThriftFramedTransport();
        int int11 = cassandraHost2.getPort();
        java.lang.String[] strArray25 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray25, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray25);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray25, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray25, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray25);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray25);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray25, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters38 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray25, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters40 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!(hi!):9160", strArray25, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters42 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray25, false);
        tSSLTransportParameters42.requireClientAuth(false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient45 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters42);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient45.equals(null)", !hThriftClient45.equals(null));
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1846");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("196");
        long long2 = cassandraHost1.getMaxWaitTimeWhenExhausted();
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters7 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6);
        tSSLTransportParameters7.setTrustStore("hi!", "", "hi!", "hi!");
        tSSLTransportParameters7.setKeyStore("CassandraClient<%s-%d>", "");
        tSSLTransportParameters7.setTrustStore("", "CassandraClient<%s-%d>(CassandraClient<%s-%d>):100", ":9160", "");
        tSSLTransportParameters7.setTrustStore("0:9160", "hi!:0");
        tSSLTransportParameters7.setKeyStore("0(0.0.0.0):5", "(127.0.0.1)((127.0.0.1)):32");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient27 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters7);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient27.equals(null)", !hThriftClient27.equals(null));
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1847");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("606", (int) (byte) 0);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):1", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:10", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0(0.0.0.0):9160", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))((127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))):36", strArray16);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient32 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters31);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient32.equals(null)", !hThriftClient32.equals(null));
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1848");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0(0.0.0.0):-1", (int) ' ');
        int int3 = cassandraHost2.getPort();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1849");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("0");
        boolean boolean2 = cassandraHost1.isPerformNameResolution();
        java.lang.String str3 = cassandraHost1.getIp();
        cassandraHost1.setUseSocketKeepalive(true);
        java.lang.String str6 = cassandraHost1.toString();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1850");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)", (int) '#');
        int int3 = cassandraHost2.getCassandraThriftSocketTimeout();
        boolean boolean4 = cassandraHost2.getUseThriftFramedTransport();
        int int5 = cassandraHost2.getPort();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1851");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":1", (int) (short) 52);
        cassandraHost2.setCassandraThriftSocketTimeout((int) (short) 399);
        java.lang.String str5 = cassandraHost2.toString();
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:10", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray13);
        tSSLTransportParameters19.requireClientAuth(false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient22 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters19);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient22.equals(null)", !hThriftClient22.equals(null));
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1852");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>:50", (int) (byte) 82);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1853");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost(":9160");
        java.lang.String str2 = cassandraHost1.getUrl();
        int int3 = cassandraHost1.getPort();
        long long4 = cassandraHost1.getMaxWaitTimeWhenExhausted();
        java.lang.String[] strArray11 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:10", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0.0.0.1:10", strArray11);
        tSSLTransportParameters17.setKeyStore(":1", "207", ":10(:10):9160", "CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):206");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient23 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters17);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient23.equals(null)", !hThriftClient23.equals(null));
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1854");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):35");
        java.lang.String str2 = cassandraHost1.getUrl();
        java.lang.String str3 = cassandraHost1.toString();
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray14);
        tSSLTransportParameters25.setTrustStore("10", "(127.0.0.1):10", "(127.0.0.1):1", "0");
        tSSLTransportParameters25.setKeyStore("10", "");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient34 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters25);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient34.equals(null)", !hThriftClient34.equals(null));
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1855");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):9160", (int) (short) 1);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray17, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1:52", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1:52", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("-2", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1))):0", strArray17, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient36 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters35);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient36.equals(null)", !hThriftClient36.equals(null));
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1856");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) 'a');
        long long3 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        int int4 = cassandraHost2.getPort();
        boolean boolean5 = cassandraHost2.getUseSocketKeepalive();
        cassandraHost2.setUseSocketKeepalive(true);
        int int8 = cassandraHost2.getPort();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1857");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("1", 3);
        cassandraHost2.setCassandraThriftSocketTimeout((int) (byte) -55);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray17, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):32", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("194", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!(hi!)", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("412", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):0", strArray17);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient30 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters29);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient30.equals(null)", !hThriftClient30.equals(null));
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1858");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", 0);
        java.lang.String str3 = cassandraHost2.toString();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0(0.0.0.0):9160", strArray10);
        tSSLTransportParameters14.requireClientAuth(false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient17 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters14);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient17.equals(null)", !hThriftClient17.equals(null));
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1859");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0", (int) (short) -1);
        boolean boolean3 = cassandraHost2.getUseSocketKeepalive();
        int int4 = cassandraHost2.getMaxActive();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1860");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) 'a');
        boolean boolean3 = cassandraHost2.getLifo();
        java.lang.String str4 = cassandraHost2.toString();
        boolean boolean5 = cassandraHost2.getUseSocketKeepalive();
        long long6 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        boolean boolean7 = cassandraHost2.isPerformNameResolution();
        cassandraHost2.setMaxActive(207);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1861");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("126", (int) (byte) 16);
        boolean boolean3 = cassandraHost2.getLifo();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1862");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost(":9160");
        boolean boolean2 = cassandraHost1.getLifo();
        cassandraHost1.setUseSocketKeepalive(false);
        int int5 = cassandraHost1.getPort();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1863");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!(hi!):10", (int) (short) 0);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!(hi!):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters7 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!(hi!):100", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters8 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":1(:1):85", strArray6);
        tSSLTransportParameters8.setTrustStore("404", "114");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient12 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters8);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient12.equals(null)", !hThriftClient12.equals(null));
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1864");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":1", (int) (short) -1);
        long long3 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray18, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("97", strArray18, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1:0", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160(:9160):296", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("96", strArray18);
        boolean boolean36 = cassandraHost2.equals((java.lang.Object) tSSLTransportParameters35);
        java.lang.String[] strArray47 = new java.lang.String[] { "127.0.0.1", "", "CassandraClient<%s-%d>", "0" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters48 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray47);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters49 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1", strArray47);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters50 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("606", strArray47);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters51 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):10", strArray47);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters52 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray47);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters54 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:35", strArray47, true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient55 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters54);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient55.equals(null)", !hThriftClient55.equals(null));
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1865");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160", 0);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1866");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 194);
        boolean boolean3 = cassandraHost2.getUseSocketKeepalive();
        java.lang.String str4 = cassandraHost2.getIp();
        long long5 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        cassandraHost2.setMaxWaitTimeWhenExhausted(111L);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1867");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (short) 10);
        java.lang.String str3 = cassandraHost2.getIp();
        cassandraHost2.setUseThriftFramedTransport(false);
        long long6 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        cassandraHost2.setLifo(true);
        boolean boolean9 = cassandraHost2.getUseThriftFramedTransport();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1868");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>:2", (-2));
        java.lang.String str3 = cassandraHost2.getIp();
        cassandraHost2.setUseSocketKeepalive(false);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160:9160", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160(:9160):52", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):35", strArray15, false);
        tSSLTransportParameters25.setKeyStore("1(0.0.0.1):9160", "(127.0.0.1)((127.0.0.1)):10", "504", "CassandraClient<%s-%d>:2");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient31 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters25);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient31.equals(null)", !hThriftClient31.equals(null));
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1869");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) (short) 5);
        boolean boolean3 = cassandraHost2.getUseSocketKeepalive();
        long long4 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        java.lang.String[] strArray14 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("10", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":10(:10):9160", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):32", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):1", strArray14, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient26 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters25);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient26.equals(null)", !hThriftClient26.equals(null));
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1870");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (byte) 10);
        boolean boolean3 = cassandraHost2.isPerformNameResolution();
        cassandraHost2.setCassandraThriftSocketTimeout((int) (byte) 10);
        java.lang.String str6 = cassandraHost2.getName();
        java.lang.String str7 = cassandraHost2.toString();
        boolean boolean8 = cassandraHost2.isPerformNameResolution();
        java.lang.String[] strArray21 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray21, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray21);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray21, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray21, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>)", strArray21);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1:0", strArray21);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("3", strArray21);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray21);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1(0.0.0.1):6", strArray21, true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient35 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters34);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient35.equals(null)", !hThriftClient35.equals(null));
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1871");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("-4", 0);
        java.lang.String str3 = cassandraHost2.toString();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1872");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("1:6", (int) (short) 109);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("97", strArray14);
        tSSLTransportParameters26.setKeyStore("CassandraClient<%s-%d>(CassandraClient<%s-%d>)", "(127.0.0.1):194", "(127.0.0.1)((127.0.0.1)):100", "1");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient32 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters26);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient32.equals(null)", !hThriftClient32.equals(null));
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1873");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!(hi!)(hi!(hi!)):9160", (-3));
        java.lang.String str3 = cassandraHost2.getHost();
        java.lang.String str4 = cassandraHost2.getHost();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray18, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1", strArray18, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("10", strArray18, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient34 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters33);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient34.equals(null)", !hThriftClient34.equals(null));
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1874");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        boolean boolean3 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String str4 = cassandraHost2.getName();
        boolean boolean5 = cassandraHost2.getUseSocketKeepalive();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 0);
        float float8 = atomicLong7.floatValue();
        long long10 = atomicLong7.getAndAdd(0L);
        atomicLong7.set((-1L));
        double double13 = atomicLong7.doubleValue();
        long long14 = atomicLong7.decrementAndGet();
        boolean boolean15 = cassandraHost2.equals((java.lang.Object) long14);
        cassandraHost2.setMaxWaitTimeWhenExhausted(108L);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient18 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient18.equals(null)", !hThriftClient18.equals(null));
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1875");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):10", (int) (short) 0);
        boolean boolean3 = cassandraHost2.getLifo();
        boolean boolean4 = cassandraHost2.isPerformNameResolution();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):1", strArray17, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:10", strArray17, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0(0.0.0.0):9160", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160:9160", strArray17);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient32 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters31);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient32.equals(null)", !hThriftClient32.equals(null));
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1876");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("399", (int) (byte) 9);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1877");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) (short) 5);
        long long3 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        int int4 = cassandraHost2.getPort();
        boolean boolean5 = cassandraHost2.getUseSocketKeepalive();
        java.lang.String str6 = cassandraHost2.toString();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1878");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):32");
        int int2 = cassandraHost1.getCassandraThriftSocketTimeout();
        java.lang.String str3 = cassandraHost1.toString();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1879");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):9160", (int) (byte) 97);
        java.lang.String str3 = cassandraHost2.toString();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray8, true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient12 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters11);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient12.equals(null)", !hThriftClient12.equals(null));
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1880");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("9160(0.0.35.200):216", (int) (short) 707);
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray9, false);
        tSSLTransportParameters14.requireClientAuth(false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient17 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters14);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient17.equals(null)", !hThriftClient17.equals(null));
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1881");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("25", 84);
        boolean boolean3 = cassandraHost2.getUseThriftFramedTransport();
        cassandraHost2.setMaxWaitTimeWhenExhausted(9179L);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1882");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):0");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient2 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient2.equals(null)", !hThriftClient2.equals(null));
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1883");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!(hi!)", (int) '4');
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1884");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (short) 10);
        int int3 = cassandraHost2.getPort();
        boolean boolean4 = cassandraHost2.getLifo();
        int int5 = cassandraHost2.getMaxActive();
        java.lang.String str6 = cassandraHost2.getIp();
        cassandraHost2.setCassandraThriftSocketTimeout((int) ' ');
        boolean boolean9 = cassandraHost2.getLifo();
        boolean boolean10 = cassandraHost2.getLifo();
        cassandraHost2.setMaxActive(11);
        int int13 = cassandraHost2.getCassandraThriftSocketTimeout();
        java.lang.String[] strArray24 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray24, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray24);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray24);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("10", strArray24, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":10(:10):9160", strArray24, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):32", strArray24);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1", strArray24, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:9160", strArray24);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient37 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters36);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient37.equals(null)", !hThriftClient37.equals(null));
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1885");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("2");
        java.lang.String str2 = cassandraHost1.getUrl();
        cassandraHost1.setMaxWaitTimeWhenExhausted((long) 84);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0.0.0.1", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("6:10", strArray17);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient32 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters31);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient32.equals(null)", !hThriftClient32.equals(null));
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1886");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):100", (int) '4');
        java.lang.String str3 = cassandraHost2.getHost();
        cassandraHost2.setMaxWaitTimeWhenExhausted(0L);
        java.lang.String[] strArray15 = new java.lang.String[] { "(127.0.0.1):1", "(127.0.0.1):10", "(127.0.0.1)((127.0.0.1)):32", "1:52", "10" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):32", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("194", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):97", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("-2", strArray15);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient22 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters21);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient22.equals(null)", !hThriftClient22.equals(null));
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1887");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160(:9160):206", 213);
        java.util.concurrent.atomic.AtomicLong atomicLong4 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 0);
        long long5 = atomicLong4.getAndIncrement();
        double double6 = atomicLong4.doubleValue();
        long long7 = atomicLong4.decrementAndGet();
        double double8 = atomicLong4.doubleValue();
        long long9 = atomicLong4.incrementAndGet();
        long long10 = atomicLong4.getAndIncrement();
        double double11 = atomicLong4.doubleValue();
        long long12 = atomicLong4.incrementAndGet();
        atomicLong4.set(500L);
        float float15 = atomicLong4.floatValue();
        boolean boolean16 = cassandraHost2.equals((java.lang.Object) float15);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient17 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient17.equals(null)", !hThriftClient17.equals(null));
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1888");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("25", 597);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1889");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):100", (int) '4');
        java.lang.String str3 = cassandraHost2.toString();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1890");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)", (int) (short) 1);
        boolean boolean3 = cassandraHost2.getLifo();
        java.lang.String[] strArray9 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray9);
        tSSLTransportParameters13.setKeyStore(":9160", "127.0.0.1");
        tSSLTransportParameters13.setKeyStore("", "hi!:10", "1", ":9160:9160");
        tSSLTransportParameters13.setTrustStore("CassandraClient<%s-%d>", "", "CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", "10");
        tSSLTransportParameters13.setKeyStore("1:52", ":9160(:9160):206");
        tSSLTransportParameters13.setKeyStore("", "416(0.0.1.160):11");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient33 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters13);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient33.equals(null)", !hThriftClient33.equals(null));
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1891");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        boolean boolean3 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String str4 = cassandraHost2.getHost();
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) 'a');
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1892");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("111", 16);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:10", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>:1", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0.0.0.194", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1:105", strArray12);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient22 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters21);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient22.equals(null)", !hThriftClient22.equals(null));
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1893");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", 99);
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray13);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient25 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters24);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient25.equals(null)", !hThriftClient25.equals(null));
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1894");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):10", (int) (byte) 100);
        cassandraHost2.setMaxWaitTimeWhenExhausted(12L);
        cassandraHost2.setMaxWaitTimeWhenExhausted(100L);
        cassandraHost2.setMaxActive((int) (byte) 97);
        java.lang.String str9 = cassandraHost2.getUrl();
        cassandraHost2.setUseSocketKeepalive(true);
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray20, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray20, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray20, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("207", strArray20, true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient30 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters29);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient30.equals(null)", !hThriftClient30.equals(null));
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1895");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!:10", (int) (short) -3);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):100", 207);
        boolean boolean6 = cassandraHost2.equals((java.lang.Object) cassandraHost5);
        boolean boolean7 = cassandraHost5.isPerformNameResolution();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost5);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1896");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) 'a');
        boolean boolean3 = cassandraHost2.getLifo();
        java.lang.String str4 = cassandraHost2.toString();
        boolean boolean5 = cassandraHost2.getUseSocketKeepalive();
        long long6 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        boolean boolean7 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String str8 = cassandraHost2.getUrl();
        cassandraHost2.setMaxWaitTimeWhenExhausted(509L);
        java.lang.String str11 = cassandraHost2.getUrl();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient23 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters22);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient23.equals(null)", !hThriftClient23.equals(null));
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1897");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):97", 221);
        cassandraHost2.setLifo(true);
        cassandraHost2.setUseSocketKeepalive(false);
        java.lang.String[] strArray13 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:10", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0.0.0.1:10", strArray13);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient20 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters19);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient20.equals(null)", !hThriftClient20.equals(null));
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1898");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):10", (int) (byte) 100);
        cassandraHost2.setMaxWaitTimeWhenExhausted(12L);
        cassandraHost2.setMaxWaitTimeWhenExhausted(100L);
        cassandraHost2.setMaxActive((int) (byte) 97);
        boolean boolean9 = cassandraHost2.isPerformNameResolution();
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray20, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0:9160", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("111", strArray20, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":97", strArray20);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient30 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters29);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient30.equals(null)", !hThriftClient30.equals(null));
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1899");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        cassandraHost2.setUseSocketKeepalive(false);
        java.lang.String str5 = cassandraHost2.toString();
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0.0.0.1", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":10", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":52", strArray15);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient26 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters25);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient26.equals(null)", !hThriftClient26.equals(null));
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1900");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("61", (int) (byte) 114);
        java.lang.String[] strArray13 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:10", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("602", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("10(0.0.0.10)(10(0.0.0.10)):406", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("6", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):0", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1(0.0.0.1):-40", strArray13);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient28 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters27);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient28.equals(null)", !hThriftClient28.equals(null));
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1901");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("9160", 216);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1902");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) (byte) -66);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):100", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0(0.0.0.0):-1", strArray14, true);
        tSSLTransportParameters28.setKeyStore("0", ":10", "(127.0.0.1)((127.0.0.1)):32", ":1");
        tSSLTransportParameters28.requireClientAuth(true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient36 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters28);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient36.equals(null)", !hThriftClient36.equals(null));
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1903");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) (short) 5);
        long long3 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        int int4 = cassandraHost2.getPort();
        java.lang.String str5 = cassandraHost2.getIp();
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient23 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters22);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient23.equals(null)", !hThriftClient23.equals(null));
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1904");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("602(0.0.2.90):416", 50);
        java.lang.String[] strArray11 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):32", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("-55", strArray11);
        tSSLTransportParameters18.setTrustStore(":52", "10");
        boolean boolean22 = cassandraHost2.equals((java.lang.Object) tSSLTransportParameters18);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient23 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient23.equals(null)", !hThriftClient23.equals(null));
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1905");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("194:99");
        boolean boolean2 = cassandraHost1.getUseThriftFramedTransport();
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":97", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("6(0.0.0.6):-2", strArray14);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient27 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters26);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient27.equals(null)", !hThriftClient27.equals(null));
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1906");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        boolean boolean3 = cassandraHost2.getUseThriftFramedTransport();
        boolean boolean4 = cassandraHost2.getUseSocketKeepalive();
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray13, false);
        tSSLTransportParameters22.setTrustStore("hi!(hi!):10", "416(0.0.1.160):11", "", ":10(:10)");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient28 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters22);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient28.equals(null)", !hThriftClient28.equals(null));
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1907");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("0");
        boolean boolean2 = cassandraHost1.isPerformNameResolution();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1908");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("-4");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient2 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient2.equals(null)", !hThriftClient2.equals(null));
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1909");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("1:52", (int) (short) 48);
        int int3 = cassandraHost2.getPort();
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("10", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("96(0.0.0.96):54", strArray14);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient26 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters25);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient26.equals(null)", !hThriftClient26.equals(null));
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1910");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) 'a');
        boolean boolean3 = cassandraHost2.getLifo();
        cassandraHost2.setCassandraThriftSocketTimeout(1);
        int int6 = cassandraHost2.getMaxActive();
        int int7 = cassandraHost2.getCassandraThriftSocketTimeout();
        cassandraHost2.setUseThriftFramedTransport(true);
        cassandraHost2.setUseThriftFramedTransport(true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient12 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient12.equals(null)", !hThriftClient12.equals(null));
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1911");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):10");
        java.lang.String str2 = cassandraHost1.getHost();
        java.lang.String str3 = cassandraHost1.getName();
        int int4 = cassandraHost1.getCassandraThriftSocketTimeout();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1912");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", 32);
        boolean boolean3 = cassandraHost2.isPerformNameResolution();
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):1", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):100", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0:-1", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("195", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>:32", strArray15, true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient27 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters26);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient27.equals(null)", !hThriftClient27.equals(null));
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1913");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>))", 12);
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
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters41 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1(127.0.0.1):52", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters43 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("97", strArray19, true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient44 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters43);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient44.equals(null)", !hThriftClient44.equals(null));
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1914");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("hi!(hi!):100");
        java.lang.String str2 = cassandraHost1.getHost();
        boolean boolean3 = cassandraHost1.getUseSocketKeepalive();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray17, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1:52", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("97", strArray17, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient33 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters32);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient33.equals(null)", !hThriftClient33.equals(null));
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1915");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) 'a');
        boolean boolean3 = cassandraHost2.getLifo();
        java.lang.String str4 = cassandraHost2.getIp();
        cassandraHost2.setMaxActive((int) (byte) 36);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):1", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("199", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1", strArray17);
        tSSLTransportParameters27.setTrustStore(":9160:296", ":9160(:9160):296", "hi!(hi!):100", "10(0.0.0.10):-1");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient33 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters27);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient33.equals(null)", !hThriftClient33.equals(null));
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1916");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (short) 10);
        int int3 = cassandraHost2.getPort();
        boolean boolean4 = cassandraHost2.getLifo();
        int int5 = cassandraHost2.getMaxActive();
        java.lang.String str6 = cassandraHost2.getIp();
        cassandraHost2.setCassandraThriftSocketTimeout((int) ' ');
        java.lang.String str9 = cassandraHost2.getHost();
        cassandraHost2.setCassandraThriftSocketTimeout((int) '#');
        boolean boolean12 = cassandraHost2.isPerformNameResolution();
        cassandraHost2.setMaxWaitTimeWhenExhausted(204L);
        boolean boolean15 = cassandraHost2.getUseThriftFramedTransport();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient16 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient16.equals(null)", !hThriftClient16.equals(null));
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1917");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):0", 101);
        cassandraHost2.setUseSocketKeepalive(false);
        java.lang.String[] strArray13 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("195", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("105", strArray13);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient20 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters19);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient20.equals(null)", !hThriftClient20.equals(null));
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1918");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160:9160", 213);
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:10", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:10", strArray11);
        tSSLTransportParameters18.setKeyStore("3", "CassandraClient<%s-%d>:97", "0:9160", "hi!(hi!):10");
        tSSLTransportParameters18.setKeyStore("CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>))", ":10(:10)");
        tSSLTransportParameters18.setKeyStore("CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):0", "CassandraClient<%s-%d>");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient30 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters18);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient30.equals(null)", !hThriftClient30.equals(null));
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1919");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))((127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))):36", 197);
        cassandraHost2.setUseThriftFramedTransport(false);
        cassandraHost2.setCassandraThriftSocketTimeout((int) (short) 707);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1920");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", 100);
        java.lang.String str3 = cassandraHost2.toString();
        int int4 = cassandraHost2.getPort();
        boolean boolean5 = cassandraHost2.getUseSocketKeepalive();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1921");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160(:9160):296", 0);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1922");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        cassandraHost2.setUseSocketKeepalive(false);
        boolean boolean5 = cassandraHost2.getLifo();
        java.lang.String[] strArray9 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        tSSLTransportParameters10.setTrustStore("hi!", "", "hi!", "hi!");
        boolean boolean16 = cassandraHost2.equals((java.lang.Object) "hi!");
        cassandraHost2.setLifo(true);
        boolean boolean19 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String[] strArray31 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray31, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray31);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray31, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters38 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray31, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters39 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray31);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters41 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1", strArray31, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters43 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):1", strArray31, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters45 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160:9160", strArray31, false);
        tSSLTransportParameters45.setTrustStore("1(0.0.0.1):6", "1(0.0.0.1):48", "348", ":9160:296");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient51 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters45);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient51.equals(null)", !hThriftClient51.equals(null));
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1923");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("194", 99);
        cassandraHost2.setMaxWaitTimeWhenExhausted((-69L));
        cassandraHost2.setUseThriftFramedTransport(false);
        java.lang.String str7 = cassandraHost2.toString();
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray20, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray20, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray20, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):1", strArray20, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:10", strArray20, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0(0.0.0.0):9160", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("-2", strArray20);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient35 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters34);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient35.equals(null)", !hThriftClient35.equals(null));
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1924");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("29", (int) (byte) 11);
        int int3 = cassandraHost2.getPort();
        cassandraHost2.setMaxWaitTimeWhenExhausted(9266L);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1925");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 123);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1926");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("2");
        java.lang.String str2 = cassandraHost1.getUrl();
        cassandraHost1.setMaxWaitTimeWhenExhausted((long) 84);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1927");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (short) 10);
        int int3 = cassandraHost2.getPort();
        boolean boolean4 = cassandraHost2.getLifo();
        int int5 = cassandraHost2.getMaxActive();
        cassandraHost2.setMaxActive(52);
        boolean boolean8 = cassandraHost2.getLifo();
        java.lang.String str9 = cassandraHost2.getIp();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1928");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("194", 11);
        cassandraHost2.setMaxWaitTimeWhenExhausted(221L);
        boolean boolean5 = cassandraHost2.getLifo();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1929");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 0);
        long long3 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        java.lang.String str4 = cassandraHost2.toString();
        int int5 = cassandraHost2.getMaxActive();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1930");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (byte) 10);
        boolean boolean3 = cassandraHost2.isPerformNameResolution();
        java.lang.String str4 = cassandraHost2.getHost();
        int int5 = cassandraHost2.getPort();
        java.lang.String str6 = cassandraHost2.getHost();
        int int7 = cassandraHost2.getCassandraThriftSocketTimeout();
        java.util.concurrent.atomic.AtomicLong atomicLong9 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long10 = atomicLong9.getAndIncrement();
        long long11 = atomicLong9.longValue();
        int int12 = atomicLong9.intValue();
        long long14 = atomicLong9.getAndAdd(12L);
        boolean boolean15 = cassandraHost2.equals((java.lang.Object) long14);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient16 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient16.equals(null)", !hThriftClient16.equals(null));
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1931");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) (short) 5);
        long long3 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        boolean boolean4 = cassandraHost2.isPerformNameResolution();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray17, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):9160", strArray17, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray17, true);
        boolean boolean32 = cassandraHost2.equals((java.lang.Object) true);
        java.lang.String[] strArray42 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters44 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray42, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters46 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray42, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters47 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray42);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters49 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray42, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters50 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):32", strArray42);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters51 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("131", strArray42);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient52 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters51);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient52.equals(null)", !hThriftClient52.equals(null));
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1932");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        cassandraHost2.setUseSocketKeepalive(false);
        java.lang.String str5 = cassandraHost2.toString();
        cassandraHost2.setCassandraThriftSocketTimeout((int) (byte) 0);
        java.lang.String str8 = cassandraHost2.getName();
        java.lang.String[] strArray21 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray21, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray21);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray21, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray21, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray21);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray21, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray21, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray21, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):10", strArray21, true);
        tSSLTransportParameters37.requireClientAuth(false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient40 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters37);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient40.equals(null)", !hThriftClient40.equals(null));
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1933");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) ' ');
        java.lang.String str3 = cassandraHost2.getName();
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):1", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("25", strArray16, true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient31 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters30);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient31.equals(null)", !hThriftClient31.equals(null));
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1934");
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
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient19 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient19.equals(null)", !hThriftClient19.equals(null));
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1935");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        cassandraHost2.setUseSocketKeepalive(false);
        boolean boolean5 = cassandraHost2.getLifo();
        int int6 = cassandraHost2.getCassandraThriftSocketTimeout();
        cassandraHost2.setLifo(true);
        java.lang.String str9 = cassandraHost2.getUrl();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":1", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1(0.0.0.1):6", strArray18);
        tSSLTransportParameters25.setKeyStore("(127.0.0.1)((127.0.0.1)):35", "");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient29 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters25);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient29.equals(null)", !hThriftClient29.equals(null));
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1936");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("195");
        cassandraHost1.setMaxActive((int) (byte) 114);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1937");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0.0.0.0", 6);
        int int3 = cassandraHost2.getCassandraThriftSocketTimeout();
        cassandraHost2.setMaxWaitTimeWhenExhausted(395L);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):0", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160(:9160):296", strArray16, true);
        tSSLTransportParameters28.setTrustStore("0(0.0.0.0):-1", ":9160((:9160():197");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient32 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters28);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient32.equals(null)", !hThriftClient32.equals(null));
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1938");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):10", (int) (short) 48);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1939");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):1", (int) (short) 500);
        boolean boolean3 = cassandraHost2.getUseSocketKeepalive();
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
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1))):0", strArray18, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient37 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters36);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient37.equals(null)", !hThriftClient37.equals(null));
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1940");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 9160);
        cassandraHost2.setCassandraThriftSocketTimeout((int) (byte) -56);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1941");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 1);
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) (short) 100);
        cassandraHost2.setUseSocketKeepalive(false);
        cassandraHost2.setLifo(true);
        boolean boolean9 = cassandraHost2.getLifo();
        java.lang.String str10 = cassandraHost2.getUrl();
        java.lang.String str11 = cassandraHost2.getUrl();
        java.lang.String[] strArray21 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray21, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray21, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray21);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160:9160", strArray21);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160(:9160):52", strArray21, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):35", strArray21, false);
        tSSLTransportParameters31.setKeyStore("1(0.0.0.1):9160", "(127.0.0.1)((127.0.0.1)):10", "504", "CassandraClient<%s-%d>:2");
        tSSLTransportParameters31.setTrustStore("-69", "126", "", ":9160(:197");
        tSSLTransportParameters31.requireClientAuth(true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient44 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters31);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient44.equals(null)", !hThriftClient44.equals(null));
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1942");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160(:9160):52", (int) (byte) 0);
        int int3 = cassandraHost2.getMaxActive();
        cassandraHost2.setUseSocketKeepalive(false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1943");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):10");
        java.lang.String str2 = cassandraHost1.getHost();
        cassandraHost1.setUseSocketKeepalive(false);
        int int5 = cassandraHost1.getCassandraThriftSocketTimeout();
        int int6 = cassandraHost1.getMaxActive();
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16);
        tSSLTransportParameters25.setKeyStore("CassandraClient<%s-%d>:1", "hi!:10");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient29 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters25);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient29.equals(null)", !hThriftClient29.equals(null));
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1944");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        boolean boolean3 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String str4 = cassandraHost2.getHost();
        int int5 = cassandraHost2.getPort();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1945");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        java.util.concurrent.atomic.AtomicLong atomicLong3 = new java.util.concurrent.atomic.AtomicLong();
        long long5 = atomicLong3.addAndGet((long) (byte) -1);
        boolean boolean6 = cassandraHost2.equals((java.lang.Object) (byte) -1);
        boolean boolean7 = cassandraHost2.getUseSocketKeepalive();
        cassandraHost2.setLifo(false);
        long long10 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        int int11 = cassandraHost2.getPort();
        cassandraHost2.setUseThriftFramedTransport(true);
        int int14 = cassandraHost2.getCassandraThriftSocketTimeout();
        cassandraHost2.setMaxWaitTimeWhenExhausted(9407L);
        java.lang.String[] strArray26 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray26, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray26, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray26);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("9160", strArray26, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0.0.0.1", strArray26);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):97", strArray26, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient37 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters36);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient37.equals(null)", !hThriftClient37.equals(null));
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1946");
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
        java.lang.String[] strArray34 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray34, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray34);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters39 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray34, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters41 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray34, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters42 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray34);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters44 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray34, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters45 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("10(0.0.0.10):-1", strArray34);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters47 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("6(0.0.0.6):-2", strArray34, true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient48 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters47);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient48.equals(null)", !hThriftClient48.equals(null));
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1947");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        cassandraHost2.setUseSocketKeepalive(false);
        java.lang.String str5 = cassandraHost2.toString();
        cassandraHost2.setUseThriftFramedTransport(true);
        cassandraHost2.setMaxActive((int) 'a');
        java.lang.String str10 = cassandraHost2.getName();
        long long11 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        java.lang.String[] strArray25 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray25, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray25, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray25);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray25, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray25);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray25);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("195", strArray25);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>:1", strArray25);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters38 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0(0.0.0.0):0", strArray25, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters40 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!(hi!):296", strArray25, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient41 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters40);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient41.equals(null)", !hThriftClient41.equals(null));
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1948");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":52", (int) (byte) 36);
        java.lang.String str3 = cassandraHost2.getHost();
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("10(0.0.0.10):-1", strArray15, true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient29 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters28);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient29.equals(null)", !hThriftClient29.equals(null));
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1949");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("126", (int) (short) 15);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1950");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 1);
        cassandraHost2.setLifo(true);
        java.lang.String str5 = cassandraHost2.toString();
        java.lang.String str6 = cassandraHost2.getIp();
        cassandraHost2.setUseSocketKeepalive(true);
        java.lang.String str9 = cassandraHost2.getHost();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1951");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 84);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters7 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6);
        tSSLTransportParameters7.setTrustStore("hi!", "", "hi!", "hi!");
        tSSLTransportParameters7.setKeyStore("CassandraClient<%s-%d>", "");
        tSSLTransportParameters7.requireClientAuth(true);
        tSSLTransportParameters7.setTrustStore("0", "", "hi!(hi!):9160", "0.0.0.0");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient23 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters7);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient23.equals(null)", !hThriftClient23.equals(null));
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1952");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):0", (int) (byte) 101);
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, true);
        tSSLTransportParameters17.setKeyStore("CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):0", "194", "(127.0.0.1):10", "194");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient23 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters17);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient23.equals(null)", !hThriftClient23.equals(null));
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1953");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) 'a');
        long long3 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        long long4 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        java.lang.String str5 = cassandraHost2.getIp();
        cassandraHost2.setCassandraThriftSocketTimeout(0);
        cassandraHost2.setLifo(false);
        cassandraHost2.setLifo(false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient12 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient12.equals(null)", !hThriftClient12.equals(null));
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1954");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0", (int) (byte) 35);
        java.util.concurrent.atomic.AtomicLong atomicLong4 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 3);
        boolean boolean5 = cassandraHost2.equals((java.lang.Object) atomicLong4);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1955");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("hi!(hi!):100");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient2 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient2.equals(null)", !hThriftClient2.equals(null));
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1956");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)", (-1));
        boolean boolean4 = cassandraHost2.equals((java.lang.Object) (-3.0d));
        boolean boolean5 = cassandraHost2.isPerformNameResolution();
        int int6 = cassandraHost2.getPort();
        cassandraHost2.setUseThriftFramedTransport(true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1957");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (short) 10);
        java.lang.String str3 = cassandraHost2.getIp();
        cassandraHost2.setUseThriftFramedTransport(false);
        cassandraHost2.setUseThriftFramedTransport(false);
        cassandraHost2.setMaxWaitTimeWhenExhausted(9159L);
        java.util.concurrent.atomic.AtomicLong atomicLong11 = new java.util.concurrent.atomic.AtomicLong(9174L);
        atomicLong11.lazySet(403L);
        long long14 = atomicLong11.decrementAndGet();
        boolean boolean15 = cassandraHost2.equals((java.lang.Object) long14);
        java.lang.String str16 = cassandraHost2.getName();
        java.lang.String[] strArray26 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray26, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray26);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray26, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray26, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray26);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0", strArray26);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient36 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters35);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient36.equals(null)", !hThriftClient36.equals(null));
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1958");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (short) 10);
        int int3 = cassandraHost2.getPort();
        boolean boolean4 = cassandraHost2.getLifo();
        int int5 = cassandraHost2.getMaxActive();
        cassandraHost2.setMaxActive(52);
        int int8 = cassandraHost2.getCassandraThriftSocketTimeout();
        long long9 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        int int10 = cassandraHost2.getMaxActive();
        java.lang.String[] strArray21 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray21, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray21, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray21, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0.0.0.1", strArray21);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":10", strArray21, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":52", strArray21);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("107", strArray21);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient33 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters32);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient33.equals(null)", !hThriftClient33.equals(null));
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1959");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        boolean boolean3 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String str4 = cassandraHost2.getHost();
        boolean boolean5 = cassandraHost2.isPerformNameResolution();
        long long6 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("9160", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("3", strArray15);
        tSSLTransportParameters23.requireClientAuth(false);
        boolean boolean26 = cassandraHost2.equals((java.lang.Object) tSSLTransportParameters23);
        java.lang.String[] strArray35 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray35);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray35);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters38 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray35);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters39 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray35);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters40 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):1", strArray35);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters42 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!(hi!):9160", strArray35, false);
        tSSLTransportParameters42.setKeyStore("", "606");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient46 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters42);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient46.equals(null)", !hThriftClient46.equals(null));
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1960");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("97");
        cassandraHost1.setMaxWaitTimeWhenExhausted(107L);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0.0.0.1", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":10", strArray12, false);
        tSSLTransportParameters21.requireClientAuth(true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient24 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters21);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient24.equals(null)", !hThriftClient24.equals(null));
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1961");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("hi!:10");
        boolean boolean2 = cassandraHost1.getUseSocketKeepalive();
        java.lang.String str3 = cassandraHost1.getHost();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1962");
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
        java.lang.String str28 = cassandraHost2.getUrl();
        java.lang.String str29 = cassandraHost2.getHost();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient30 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient30.equals(null)", !hThriftClient30.equals(null));
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1963");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):32", (int) (short) 206);
        boolean boolean3 = cassandraHost2.isPerformNameResolution();
        java.lang.String[] strArray14 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("3", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("815", strArray14);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient25 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters24);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient25.equals(null)", !hThriftClient25.equals(null));
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1964");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160", (int) (byte) -2);
        cassandraHost2.setCassandraThriftSocketTimeout((int) (byte) 1);
        boolean boolean5 = cassandraHost2.isPerformNameResolution();
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("194", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray15, true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient27 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters26);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient27.equals(null)", !hThriftClient27.equals(null));
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1965");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>:50", (int) (byte) 82);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":10", strArray12, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient23 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters22);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient23.equals(null)", !hThriftClient23.equals(null));
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1966");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        cassandraHost2.setUseSocketKeepalive(false);
        int int5 = cassandraHost2.getCassandraThriftSocketTimeout();
        boolean boolean6 = cassandraHost2.getLifo();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray18, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("416(0.0.1.160)(416(0.0.1.160)):11", strArray18);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient30 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters29);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient30.equals(null)", !hThriftClient30.equals(null));
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1967");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) 'a');
        int int3 = cassandraHost2.getPort();
        boolean boolean4 = cassandraHost2.getUseSocketKeepalive();
        cassandraHost2.setMaxActive(12);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1968");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", 207);
        java.lang.String str3 = cassandraHost2.getIp();
        long long4 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        long long5 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        cassandraHost2.setMaxActive((int) (short) 293);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1969");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):32");
        java.lang.String str2 = cassandraHost1.toString();
        java.lang.String str3 = cassandraHost1.getName();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1970");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (short) 10);
        cassandraHost2.setUseSocketKeepalive(true);
        long long5 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        java.lang.String str6 = cassandraHost2.getName();
        cassandraHost2.setMaxWaitTimeWhenExhausted(9L);
        java.lang.String[] strArray21 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray21, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray21);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray21, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray21, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray21);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray21);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray21, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("97", strArray21);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("-4", strArray21, true);
        tSSLTransportParameters35.setKeyStore("(127.0.0.1):52", "", "106", "");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient41 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters35);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient41.equals(null)", !hThriftClient41.equals(null));
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1971");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 1);
        int int3 = cassandraHost2.getPort();
        java.lang.String str4 = cassandraHost2.getUrl();
        cassandraHost2.setLifo(true);
        cassandraHost2.setUseThriftFramedTransport(false);
        int int9 = cassandraHost2.getCassandraThriftSocketTimeout();
        java.lang.String str10 = cassandraHost2.toString();
        java.lang.String[] strArray21 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray21, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray21, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:10", strArray21);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray21);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1:52", strArray21, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("209", strArray21, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":10(:10)(:10(:10)):84", strArray21);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient33 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters32);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient33.equals(null)", !hThriftClient33.equals(null));
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1972");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160", (int) (short) 194);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1973");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("399", (int) (byte) 48);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1974");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!:10", (int) (short) 0);
        boolean boolean3 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String str4 = cassandraHost2.toString();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1975");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("1", 100);
        cassandraHost2.setMaxWaitTimeWhenExhausted(199L);
        long long5 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1976");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("9", (int) (byte) -66);
        java.lang.String[] strArray11 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):9160", strArray11, true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient19 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters18);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient19.equals(null)", !hThriftClient19.equals(null));
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1977");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>)", 406);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1978");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160", (int) '4');
        int int3 = cassandraHost2.getPort();
        boolean boolean4 = cassandraHost2.getLifo();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1979");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1", (int) '4');
        java.lang.String str3 = cassandraHost2.getIp();
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) (byte) 124);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1980");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 123);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray17, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("10", strArray17, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("3", strArray17, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:35", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):295", strArray17);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient36 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters35);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient36.equals(null)", !hThriftClient36.equals(null));
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1981");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1", (int) (short) 1);
        int int3 = cassandraHost2.getCassandraThriftSocketTimeout();
        boolean boolean4 = cassandraHost2.getLifo();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1982");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost(":9160(:9160):1");
        int int2 = cassandraHost1.getMaxActive();
        boolean boolean3 = cassandraHost1.getLifo();
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160:9160", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0.0.0.6", strArray13);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient23 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters22);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient23.equals(null)", !hThriftClient23.equals(null));
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1983");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1", (int) (short) 1);
        int int3 = cassandraHost2.getCassandraThriftSocketTimeout();
        boolean boolean4 = cassandraHost2.isPerformNameResolution();
        cassandraHost2.setLifo(false);
        java.lang.String str7 = cassandraHost2.getName();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1:52", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient26 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters25);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient26.equals(null)", !hThriftClient26.equals(null));
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1984");
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
        java.lang.String[] strArray44 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters46 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray44, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters48 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray44, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters49 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray44);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters51 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray44, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters52 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray44);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters54 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":97", strArray44, true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient55 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters54);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient55.equals(null)", !hThriftClient55.equals(null));
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1985");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("10(0.0.0.10)(10(0.0.0.10)):406", (int) (short) 2);
        cassandraHost2.setCassandraThriftSocketTimeout(0);
        int int5 = cassandraHost2.getPort();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray17, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160:9160", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("-1", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0.0.0.194", strArray17, true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient30 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters29);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient30.equals(null)", !hThriftClient30.equals(null));
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1986");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("6(0.0.0.6)", (int) (short) 500);
        java.lang.String[] strArray11 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("97", strArray11, true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient19 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters18);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient19.equals(null)", !hThriftClient19.equals(null));
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1987");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        cassandraHost2.setUseSocketKeepalive(true);
        int int5 = cassandraHost2.getCassandraThriftSocketTimeout();
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) (byte) 53);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost10 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))((127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))):36", 197);
        cassandraHost10.setUseThriftFramedTransport(false);
        boolean boolean13 = cassandraHost2.equals((java.lang.Object) false);
        java.lang.String str14 = cassandraHost2.getUrl();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient15 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient15.equals(null)", !hThriftClient15.equals(null));
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1988");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160:9160", (int) ' ');
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):0", 9160);
        boolean boolean6 = cassandraHost2.equals((java.lang.Object) 9160);
        java.lang.String str7 = cassandraHost2.getIp();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1989");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 1);
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) (short) 100);
        cassandraHost2.setCassandraThriftSocketTimeout((int) '#');
        boolean boolean7 = cassandraHost2.getUseSocketKeepalive();
        java.lang.String str8 = cassandraHost2.getName();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1990");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):10");
        java.lang.String str2 = cassandraHost1.getHost();
        java.lang.String str3 = cassandraHost1.getName();
        int int4 = cassandraHost1.getPort();
        boolean boolean5 = cassandraHost1.getLifo();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1991");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 100);
        java.lang.String str3 = cassandraHost2.getHost();
        cassandraHost2.setMaxWaitTimeWhenExhausted(403L);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1992");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (short) 10);
        java.lang.String str3 = cassandraHost2.getIp();
        cassandraHost2.setLifo(true);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("0");
        java.lang.String str8 = cassandraHost7.getName();
        boolean boolean9 = cassandraHost7.getUseThriftFramedTransport();
        boolean boolean10 = cassandraHost2.equals((java.lang.Object) boolean9);
        java.lang.String str11 = cassandraHost2.getUrl();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient12 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient12.equals(null)", !hThriftClient12.equals(null));
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1993");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        boolean boolean3 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String str4 = cassandraHost2.getName();
        cassandraHost2.setUseThriftFramedTransport(true);
        java.lang.String str7 = cassandraHost2.getIp();
        cassandraHost2.setUseThriftFramedTransport(true);
        boolean boolean10 = cassandraHost2.getLifo();
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters();
        tSSLTransportParameters11.setTrustStore("hi!", "CassandraClient<%s-%d>");
        tSSLTransportParameters11.setTrustStore(":9160:9160", "");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient18 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters11);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient18.equals(null)", !hThriftClient18.equals(null));
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1994");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!(hi!):1", 9567);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1995");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160", (int) (short) 296);
        java.lang.String str3 = cassandraHost2.getName();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = new java.util.concurrent.atomic.AtomicLong((long) (short) -1);
        long long7 = atomicLong5.addAndGet((long) (short) 5);
        boolean boolean8 = cassandraHost2.equals((java.lang.Object) atomicLong5);
        int int9 = cassandraHost2.getPort();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1996");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("");
        java.lang.String str2 = cassandraHost1.getUrl();
        java.lang.String str3 = cassandraHost1.getUrl();
        java.lang.String str4 = cassandraHost1.getUrl();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) (short) -1);
        long long8 = cassandraHost7.getMaxWaitTimeWhenExhausted();
        boolean boolean9 = cassandraHost1.equals((java.lang.Object) long8);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1997");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("9160", 1);
        cassandraHost2.setMaxWaitTimeWhenExhausted(408L);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1998");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 1);
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) (short) 100);
        cassandraHost2.setUseThriftFramedTransport(true);
        cassandraHost2.setUseThriftFramedTransport(false);
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray23, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray23, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray23);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray23, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray23);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray23, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray23, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0", strArray23, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters39 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray23, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters41 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray23, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters42 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0(0.0.0.0):-1", strArray23);
        tSSLTransportParameters42.setKeyStore("hi!(hi!):10", "10:-1");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient46 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters42);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient46.equals(null)", !hThriftClient46.equals(null));
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1999");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        cassandraHost2.setUseSocketKeepalive(false);
        java.lang.String str5 = cassandraHost2.toString();
        cassandraHost2.setUseThriftFramedTransport(true);
        java.lang.String str8 = cassandraHost2.toString();
        int int9 = cassandraHost2.getPort();
        cassandraHost2.setMaxWaitTimeWhenExhausted(0L);
        boolean boolean12 = cassandraHost2.isPerformNameResolution();
        java.util.concurrent.atomic.AtomicLong atomicLong14 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 0);
        float float15 = atomicLong14.floatValue();
        double double16 = atomicLong14.doubleValue();
        long long18 = atomicLong14.getAndSet((long) 10);
        double double19 = atomicLong14.doubleValue();
        double double20 = atomicLong14.doubleValue();
        double double21 = atomicLong14.doubleValue();
        atomicLong14.set(0L);
        java.lang.String str24 = atomicLong14.toString();
        boolean boolean25 = cassandraHost2.equals((java.lang.Object) str24);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient26 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient26.equals(null)", !hThriftClient26.equals(null));
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test2000");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("602", (int) (short) 105);
        int int3 = cassandraHost2.getMaxActive();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }
}

