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
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):32");
        java.lang.String str2 = cassandraHost1.toString();
        java.lang.String str3 = cassandraHost1.getName();
        int int4 = cassandraHost1.getPort();
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):1", strArray16, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient29 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters28);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient29.equals(null)", !hThriftClient29.equals(null));
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1002");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost(":9160");
        long long2 = cassandraHost1.getMaxWaitTimeWhenExhausted();
        int int3 = cassandraHost1.getMaxActive();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1003");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        cassandraHost2.setUseSocketKeepalive(false);
        boolean boolean5 = cassandraHost2.getLifo();
        java.lang.String[] strArray9 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        tSSLTransportParameters10.setTrustStore("hi!", "", "hi!", "hi!");
        boolean boolean16 = cassandraHost2.equals((java.lang.Object) "hi!");
        cassandraHost2.setLifo(true);
        long long19 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        int int20 = cassandraHost2.getMaxActive();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient21 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient21.equals(null)", !hThriftClient21.equals(null));
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1004");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) 'a');
        boolean boolean3 = cassandraHost2.getLifo();
        java.lang.String str4 = cassandraHost2.toString();
        cassandraHost2.setUseThriftFramedTransport(true);
        cassandraHost2.setUseThriftFramedTransport(false);
        boolean boolean9 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String[] strArray22 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray22, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray22, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray22);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray22, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray22);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray22);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray22);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0(0.0.0.0):9160", strArray22);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray22);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient35 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters34);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient35.equals(null)", !hThriftClient35.equals(null));
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1005");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("101", 5);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1006");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("10(0.0.0.10)(10(0.0.0.10)):406", (int) (short) 2);
        cassandraHost2.setCassandraThriftSocketTimeout(0);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8);
        tSSLTransportParameters9.setTrustStore("hi!", "", "hi!", "hi!");
        tSSLTransportParameters9.setKeyStore("CassandraClient<%s-%d>", "");
        tSSLTransportParameters9.setTrustStore("CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):1", "(127.0.0.1):9160", "9", "(127.0.0.1):194");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient23 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters9);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient23.equals(null)", !hThriftClient23.equals(null));
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1007");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)", (int) ' ');
        long long3 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:10", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):1", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):0", strArray13);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient23 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters22);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient23.equals(null)", !hThriftClient23.equals(null));
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1008");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("0.0.0.6");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient2 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient2.equals(null)", !hThriftClient2.equals(null));
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1009");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):1");
        java.lang.String str2 = cassandraHost1.getUrl();
        java.lang.String str3 = cassandraHost1.getUrl();
        cassandraHost1.setMaxWaitTimeWhenExhausted((long) (short) 5);
        java.lang.String str6 = cassandraHost1.getIp();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray18, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1", strArray18, true);
        tSSLTransportParameters30.requireClientAuth(false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient33 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters30);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient33.equals(null)", !hThriftClient33.equals(null));
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1010");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("131");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters7 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters8 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6);
        tSSLTransportParameters8.setKeyStore("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", "");
        tSSLTransportParameters8.setKeyStore("CassandraClient<%s-%d>", ":9160", "(127.0.0.1):10", "0");
        tSSLTransportParameters8.setKeyStore("", "127.0.0.1");
        tSSLTransportParameters8.setTrustStore(":9160", "(127.0.0.1)");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient23 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters8);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient23.equals(null)", !hThriftClient23.equals(null));
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1011");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        boolean boolean3 = cassandraHost2.getUseSocketKeepalive();
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
        tSSLTransportParameters25.setKeyStore("207", "CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>))");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient37 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters25);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient37.equals(null)", !hThriftClient37.equals(null));
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1012");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)", (int) ' ');
        java.lang.String[] strArray7 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray7, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray7);
        boolean boolean11 = cassandraHost2.equals((java.lang.Object) tSSLTransportParameters10);
        boolean boolean12 = cassandraHost2.getUseSocketKeepalive();
        java.lang.String str13 = cassandraHost2.getIp();
        java.lang.String str14 = cassandraHost2.getUrl();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient15 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient15.equals(null)", !hThriftClient15.equals(null));
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1013");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("194(0.0.0.194):84");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient2 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient2.equals(null)", !hThriftClient2.equals(null));
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1014");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160", (int) '4');
        java.lang.String str3 = cassandraHost2.getName();
        int int4 = cassandraHost2.getMaxActive();
        boolean boolean5 = cassandraHost2.getLifo();
        cassandraHost2.setCassandraThriftSocketTimeout((int) '4');
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1015");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (byte) 10);
        boolean boolean3 = cassandraHost2.getUseSocketKeepalive();
        boolean boolean4 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String str5 = cassandraHost2.getIp();
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
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":52", strArray19, false);
        tSSLTransportParameters37.setTrustStore("0(0.0.0.0):-1", "CassandraClient<%s-%d>(CassandraClient<%s-%d>):0");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient41 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters37);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient41.equals(null)", !hThriftClient41.equals(null));
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1016");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) 'a');
        long long3 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        int int4 = cassandraHost2.getPort();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("1", (int) (short) -1);
        boolean boolean8 = cassandraHost2.equals((java.lang.Object) cassandraHost7);
        java.lang.String str9 = cassandraHost2.toString();
        cassandraHost2.setUseSocketKeepalive(false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient12 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient12.equals(null)", !hThriftClient12.equals(null));
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1017");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("hi!");
        cassandraHost1.setMaxActive(10);
        boolean boolean4 = cassandraHost1.getLifo();
        int int5 = cassandraHost1.getMaxActive();
        int int6 = cassandraHost1.getCassandraThriftSocketTimeout();
        java.lang.String[] strArray19 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):97", strArray19);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient34 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters33);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient34.equals(null)", !hThriftClient34.equals(null));
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1018");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) 'a');
        boolean boolean6 = cassandraHost5.getLifo();
        boolean boolean7 = cassandraHost2.equals((java.lang.Object) boolean6);
        int int8 = cassandraHost2.getPort();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1019");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (byte) 10);
        boolean boolean3 = cassandraHost2.isPerformNameResolution();
        java.lang.String str4 = cassandraHost2.getHost();
        int int5 = cassandraHost2.getPort();
        java.lang.String str6 = cassandraHost2.getHost();
        int int7 = cassandraHost2.getCassandraThriftSocketTimeout();
        cassandraHost2.setCassandraThriftSocketTimeout((int) (byte) -1);
        java.lang.String str10 = cassandraHost2.getUrl();
        boolean boolean11 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String[] strArray25 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray25, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray25);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray25, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray25, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray25);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray25);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray25, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters38 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0", strArray25, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters40 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):100", strArray25, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters41 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>:2", strArray25);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient42 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters41);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient42.equals(null)", !hThriftClient42.equals(null));
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1020");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("0(0.0.0.0):-1");
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160:9160", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("207", strArray12);
        boolean boolean23 = cassandraHost1.equals((java.lang.Object) "207");
        java.lang.String[] strArray28 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray28);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray28);
        tSSLTransportParameters30.setKeyStore("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", "");
        tSSLTransportParameters30.setKeyStore("CassandraClient<%s-%d>", ":9160", "(127.0.0.1):10", "0");
        tSSLTransportParameters30.setKeyStore("CassandraClient<%s-%d>", "0", "CassandraClient<%s-%d>", "0");
        tSSLTransportParameters30.setTrustStore(":9160", "");
        tSSLTransportParameters30.setTrustStore("1:52", ":9160");
        tSSLTransportParameters30.setTrustStore("CassandraClient<%s-%d>(CassandraClient<%s-%d>):0", "(127.0.0.1):1");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient53 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters30);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient53.equals(null)", !hThriftClient53.equals(null));
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1021");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (byte) 10);
        boolean boolean3 = cassandraHost2.isPerformNameResolution();
        java.lang.String str4 = cassandraHost2.getHost();
        int int5 = cassandraHost2.getPort();
        java.lang.String str6 = cassandraHost2.getHost();
        boolean boolean7 = cassandraHost2.isPerformNameResolution();
        int int8 = cassandraHost2.getMaxActive();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1022");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (short) 10);
        java.lang.String str3 = cassandraHost2.getIp();
        boolean boolean4 = cassandraHost2.getLifo();
        java.lang.String str5 = cassandraHost2.getHost();
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:10", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1:52", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0(0.0.0.0)", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":1", strArray16);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient27 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters26);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient27.equals(null)", !hThriftClient27.equals(null));
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1023");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160", (int) ' ');
        int int3 = cassandraHost2.getPort();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1024");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 1);
        cassandraHost2.setLifo(true);
        java.lang.String str5 = cassandraHost2.toString();
        cassandraHost2.setLifo(true);
        java.lang.String str8 = cassandraHost2.getIp();
        java.lang.String str9 = cassandraHost2.getIp();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1025");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 1);
        int int3 = cassandraHost2.getPort();
        java.lang.String str4 = cassandraHost2.getUrl();
        cassandraHost2.setLifo(true);
        boolean boolean7 = cassandraHost2.isPerformNameResolution();
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray16, false);
        tSSLTransportParameters25.requireClientAuth(false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient28 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters25);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient28.equals(null)", !hThriftClient28.equals(null));
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1026");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 1);
        cassandraHost2.setLifo(true);
        java.lang.String str5 = cassandraHost2.toString();
        int int6 = cassandraHost2.getCassandraThriftSocketTimeout();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1027");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 1);
        cassandraHost2.setLifo(true);
        java.lang.String str5 = cassandraHost2.getIp();
        cassandraHost2.setMaxWaitTimeWhenExhausted(84L);
        java.lang.String[] strArray16 = new java.lang.String[] { "127.0.0.1", "", "CassandraClient<%s-%d>", "0" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0:9160", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray16);
        tSSLTransportParameters22.requireClientAuth(false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient25 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters22);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient25.equals(null)", !hThriftClient25.equals(null));
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1028");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("9160(0.0.35.200):216", (int) (short) 48);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("97", strArray14);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient27 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters26);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient27.equals(null)", !hThriftClient27.equals(null));
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1029");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):32");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient2 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient2.equals(null)", !hThriftClient2.equals(null));
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1030");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1))", (int) (byte) 0);
        java.lang.String str3 = cassandraHost2.toString();
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):32", strArray13);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient24 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters23);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient24.equals(null)", !hThriftClient24.equals(null));
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1031");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160", (int) '4');
        int int3 = cassandraHost2.getPort();
        int int4 = cassandraHost2.getMaxActive();
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1:0", strArray15);
        tSSLTransportParameters25.requireClientAuth(false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient28 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters25);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient28.equals(null)", !hThriftClient28.equals(null));
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1032");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (-2));
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0.0.0.1", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0(0.0.0.0):0", strArray11);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient20 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters19);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient20.equals(null)", !hThriftClient20.equals(null));
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1033");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0", 100);
        cassandraHost2.setLifo(true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1034");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        cassandraHost2.setUseSocketKeepalive(false);
        boolean boolean5 = cassandraHost2.getLifo();
        int int6 = cassandraHost2.getCassandraThriftSocketTimeout();
        boolean boolean7 = cassandraHost2.getUseThriftFramedTransport();
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters8 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters();
        tSSLTransportParameters8.setKeyStore("(127.0.0.1):10", "(127.0.0.1)", "(127.0.0.1):10", "hi!");
        tSSLTransportParameters8.requireClientAuth(true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient16 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters8);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient16.equals(null)", !hThriftClient16.equals(null));
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1035");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 194);
        boolean boolean3 = cassandraHost2.isPerformNameResolution();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1036");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (short) 10);
        java.lang.String str3 = cassandraHost2.getIp();
        cassandraHost2.setUseThriftFramedTransport(false);
        long long6 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        long long7 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1037");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0.0.0.0", 213);
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):32", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>:97", strArray13, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient25 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters24);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient25.equals(null)", !hThriftClient25.equals(null));
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1038");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 1);
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) (short) 100);
        cassandraHost2.setUseThriftFramedTransport(true);
        cassandraHost2.setUseThriftFramedTransport(false);
        java.lang.String str9 = cassandraHost2.getUrl();
        int int10 = cassandraHost2.getMaxActive();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient11.equals(null)", !hThriftClient11.equals(null));
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1039");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0", 100);
        int int3 = cassandraHost2.getPort();
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray14, true);
        tSSLTransportParameters27.setTrustStore("(127.0.0.1)((127.0.0.1)):1", "(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))((127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))):36", "hi!(hi!):194", "127.0.0.1(127.0.0.1):52");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient33 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters27);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient33.equals(null)", !hThriftClient33.equals(null));
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1040");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("606", (-2));
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1041");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97");
        java.lang.String str2 = cassandraHost1.getUrl();
        boolean boolean3 = cassandraHost1.getUseSocketKeepalive();
        long long4 = cassandraHost1.getMaxWaitTimeWhenExhausted();
        cassandraHost1.setUseThriftFramedTransport(true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1042");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (byte) 10);
        boolean boolean3 = cassandraHost2.isPerformNameResolution();
        java.lang.String str4 = cassandraHost2.getHost();
        int int5 = cassandraHost2.getMaxActive();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1043");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":10", (-1));
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1044");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", 0);
        boolean boolean3 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("97", strArray13);
        tSSLTransportParameters22.setTrustStore("", "0.0.0.1");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient26 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters22);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient26.equals(null)", !hThriftClient26.equals(null));
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1045");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        boolean boolean3 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String str4 = cassandraHost2.getName();
        cassandraHost2.setUseThriftFramedTransport(true);
        java.lang.String str7 = cassandraHost2.getIp();
        boolean boolean8 = cassandraHost2.getLifo();
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!(hi!):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!(hi!):100", strArray11);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient13 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters12);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient13.equals(null)", !hThriftClient13.equals(null));
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1046");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 1);
        cassandraHost2.setLifo(true);
        java.lang.String str5 = cassandraHost2.getIp();
        cassandraHost2.setMaxWaitTimeWhenExhausted(84L);
        long long8 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        java.lang.String[] strArray21 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray21, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray21, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray21);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray21, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray21);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray21);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray21);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):100", strArray21);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray21, true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient35 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters34);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient35.equals(null)", !hThriftClient35.equals(null));
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1047");
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
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient32 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient32.equals(null)", !hThriftClient32.equals(null));
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1048");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("10(0.0.0.10):-1", 406);
        java.lang.String str3 = cassandraHost2.getName();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1049");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!:0", (int) (short) 206);
        java.lang.String[] strArray11 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160(:9160):52", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("9160", strArray11);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient19 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters18);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient19.equals(null)", !hThriftClient19.equals(null));
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1050");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("10(0.0.0.10)(10(0.0.0.10)):406", (int) (short) 2);
        cassandraHost2.setCassandraThriftSocketTimeout(0);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1051");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):10");
        java.lang.String str2 = cassandraHost1.getHost();
        java.lang.String str3 = cassandraHost1.getName();
        int int4 = cassandraHost1.getPort();
        boolean boolean5 = cassandraHost1.getLifo();
        java.lang.String[] strArray19 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray19, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray19, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray19, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":1", strArray19, false);
        tSSLTransportParameters36.setKeyStore(":48", "9(0.0.0.9):9160");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient40 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters36);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient40.equals(null)", !hThriftClient40.equals(null));
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1052");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        java.util.concurrent.atomic.AtomicLong atomicLong3 = new java.util.concurrent.atomic.AtomicLong();
        long long5 = atomicLong3.addAndGet((long) (byte) -1);
        boolean boolean6 = cassandraHost2.equals((java.lang.Object) (byte) -1);
        boolean boolean7 = cassandraHost2.getUseSocketKeepalive();
        cassandraHost2.setLifo(false);
        java.lang.String str10 = cassandraHost2.getIp();
        long long11 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        java.lang.String str12 = cassandraHost2.getIp();
        java.lang.String[] strArray24 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray24, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray24);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray24, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):1", strArray24);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):100", strArray24);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0:-1", strArray24);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("195", strArray24);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1(127.0.0.1):52", strArray24);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient35 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters34);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient35.equals(null)", !hThriftClient35.equals(null));
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1053");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)", 6);
        cassandraHost2.setUseSocketKeepalive(true);
        int int5 = cassandraHost2.getPort();
        java.lang.String[] strArray14 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("416", strArray14);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient24 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters23);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient24.equals(null)", !hThriftClient24.equals(null));
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1054");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):1");
        java.lang.String str2 = cassandraHost1.getUrl();
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("10", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):100", strArray9, false);
        tSSLTransportParameters15.setKeyStore("CassandraClient<%s-%d>:97", "hi!(hi!):9160", "0.0.0.1(0.0.0.1):48", "97");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient21 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters15);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient21.equals(null)", !hThriftClient21.equals(null));
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1055");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("-4", (int) '#');
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray14, false);
        tSSLTransportParameters28.setKeyStore("(127.0.0.1):10", ":9160:9160");
        tSSLTransportParameters28.setKeyStore("(127.0.0.1)((127.0.0.1)):32", "0(0.0.0.0):-1", "CassandraClient<%s-%d>(CassandraClient<%s-%d>):9160", "CassandraClient<%s-%d>:97");
        tSSLTransportParameters28.setKeyStore("6", "10(0.0.0.10)(10(0.0.0.10)):406");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient40 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters28);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient40.equals(null)", !hThriftClient40.equals(null));
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1056");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (short) 10);
        java.lang.String str3 = cassandraHost2.getIp();
        cassandraHost2.setLifo(true);
        java.lang.String str6 = cassandraHost2.getIp();
        cassandraHost2.setCassandraThriftSocketTimeout(6);
        int int9 = cassandraHost2.getMaxActive();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1057");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("9160", 216);
        boolean boolean3 = cassandraHost2.getUseSocketKeepalive();
        java.lang.String str4 = cassandraHost2.toString();
        long long5 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        cassandraHost2.setLifo(true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1058");
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
        java.lang.String[] strArray27 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray27);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray27);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray27);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray27);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):32", strArray27, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("-55", strArray27);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray27, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient37 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters36);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient37.equals(null)", !hThriftClient37.equals(null));
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1059");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        java.util.concurrent.atomic.AtomicLong atomicLong3 = new java.util.concurrent.atomic.AtomicLong();
        long long5 = atomicLong3.addAndGet((long) (byte) -1);
        boolean boolean6 = cassandraHost2.equals((java.lang.Object) (byte) -1);
        boolean boolean7 = cassandraHost2.getUseSocketKeepalive();
        cassandraHost2.setLifo(false);
        java.lang.String str10 = cassandraHost2.getIp();
        long long11 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        java.lang.String str12 = cassandraHost2.getIp();
        int int13 = cassandraHost2.getPort();
        java.lang.String[] strArray24 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray24, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray24);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray24, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray24);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0(0.0.0.0):-1", strArray24);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("126", strArray24, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!(hi!):9160", strArray24, true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient36 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters35);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient36.equals(null)", !hThriftClient36.equals(null));
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1060");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)", (int) ' ');
        cassandraHost2.setUseSocketKeepalive(false);
        boolean boolean5 = cassandraHost2.getLifo();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1061");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 48);
        cassandraHost2.setMaxWaitTimeWhenExhausted(509L);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1062");
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
        boolean boolean26 = cassandraHost2.getUseThriftFramedTransport();
        java.util.concurrent.atomic.AtomicLong atomicLong28 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 0);
        float float29 = atomicLong28.floatValue();
        long long31 = atomicLong28.getAndAdd(0L);
        atomicLong28.set((-1L));
        atomicLong28.lazySet((long) (byte) -1);
        long long37 = atomicLong28.addAndGet(407L);
        boolean boolean38 = cassandraHost2.equals((java.lang.Object) atomicLong28);
        java.lang.String[] strArray51 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters53 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray51, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters55 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray51, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters56 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray51);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters58 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray51, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters59 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray51);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters61 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray51, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters63 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray51, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters65 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0", strArray51, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters67 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray51, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient68 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters67);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient68.equals(null)", !hThriftClient68.equals(null));
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1063");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", 1);
        boolean boolean3 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String str4 = cassandraHost2.toString();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = me.prettyprint.cassandra.connection.client.HThriftClient.serial;
        long long7 = atomicLong5.getAndAdd((long) 'a');
        long long8 = atomicLong5.longValue();
        boolean boolean11 = atomicLong5.weakCompareAndSet((long) 'a', (long) (short) 106);
        boolean boolean12 = cassandraHost2.equals((java.lang.Object) atomicLong5);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient13 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient13.equals(null)", !hThriftClient13.equals(null));
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1064");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("");
        int int2 = cassandraHost1.getCassandraThriftSocketTimeout();
        boolean boolean3 = cassandraHost1.getLifo();
        boolean boolean4 = cassandraHost1.isPerformNameResolution();
        cassandraHost1.setUseThriftFramedTransport(true);
        boolean boolean7 = cassandraHost1.isPerformNameResolution();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:10", strArray17, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>:1", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0.0.0.194", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("-2", strArray17);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient27 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters26);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient27.equals(null)", !hThriftClient27.equals(null));
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1065");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) '#');
        cassandraHost2.setCassandraThriftSocketTimeout(6);
        cassandraHost2.setUseSocketKeepalive(true);
        java.lang.String str7 = cassandraHost2.getHost();
        java.lang.String str8 = cassandraHost2.getIp();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1066");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1))):32", 9160);
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) (byte) 69);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1067");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        boolean boolean3 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String str4 = cassandraHost2.getName();
        boolean boolean5 = cassandraHost2.getUseSocketKeepalive();
        int int6 = cassandraHost2.getCassandraThriftSocketTimeout();
        int int7 = cassandraHost2.getCassandraThriftSocketTimeout();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1068");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 1);
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) (short) 100);
        cassandraHost2.setCassandraThriftSocketTimeout((int) '#');
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray16);
        tSSLTransportParameters24.setTrustStore("416", "CassandraClient<%s-%d>(CassandraClient<%s-%d>):100", "hi!(hi!):9160", ":9160");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient30 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters24);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient30.equals(null)", !hThriftClient30.equals(null));
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1069");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) 'a');
        boolean boolean3 = cassandraHost2.getLifo();
        java.lang.String str4 = cassandraHost2.toString();
        cassandraHost2.setUseThriftFramedTransport(true);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):1", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("6:10", strArray17);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient29 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters28);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient29.equals(null)", !hThriftClient29.equals(null));
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1070");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1(127.0.0.1):52", 101);
        java.lang.String str3 = cassandraHost2.getIp();
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1:52", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1:52", strArray16, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient31 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters30);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient31.equals(null)", !hThriftClient31.equals(null));
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1071");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 1);
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) (short) 100);
        cassandraHost2.setCassandraThriftSocketTimeout((int) '#');
        boolean boolean7 = cassandraHost2.getLifo();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost10 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) (short) 5);
        long long11 = cassandraHost10.getMaxWaitTimeWhenExhausted();
        long long12 = cassandraHost10.getMaxWaitTimeWhenExhausted();
        java.lang.Class<?> wildcardClass13 = cassandraHost10.getClass();
        boolean boolean14 = cassandraHost2.equals((java.lang.Object) wildcardClass13);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient15 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient15.equals(null)", !hThriftClient15.equals(null));
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1072");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):0", (int) (byte) -1);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):9160", strArray14, true);
        tSSLTransportParameters26.setKeyStore("hi!(hi!)(hi!(hi!)):9160", ":9160:9160");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient30 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters26);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient30.equals(null)", !hThriftClient30.equals(null));
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1073");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) 'a');
        boolean boolean3 = cassandraHost2.getLifo();
        java.lang.String str4 = cassandraHost2.toString();
        cassandraHost2.setUseThriftFramedTransport(true);
        cassandraHost2.setUseThriftFramedTransport(true);
        boolean boolean9 = cassandraHost2.getUseThriftFramedTransport();
        int int10 = cassandraHost2.getPort();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient11.equals(null)", !hThriftClient11.equals(null));
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1074");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (byte) 10);
        boolean boolean3 = cassandraHost2.isPerformNameResolution();
        java.lang.String str4 = cassandraHost2.getHost();
        java.lang.String str5 = cassandraHost2.getHost();
        java.lang.String str6 = cassandraHost2.getIp();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1075");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0.0.0.0", 0);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1076");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0.0.0.194", (int) '4');
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1077");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("96", 0);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1078");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (-2));
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters3 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters();
        tSSLTransportParameters3.setKeyStore("(127.0.0.1):10", "(127.0.0.1)", "(127.0.0.1):10", "hi!");
        tSSLTransportParameters3.setKeyStore("hi!", "");
        tSSLTransportParameters3.setKeyStore("hi!(hi!)(hi!(hi!)):9160", "6(0.0.0.6):9160", "CassandraClient<%s-%d>(CassandraClient<%s-%d>):9160", "");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient17 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters3);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient17.equals(null)", !hThriftClient17.equals(null));
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1079");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160(:9160)", (int) (byte) 85);
        boolean boolean3 = cassandraHost2.getLifo();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1080");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160(:9160)(:9160(:9160)):-1", (int) (byte) -46);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):1", strArray17, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:10", strArray17, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0(0.0.0.0):9160", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("-2", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160:1", strArray17, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("11", strArray17);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient35 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters34);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient35.equals(null)", !hThriftClient35.equals(null));
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1081");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1))):32", (int) (byte) -60);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1082");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("606");
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray20, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray20, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray20, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray20, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray20, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0", strArray20, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray20, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters38 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray20, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters40 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray20, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters41 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0:9160", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters42 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("196", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters43 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters44 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):52", strArray20);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient45 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters44);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient45.equals(null)", !hThriftClient45.equals(null));
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1083");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        int int3 = cassandraHost2.getPort();
        long long4 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        int int5 = cassandraHost2.getPort();
        java.lang.String str6 = cassandraHost2.getUrl();
        java.lang.String str7 = cassandraHost2.getIp();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1084");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        cassandraHost2.setUseSocketKeepalive(false);
        java.lang.String str5 = cassandraHost2.toString();
        cassandraHost2.setUseThriftFramedTransport(true);
        int int8 = cassandraHost2.getMaxActive();
        cassandraHost2.setCassandraThriftSocketTimeout(97);
        boolean boolean11 = cassandraHost2.isPerformNameResolution();
        java.lang.String[] strArray24 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray24, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray24);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray24, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray24, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray24, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):0", strArray24);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160(:9160):296", strArray24, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("199", strArray24);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters39 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("114", strArray24, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient40 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters39);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient40.equals(null)", !hThriftClient40.equals(null));
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1085");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 1);
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) (short) 100);
        cassandraHost2.setUseThriftFramedTransport(true);
        cassandraHost2.setUseThriftFramedTransport(false);
        java.lang.String str9 = cassandraHost2.getUrl();
        int int10 = cassandraHost2.getMaxActive();
        java.lang.String str11 = cassandraHost2.getName();
        java.lang.String[] strArray24 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray24, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray24);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray24, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray24, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray24);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1", strArray24, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):1", strArray24, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0", strArray24);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters39 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("10(0.0.0.10):-1", strArray24, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient40 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters39);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient40.equals(null)", !hThriftClient40.equals(null));
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1086");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        cassandraHost2.setUseSocketKeepalive(false);
        int int5 = cassandraHost2.getCassandraThriftSocketTimeout();
        java.lang.String str6 = cassandraHost2.getHost();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1087");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0", (int) ' ');
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("10", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160:9160", strArray12, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient24 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters23);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient24.equals(null)", !hThriftClient24.equals(null));
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1088");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("105");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient2 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient2.equals(null)", !hThriftClient2.equals(null));
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1089");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 5);
        boolean boolean3 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("10", strArray12);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient21 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters20);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient21.equals(null)", !hThriftClient21.equals(null));
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1090");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("");
        long long2 = cassandraHost1.getMaxWaitTimeWhenExhausted();
        cassandraHost1.setCassandraThriftSocketTimeout((int) (short) 100);
        java.util.concurrent.atomic.AtomicLong atomicLong6 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 0);
        float float7 = atomicLong6.floatValue();
        double double8 = atomicLong6.doubleValue();
        long long10 = atomicLong6.getAndSet((long) 10);
        double double11 = atomicLong6.doubleValue();
        long long12 = atomicLong6.incrementAndGet();
        java.lang.Class<?> wildcardClass13 = atomicLong6.getClass();
        boolean boolean14 = cassandraHost1.equals((java.lang.Object) wildcardClass13);
        cassandraHost1.setUseThriftFramedTransport(false);
        boolean boolean17 = cassandraHost1.getUseSocketKeepalive();
        java.util.concurrent.atomic.AtomicLong atomicLong19 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 0);
        float float20 = atomicLong19.floatValue();
        double double21 = atomicLong19.doubleValue();
        long long23 = atomicLong19.getAndSet((long) 10);
        long long24 = atomicLong19.getAndIncrement();
        int int25 = atomicLong19.intValue();
        long long27 = atomicLong19.getAndSet((long) (short) 5);
        atomicLong19.set(29L);
        long long31 = atomicLong19.getAndAdd((long) (short) 96);
        boolean boolean32 = cassandraHost1.equals((java.lang.Object) atomicLong19);
        boolean boolean33 = cassandraHost1.getUseThriftFramedTransport();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient34 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient34.equals(null)", !hThriftClient34.equals(null));
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1091");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) 'a');
        long long3 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        long long4 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        java.lang.String str5 = cassandraHost2.getIp();
        cassandraHost2.setCassandraThriftSocketTimeout(0);
        boolean boolean8 = cassandraHost2.isPerformNameResolution();
        long long9 = cassandraHost2.getMaxWaitTimeWhenExhausted();
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
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters47 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray27, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters48 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0:9160", strArray27);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters49 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("196", strArray27);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters50 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray27);
        tSSLTransportParameters50.setTrustStore("25", "10");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient54 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters50);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient54.equals(null)", !hThriftClient54.equals(null));
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1092");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (short) 10);
        int int3 = cassandraHost2.getPort();
        boolean boolean4 = cassandraHost2.getLifo();
        int int5 = cassandraHost2.getMaxActive();
        java.lang.String str6 = cassandraHost2.getIp();
        cassandraHost2.setCassandraThriftSocketTimeout((int) ' ');
        boolean boolean9 = cassandraHost2.getLifo();
        boolean boolean10 = cassandraHost2.getLifo();
        cassandraHost2.setMaxActive(0);
        java.lang.String str13 = cassandraHost2.toString();
        java.lang.String[] strArray26 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray26, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray26);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray26, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray26, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray26);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray26, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters38 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray26, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters39 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray26);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters40 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray26);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient41 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters40);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient41.equals(null)", !hThriftClient41.equals(null));
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1093");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160(:9160):206", (int) (short) 206);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1094");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (short) 10);
        java.lang.String str3 = cassandraHost2.getIp();
        cassandraHost2.setUseThriftFramedTransport(false);
        cassandraHost2.setMaxWaitTimeWhenExhausted(9159L);
        long long8 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        java.lang.String str9 = cassandraHost2.getIp();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1095");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) 'a');
        boolean boolean3 = cassandraHost2.getLifo();
        int int4 = cassandraHost2.getPort();
        boolean boolean5 = cassandraHost2.getLifo();
        int int6 = cassandraHost2.getPort();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1096");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):1", (int) (byte) 97);
        java.lang.String str3 = cassandraHost2.getName();
        cassandraHost2.setMaxActive((int) (byte) 11);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("199", strArray18, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient35 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters34);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient35.equals(null)", !hThriftClient35.equals(null));
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1097");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0.0.0.1", 11);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1098");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!:10", (int) (short) 0);
        boolean boolean3 = cassandraHost2.getUseThriftFramedTransport();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1099");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)", (int) '#');
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray9, true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient16 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters15);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient16.equals(null)", !hThriftClient16.equals(null));
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1100");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) '#');
        cassandraHost2.setCassandraThriftSocketTimeout(6);
        boolean boolean5 = cassandraHost2.getLifo();
        java.lang.String[] strArray11 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:0", strArray11, true);
        tSSLTransportParameters16.setTrustStore("hi!:9160", "131", "9", "10:9160");
        tSSLTransportParameters16.requireClientAuth(true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient24 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters16);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient24.equals(null)", !hThriftClient24.equals(null));
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1101");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        cassandraHost2.setUseSocketKeepalive(false);
        java.lang.String str5 = cassandraHost2.toString();
        cassandraHost2.setLifo(true);
        boolean boolean8 = cassandraHost2.isPerformNameResolution();
        cassandraHost2.setMaxWaitTimeWhenExhausted(4L);
        cassandraHost2.setCassandraThriftSocketTimeout(50);
        java.lang.String[] strArray22 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray22);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray22);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray22);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray22);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1", strArray22, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1:52", strArray22);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1:6", strArray22, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient32 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters31);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient32.equals(null)", !hThriftClient32.equals(null));
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1102");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("0");
        int int2 = cassandraHost1.getPort();
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray12);
        tSSLTransportParameters22.setKeyStore("25", "", "11", "0.0.0.194");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient28 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters22);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient28.equals(null)", !hThriftClient28.equals(null));
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1103");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0", (int) (short) -1);
        boolean boolean3 = cassandraHost2.getLifo();
        java.lang.String str4 = cassandraHost2.toString();
        int int5 = cassandraHost2.getMaxActive();
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient21 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters20);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient21.equals(null)", !hThriftClient21.equals(null));
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1104");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):1", 414);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1105");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):32");
        java.lang.String str2 = cassandraHost1.toString();
        java.lang.String str3 = cassandraHost1.getName();
        int int4 = cassandraHost1.getPort();
        java.lang.String str5 = cassandraHost1.getName();
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("10", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160:9160", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0(0.0.0.0)", strArray16);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient29 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters28);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient29.equals(null)", !hThriftClient29.equals(null));
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1106");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        boolean boolean3 = cassandraHost2.getUseThriftFramedTransport();
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) 10);
        int int6 = cassandraHost2.getCassandraThriftSocketTimeout();
        cassandraHost2.setLifo(true);
        boolean boolean9 = cassandraHost2.isPerformNameResolution();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1107");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)", (int) ' ');
        cassandraHost2.setMaxActive((int) (short) 106);
        long long5 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        java.lang.String[] strArray19 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray19, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("97", strArray19, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1:0", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("10", strArray19);
        tSSLTransportParameters34.setTrustStore("hi!", "hi!(hi!):10");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient38 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters34);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient38.equals(null)", !hThriftClient38.equals(null));
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1108");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("0");
        boolean boolean2 = cassandraHost1.isPerformNameResolution();
        cassandraHost1.setCassandraThriftSocketTimeout(50);
        boolean boolean5 = cassandraHost1.getUseSocketKeepalive();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, false);
        boolean boolean13 = cassandraHost1.equals((java.lang.Object) "hi!");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient14 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient14.equals(null)", !hThriftClient14.equals(null));
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1109");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):10", (int) (byte) 10);
        boolean boolean3 = cassandraHost2.isPerformNameResolution();
        cassandraHost2.setUseSocketKeepalive(false);
        cassandraHost2.setUseSocketKeepalive(false);
        cassandraHost2.setCassandraThriftSocketTimeout((int) (byte) -2);
        int int10 = cassandraHost2.getPort();
        java.lang.String str11 = cassandraHost2.toString();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient21 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters20);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient21.equals(null)", !hThriftClient21.equals(null));
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1110");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 1);
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) (short) 100);
        cassandraHost2.setCassandraThriftSocketTimeout((int) '#');
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray20, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray20, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray20, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray20, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray20, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):100", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("25", strArray20);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient36 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters35);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient36.equals(null)", !hThriftClient36.equals(null));
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1111");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        cassandraHost2.setUseSocketKeepalive(false);
        java.lang.String str5 = cassandraHost2.toString();
        cassandraHost2.setUseThriftFramedTransport(true);
        java.lang.String str8 = cassandraHost2.toString();
        int int9 = cassandraHost2.getPort();
        cassandraHost2.setMaxWaitTimeWhenExhausted(0L);
        boolean boolean12 = cassandraHost2.isPerformNameResolution();
        java.lang.String str13 = cassandraHost2.toString();
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray23, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray23, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:10", strArray23);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray23);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1:52", strArray23, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0(0.0.0.0)", strArray23);
        tSSLTransportParameters32.setTrustStore("CassandraClient<%s-%d>(CassandraClient<%s-%d>):100", "0:9160");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient36 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters32);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient36.equals(null)", !hThriftClient36.equals(null));
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1112");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 10);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) 'a');
        boolean boolean6 = cassandraHost5.getLifo();
        boolean boolean7 = cassandraHost2.equals((java.lang.Object) boolean6);
        long long8 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):1", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:9160", strArray17, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient25 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters24);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient25.equals(null)", !hThriftClient25.equals(null));
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1113");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160", (int) (short) 206);
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("6", strArray13);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient23 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters22);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient23.equals(null)", !hThriftClient23.equals(null));
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1114");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (byte) 10);
        boolean boolean3 = cassandraHost2.isPerformNameResolution();
        java.lang.String str4 = cassandraHost2.getHost();
        int int5 = cassandraHost2.getPort();
        boolean boolean6 = cassandraHost2.isPerformNameResolution();
        cassandraHost2.setMaxWaitTimeWhenExhausted(1L);
        cassandraHost2.setUseThriftFramedTransport(false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient11.equals(null)", !hThriftClient11.equals(null));
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1115");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))((127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))):36", 54);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        int int6 = cassandraHost5.getPort();
        cassandraHost5.setLifo(false);
        boolean boolean9 = cassandraHost5.getUseSocketKeepalive();
        boolean boolean10 = cassandraHost2.equals((java.lang.Object) cassandraHost5);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost5);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient11.equals(null)", !hThriftClient11.equals(null));
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1116");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        cassandraHost2.setUseSocketKeepalive(true);
        int int5 = cassandraHost2.getCassandraThriftSocketTimeout();
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) (byte) 53);
        java.lang.String str8 = cassandraHost2.getIp();
        java.lang.String[] strArray16 = new java.lang.String[] { "9160", "0(0.0.0.0):9160", "-2", "1:0", "(127.0.0.1):97" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160:9160", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":52", strArray16);
        tSSLTransportParameters18.setTrustStore("hi!(hi!):9160", "hi!(hi!):10", "", "(127.0.0.1):1");
        tSSLTransportParameters18.requireClientAuth(true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient26 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters18);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient26.equals(null)", !hThriftClient26.equals(null));
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1117");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):32");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient2 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient2.equals(null)", !hThriftClient2.equals(null));
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1118");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0.0.0.0", (int) (byte) 3);
        long long3 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        cassandraHost2.setUseSocketKeepalive(true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1119");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("209", (int) (byte) 35);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1120");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("1", 0);
        java.lang.String str3 = cassandraHost2.getUrl();
        java.lang.String[] strArray7 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters8 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray7);
        tSSLTransportParameters8.setTrustStore("hi!", "", "hi!", "hi!");
        tSSLTransportParameters8.setKeyStore("CassandraClient<%s-%d>", "");
        tSSLTransportParameters8.setKeyStore("(127.0.0.1)", "(127.0.0.1):1", "(127.0.0.1):1", "CassandraClient<%s-%d>(CassandraClient<%s-%d>):100");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient22 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters8);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient22.equals(null)", !hThriftClient22.equals(null));
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1121");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0.0.0.1", (int) (byte) -60);
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
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters38 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0(0.0.0.0):-1", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters40 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:10", strArray19, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters41 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("-2", strArray19);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient42 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters41);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient42.equals(null)", !hThriftClient42.equals(null));
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1122");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (short) 10);
        java.lang.String str3 = cassandraHost2.getIp();
        cassandraHost2.setUseThriftFramedTransport(false);
        boolean boolean6 = cassandraHost2.getUseSocketKeepalive();
        boolean boolean7 = cassandraHost2.getUseSocketKeepalive();
        java.lang.String str8 = cassandraHost2.getHost();
        cassandraHost2.setMaxActive((int) (byte) 9);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient11.equals(null)", !hThriftClient11.equals(null));
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1123");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("");
        int int2 = cassandraHost1.getCassandraThriftSocketTimeout();
        int int3 = cassandraHost1.getPort();
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, true);
        tSSLTransportParameters25.setKeyStore("CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):97", "CassandraClient<%s-%d>:2");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient29 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters25);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient29.equals(null)", !hThriftClient29.equals(null));
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1124");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!:10", (int) (byte) 97);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1125");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("9(0.0.0.9):9160");
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
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1126");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("");
        java.lang.String str2 = cassandraHost1.getUrl();
        boolean boolean3 = cassandraHost1.getLifo();
        int int4 = cassandraHost1.getMaxActive();
        int int5 = cassandraHost1.getPort();
        cassandraHost1.setMaxActive((int) (short) 106);
        java.lang.String str8 = cassandraHost1.toString();
        cassandraHost1.setUseThriftFramedTransport(true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient11.equals(null)", !hThriftClient11.equals(null));
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1127");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost(":9160(:9160):206");
        cassandraHost1.setMaxWaitTimeWhenExhausted(247L);
        boolean boolean4 = cassandraHost1.getLifo();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1128");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):10");
        long long2 = cassandraHost1.getMaxWaitTimeWhenExhausted();
        boolean boolean3 = cassandraHost1.isPerformNameResolution();
        long long4 = cassandraHost1.getMaxWaitTimeWhenExhausted();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1129");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("25", 84);
        int int3 = cassandraHost2.getCassandraThriftSocketTimeout();
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray15, false);
        tSSLTransportParameters29.setKeyStore("(127.0.0.1):10", ":9160:9160");
        tSSLTransportParameters29.setKeyStore("(127.0.0.1)((127.0.0.1)):32", "0(0.0.0.0):-1", "CassandraClient<%s-%d>(CassandraClient<%s-%d>):9160", "CassandraClient<%s-%d>:97");
        tSSLTransportParameters29.setKeyStore("6", "10(0.0.0.10)(10(0.0.0.10)):406");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient41 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters29);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient41.equals(null)", !hThriftClient41.equals(null));
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1130");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 1);
        int int3 = cassandraHost2.getPort();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) 'a');
        boolean boolean7 = cassandraHost6.getLifo();
        java.lang.String str8 = cassandraHost6.toString();
        java.lang.String str9 = cassandraHost6.getIp();
        boolean boolean10 = cassandraHost2.equals((java.lang.Object) str9);
        int int11 = cassandraHost2.getCassandraThriftSocketTimeout();
        java.lang.String str12 = cassandraHost2.getIp();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient13 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient13.equals(null)", !hThriftClient13.equals(null));
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1131");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160(:9160):52", (int) (byte) 0);
        long long3 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        cassandraHost2.setCassandraThriftSocketTimeout((int) (byte) 36);
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray20, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray20, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray20, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray20, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray20, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0", strArray20, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray20, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters38 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray20, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters39 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray20);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient40 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters39);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient40.equals(null)", !hThriftClient40.equals(null));
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1132");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (short) 10);
        java.lang.String str3 = cassandraHost2.getIp();
        boolean boolean4 = cassandraHost2.getLifo();
        cassandraHost2.setLifo(true);
        cassandraHost2.setUseSocketKeepalive(false);
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) (short) 203);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient11.equals(null)", !hThriftClient11.equals(null));
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1133");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0.0.0.0", 0);
        boolean boolean3 = cassandraHost2.getUseSocketKeepalive();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1134");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) 'a');
        boolean boolean3 = cassandraHost2.getUseSocketKeepalive();
        java.lang.String[] strArray9 = new java.lang.String[] { "127.0.0.1", "", "CassandraClient<%s-%d>", "0" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray9);
        tSSLTransportParameters10.setKeyStore("", ":9160(:9160)", "CassandraClient<%s-%d>(CassandraClient<%s-%d>):0", "CassandraClient<%s-%d>(CassandraClient<%s-%d>):9160");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient16 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters10);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient16.equals(null)", !hThriftClient16.equals(null));
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1135");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0", (int) (short) -1);
        boolean boolean3 = cassandraHost2.getLifo();
        java.lang.String str4 = cassandraHost2.toString();
        int int5 = cassandraHost2.getMaxActive();
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1))):32", strArray14, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient22 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters21);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient22.equals(null)", !hThriftClient22.equals(null));
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1136");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("236", (int) (byte) -117);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1137");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):1", 207);
        java.lang.String str3 = cassandraHost2.getIp();
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9, false);
        tSSLTransportParameters13.setTrustStore("", "", "0", "0");
        tSSLTransportParameters13.setKeyStore("", "127.0.0.1", "(127.0.0.1):10", "127.0.0.1");
        tSSLTransportParameters13.requireClientAuth(true);
        tSSLTransportParameters13.setKeyStore("hi!(hi!):10", "131", ":9160(:9160)(:9160(:9160)):206", "114");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient31 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters13);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient31.equals(null)", !hThriftClient31.equals(null));
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1138");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) 'a');
        long long3 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        long long4 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        java.lang.String str5 = cassandraHost2.getIp();
        cassandraHost2.setCassandraThriftSocketTimeout(0);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("10", strArray16);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient25 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters24);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient25.equals(null)", !hThriftClient25.equals(null));
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1139");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!(hi!):35", 35);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1140");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("");
        long long2 = cassandraHost1.getMaxWaitTimeWhenExhausted();
        cassandraHost1.setCassandraThriftSocketTimeout((int) (short) 100);
        java.util.concurrent.atomic.AtomicLong atomicLong6 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 0);
        float float7 = atomicLong6.floatValue();
        double double8 = atomicLong6.doubleValue();
        long long10 = atomicLong6.getAndSet((long) 10);
        double double11 = atomicLong6.doubleValue();
        long long12 = atomicLong6.incrementAndGet();
        java.lang.Class<?> wildcardClass13 = atomicLong6.getClass();
        boolean boolean14 = cassandraHost1.equals((java.lang.Object) wildcardClass13);
        cassandraHost1.setUseThriftFramedTransport(false);
        boolean boolean17 = cassandraHost1.getUseSocketKeepalive();
        java.util.concurrent.atomic.AtomicLong atomicLong19 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 0);
        float float20 = atomicLong19.floatValue();
        double double21 = atomicLong19.doubleValue();
        long long23 = atomicLong19.getAndSet((long) 10);
        long long24 = atomicLong19.getAndIncrement();
        int int25 = atomicLong19.intValue();
        long long27 = atomicLong19.getAndSet((long) (short) 5);
        atomicLong19.set(29L);
        long long31 = atomicLong19.getAndAdd((long) (short) 96);
        boolean boolean32 = cassandraHost1.equals((java.lang.Object) atomicLong19);
        boolean boolean33 = cassandraHost1.getUseThriftFramedTransport();
        java.lang.String[] strArray46 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters48 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray46, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters49 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray46);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters51 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray46, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters53 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray46, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters54 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray46);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters55 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray46);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters56 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray46);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters58 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):1", strArray46, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters59 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!(hi!):100", strArray46);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient60 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters59);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient60.equals(null)", !hThriftClient60.equals(null));
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1141");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) (short) 5);
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0.0.0.1", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":10", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":52", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160(:9160)", strArray13);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient25 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters24);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient25.equals(null)", !hThriftClient25.equals(null));
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1142");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        boolean boolean3 = cassandraHost2.getUseThriftFramedTransport();
        boolean boolean4 = cassandraHost2.isPerformNameResolution();
        boolean boolean5 = cassandraHost2.getUseSocketKeepalive();
        cassandraHost2.setUseSocketKeepalive(true);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("416", strArray17, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160(:9160):206", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>:50", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("131", strArray17);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient27 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters26);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient27.equals(null)", !hThriftClient27.equals(null));
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1143");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (short) 1);
        java.lang.String str3 = cassandraHost2.toString();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):1", strArray17, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:10", strArray17, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0(0.0.0.0):9160", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-2", strArray17, true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient34 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters33);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient34.equals(null)", !hThriftClient34.equals(null));
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1144");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        cassandraHost2.setUseSocketKeepalive(false);
        java.lang.String str5 = cassandraHost2.toString();
        int int6 = cassandraHost2.getPort();
        cassandraHost2.setMaxActive(100);
        long long9 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1145");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("416", (int) (short) 5);
        java.lang.String[] strArray11 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):32", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("-55", strArray11);
        tSSLTransportParameters18.setTrustStore(":52", "10");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient22 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters18);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient22.equals(null)", !hThriftClient22.equals(null));
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1146");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("hi!");
        cassandraHost1.setMaxActive(206);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1147");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        cassandraHost2.setUseSocketKeepalive(false);
        boolean boolean5 = cassandraHost2.getLifo();
        java.lang.String[] strArray9 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        tSSLTransportParameters10.setTrustStore("hi!", "", "hi!", "hi!");
        boolean boolean16 = cassandraHost2.equals((java.lang.Object) "hi!");
        java.lang.String str17 = cassandraHost2.getIp();
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters();
        tSSLTransportParameters18.setTrustStore("hi!", "CassandraClient<%s-%d>");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient22 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters18);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient22.equals(null)", !hThriftClient22.equals(null));
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1148");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("10", (int) (byte) -1);
        cassandraHost2.setMaxActive((int) '4');
        java.lang.String str5 = cassandraHost2.getUrl();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1149");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):10", (int) (byte) 100);
        cassandraHost2.setMaxWaitTimeWhenExhausted(12L);
        cassandraHost2.setMaxWaitTimeWhenExhausted(100L);
        cassandraHost2.setMaxActive(1);
        java.lang.String str9 = cassandraHost2.getHost();
        cassandraHost2.setUseSocketKeepalive(true);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray18, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):0", strArray18);
        tSSLTransportParameters23.setTrustStore("-55", "0(0.0.0.0):9160");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient27 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters23);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient27.equals(null)", !hThriftClient27.equals(null));
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1150");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 1);
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) (short) 100);
        cassandraHost2.setUseThriftFramedTransport(true);
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        tSSLTransportParameters17.setKeyStore("(127.0.0.1)", "0", "", "(127.0.0.1):10");
        tSSLTransportParameters17.setKeyStore("CassandraClient<%s-%d>(CassandraClient<%s-%d>):100", "");
        tSSLTransportParameters17.setTrustStore("CassandraClient<%s-%d>:50", "(127.0.0.1)((127.0.0.1)):100");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient29 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters17);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient29.equals(null)", !hThriftClient29.equals(null));
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1151");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) '#');
        cassandraHost2.setCassandraThriftSocketTimeout(6);
        cassandraHost2.setUseSocketKeepalive(true);
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) (byte) 53);
        cassandraHost2.setMaxActive(50);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("11", strArray18, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":0", strArray18);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient25 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters24);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient25.equals(null)", !hThriftClient25.equals(null));
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1152");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) (short) 5);
        long long3 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        cassandraHost2.setMaxWaitTimeWhenExhausted(199L);
        java.lang.String str6 = cassandraHost2.getName();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1153");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("61");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient2 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient2.equals(null)", !hThriftClient2.equals(null));
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1154");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 84);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1155");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0", (int) (byte) 35);
        java.util.concurrent.atomic.AtomicLong atomicLong4 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 3);
        boolean boolean5 = cassandraHost2.equals((java.lang.Object) atomicLong4);
        cassandraHost2.setCassandraThriftSocketTimeout((int) (byte) 85);
        cassandraHost2.setCassandraThriftSocketTimeout((int) 'a');
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1156");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!(hi!):194", (int) (short) 9396);
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray11);
        tSSLTransportParameters19.setTrustStore("CassandraClient<%s-%d>(CassandraClient<%s-%d>):100", "-2", ":9160", "194");
        tSSLTransportParameters19.requireClientAuth(true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient27 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters19);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient27.equals(null)", !hThriftClient27.equals(null));
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1157");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):9160", (int) (byte) 97);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1158");
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
        java.lang.String[] strArray25 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray25, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray25, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray25, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0.0.0.1", strArray25);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient33 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters32);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient33.equals(null)", !hThriftClient33.equals(null));
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1159");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) '4');
        java.lang.String str3 = cassandraHost2.getHost();
        long long4 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1160");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("6", (int) (byte) -2);
        boolean boolean3 = cassandraHost2.getLifo();
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("10(0.0.0.10):-1", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0.0.0.1:10", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160(:9160)", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray12);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient22 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters21);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient22.equals(null)", !hThriftClient22.equals(null));
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1161");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97");
        cassandraHost1.setMaxWaitTimeWhenExhausted((long) 6);
        int int4 = cassandraHost1.getCassandraThriftSocketTimeout();
        java.lang.String str5 = cassandraHost1.getIp();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):1", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):100", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0:-1", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("195", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1(127.0.0.1):52", strArray17);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient28 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters27);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient28.equals(null)", !hThriftClient28.equals(null));
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1162");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 1);
        cassandraHost2.setLifo(true);
        java.lang.String str5 = cassandraHost2.toString();
        java.lang.String str6 = cassandraHost2.getIp();
        boolean boolean7 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String str8 = cassandraHost2.getIp();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1163");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", (int) (short) 5);
        cassandraHost2.setLifo(true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1164");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97");
        java.lang.String str2 = cassandraHost1.getHost();
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):100", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>:2", strArray16);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient33 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters32);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient33.equals(null)", !hThriftClient33.equals(null));
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1165");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0.0.0.0(0.0.0.0):50", (int) (short) 123);
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0", strArray13);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient25 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters24);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient25.equals(null)", !hThriftClient25.equals(null));
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1166");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("");
        java.lang.String str2 = cassandraHost1.getUrl();
        boolean boolean3 = cassandraHost1.getLifo();
        int int4 = cassandraHost1.getMaxActive();
        int int5 = cassandraHost1.getPort();
        cassandraHost1.setMaxActive((int) (short) 106);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray12, true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient16 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters15);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient16.equals(null)", !hThriftClient16.equals(null));
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1167");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!(hi!):100", (int) (short) 296);
        java.lang.String[] strArray7 = new java.lang.String[] { "6:10", "196", "416" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):1", strArray7, true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters9);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1168");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) 'a');
        cassandraHost2.setUseThriftFramedTransport(false);
        boolean boolean5 = cassandraHost2.isPerformNameResolution();
        cassandraHost2.setUseThriftFramedTransport(true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1169");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        cassandraHost2.setUseSocketKeepalive(false);
        java.lang.String str5 = cassandraHost2.toString();
        cassandraHost2.setUseThriftFramedTransport(true);
        int int8 = cassandraHost2.getMaxActive();
        cassandraHost2.setCassandraThriftSocketTimeout(97);
        cassandraHost2.setLifo(true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient13 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient13.equals(null)", !hThriftClient13.equals(null));
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1170");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", 9160);
        boolean boolean3 = cassandraHost2.isPerformNameResolution();
        cassandraHost2.setLifo(true);
        int int6 = cassandraHost2.getMaxActive();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1171");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("10:9160", (int) (short) 296);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        tSSLTransportParameters22.setTrustStore(":9160:9160", "CassandraClient<%s-%d>(CassandraClient<%s-%d>):100", "(127.0.0.1):10", ":9160:9160");
        tSSLTransportParameters22.setTrustStore("-2", "(127.0.0.1):10");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient31 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters22);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient31.equals(null)", !hThriftClient31.equals(null));
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1172");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160(:9160):52", (int) (byte) -1);
        int int3 = cassandraHost2.getCassandraThriftSocketTimeout();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1173");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) (short) 5);
        boolean boolean3 = cassandraHost2.getUseSocketKeepalive();
        int int4 = cassandraHost2.getCassandraThriftSocketTimeout();
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):1", strArray12);
        tSSLTransportParameters17.setTrustStore("hi!:10", "CassandraClient<%s-%d>(CassandraClient<%s-%d>):5", "(127.0.0.1):35", ":9160(:9160):206");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient23 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters17);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient23.equals(null)", !hThriftClient23.equals(null));
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1174");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0(0.0.0.0):9160", 406);
        int int3 = cassandraHost2.getCassandraThriftSocketTimeout();
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):0", strArray13);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient21 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters20);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient21.equals(null)", !hThriftClient21.equals(null));
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1175");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) (byte) -66);
        java.lang.String[] strArray7 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters8 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray7);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray7, true);
        tSSLTransportParameters10.setKeyStore("127.0.0.1", ":9160:9160");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient14 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters10);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient14.equals(null)", !hThriftClient14.equals(null));
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1176");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("207", (int) (byte) 16);
        java.lang.String str3 = cassandraHost2.getName();
        boolean boolean4 = cassandraHost2.getUseSocketKeepalive();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1177");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("209", (int) (byte) 35);
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>)", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1:0", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0(0.0.0.0)", strArray13, true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient25 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters24);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient25.equals(null)", !hThriftClient25.equals(null));
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1178");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("25", 216);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1179");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!:10", (int) (short) -3);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):100", 207);
        boolean boolean6 = cassandraHost2.equals((java.lang.Object) cassandraHost5);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1180");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97");
        cassandraHost1.setMaxWaitTimeWhenExhausted((long) 6);
        cassandraHost1.setMaxActive((int) (short) 216);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:10", strArray16, false);
        tSSLTransportParameters28.setKeyStore("", "(127.0.0.1):100");
        tSSLTransportParameters28.setTrustStore("6:10", "CassandraClient<%s-%d>(CassandraClient<%s-%d>)");
        tSSLTransportParameters28.requireClientAuth(true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient37 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters28);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient37.equals(null)", !hThriftClient37.equals(null));
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1181");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (short) 10);
        java.lang.String str3 = cassandraHost2.getIp();
        cassandraHost2.setUseThriftFramedTransport(false);
        long long6 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        cassandraHost2.setLifo(true);
        boolean boolean9 = cassandraHost2.getUseThriftFramedTransport();
        int int10 = cassandraHost2.getPort();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient11.equals(null)", !hThriftClient11.equals(null));
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1182");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 1);
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) (short) 100);
        cassandraHost2.setCassandraThriftSocketTimeout((int) '#');
        boolean boolean7 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String str8 = cassandraHost2.getName();
        java.lang.String[] strArray19 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray19, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):32", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("236", strArray19, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient32 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters31);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient32.equals(null)", !hThriftClient32.equals(null));
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1183");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) 'a');
        long long3 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        int int4 = cassandraHost2.getPort();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("1", (int) (short) -1);
        boolean boolean8 = cassandraHost2.equals((java.lang.Object) cassandraHost7);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray18, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):32", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("207", strArray18, true);
        tSSLTransportParameters28.setTrustStore(":1:85", "-2(-2):9160");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient32 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters28);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient32.equals(null)", !hThriftClient32.equals(null));
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1184");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("hi!:0");
        java.lang.String str2 = cassandraHost1.getHost();
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient29 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters28);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient29.equals(null)", !hThriftClient29.equals(null));
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1185");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("10:9160", (int) (byte) -1);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1186");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0:9160", (int) (short) 5);
        cassandraHost2.setMaxActive((int) (short) 96);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        tSSLTransportParameters18.setTrustStore("416", "CassandraClient<%s-%d>:1", "", ":9160");
        tSSLTransportParameters18.setTrustStore("", "194(0.0.0.194):84");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient27 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters18);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient27.equals(null)", !hThriftClient27.equals(null));
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1187");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("");
        java.lang.String str2 = cassandraHost1.getUrl();
        boolean boolean3 = cassandraHost1.getUseSocketKeepalive();
        int int4 = cassandraHost1.getPort();
        int int5 = cassandraHost1.getMaxActive();
        int int6 = cassandraHost1.getMaxActive();
        int int7 = cassandraHost1.getPort();
        cassandraHost1.setUseSocketKeepalive(false);
        java.lang.String str10 = cassandraHost1.getUrl();
        java.lang.String[] strArray15 = new java.lang.String[] { "(127.0.0.1):97", "hi!:10" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("-2", strArray15);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient19 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters18);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient19.equals(null)", !hThriftClient19.equals(null));
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1188");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("9160", 100);
        java.lang.String str3 = cassandraHost2.getHost();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1189");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("");
        java.lang.String str2 = cassandraHost1.getUrl();
        boolean boolean3 = cassandraHost1.getLifo();
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):1", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("6:10", strArray14);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient26 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters25);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient26.equals(null)", !hThriftClient26.equals(null));
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1190");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 194);
        boolean boolean3 = cassandraHost2.getUseSocketKeepalive();
        java.lang.String str4 = cassandraHost2.getIp();
        int int5 = cassandraHost2.getMaxActive();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1191");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (byte) 10);
        boolean boolean3 = cassandraHost2.isPerformNameResolution();
        java.lang.String str4 = cassandraHost2.getHost();
        int int5 = cassandraHost2.getPort();
        java.lang.String str6 = cassandraHost2.getHost();
        cassandraHost2.setUseThriftFramedTransport(false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1192");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("0");
        boolean boolean2 = cassandraHost1.isPerformNameResolution();
        java.lang.String str3 = cassandraHost1.getIp();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1193");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160(:9160):206", (int) ' ');
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1194");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("-2");
        cassandraHost1.setLifo(true);
        java.lang.String[] strArray11 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:0", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1:52", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient20 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters19);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient20.equals(null)", !hThriftClient20.equals(null));
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1195");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("9160", 48);
        int int3 = cassandraHost2.getCassandraThriftSocketTimeout();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8);
        tSSLTransportParameters10.setKeyStore("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", "");
        tSSLTransportParameters10.setKeyStore("CassandraClient<%s-%d>", ":9160", "(127.0.0.1):10", "0");
        tSSLTransportParameters10.setKeyStore("", "127.0.0.1");
        tSSLTransportParameters10.setTrustStore(":9160", "(127.0.0.1)");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient25 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters10);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient25.equals(null)", !hThriftClient25.equals(null));
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1196");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160(:9160):52", (int) (byte) -1);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1197");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)", (int) ' ');
        java.lang.String[] strArray7 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray7, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray7);
        boolean boolean11 = cassandraHost2.equals((java.lang.Object) tSSLTransportParameters10);
        java.lang.String str12 = cassandraHost2.getHost();
        java.lang.String[] strArray20 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray20, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("6(0.0.0.6):9160", strArray20, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient28 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters27);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient28.equals(null)", !hThriftClient28.equals(null));
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1198");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 194);
        boolean boolean3 = cassandraHost2.getUseSocketKeepalive();
        boolean boolean4 = cassandraHost2.getUseSocketKeepalive();
        cassandraHost2.setCassandraThriftSocketTimeout((int) (byte) 124);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1199");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):10", (int) (byte) 10);
        cassandraHost2.setCassandraThriftSocketTimeout(9160);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1200");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) '#');
        java.lang.String str3 = cassandraHost2.getUrl();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1201");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (short) 10);
        int int3 = cassandraHost2.getPort();
        boolean boolean4 = cassandraHost2.getLifo();
        int int5 = cassandraHost2.getMaxActive();
        java.lang.String str6 = cassandraHost2.getIp();
        cassandraHost2.setCassandraThriftSocketTimeout((int) ' ');
        java.lang.String str9 = cassandraHost2.getHost();
        cassandraHost2.setUseSocketKeepalive(true);
        boolean boolean12 = cassandraHost2.getUseSocketKeepalive();
        java.lang.String[] strArray25 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray25, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray25);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray25, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray25, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray25);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray25);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray25);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("6:10", strArray25);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0", strArray25);
        tSSLTransportParameters37.setKeyStore("hi!(hi!)(hi!(hi!)):9160", "CassandraClient<%s-%d>(CassandraClient<%s-%d>)");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient41 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters37);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient41.equals(null)", !hThriftClient41.equals(null));
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1202");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (short) 10);
        java.lang.String str3 = cassandraHost2.getIp();
        cassandraHost2.setUseThriftFramedTransport(false);
        long long6 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        cassandraHost2.setLifo(true);
        boolean boolean9 = cassandraHost2.getUseThriftFramedTransport();
        int int10 = cassandraHost2.getPort();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("416", strArray17, true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient23 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters22);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient23.equals(null)", !hThriftClient23.equals(null));
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1203");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (-2));
        long long3 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        int int4 = cassandraHost2.getMaxActive();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1204");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):10", 3);
        boolean boolean3 = cassandraHost2.getUseThriftFramedTransport();
        cassandraHost2.setMaxWaitTimeWhenExhausted(7L);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1205");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("1:0");
        int int2 = cassandraHost1.getMaxActive();
        cassandraHost1.setUseSocketKeepalive(false);
        cassandraHost1.setUseSocketKeepalive(true);
        java.lang.String[] strArray13 = new java.lang.String[] { "127.0.0.1", "", "CassandraClient<%s-%d>", "0" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1", strArray13);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient16 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters15);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient16.equals(null)", !hThriftClient16.equals(null));
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1206");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("1:52", 0);
        boolean boolean3 = cassandraHost2.isPerformNameResolution();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1207");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("205");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient2 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient2.equals(null)", !hThriftClient2.equals(null));
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1208");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160(:9160)", 197);
        long long3 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        boolean boolean4 = cassandraHost2.getLifo();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1209");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):9160", (int) (byte) 53);
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):100", strArray13);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient25 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters24);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient25.equals(null)", !hThriftClient25.equals(null));
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1210");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("9160(0.0.35.200):216", (int) (short) 48);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1))):32", strArray15);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient31 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters30);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient31.equals(null)", !hThriftClient31.equals(null));
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1211");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (byte) 10);
        boolean boolean3 = cassandraHost2.isPerformNameResolution();
        cassandraHost2.setCassandraThriftSocketTimeout((int) (byte) 10);
        java.lang.String str6 = cassandraHost2.getName();
        int int7 = cassandraHost2.getCassandraThriftSocketTimeout();
        boolean boolean8 = cassandraHost2.getUseThriftFramedTransport();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1212");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 194);
        boolean boolean3 = cassandraHost2.getUseSocketKeepalive();
        java.lang.String str4 = cassandraHost2.getIp();
        java.lang.String[] strArray14 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):32", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("-55", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray14, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient24 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters23);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient24.equals(null)", !hThriftClient24.equals(null));
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1213");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("");
        java.lang.String str2 = cassandraHost1.getUrl();
        boolean boolean3 = cassandraHost1.getUseSocketKeepalive();
        int int4 = cassandraHost1.getPort();
        boolean boolean5 = cassandraHost1.getUseSocketKeepalive();
        int int6 = cassandraHost1.getCassandraThriftSocketTimeout();
        boolean boolean7 = cassandraHost1.getUseSocketKeepalive();
        boolean boolean8 = cassandraHost1.getLifo();
        int int9 = cassandraHost1.getPort();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):32", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("-55", strArray18);
        tSSLTransportParameters25.setTrustStore(":52", "10");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient29 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters25);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient29.equals(null)", !hThriftClient29.equals(null));
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1214");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", 10);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1215");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("199", (int) (short) 194);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1216");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1", (int) '4');
        java.lang.String str3 = cassandraHost2.toString();
        java.lang.String str4 = cassandraHost2.getName();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1217");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!:9160", 407);
        int int3 = cassandraHost2.getMaxActive();
        java.lang.String str4 = cassandraHost2.getHost();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1218");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        int int3 = cassandraHost2.getPort();
        cassandraHost2.setUseSocketKeepalive(true);
        java.lang.String[] strArray10 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        tSSLTransportParameters12.setKeyStore("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", "");
        tSSLTransportParameters12.setKeyStore("CassandraClient<%s-%d>", ":9160", "(127.0.0.1):10", "0");
        tSSLTransportParameters12.setTrustStore("97", ":1");
        tSSLTransportParameters12.setKeyStore("CassandraClient<%s-%d>:97", "CassandraClient<%s-%d>(CassandraClient<%s-%d>)", "11", "1");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient29 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters12);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient29.equals(null)", !hThriftClient29.equals(null));
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1219");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("114", (int) (byte) 84);
        cassandraHost2.setCassandraThriftSocketTimeout((int) (short) 123);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!(hi!):9160", strArray17, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient33 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters32);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient33.equals(null)", !hThriftClient33.equals(null));
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1220");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))", (int) (byte) 9);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1221");
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
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient21 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient21.equals(null)", !hThriftClient21.equals(null));
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1222");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        cassandraHost2.setUseSocketKeepalive(false);
        java.lang.String str5 = cassandraHost2.toString();
        java.lang.String str6 = cassandraHost2.getHost();
        boolean boolean7 = cassandraHost2.getUseThriftFramedTransport();
        cassandraHost2.setMaxWaitTimeWhenExhausted(101L);
        java.lang.String str10 = cassandraHost2.getHost();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient11.equals(null)", !hThriftClient11.equals(null));
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1223");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):35", (-1));
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        tSSLTransportParameters19.requireClientAuth(true);
        tSSLTransportParameters19.requireClientAuth(false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient24 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters19);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient24.equals(null)", !hThriftClient24.equals(null));
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1224");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (short) 206);
        java.lang.String str3 = cassandraHost2.getName();
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray12, true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient20 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters19);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient20.equals(null)", !hThriftClient20.equals(null));
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1225");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 1);
        int int3 = cassandraHost2.getPort();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) 'a');
        boolean boolean7 = cassandraHost6.getLifo();
        java.lang.String str8 = cassandraHost6.toString();
        java.lang.String str9 = cassandraHost6.getIp();
        boolean boolean10 = cassandraHost2.equals((java.lang.Object) str9);
        boolean boolean11 = cassandraHost2.getLifo();
        boolean boolean12 = cassandraHost2.getUseThriftFramedTransport();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient13 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient13.equals(null)", !hThriftClient13.equals(null));
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1226");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):97", 597);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1227");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("207(0.0.0.207):16", 0);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0(0.0.0.0):-1", strArray15);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient31 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters30);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient31.equals(null)", !hThriftClient31.equals(null));
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1228");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0.0.0.1(0.0.0.1):48", 597);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1229");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):10", (int) (byte) 100);
        cassandraHost2.setMaxWaitTimeWhenExhausted(12L);
        int int5 = cassandraHost2.getCassandraThriftSocketTimeout();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1230");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (short) 10);
        java.lang.String str3 = cassandraHost2.getIp();
        cassandraHost2.setUseThriftFramedTransport(false);
        boolean boolean6 = cassandraHost2.getUseSocketKeepalive();
        boolean boolean7 = cassandraHost2.getUseSocketKeepalive();
        boolean boolean8 = cassandraHost2.getUseSocketKeepalive();
        cassandraHost2.setUseSocketKeepalive(true);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray17, false);
        tSSLTransportParameters22.requireClientAuth(false);
        tSSLTransportParameters22.requireClientAuth(true);
        tSSLTransportParameters22.setTrustStore("0(0.0.0.0):9160", ":9160:9160");
        tSSLTransportParameters22.setKeyStore("194", "hi!", "0.0.0.194", "(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient35 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters22);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient35.equals(null)", !hThriftClient35.equals(null));
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1231");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("hi!");
        cassandraHost1.setMaxActive(10);
        boolean boolean4 = cassandraHost1.isPerformNameResolution();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1232");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0:9160", (int) (short) 135);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1233");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        cassandraHost2.setUseSocketKeepalive(false);
        int int5 = cassandraHost2.getCassandraThriftSocketTimeout();
        boolean boolean6 = cassandraHost2.getLifo();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = new me.prettyprint.cassandra.service.CassandraHost("0");
        boolean boolean9 = cassandraHost8.isPerformNameResolution();
        cassandraHost8.setCassandraThriftSocketTimeout(50);
        cassandraHost8.setCassandraThriftSocketTimeout((int) (short) 1);
        boolean boolean14 = cassandraHost2.equals((java.lang.Object) cassandraHost8);
        long long15 = cassandraHost8.getMaxWaitTimeWhenExhausted();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient16 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost8);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient16.equals(null)", !hThriftClient16.equals(null));
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1234");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160", (int) '4');
        int int3 = cassandraHost2.getPort();
        boolean boolean4 = cassandraHost2.getLifo();
        cassandraHost2.setUseSocketKeepalive(false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1235");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("1:52", 6);
        boolean boolean3 = cassandraHost2.getLifo();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1236");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):10", 99);
        int int3 = cassandraHost2.getPort();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1237");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", (int) (byte) 0);
        cassandraHost2.setMaxActive((int) (byte) 33);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1238");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("101", 50);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1239");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        boolean boolean3 = cassandraHost2.getUseThriftFramedTransport();
        cassandraHost2.setLifo(true);
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) (-1));
        java.lang.String str8 = cassandraHost2.getName();
        java.lang.String str9 = cassandraHost2.getHost();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1240");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("1:105", (int) (short) 135);
        java.lang.String[] strArray7 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters8 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray7);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray7);
        tSSLTransportParameters9.setKeyStore("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", "");
        tSSLTransportParameters9.setKeyStore("CassandraClient<%s-%d>", ":9160", "(127.0.0.1):10", "0");
        tSSLTransportParameters9.setKeyStore("CassandraClient<%s-%d>", "0", "CassandraClient<%s-%d>", "0");
        tSSLTransportParameters9.setTrustStore(":9160", "");
        tSSLTransportParameters9.setTrustStore("1:52", ":9160");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient29 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters9);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient29.equals(null)", !hThriftClient29.equals(null));
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1241");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("96", 54);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):1", strArray12, true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient23 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters22);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient23.equals(null)", !hThriftClient23.equals(null));
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1242");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        boolean boolean3 = cassandraHost2.getUseThriftFramedTransport();
        cassandraHost2.setLifo(true);
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) (-1));
        java.lang.String str8 = cassandraHost2.getName();
        int int9 = cassandraHost2.getPort();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1243");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) 'a');
        boolean boolean3 = cassandraHost2.getLifo();
        java.lang.String str4 = cassandraHost2.getIp();
        java.lang.String str5 = cassandraHost2.getIp();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1244");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160(:9160)", 197);
        long long3 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        int int4 = cassandraHost2.getMaxActive();
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("11", strArray16);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient28 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters27);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient28.equals(null)", !hThriftClient28.equals(null));
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1245");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):97", 2);
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("10", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):100", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>))", strArray10, true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient19 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters18);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient19.equals(null)", !hThriftClient19.equals(null));
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1246");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (short) 10);
        int int3 = cassandraHost2.getPort();
        boolean boolean4 = cassandraHost2.getLifo();
        int int5 = cassandraHost2.getMaxActive();
        java.lang.String str6 = cassandraHost2.getIp();
        cassandraHost2.setCassandraThriftSocketTimeout((int) ' ');
        boolean boolean9 = cassandraHost2.getLifo();
        boolean boolean10 = cassandraHost2.getLifo();
        boolean boolean11 = cassandraHost2.isPerformNameResolution();
        java.lang.String[] strArray24 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray24, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray24);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray24, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray24, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray24, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160:9160", strArray24, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray24, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters38 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):32", strArray24);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters39 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1(0.0.0.1):100", strArray24);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient40 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters39);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient40.equals(null)", !hThriftClient40.equals(null));
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1247");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        cassandraHost2.setUseSocketKeepalive(false);
        boolean boolean5 = cassandraHost2.getLifo();
        java.lang.String[] strArray9 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        tSSLTransportParameters10.setTrustStore("hi!", "", "hi!", "hi!");
        boolean boolean16 = cassandraHost2.equals((java.lang.Object) "hi!");
        cassandraHost2.setLifo(true);
        java.lang.String[] strArray31 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray31, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray31, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray31);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters38 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray31, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters39 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray31);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters41 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray31, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters43 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray31, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters45 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0", strArray31, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters47 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray31, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient48 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters47);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient48.equals(null)", !hThriftClient48.equals(null));
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1248");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1))", (int) (short) -3);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1249");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):100", 35);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("416", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160(:9160):206", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>:50", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("131", strArray12);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient22 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters21);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient22.equals(null)", !hThriftClient22.equals(null));
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1250");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):194");
        java.lang.String[] strArray10 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):1", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:9160", strArray10, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient18 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters17);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient18.equals(null)", !hThriftClient18.equals(null));
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1251");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (-2));
        int int3 = cassandraHost2.getCassandraThriftSocketTimeout();
        cassandraHost2.setMaxActive((int) (byte) 3);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1252");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("96", 54);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1253");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0(0.0.0.0):-1", (int) (short) 10);
        cassandraHost2.setUseSocketKeepalive(true);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("10", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):100", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:0", strArray17, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient32 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters31);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient32.equals(null)", !hThriftClient32.equals(null));
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1254");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("9160", 216);
        boolean boolean3 = cassandraHost2.getUseSocketKeepalive();
        java.lang.String str4 = cassandraHost2.toString();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1255");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        boolean boolean3 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String str4 = cassandraHost2.getName();
        cassandraHost2.setUseThriftFramedTransport(true);
        java.lang.String str7 = cassandraHost2.getIp();
        boolean boolean8 = cassandraHost2.getLifo();
        java.lang.String str9 = cassandraHost2.getUrl();
        java.lang.String str10 = cassandraHost2.getIp();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient11.equals(null)", !hThriftClient11.equals(null));
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1256");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) '4');
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):52", strArray13);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient25 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters24);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient25.equals(null)", !hThriftClient25.equals(null));
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1257");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (short) 10);
        int int3 = cassandraHost2.getPort();
        boolean boolean4 = cassandraHost2.getLifo();
        int int5 = cassandraHost2.getMaxActive();
        cassandraHost2.setMaxActive(52);
        int int8 = cassandraHost2.getCassandraThriftSocketTimeout();
        java.lang.String str9 = cassandraHost2.getUrl();
        long long10 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient11.equals(null)", !hThriftClient11.equals(null));
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1258");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160", (int) '4');
        int int3 = cassandraHost2.getPort();
        java.lang.String str4 = cassandraHost2.getName();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1259");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):10", 99);
        int int3 = cassandraHost2.getMaxActive();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1260");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("");
        java.lang.String str2 = cassandraHost1.getUrl();
        boolean boolean3 = cassandraHost1.getLifo();
        int int4 = cassandraHost1.getMaxActive();
        int int5 = cassandraHost1.getPort();
        cassandraHost1.setMaxActive((int) (short) 106);
        java.lang.String str8 = cassandraHost1.toString();
        cassandraHost1.setUseThriftFramedTransport(false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient11.equals(null)", !hThriftClient11.equals(null));
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1261");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>)", (int) (byte) 33);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1262");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (short) 10);
        java.lang.String str3 = cassandraHost2.getIp();
        boolean boolean4 = cassandraHost2.getLifo();
        cassandraHost2.setLifo(true);
        cassandraHost2.setUseSocketKeepalive(false);
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) (short) 203);
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray20, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray20, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray20, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("6(0.0.0.6):-2", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("101", strArray20, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160:1", strArray20, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient32 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters31);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient32.equals(null)", !hThriftClient32.equals(null));
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1263");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("hi!(hi!):10");
        long long2 = cassandraHost1.getMaxWaitTimeWhenExhausted();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1264");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):48", (int) (short) 206);
        cassandraHost2.setCassandraThriftSocketTimeout((int) (short) 36);
        java.lang.String str5 = cassandraHost2.getName();
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":52", strArray12);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient17 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters16);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient17.equals(null)", !hThriftClient17.equals(null));
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1265");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        cassandraHost2.setUseSocketKeepalive(false);
        java.lang.String str5 = cassandraHost2.toString();
        cassandraHost2.setLifo(true);
        boolean boolean8 = cassandraHost2.isPerformNameResolution();
        int int9 = cassandraHost2.getCassandraThriftSocketTimeout();
        java.lang.String str10 = cassandraHost2.toString();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient11.equals(null)", !hThriftClient11.equals(null));
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1266");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):1");
        java.lang.String str2 = cassandraHost1.getUrl();
        java.lang.String str3 = cassandraHost1.getUrl();
        long long4 = cassandraHost1.getMaxWaitTimeWhenExhausted();
        boolean boolean5 = cassandraHost1.getUseThriftFramedTransport();
        boolean boolean6 = cassandraHost1.getUseThriftFramedTransport();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1267");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 1);
        boolean boolean3 = cassandraHost2.isPerformNameResolution();
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("97", strArray13);
        tSSLTransportParameters22.setTrustStore("", "0.0.0.1");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient26 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters22);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient26.equals(null)", !hThriftClient26.equals(null));
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1268");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("");
        java.lang.String str2 = cassandraHost1.getUrl();
        boolean boolean3 = cassandraHost1.getUseSocketKeepalive();
        int int4 = cassandraHost1.getMaxActive();
        boolean boolean5 = cassandraHost1.getUseSocketKeepalive();
        java.lang.String[] strArray15 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0.0.0.194", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("199", strArray15);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient24 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters23);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient24.equals(null)", !hThriftClient24.equals(null));
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1269");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (short) 10);
        java.lang.String str3 = cassandraHost2.getIp();
        boolean boolean4 = cassandraHost2.getLifo();
        cassandraHost2.setUseThriftFramedTransport(false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1270");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) 'a');
        boolean boolean3 = cassandraHost2.getLifo();
        java.lang.String str4 = cassandraHost2.toString();
        boolean boolean5 = cassandraHost2.getUseSocketKeepalive();
        java.lang.String str6 = cassandraHost2.getName();
        java.lang.String str7 = cassandraHost2.toString();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1271");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("416(0.0.1.160):11");
        java.lang.String str2 = cassandraHost1.getName();
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
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("399", strArray16, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient31 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters30);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient31.equals(null)", !hThriftClient31.equals(null));
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1272");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97");
        cassandraHost1.setMaxWaitTimeWhenExhausted((long) 6);
        int int4 = cassandraHost1.getCassandraThriftSocketTimeout();
        java.lang.String[] strArray19 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray19, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("97", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160:1", strArray19, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:35", strArray19);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient37 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters36);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient37.equals(null)", !hThriftClient37.equals(null));
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1273");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 194);
        boolean boolean3 = cassandraHost2.getUseSocketKeepalive();
        boolean boolean4 = cassandraHost2.getUseSocketKeepalive();
        int int5 = cassandraHost2.getPort();
        java.lang.String str6 = cassandraHost2.getName();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray17);
        boolean boolean28 = cassandraHost2.equals((java.lang.Object) "127.0.0.1");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient29 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient29.equals(null)", !hThriftClient29.equals(null));
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1274");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!(hi!)(hi!(hi!)):9160", (int) (byte) 3);
        boolean boolean3 = cassandraHost2.getUseThriftFramedTransport();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1275");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!:10", (int) (short) 0);
        java.lang.String str3 = cassandraHost2.getIp();
        cassandraHost2.setCassandraThriftSocketTimeout((int) (short) 100);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:10", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1:52", strArray14, false);
        tSSLTransportParameters22.setKeyStore("", "", "CassandraClient<%s-%d>(CassandraClient<%s-%d>):100", "(127.0.0.1):9160");
        tSSLTransportParameters22.setKeyStore("199", "10");
        tSSLTransportParameters22.setKeyStore("10:-1", "209", "(127.0.0.1):97", "1:52");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient36 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters22);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient36.equals(null)", !hThriftClient36.equals(null));
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1276");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) 'a');
        boolean boolean3 = cassandraHost2.getLifo();
        java.lang.String str4 = cassandraHost2.getIp();
        java.lang.String str5 = cassandraHost2.getIp();
        int int6 = cassandraHost2.getPort();
        boolean boolean7 = cassandraHost2.isPerformNameResolution();
        long long8 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        java.lang.String str9 = cassandraHost2.getUrl();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1277");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("10(0.0.0.10):-1", (int) (short) 106);
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":97", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient25 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters24);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient25.equals(null)", !hThriftClient25.equals(null));
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1278");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):10");
        long long2 = cassandraHost1.getMaxWaitTimeWhenExhausted();
        boolean boolean3 = cassandraHost1.isPerformNameResolution();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1279");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("207(0.0.0.207):16");
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1))):32", strArray12, false);
        tSSLTransportParameters24.setKeyStore(":10(:10):9160", "(127.0.0.1):1", ":9160", "0(0.0.0.0):5");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient30 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters24);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient30.equals(null)", !hThriftClient30.equals(null));
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1280");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (byte) 10);
        boolean boolean3 = cassandraHost2.isPerformNameResolution();
        java.lang.String str4 = cassandraHost2.getHost();
        java.lang.String str5 = cassandraHost2.getHost();
        java.lang.String str6 = cassandraHost2.getIp();
        boolean boolean7 = cassandraHost2.isPerformNameResolution();
        boolean boolean8 = cassandraHost2.getUseSocketKeepalive();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1281");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) '4');
        cassandraHost2.setMaxWaitTimeWhenExhausted(407L);
        cassandraHost2.setUseThriftFramedTransport(false);
        java.util.concurrent.atomic.AtomicLong atomicLong8 = new java.util.concurrent.atomic.AtomicLong((long) 9160);
        boolean boolean9 = cassandraHost2.equals((java.lang.Object) atomicLong8);
        java.lang.String[] strArray19 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):32", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1:52", strArray19, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient29 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters28);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient29.equals(null)", !hThriftClient29.equals(null));
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1282");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97");
        java.lang.String str2 = cassandraHost1.getUrl();
        java.lang.String str3 = cassandraHost1.getUrl();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1283");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        boolean boolean3 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String str4 = cassandraHost2.getName();
        cassandraHost2.setUseThriftFramedTransport(true);
        java.lang.String str7 = cassandraHost2.getIp();
        boolean boolean8 = cassandraHost2.getLifo();
        boolean boolean10 = cassandraHost2.equals((java.lang.Object) "CassandraClient<%s-%d>(CassandraClient<%s-%d>):9160");
        java.lang.String str11 = cassandraHost2.getHost();
        java.lang.String str12 = cassandraHost2.getIp();
        java.lang.String str13 = cassandraHost2.toString();
        java.lang.String[] strArray25 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray25, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray25, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray25);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray25, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray25);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray25, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("10", strArray25, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters39 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("3", strArray25, true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient40 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters39);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient40.equals(null)", !hThriftClient40.equals(null));
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1284");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        boolean boolean3 = cassandraHost2.getUseThriftFramedTransport();
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) 10);
        java.lang.String str6 = cassandraHost2.getIp();
        int int7 = cassandraHost2.getPort();
        cassandraHost2.setCassandraThriftSocketTimeout((int) (short) 707);
        java.lang.String str10 = cassandraHost2.getHost();
        java.lang.String[] strArray21 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray21, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray21, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray21);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray21, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):32", strArray21);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":10", strArray21);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):1", strArray21);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient32 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters31);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient32.equals(null)", !hThriftClient32.equals(null));
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1285");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        cassandraHost2.setUseSocketKeepalive(false);
        java.lang.String str5 = cassandraHost2.toString();
        cassandraHost2.setLifo(true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1286");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1))):32");
        java.lang.String str2 = cassandraHost1.getHost();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1287");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("54", (int) (byte) -1);
        boolean boolean3 = cassandraHost2.isPerformNameResolution();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1288");
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
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient28 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient28.equals(null)", !hThriftClient28.equals(null));
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1289");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("1", 3);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1290");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("6", (int) (byte) 9);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("10(0.0.0.10):-1", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient23 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters22);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient23.equals(null)", !hThriftClient23.equals(null));
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1291");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>");
        cassandraHost1.setUseThriftFramedTransport(false);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray12);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient19 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters18);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient19.equals(null)", !hThriftClient19.equals(null));
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1292");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (byte) 10);
        boolean boolean3 = cassandraHost2.isPerformNameResolution();
        java.lang.String str4 = cassandraHost2.getHost();
        int int5 = cassandraHost2.getPort();
        boolean boolean6 = cassandraHost2.isPerformNameResolution();
        cassandraHost2.setMaxWaitTimeWhenExhausted(1L);
        int int9 = cassandraHost2.getPort();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1293");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        cassandraHost2.setUseSocketKeepalive(false);
        java.lang.String str5 = cassandraHost2.toString();
        cassandraHost2.setLifo(true);
        cassandraHost2.setUseSocketKeepalive(true);
        java.lang.String[] strArray21 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray21, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray21);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray21, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray21, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray21);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray21, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray21, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("2", strArray21);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient35 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters34);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient35.equals(null)", !hThriftClient35.equals(null));
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1294");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        cassandraHost2.setUseSocketKeepalive(true);
        int int5 = cassandraHost2.getCassandraThriftSocketTimeout();
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) (byte) 53);
        java.lang.String str8 = cassandraHost2.getIp();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray18, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray18, true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient29 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters28);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient29.equals(null)", !hThriftClient29.equals(null));
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1295");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)", (int) ' ');
        cassandraHost2.setMaxActive((int) (short) 106);
        long long5 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1296");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 0);
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray10, true);
        tSSLTransportParameters17.setKeyStore("0(0.0.0.0):-1", "CassandraClient<%s-%d>:50");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient21 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters17);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient21.equals(null)", !hThriftClient21.equals(null));
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1297");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("");
        java.lang.String str2 = cassandraHost1.getUrl();
        boolean boolean3 = cassandraHost1.getUseSocketKeepalive();
        int int4 = cassandraHost1.getPort();
        boolean boolean5 = cassandraHost1.getUseSocketKeepalive();
        int int6 = cassandraHost1.getMaxActive();
        java.lang.String str7 = cassandraHost1.getHost();
        long long8 = cassandraHost1.getMaxWaitTimeWhenExhausted();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1298");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("");
        java.lang.String str2 = cassandraHost1.getUrl();
        boolean boolean3 = cassandraHost1.getUseSocketKeepalive();
        int int4 = cassandraHost1.getPort();
        boolean boolean5 = cassandraHost1.getUseSocketKeepalive();
        int int6 = cassandraHost1.getMaxActive();
        java.lang.String str7 = cassandraHost1.getHost();
        java.lang.String str8 = cassandraHost1.getHost();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1299");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (short) 10);
        java.lang.String str3 = cassandraHost2.getIp();
        cassandraHost2.setUseThriftFramedTransport(false);
        long long6 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        cassandraHost2.setLifo(true);
        cassandraHost2.setUseThriftFramedTransport(false);
        cassandraHost2.setMaxWaitTimeWhenExhausted(349L);
        cassandraHost2.setUseThriftFramedTransport(false);
        java.lang.String str15 = cassandraHost2.getIp();
        java.lang.String[] strArray26 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray26, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray26, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray26);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray26, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray26);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray26, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters38 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("10", strArray26, true);
        tSSLTransportParameters38.setKeyStore("194", "194");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient42 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters38);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient42.equals(null)", !hThriftClient42.equals(null));
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1300");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", 207);
        java.lang.String str3 = cassandraHost2.getIp();
        long long4 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0(0.0.0.0):9160", strArray12, true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient19 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters18);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient19.equals(null)", !hThriftClient19.equals(null));
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1301");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        cassandraHost2.setUseSocketKeepalive(false);
        boolean boolean5 = cassandraHost2.getLifo();
        java.lang.String[] strArray9 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        tSSLTransportParameters10.setTrustStore("hi!", "", "hi!", "hi!");
        boolean boolean16 = cassandraHost2.equals((java.lang.Object) "hi!");
        java.lang.String[] strArray27 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray27, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray27, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray27);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray27, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):32", strArray27);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray27, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters38 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1))):0", strArray27);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient39 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters38);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient39.equals(null)", !hThriftClient39.equals(null));
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1302");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):9160", (int) (byte) 16);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1303");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) (short) 5);
        int int3 = cassandraHost2.getMaxActive();
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("10", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0(0.0.0.0)", strArray13);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient23 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters22);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient23.equals(null)", !hThriftClient23.equals(null));
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1304");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("");
        java.lang.String str2 = cassandraHost1.getUrl();
        boolean boolean3 = cassandraHost1.getUseSocketKeepalive();
        int int4 = cassandraHost1.getPort();
        boolean boolean5 = cassandraHost1.getUseSocketKeepalive();
        int int6 = cassandraHost1.getCassandraThriftSocketTimeout();
        long long7 = cassandraHost1.getMaxWaitTimeWhenExhausted();
        java.lang.String str8 = cassandraHost1.getIp();
        java.lang.String[] strArray24 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray24, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray24, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray24);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray24, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray24);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray24);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray24);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1", strArray24, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray24);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters39 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray24, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters41 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-2", strArray24, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters42 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("-2", strArray24);
        tSSLTransportParameters42.setTrustStore("(127.0.0.1)((127.0.0.1))", "10", "54", ":9160(:9160):52");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient48 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters42);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient48.equals(null)", !hThriftClient48.equals(null));
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1305");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        boolean boolean3 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String str4 = cassandraHost2.getName();
        cassandraHost2.setUseThriftFramedTransport(true);
        java.lang.String str7 = cassandraHost2.getIp();
        boolean boolean8 = cassandraHost2.getLifo();
        java.lang.String str9 = cassandraHost2.getHost();
        boolean boolean10 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String str11 = cassandraHost2.getIp();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient12 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient12.equals(null)", !hThriftClient12.equals(null));
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1306");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 1);
        cassandraHost2.setLifo(true);
        java.lang.String str5 = cassandraHost2.getHost();
        java.lang.String str6 = cassandraHost2.getHost();
        int int7 = cassandraHost2.getPort();
        int int8 = cassandraHost2.getMaxActive();
        long long9 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        cassandraHost2.setMaxActive(414);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient12 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient12.equals(null)", !hThriftClient12.equals(null));
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1307");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97");
        java.lang.String str2 = cassandraHost1.getHost();
        java.lang.String str3 = cassandraHost1.getUrl();
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):32", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient26 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters25);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient26.equals(null)", !hThriftClient26.equals(null));
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1308");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost(":0");
        cassandraHost1.setMaxActive((int) (short) 9159);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1309");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160", (int) (short) 206);
        cassandraHost2.setMaxWaitTimeWhenExhausted(114L);
        java.lang.String str5 = cassandraHost2.getName();
        int int6 = cassandraHost2.getPort();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray18, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray18, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1:52", strArray18, false);
        tSSLTransportParameters32.setTrustStore("CassandraClient<%s-%d>(CassandraClient<%s-%d>):9160", "6");
        tSSLTransportParameters32.setKeyStore("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", "CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):0", "(127.0.0.1):97", "CassandraClient<%s-%d>(CassandraClient<%s-%d>)");
        tSSLTransportParameters32.requireClientAuth(true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient43 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters32);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient43.equals(null)", !hThriftClient43.equals(null));
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1310");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160", (int) '4');
        int int3 = cassandraHost2.getPort();
        boolean boolean4 = cassandraHost2.getLifo();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):1", strArray17, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:10", strArray17, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0(0.0.0.0):9160", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray17);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient32 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters31);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient32.equals(null)", !hThriftClient32.equals(null));
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1311");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):100", (-2));
        java.lang.String str3 = cassandraHost2.getIp();
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0(0.0.0.0):9160", strArray15, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient28 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters27);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient28.equals(null)", !hThriftClient28.equals(null));
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1312");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        cassandraHost2.setUseSocketKeepalive(false);
        int int5 = cassandraHost2.getCassandraThriftSocketTimeout();
        boolean boolean6 = cassandraHost2.isPerformNameResolution();
        cassandraHost2.setLifo(true);
        java.lang.String str9 = cassandraHost2.getIp();
        java.lang.String str10 = cassandraHost2.getIp();
        java.lang.String[] strArray14 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        tSSLTransportParameters15.setTrustStore("hi!", "", "hi!", "hi!");
        tSSLTransportParameters15.requireClientAuth(true);
        tSSLTransportParameters15.setTrustStore("(127.0.0.1)", "CassandraClient<%s-%d>");
        tSSLTransportParameters15.setKeyStore("CassandraClient<%s-%d>:1", "", "CassandraClient<%s-%d>", "0.0.0.194");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient31 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters15);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient31.equals(null)", !hThriftClient31.equals(null));
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1313");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):9160", (int) (byte) 53);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1314");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        int int3 = cassandraHost2.getPort();
        cassandraHost2.setUseSocketKeepalive(true);
        java.lang.String str6 = cassandraHost2.getName();
        java.lang.String[] strArray16 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):9160", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("25", strArray16, true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient26 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters25);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient26.equals(null)", !hThriftClient26.equals(null));
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1315");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", 1);
        boolean boolean3 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String str4 = cassandraHost2.toString();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = me.prettyprint.cassandra.connection.client.HThriftClient.serial;
        long long7 = atomicLong5.getAndAdd((long) 'a');
        long long8 = atomicLong5.longValue();
        boolean boolean11 = atomicLong5.weakCompareAndSet((long) 'a', (long) (short) 106);
        boolean boolean12 = cassandraHost2.equals((java.lang.Object) atomicLong5);
        java.lang.String str13 = cassandraHost2.toString();
        java.lang.String[] strArray28 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray28, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray28, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray28);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray28, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray28);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray28);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters38 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray28);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters40 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray28, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters42 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray28, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters43 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0.0.0.1", strArray28);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters45 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray28, true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient46 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters45);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient46.equals(null)", !hThriftClient46.equals(null));
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1316");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("126", (int) (byte) 16);
        boolean boolean3 = cassandraHost2.isPerformNameResolution();
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):9160", strArray12, true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient20 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters19);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient20.equals(null)", !hThriftClient20.equals(null));
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1317");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("10(0.0.0.10):-1", 406);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1318");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        boolean boolean3 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String str4 = cassandraHost2.getName();
        cassandraHost2.setUseThriftFramedTransport(true);
        java.lang.String str7 = cassandraHost2.getIp();
        boolean boolean8 = cassandraHost2.getLifo();
        boolean boolean10 = cassandraHost2.equals((java.lang.Object) "CassandraClient<%s-%d>(CassandraClient<%s-%d>):9160");
        java.lang.String[] strArray21 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray21, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray21);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray21, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray21);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0(0.0.0.0):-1", strArray21);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("126", strArray21, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>:1", strArray21, true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient33 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters32);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient33.equals(null)", !hThriftClient33.equals(null));
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1319");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("-1");
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>:50", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("602", strArray15);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient31 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters30);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient31.equals(null)", !hThriftClient31.equals(null));
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1320");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1", 10);
        boolean boolean3 = cassandraHost2.getLifo();
        cassandraHost2.setMaxActive(3);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1321");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", 32);
        java.lang.String str3 = cassandraHost2.getUrl();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1322");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("8");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient2 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient2.equals(null)", !hThriftClient2.equals(null));
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1323");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160", (int) ' ');
        cassandraHost2.setLifo(true);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):9160", strArray12, true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient20 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters19);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient20.equals(null)", !hThriftClient20.equals(null));
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1324");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):9160", 0);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("10", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160:9160", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160(:9160):206", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!(hi!)", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:9160", strArray15, true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient31 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters30);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient31.equals(null)", !hThriftClient31.equals(null));
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1325");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):10");
        java.lang.String str2 = cassandraHost1.getHost();
        boolean boolean3 = cassandraHost1.isPerformNameResolution();
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160:9160", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("207", strArray14);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient25 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters24);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient25.equals(null)", !hThriftClient25.equals(null));
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1326");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) 'a');
        boolean boolean3 = cassandraHost2.getLifo();
        java.lang.String str4 = cassandraHost2.toString();
        boolean boolean5 = cassandraHost2.getUseSocketKeepalive();
        long long6 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        boolean boolean7 = cassandraHost2.isPerformNameResolution();
        cassandraHost2.setMaxActive(207);
        cassandraHost2.setCassandraThriftSocketTimeout((int) (short) -3);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient12 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient12.equals(null)", !hThriftClient12.equals(null));
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1327");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) 'a');
        long long3 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        int int4 = cassandraHost2.getPort();
        cassandraHost2.setLifo(true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1328");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) '4');
        java.lang.String str3 = cassandraHost2.getHost();
        long long4 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        long long5 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters6 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters6);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1329");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160", 1);
        long long3 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        int int4 = cassandraHost2.getMaxActive();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1330");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1))", 100);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1331");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("1", (-1));
        boolean boolean3 = cassandraHost2.getLifo();
        long long4 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1))):32", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!(hi!):9160", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("-2", strArray18);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient34 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters33);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient34.equals(null)", !hThriftClient34.equals(null));
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1332");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):9160", (int) (short) 340);
        java.lang.String[] strArray11 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:10", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>:1", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0.0.0.194", strArray11);
        tSSLTransportParameters19.setKeyStore("CassandraClient<%s-%d>(CassandraClient<%s-%d>)", "CassandraClient<%s-%d>(CassandraClient<%s-%d>):0");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient23 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters19);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient23.equals(null)", !hThriftClient23.equals(null));
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1333");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):0", (int) (byte) 33);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1334");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))((127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))):36", 197);
        java.lang.String[] strArray10 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):1", strArray10, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient18 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters17);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient18.equals(null)", !hThriftClient18.equals(null));
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1335");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("97", (int) (byte) 11);
        java.lang.String str3 = cassandraHost2.getHost();
        int int4 = cassandraHost2.getCassandraThriftSocketTimeout();
        int int5 = cassandraHost2.getCassandraThriftSocketTimeout();
        java.lang.String[] strArray14 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:10", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>:1", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0.0.0.194", strArray14);
        tSSLTransportParameters22.setTrustStore("hi!(hi!)", "127.0.0.1(127.0.0.1):52", "CassandraClient<%s-%d>:2", "1:52");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient28 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters22);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient28.equals(null)", !hThriftClient28.equals(null));
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1336");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("3", (int) '4');
        boolean boolean3 = cassandraHost2.getLifo();
        cassandraHost2.setUseThriftFramedTransport(false);
        java.lang.String[] strArray21 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray21, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray21, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray21);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray21, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray21);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray21);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray21);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1", strArray21, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray21);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray21, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters38 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-2", strArray21, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters39 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("-2", strArray21);
        tSSLTransportParameters39.setTrustStore("(127.0.0.1)((127.0.0.1))", "10", "54", ":9160(:9160):52");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient45 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters39);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient45.equals(null)", !hThriftClient45.equals(null));
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1337");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (short) 10);
        int int3 = cassandraHost2.getPort();
        boolean boolean4 = cassandraHost2.getUseThriftFramedTransport();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1338");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) 'a');
        boolean boolean3 = cassandraHost2.getLifo();
        java.lang.String str4 = cassandraHost2.toString();
        boolean boolean5 = cassandraHost2.getUseSocketKeepalive();
        cassandraHost2.setUseThriftFramedTransport(false);
        java.lang.String str8 = cassandraHost2.getUrl();
        int int9 = cassandraHost2.getMaxActive();
        java.util.concurrent.atomic.AtomicLong atomicLong11 = new java.util.concurrent.atomic.AtomicLong((long) (byte) -1);
        long long13 = atomicLong11.getAndSet(0L);
        double double14 = atomicLong11.doubleValue();
        long long16 = atomicLong11.getAndSet(204L);
        long long17 = atomicLong11.getAndDecrement();
        boolean boolean18 = cassandraHost2.equals((java.lang.Object) atomicLong11);
        boolean boolean19 = cassandraHost2.getLifo();
        java.lang.String str20 = cassandraHost2.getIp();
        java.lang.String[] strArray24 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray24);
        tSSLTransportParameters25.setTrustStore("hi!", "", "hi!", "hi!");
        tSSLTransportParameters25.setKeyStore("CassandraClient<%s-%d>", "");
        tSSLTransportParameters25.setTrustStore("CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):1", "(127.0.0.1):9160", "9", "(127.0.0.1):194");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient39 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters25);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient39.equals(null)", !hThriftClient39.equals(null));
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1339");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("209", (int) (byte) 35);
        cassandraHost2.setMaxActive((int) (short) 5);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1340");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160:9160", 1);
        cassandraHost2.setMaxActive(414);
        cassandraHost2.setUseThriftFramedTransport(false);
        java.lang.String str7 = cassandraHost2.getName();
        java.lang.String str8 = cassandraHost2.getHost();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray18, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("504", strArray18, true);
        tSSLTransportParameters28.setTrustStore(":9160(:9160):206", "hi!(hi!):296");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient32 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters28);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient32.equals(null)", !hThriftClient32.equals(null));
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1341");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        java.util.concurrent.atomic.AtomicLong atomicLong3 = new java.util.concurrent.atomic.AtomicLong();
        long long5 = atomicLong3.addAndGet((long) (byte) -1);
        boolean boolean6 = cassandraHost2.equals((java.lang.Object) (byte) -1);
        java.lang.String str7 = cassandraHost2.getIp();
        boolean boolean8 = cassandraHost2.getLifo();
        boolean boolean9 = cassandraHost2.getUseSocketKeepalive();
        java.lang.String[] strArray19 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("9160", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0.0.0.1", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):97", strArray19, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient30 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters29);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient30.equals(null)", !hThriftClient30.equals(null));
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1342");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("");
        java.lang.String str2 = cassandraHost1.getUrl();
        boolean boolean3 = cassandraHost1.getUseSocketKeepalive();
        int int4 = cassandraHost1.getPort();
        boolean boolean5 = cassandraHost1.getUseSocketKeepalive();
        int int6 = cassandraHost1.getMaxActive();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1343");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160(:9160):52", (int) (byte) -1);
        int int3 = cassandraHost2.getCassandraThriftSocketTimeout();
        java.lang.String str4 = cassandraHost2.toString();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1344");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0", (int) (short) -1);
        boolean boolean3 = cassandraHost2.getUseSocketKeepalive();
        int int4 = cassandraHost2.getMaxActive();
        int int5 = cassandraHost2.getMaxActive();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1345");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>:97", (int) (short) 2);
        cassandraHost2.setMaxActive(52);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1346");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97");
        java.lang.String str2 = cassandraHost1.getHost();
        cassandraHost1.setUseSocketKeepalive(true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1347");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (short) 10);
        java.lang.String str3 = cassandraHost2.getIp();
        cassandraHost2.setUseThriftFramedTransport(false);
        boolean boolean6 = cassandraHost2.getUseSocketKeepalive();
        boolean boolean7 = cassandraHost2.getUseSocketKeepalive();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1348");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("");
        java.lang.String str2 = cassandraHost1.getUrl();
        long long3 = cassandraHost1.getMaxWaitTimeWhenExhausted();
        boolean boolean4 = cassandraHost1.isPerformNameResolution();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray10);
        boolean boolean14 = cassandraHost1.equals((java.lang.Object) tSSLTransportParameters13);
        cassandraHost1.setMaxActive((int) (byte) 1);
        java.lang.String[] strArray29 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray29, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray29);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray29, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray29, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray29);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters39 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray29, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters41 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray29, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters42 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray29);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters43 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):100", strArray29);
        tSSLTransportParameters43.setTrustStore("1", "127.0.0.1(127.0.0.1):52", "205", "0:9160");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient49 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters43);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient49.equals(null)", !hThriftClient49.equals(null));
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1349");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>:97", 5);
        java.lang.String str3 = cassandraHost2.getHost();
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("9160", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("3", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":1(:1):85", strArray13);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient23 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters22);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient23.equals(null)", !hThriftClient23.equals(null));
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1350");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("hi!(hi!):206");
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:10", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:35", strArray12, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient26 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters25);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient26.equals(null)", !hThriftClient26.equals(null));
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1351");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) 'a');
        boolean boolean3 = cassandraHost2.getLifo();
        java.lang.String str4 = cassandraHost2.getIp();
        java.lang.String str5 = cassandraHost2.getIp();
        int int6 = cassandraHost2.getPort();
        java.lang.String str7 = cassandraHost2.toString();
        cassandraHost2.setLifo(false);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("416", strArray18, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):1", strArray18, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient28 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters27);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient28.equals(null)", !hThriftClient28.equals(null));
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1352");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):0", (int) (byte) 9);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1353");
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
        int int18 = cassandraHost1.getPort();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient19 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient19.equals(null)", !hThriftClient19.equals(null));
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1354");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!:10", (int) (short) 1);
        java.lang.String str3 = cassandraHost2.toString();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1355");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 1);
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) (short) 100);
        cassandraHost2.setUseSocketKeepalive(false);
        java.lang.String str7 = cassandraHost2.getUrl();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1356");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (short) 10);
        int int3 = cassandraHost2.getPort();
        boolean boolean4 = cassandraHost2.getLifo();
        java.lang.String str5 = cassandraHost2.getHost();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1357");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("399", (int) (byte) 48);
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):32", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("194", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):-1", strArray13, true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient25 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters24);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient25.equals(null)", !hThriftClient25.equals(null));
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1358");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("0(0.0.0.0):9160");
        java.lang.String str2 = cassandraHost1.getUrl();
        boolean boolean3 = cassandraHost1.getUseThriftFramedTransport();
        java.lang.String str4 = cassandraHost1.getUrl();
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray12);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient19 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters18);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient19.equals(null)", !hThriftClient19.equals(null));
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1359");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!:10", (int) (byte) 100);
        boolean boolean3 = cassandraHost2.getUseSocketKeepalive();
        java.lang.String str4 = cassandraHost2.toString();
        java.lang.String str5 = cassandraHost2.getIp();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1360");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (byte) 10);
        boolean boolean3 = cassandraHost2.getUseSocketKeepalive();
        int int4 = cassandraHost2.getPort();
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):32", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1))):0", strArray15);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient27 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters26);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient27.equals(null)", !hThriftClient27.equals(null));
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1361");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("6");
        boolean boolean2 = cassandraHost1.getUseSocketKeepalive();
        java.lang.String[] strArray11 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):0", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0:-1", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient20 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters19);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient20.equals(null)", !hThriftClient20.equals(null));
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1362");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        cassandraHost2.setUseSocketKeepalive(false);
        java.lang.String str5 = cassandraHost2.toString();
        cassandraHost2.setUseThriftFramedTransport(true);
        java.lang.String str8 = cassandraHost2.toString();
        java.lang.String str9 = cassandraHost2.getIp();
        java.util.concurrent.atomic.AtomicLong atomicLong11 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 0);
        float float12 = atomicLong11.floatValue();
        double double13 = atomicLong11.doubleValue();
        long long15 = atomicLong11.getAndSet((long) 10);
        atomicLong11.set((long) 1);
        long long19 = atomicLong11.getAndAdd(5L);
        int int20 = atomicLong11.intValue();
        long long22 = atomicLong11.getAndSet(308L);
        long long23 = atomicLong11.getAndDecrement();
        boolean boolean24 = cassandraHost2.equals((java.lang.Object) long23);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient25 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient25.equals(null)", !hThriftClient25.equals(null));
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1363");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 194);
        boolean boolean3 = cassandraHost2.getUseSocketKeepalive();
        java.lang.String str4 = cassandraHost2.getIp();
        long long5 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        cassandraHost2.setMaxWaitTimeWhenExhausted(111L);
        cassandraHost2.setUseThriftFramedTransport(true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1364");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("");
        int int2 = cassandraHost1.getCassandraThriftSocketTimeout();
        boolean boolean3 = cassandraHost1.getLifo();
        boolean boolean4 = cassandraHost1.isPerformNameResolution();
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, false);
        tSSLTransportParameters24.setKeyStore("(127.0.0.1):32", "-4");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient28 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters24);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient28.equals(null)", !hThriftClient28.equals(null));
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1365");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("hi!:0");
        cassandraHost1.setUseSocketKeepalive(true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1366");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost(":9160:9160");
        java.lang.String str2 = cassandraHost1.getUrl();
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("10", strArray8, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient13 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters12);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient13.equals(null)", !hThriftClient13.equals(null));
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1367");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) 'a');
        boolean boolean3 = cassandraHost2.getLifo();
        java.lang.String str4 = cassandraHost2.toString();
        boolean boolean5 = cassandraHost2.getUseSocketKeepalive();
        long long6 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15);
        tSSLTransportParameters23.setTrustStore("0", "");
        tSSLTransportParameters23.setKeyStore("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))", "CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):1", "CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):1", "(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))");
        tSSLTransportParameters23.setKeyStore("(127.0.0.1)((127.0.0.1)):35", "0.0.0.1:10");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient35 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters23);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient35.equals(null)", !hThriftClient35.equals(null));
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1368");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0", (int) (short) -1);
        boolean boolean3 = cassandraHost2.getUseSocketKeepalive();
        int int4 = cassandraHost2.getMaxActive();
        long long5 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        cassandraHost2.setLifo(true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1369");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):206", 6);
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("194", strArray11, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient21 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters20);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient21.equals(null)", !hThriftClient21.equals(null));
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1370");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        cassandraHost2.setUseSocketKeepalive(false);
        java.lang.String str5 = cassandraHost2.toString();
        java.lang.String str6 = cassandraHost2.getHost();
        int int7 = cassandraHost2.getMaxActive();
        int int8 = cassandraHost2.getCassandraThriftSocketTimeout();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1371");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160", (int) ' ');
        cassandraHost2.setLifo(true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1372");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("10(0.0.0.10):-1", (int) 'a');
        cassandraHost2.setUseSocketKeepalive(false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1373");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost(":9160");
        boolean boolean2 = cassandraHost1.getLifo();
        cassandraHost1.setUseSocketKeepalive(false);
        java.lang.String str5 = cassandraHost1.getUrl();
        java.lang.String[] strArray14 = new java.lang.String[] { "(127.0.0.1):1", "(127.0.0.1):10", "(127.0.0.1)((127.0.0.1)):32", "1:52", "10" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):32", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("6:10", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):194", strArray14, true);
        boolean boolean21 = cassandraHost1.equals((java.lang.Object) tSSLTransportParameters20);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient22 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient22.equals(null)", !hThriftClient22.equals(null));
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1374");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 1);
        int int3 = cassandraHost2.getPort();
        java.lang.String str4 = cassandraHost2.getUrl();
        cassandraHost2.setLifo(true);
        cassandraHost2.setUseThriftFramedTransport(false);
        boolean boolean9 = cassandraHost2.getUseSocketKeepalive();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1375");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>)", 10);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1376");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("0");
        java.lang.String str2 = cassandraHost1.getName();
        boolean boolean3 = cassandraHost1.getUseThriftFramedTransport();
        cassandraHost1.setMaxWaitTimeWhenExhausted((-3L));
        boolean boolean6 = cassandraHost1.getUseSocketKeepalive();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1377");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", 0);
        java.lang.String str3 = cassandraHost2.toString();
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):32", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("194", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>)", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160:9160", strArray15);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient27 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters26);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient27.equals(null)", !hThriftClient27.equals(null));
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1378");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        cassandraHost2.setUseSocketKeepalive(false);
        boolean boolean5 = cassandraHost2.getLifo();
        int int6 = cassandraHost2.getCassandraThriftSocketTimeout();
        cassandraHost2.setLifo(true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1379");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("");
        java.lang.String str2 = cassandraHost1.getUrl();
        boolean boolean3 = cassandraHost1.getUseSocketKeepalive();
        int int4 = cassandraHost1.getPort();
        boolean boolean5 = cassandraHost1.getUseSocketKeepalive();
        cassandraHost1.setMaxWaitTimeWhenExhausted(194L);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160(:9160):52", strArray15);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient22 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters21);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient22.equals(null)", !hThriftClient22.equals(null));
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1380");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)", (int) ' ');
        java.lang.String[] strArray7 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray7, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray7);
        boolean boolean11 = cassandraHost2.equals((java.lang.Object) tSSLTransportParameters10);
        boolean boolean12 = cassandraHost2.getUseSocketKeepalive();
        java.lang.String str13 = cassandraHost2.getIp();
        java.lang.String[] strArray21 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray21, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray21, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray21);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160:9160", strArray21);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient28 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters27);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient28.equals(null)", !hThriftClient28.equals(null));
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1381");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):10", (int) (byte) 100);
        cassandraHost2.setMaxWaitTimeWhenExhausted(12L);
        int int5 = cassandraHost2.getCassandraThriftSocketTimeout();
        java.lang.String str6 = cassandraHost2.getName();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1382");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", (int) (byte) 0);
        boolean boolean3 = cassandraHost2.isPerformNameResolution();
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("9160", strArray15);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient27 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters26);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient27.equals(null)", !hThriftClient27.equals(null));
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1383");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):97", (int) (byte) -3);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1384");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160", (int) (short) 194);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1:52", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("10(0.0.0.10)(10(0.0.0.10)):406", strArray14);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient28 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters27);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient28.equals(null)", !hThriftClient28.equals(null));
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1385");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("606");
        cassandraHost1.setMaxWaitTimeWhenExhausted((long) 50);
        cassandraHost1.setLifo(true);
        cassandraHost1.setMaxWaitTimeWhenExhausted((long) 50);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray17, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray17);
        tSSLTransportParameters27.setKeyStore("25", "", "11", "0.0.0.194");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient33 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters27);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient33.equals(null)", !hThriftClient33.equals(null));
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1386");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) '4');
        long long3 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        boolean boolean4 = cassandraHost2.getUseSocketKeepalive();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1387");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0.0.0.1", (int) (short) 10);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray8);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient13 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters12);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient13.equals(null)", !hThriftClient13.equals(null));
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1388");
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
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient23 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient23.equals(null)", !hThriftClient23.equals(null));
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1389");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":1:1", (int) (byte) 97);
        cassandraHost2.setUseThriftFramedTransport(true);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):100", strArray15);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient27 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters26);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient27.equals(null)", !hThriftClient27.equals(null));
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1390");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("416", (int) (byte) 35);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:10", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1:52", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0(0.0.0.0)", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":1", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>:2", strArray14);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient26 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters25);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient26.equals(null)", !hThriftClient26.equals(null));
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1391");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("-2");
        java.lang.String str2 = cassandraHost1.toString();
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters7 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6);
        tSSLTransportParameters7.setTrustStore("hi!", "", "hi!", "hi!");
        tSSLTransportParameters7.requireClientAuth(true);
        tSSLTransportParameters7.setTrustStore("(127.0.0.1)", "CassandraClient<%s-%d>");
        tSSLTransportParameters7.setTrustStore("hi!:10", "(127.0.0.1)");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient21 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters7);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient21.equals(null)", !hThriftClient21.equals(null));
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1392");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("1", (int) '4');
        java.lang.String str3 = cassandraHost2.getUrl();
        long long4 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        int int5 = cassandraHost2.getMaxActive();
        java.lang.String[] strArray14 = new java.lang.String[] { "(127.0.0.1):1", "(127.0.0.1):10", "(127.0.0.1)((127.0.0.1)):32", "1:52", "10" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):32", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("6:10", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("196", strArray14);
        tSSLTransportParameters19.requireClientAuth(true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient22 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters19);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient22.equals(null)", !hThriftClient22.equals(null));
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1393");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))", (int) (byte) 36);
        java.lang.String[] strArray9 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray9, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):0", strArray9);
        tSSLTransportParameters14.setTrustStore("-55", "0(0.0.0.0):9160");
        tSSLTransportParameters14.requireClientAuth(true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient20 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters14);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient20.equals(null)", !hThriftClient20.equals(null));
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1394");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):10", (int) (byte) 10);
        boolean boolean3 = cassandraHost2.isPerformNameResolution();
        cassandraHost2.setMaxWaitTimeWhenExhausted(12L);
        java.lang.String str6 = cassandraHost2.getIp();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("12", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1(0.0.0.1):6", strArray18, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient31 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters30);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient31.equals(null)", !hThriftClient31.equals(null));
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1395");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("0.0.0.1");
        int int2 = cassandraHost1.getPort();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1:0", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160:9160", strArray10, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient18 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters17);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient18.equals(null)", !hThriftClient18.equals(null));
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1396");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) '4');
        cassandraHost2.setMaxWaitTimeWhenExhausted(407L);
        cassandraHost2.setUseThriftFramedTransport(false);
        boolean boolean7 = cassandraHost2.getUseSocketKeepalive();
        java.lang.String[] strArray21 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray21, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray21);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray21, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray21, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray21);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray21);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray21, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("97", strArray21);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160:1", strArray21, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray21, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient38 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters37);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient38.equals(null)", !hThriftClient38.equals(null));
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1397");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", 1);
        boolean boolean3 = cassandraHost2.getLifo();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1398");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("0");
        boolean boolean2 = cassandraHost1.isPerformNameResolution();
        cassandraHost1.setCassandraThriftSocketTimeout(50);
        boolean boolean5 = cassandraHost1.getUseSocketKeepalive();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, false);
        boolean boolean13 = cassandraHost1.equals((java.lang.Object) "hi!");
        java.lang.String str14 = cassandraHost1.getIp();
        cassandraHost1.setMaxWaitTimeWhenExhausted((long) 50);
        cassandraHost1.setMaxWaitTimeWhenExhausted((long) 407);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient19 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient19.equals(null)", !hThriftClient19.equals(null));
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1399");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>)", (int) (short) 0);
        java.lang.String str3 = cassandraHost2.getIp();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray17, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0:35", strArray17, true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient34 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters33);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient34.equals(null)", !hThriftClient34.equals(null));
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1400");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("97", 9160);
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray11, false);
        tSSLTransportParameters20.requireClientAuth(false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient23 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters20);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient23.equals(null)", !hThriftClient23.equals(null));
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1401");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0", (-1));
        cassandraHost2.setCassandraThriftSocketTimeout((int) (short) 97);
        java.lang.String str5 = cassandraHost2.getHost();
        long long6 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160:9160", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160(:9160):52", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):35", strArray16, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient27 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters26);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient27.equals(null)", !hThriftClient27.equals(null));
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1402");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost(":1");
        java.lang.String str2 = cassandraHost1.getName();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1403");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 1);
        cassandraHost2.setLifo(true);
        java.lang.String str5 = cassandraHost2.getHost();
        java.lang.String str6 = cassandraHost2.getHost();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1404");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        cassandraHost2.setUseSocketKeepalive(false);
        java.lang.String str5 = cassandraHost2.toString();
        java.lang.String str6 = cassandraHost2.getHost();
        boolean boolean7 = cassandraHost2.getUseThriftFramedTransport();
        cassandraHost2.setMaxWaitTimeWhenExhausted(101L);
        java.lang.String str10 = cassandraHost2.getHost();
        java.lang.String str11 = cassandraHost2.getName();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient12 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient12.equals(null)", !hThriftClient12.equals(null));
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1405");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        cassandraHost2.setUseSocketKeepalive(false);
        java.lang.String str5 = cassandraHost2.toString();
        boolean boolean6 = cassandraHost2.getUseSocketKeepalive();
        java.lang.String str7 = cassandraHost2.getHost();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1406");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("194", 11);
        cassandraHost2.setMaxWaitTimeWhenExhausted(221L);
        java.lang.String str5 = cassandraHost2.getIp();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1407");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        boolean boolean3 = cassandraHost2.getUseThriftFramedTransport();
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) 10);
        java.lang.String str6 = cassandraHost2.getHost();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1408");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))((127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))):36", 54);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):97", strArray15);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient30 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters29);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient30.equals(null)", !hThriftClient30.equals(null));
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1409");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("1:52", 0);
        boolean boolean3 = cassandraHost2.isPerformNameResolution();
        cassandraHost2.setLifo(true);
        cassandraHost2.setUseThriftFramedTransport(true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1410");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        cassandraHost2.setUseSocketKeepalive(true);
        int int5 = cassandraHost2.getCassandraThriftSocketTimeout();
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) (byte) 53);
        java.lang.String str8 = cassandraHost2.getIp();
        boolean boolean9 = cassandraHost2.isPerformNameResolution();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1411");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160", (int) '4');
        java.lang.String str3 = cassandraHost2.getName();
        int int4 = cassandraHost2.getMaxActive();
        int int5 = cassandraHost2.getPort();
        cassandraHost2.setUseThriftFramedTransport(false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1412");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("");
        java.lang.String str2 = cassandraHost1.getUrl();
        boolean boolean3 = cassandraHost1.getLifo();
        cassandraHost1.setLifo(true);
        java.lang.String str6 = cassandraHost1.getIp();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1413");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!(hi!)(hi!(hi!)):9160", (int) (short) 203);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1414");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":1:1", (int) (byte) 97);
        cassandraHost2.setUseThriftFramedTransport(true);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, true);
        tSSLTransportParameters30.setKeyStore("CassandraClient<%s-%d>:97", "416", "0(0.0.0.0)", "10");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient36 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters30);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient36.equals(null)", !hThriftClient36.equals(null));
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1415");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("111");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient2 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient2.equals(null)", !hThriftClient2.equals(null));
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1416");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>:97", (int) (short) 2);
        cassandraHost2.setMaxActive(52);
        java.lang.String[] strArray10 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray10);
        tSSLTransportParameters14.setKeyStore("(127.0.0.1)((127.0.0.1)):100", "hi!(hi!):9160", ":9160(:9160):52", "3");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient20 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters14);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient20.equals(null)", !hThriftClient20.equals(null));
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1417");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))((127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))):36", 54);
        java.lang.String[] strArray7 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters8 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray7);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):100", strArray7);
        tSSLTransportParameters9.setTrustStore("10(0.0.0.10):-1", "504", "131", "hi!(hi!):1");
        tSSLTransportParameters9.requireClientAuth(false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient17 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters9);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient17.equals(null)", !hThriftClient17.equals(null));
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1418");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient2 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient2.equals(null)", !hThriftClient2.equals(null));
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1419");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0", (-1));
        java.lang.String str3 = cassandraHost2.toString();
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray18, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0.0.0.1", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18, true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient36 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters35);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient36.equals(null)", !hThriftClient36.equals(null));
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1420");
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
        java.lang.String[] strArray27 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray27);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray27);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray27, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>:1", strArray27);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160:1", strArray27);
        tSSLTransportParameters33.setTrustStore("(127.0.0.1)((127.0.0.1))", "199");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient37 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters33);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient37.equals(null)", !hThriftClient37.equals(null));
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1421");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("1:52", 0);
        boolean boolean3 = cassandraHost2.isPerformNameResolution();
        java.lang.String[] strArray13 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>)", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!(hi!):10", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("10(0.0.0.10):-1", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient23 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters22);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient23.equals(null)", !hThriftClient23.equals(null));
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1422");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0:9160", (int) (short) 5);
        cassandraHost2.setMaxActive((int) (short) 96);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1423");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160", (int) ' ');
        boolean boolean3 = cassandraHost2.getUseSocketKeepalive();
        boolean boolean4 = cassandraHost2.isPerformNameResolution();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1424");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 1);
        cassandraHost2.setLifo(true);
        java.lang.String str5 = cassandraHost2.getHost();
        java.lang.String str6 = cassandraHost2.getHost();
        java.lang.String str7 = cassandraHost2.getHost();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1425");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 1);
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) (short) 100);
        cassandraHost2.setUseThriftFramedTransport(true);
        java.lang.String[] strArray19 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray19, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0(0.0.0.0):9160", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray19);
        tSSLTransportParameters31.setTrustStore("33", "0.0.0.194");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient35 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters31);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient35.equals(null)", !hThriftClient35.equals(null));
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1426");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("");
        java.lang.String str2 = cassandraHost1.getUrl();
        boolean boolean3 = cassandraHost1.getLifo();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1427");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>:97", (int) (short) 2);
        java.lang.String str3 = cassandraHost2.getIp();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1428");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):32");
        java.lang.String str2 = cassandraHost1.toString();
        java.lang.String str3 = cassandraHost1.getName();
        long long4 = cassandraHost1.getMaxWaitTimeWhenExhausted();
        boolean boolean5 = cassandraHost1.getUseSocketKeepalive();
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray12, false);
        tSSLTransportParameters17.setKeyStore("(127.0.0.1):10", ":9160:9160");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient21 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters17);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient21.equals(null)", !hThriftClient21.equals(null));
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1429");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (short) 10);
        java.lang.String str3 = cassandraHost2.getIp();
        cassandraHost2.setUseThriftFramedTransport(false);
        cassandraHost2.setUseThriftFramedTransport(false);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost10 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))", (int) (byte) 36);
        java.lang.String str11 = cassandraHost10.getName();
        boolean boolean12 = cassandraHost2.equals((java.lang.Object) str11);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient13 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient13.equals(null)", !hThriftClient13.equals(null));
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1430");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (-2));
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):35", strArray13, false);
        tSSLTransportParameters25.setTrustStore("hi!(hi!):10", "9");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient29 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters25);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient29.equals(null)", !hThriftClient29.equals(null));
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1431");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (short) 10);
        java.lang.String str3 = cassandraHost2.getIp();
        cassandraHost2.setUseThriftFramedTransport(false);
        boolean boolean6 = cassandraHost2.getUseSocketKeepalive();
        cassandraHost2.setMaxActive((int) (byte) 0);
        boolean boolean9 = cassandraHost2.isPerformNameResolution();
        java.lang.String[] strArray14 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        tSSLTransportParameters16.setKeyStore("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", "");
        tSSLTransportParameters16.setKeyStore("CassandraClient<%s-%d>", ":9160", "(127.0.0.1):10", "0");
        tSSLTransportParameters16.setKeyStore("CassandraClient<%s-%d>", "0", "CassandraClient<%s-%d>", "0");
        tSSLTransportParameters16.setTrustStore(":9160", "");
        tSSLTransportParameters16.setKeyStore("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1))):32", ":9160", ":52", ":9160");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient38 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters16);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient38.equals(null)", !hThriftClient38.equals(null));
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1432");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0.0.0.0", (int) (short) 203);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160:9160", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("-1", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0.0.0.194", strArray14, true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient27 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters26);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient27.equals(null)", !hThriftClient27.equals(null));
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1433");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (byte) 10);
        boolean boolean3 = cassandraHost2.isPerformNameResolution();
        java.lang.String str4 = cassandraHost2.getUrl();
        cassandraHost2.setMaxWaitTimeWhenExhausted(209L);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):1", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):100", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0:-1", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("195", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1))):0", strArray18, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient30 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters29);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient30.equals(null)", !hThriftClient30.equals(null));
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1434");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):35", 10);
        java.lang.String str3 = cassandraHost2.toString();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1435");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0", (int) (byte) -116);
        java.lang.String[] strArray13 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):1", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!(hi!):9160", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":0", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-2", strArray13, false);
        tSSLTransportParameters23.setTrustStore("hi!:0", "");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient27 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters23);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient27.equals(null)", !hThriftClient27.equals(null));
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1436");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("");
        java.lang.String str2 = cassandraHost1.getHost();
        int int3 = cassandraHost1.getMaxActive();
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":52", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("126", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray12, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient21 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters20);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient21.equals(null)", !hThriftClient21.equals(null));
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1437");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        cassandraHost2.setUseSocketKeepalive(false);
        java.lang.String str5 = cassandraHost2.toString();
        cassandraHost2.setUseThriftFramedTransport(true);
        java.lang.String str8 = cassandraHost2.toString();
        int int9 = cassandraHost2.getPort();
        cassandraHost2.setMaxWaitTimeWhenExhausted(0L);
        boolean boolean12 = cassandraHost2.getUseThriftFramedTransport();
        boolean boolean13 = cassandraHost2.getUseSocketKeepalive();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient14 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient14.equals(null)", !hThriftClient14.equals(null));
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1438");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (short) 10);
        int int3 = cassandraHost2.getPort();
        boolean boolean4 = cassandraHost2.getLifo();
        int int5 = cassandraHost2.getMaxActive();
        java.lang.String str6 = cassandraHost2.getIp();
        cassandraHost2.setCassandraThriftSocketTimeout((int) ' ');
        java.lang.String str9 = cassandraHost2.getHost();
        cassandraHost2.setUseSocketKeepalive(true);
        boolean boolean12 = cassandraHost2.getUseSocketKeepalive();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient13 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient13.equals(null)", !hThriftClient13.equals(null));
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1439");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        cassandraHost2.setUseSocketKeepalive(false);
        java.lang.String str5 = cassandraHost2.toString();
        cassandraHost2.setUseThriftFramedTransport(true);
        cassandraHost2.setMaxActive((int) 'a');
        int int10 = cassandraHost2.getPort();
        java.lang.String[] strArray21 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray21, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray21, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray21);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray21, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray21);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray21, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray21);
        boolean boolean33 = cassandraHost2.equals((java.lang.Object) "CassandraClient<%s-%d>(CassandraClient<%s-%d>):97");
        cassandraHost2.setCassandraThriftSocketTimeout(48);
        cassandraHost2.setMaxActive((int) (byte) -46);
        java.lang.String[] strArray47 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters49 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray47, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters51 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray47, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters52 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray47);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters53 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160:9160", strArray47);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters55 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160(:9160):52", strArray47, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters57 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):35", strArray47, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient58 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters57);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient58.equals(null)", !hThriftClient58.equals(null));
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1440");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost(":9160(:9160):296");
        int int2 = cassandraHost1.getPort();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1441");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("1:0");
        int int2 = cassandraHost1.getMaxActive();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1442");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (byte) 10);
        java.lang.String str3 = cassandraHost2.getUrl();
        cassandraHost2.setLifo(true);
        java.lang.String str6 = cassandraHost2.getHost();
        cassandraHost2.setMaxActive((int) (byte) -108);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray18, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):32", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18, false);
        tSSLTransportParameters28.requireClientAuth(true);
        tSSLTransportParameters28.setKeyStore("6", "CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>))", "(127.0.0.1):100", ":9160(:9160):296");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient36 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters28);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient36.equals(null)", !hThriftClient36.equals(null));
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1443");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) 'a');
        boolean boolean3 = cassandraHost2.getLifo();
        java.lang.String str4 = cassandraHost2.toString();
        cassandraHost2.setUseThriftFramedTransport(true);
        cassandraHost2.setUseThriftFramedTransport(false);
        boolean boolean9 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray20, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray20, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1)))", strArray20);
        tSSLTransportParameters29.setKeyStore("(127.0.0.1):1", "0.0.0.1", "0(0.0.0.0):5", "0.0.0.1:10");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient35 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters29);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient35.equals(null)", !hThriftClient35.equals(null));
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1444");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160", (int) '4');
        java.lang.String str3 = cassandraHost2.getName();
        int int4 = cassandraHost2.getMaxActive();
        boolean boolean5 = cassandraHost2.getLifo();
        boolean boolean6 = cassandraHost2.getUseSocketKeepalive();
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray20, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray20, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray20, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray20, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray20, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1))((127.0.0.1)((127.0.0.1))):32", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!(hi!):9160", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("-2", strArray20);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient36 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters35);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient36.equals(null)", !hThriftClient36.equals(null));
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1445");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("59", (int) (byte) -98);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1446");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160(:9160):206", (int) (short) 296);
        boolean boolean3 = cassandraHost2.isPerformNameResolution();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1447");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        cassandraHost2.setUseSocketKeepalive(false);
        java.lang.String str5 = cassandraHost2.toString();
        cassandraHost2.setLifo(true);
        int int8 = cassandraHost2.getMaxActive();
        int int9 = cassandraHost2.getPort();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient10 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient10.equals(null)", !hThriftClient10.equals(null));
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1448");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0", (int) (short) -1);
        boolean boolean3 = cassandraHost2.getLifo();
        java.lang.String str4 = cassandraHost2.toString();
        int int5 = cassandraHost2.getMaxActive();
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):1", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0.0.0.0", strArray14, true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient23 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters22);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient23.equals(null)", !hThriftClient23.equals(null));
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1449");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160", (int) '4');
        java.lang.String str3 = cassandraHost2.getName();
        int int4 = cassandraHost2.getMaxActive();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1450");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0.0.0.1", 11);
        int int3 = cassandraHost2.getMaxActive();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1451");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):0", 84);
        java.lang.String str3 = cassandraHost2.toString();
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160:9160", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("602(0.0.2.90):416", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("196", strArray14, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient26 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters25);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient26.equals(null)", !hThriftClient26.equals(null));
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1452");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("515", 9160);
        boolean boolean3 = cassandraHost2.getUseThriftFramedTransport();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1453");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("126", 0);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1454");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (short) 10);
        java.lang.String str3 = cassandraHost2.getIp();
        cassandraHost2.setUseThriftFramedTransport(false);
        long long6 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        cassandraHost2.setLifo(true);
        cassandraHost2.setUseThriftFramedTransport(false);
        boolean boolean11 = cassandraHost2.isPerformNameResolution();
        java.util.concurrent.atomic.AtomicLong atomicLong13 = new java.util.concurrent.atomic.AtomicLong((long) ' ');
        boolean boolean14 = cassandraHost2.equals((java.lang.Object) atomicLong13);
        int int15 = cassandraHost2.getCassandraThriftSocketTimeout();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient16 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient16.equals(null)", !hThriftClient16.equals(null));
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1455");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("96", 54);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters7 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6);
        tSSLTransportParameters7.setTrustStore("hi!", "", "hi!", "hi!");
        tSSLTransportParameters7.setKeyStore("CassandraClient<%s-%d>", "");
        tSSLTransportParameters7.setTrustStore("", "CassandraClient<%s-%d>(CassandraClient<%s-%d>):100", ":9160", "");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient21 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters7);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient21.equals(null)", !hThriftClient21.equals(null));
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1456");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):10", (int) (byte) 10);
        boolean boolean3 = cassandraHost2.isPerformNameResolution();
        cassandraHost2.setUseSocketKeepalive(false);
        cassandraHost2.setUseSocketKeepalive(false);
        java.lang.String str8 = cassandraHost2.getHost();
        int int9 = cassandraHost2.getPort();
        java.lang.String[] strArray26 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray26, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray26, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray26);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray26, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray26);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray26, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters38 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray26, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters40 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0", strArray26, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters42 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray26, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters44 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray26, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters45 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0(0.0.0.0):-1", strArray26);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters47 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:10", strArray26, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters48 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):32", strArray26);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient49 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters48);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient49.equals(null)", !hThriftClient49.equals(null));
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1457");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        boolean boolean3 = cassandraHost2.getUseThriftFramedTransport();
        java.lang.String str4 = cassandraHost2.getName();
        cassandraHost2.setUseThriftFramedTransport(true);
        java.lang.String str7 = cassandraHost2.getIp();
        boolean boolean8 = cassandraHost2.getLifo();
        boolean boolean10 = cassandraHost2.equals((java.lang.Object) "CassandraClient<%s-%d>(CassandraClient<%s-%d>):9160");
        cassandraHost2.setUseThriftFramedTransport(true);
        java.lang.String[] strArray20 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("195", strArray20);
        tSSLTransportParameters25.setTrustStore("(127.0.0.1)", "(127.0.0.1)((127.0.0.1))");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient29 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters25);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient29.equals(null)", !hThriftClient29.equals(null));
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1458");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) 'a');
        boolean boolean3 = cassandraHost2.getLifo();
        java.lang.String str4 = cassandraHost2.toString();
        cassandraHost2.setUseThriftFramedTransport(true);
        cassandraHost2.setUseThriftFramedTransport(true);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray18, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray18);
        tSSLTransportParameters28.setKeyStore("hi!(hi!):296", "199", "0:-1", "hi!(hi!)(hi!(hi!))");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient34 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters28);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient34.equals(null)", !hThriftClient34.equals(null));
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1459");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("hi!");
        cassandraHost1.setMaxActive((int) (short) 500);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1460");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", 1);
        boolean boolean3 = cassandraHost2.getLifo();
        int int4 = cassandraHost2.getMaxActive();
        int int5 = cassandraHost2.getMaxActive();
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160:9160", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16, true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient30 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters29);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient30.equals(null)", !hThriftClient30.equals(null));
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1461");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("194", 11);
        cassandraHost2.setMaxWaitTimeWhenExhausted(221L);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1462");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97");
        java.lang.String str2 = cassandraHost1.getUrl();
        cassandraHost1.setUseSocketKeepalive(false);
        java.lang.String str5 = cassandraHost1.getUrl();
        cassandraHost1.setCassandraThriftSocketTimeout(5);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient8 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient8.equals(null)", !hThriftClient8.equals(null));
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1463");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 101);
        cassandraHost2.setMaxWaitTimeWhenExhausted((-4L));
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1464");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("126");
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray11);
        tSSLTransportParameters21.setKeyStore("hi!(hi!):296", "199", "0:-1", "hi!(hi!)(hi!(hi!))");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient27 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters21);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient27.equals(null)", !hThriftClient27.equals(null));
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1465");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("10(0.0.0.10)(10(0.0.0.10)):406", (int) (short) 2);
        cassandraHost2.setCassandraThriftSocketTimeout(0);
        int int5 = cassandraHost2.getPort();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1466");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("1", (int) (short) 5);
        java.lang.String str3 = cassandraHost2.getUrl();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray17, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):100", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray17, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!(hi!)(hi!(hi!))", strArray17);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient32 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters31);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient32.equals(null)", !hThriftClient32.equals(null));
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1467");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0:9160", (int) (short) 5);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1468");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("1:52", (int) (short) 48);
        int int3 = cassandraHost2.getPort();
        cassandraHost2.setMaxActive((int) (byte) 48);
        long long6 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient7 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient7.equals(null)", !hThriftClient7.equals(null));
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1469");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 1);
        int int3 = cassandraHost2.getPort();
        java.lang.String str4 = cassandraHost2.getUrl();
        cassandraHost2.setLifo(true);
        cassandraHost2.setUseThriftFramedTransport(false);
        int int9 = cassandraHost2.getCassandraThriftSocketTimeout();
        java.lang.String[] strArray19 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray19, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":10", strArray19, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient30 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters29);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient30.equals(null)", !hThriftClient30.equals(null));
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1470");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        java.util.concurrent.atomic.AtomicLong atomicLong3 = new java.util.concurrent.atomic.AtomicLong();
        long long5 = atomicLong3.addAndGet((long) (byte) -1);
        boolean boolean6 = cassandraHost2.equals((java.lang.Object) (byte) -1);
        boolean boolean7 = cassandraHost2.getUseSocketKeepalive();
        cassandraHost2.setLifo(false);
        long long10 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        long long11 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        java.lang.String[] strArray24 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray24, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray24);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray24, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray24, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray24);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):1", strArray24, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:10", strArray24, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0(0.0.0.0):9160", strArray24);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters38 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("-2", strArray24);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient39 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters38);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient39.equals(null)", !hThriftClient39.equals(null));
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1471");
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
        int int56 = cassandraHost2.getPort();
        java.lang.String[] strArray69 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters71 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray69, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters72 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray69);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters74 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray69, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters76 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray69, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters77 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray69);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters78 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray69);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters80 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray69, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters82 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray69, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters83 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray69);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient84 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters83);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient84.equals(null)", !hThriftClient84.equals(null));
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1472");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0(0.0.0.0):9160", 406);
        int int3 = cassandraHost2.getCassandraThriftSocketTimeout();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1473");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 0);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):100", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!(hi!):35", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1:0", strArray12);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient22 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters21);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient22.equals(null)", !hThriftClient22.equals(null));
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1474");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        cassandraHost2.setUseSocketKeepalive(false);
        java.lang.String str5 = cassandraHost2.toString();
        cassandraHost2.setUseThriftFramedTransport(true);
        java.lang.String str8 = cassandraHost2.toString();
        int int9 = cassandraHost2.getPort();
        cassandraHost2.setMaxWaitTimeWhenExhausted(0L);
        boolean boolean12 = cassandraHost2.isPerformNameResolution();
        java.lang.String str13 = cassandraHost2.toString();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient14 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient14.equals(null)", !hThriftClient14.equals(null));
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1475");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("416", (int) (byte) 35);
        boolean boolean3 = cassandraHost2.getUseThriftFramedTransport();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient4 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient4.equals(null)", !hThriftClient4.equals(null));
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1476");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("hi!:10");
        boolean boolean2 = cassandraHost1.getUseSocketKeepalive();
        java.lang.String str3 = cassandraHost1.getHost();
        java.lang.String str4 = cassandraHost1.toString();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):100", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0.0.0.1", strArray10, false);
        tSSLTransportParameters14.setTrustStore("hi!(hi!)(hi!(hi!)):9160", "(127.0.0.1):97", "hi!:9160", "515");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient20 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters14);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient20.equals(null)", !hThriftClient20.equals(null));
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1477");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", 1);
        cassandraHost2.setCassandraThriftSocketTimeout((int) (byte) 33);
        java.lang.String str5 = cassandraHost2.getHost();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1478");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) 'a');
        boolean boolean3 = cassandraHost2.getLifo();
        int int4 = cassandraHost2.getPort();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1479");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("0");
        java.lang.String str2 = cassandraHost1.getName();
        java.lang.String str3 = cassandraHost1.getName();
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1:0", strArray16, false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient31 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters30);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient31.equals(null)", !hThriftClient31.equals(null));
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1480");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("");
        long long2 = cassandraHost1.getMaxWaitTimeWhenExhausted();
        cassandraHost1.setCassandraThriftSocketTimeout((int) (short) 100);
        boolean boolean5 = cassandraHost1.getUseSocketKeepalive();
        java.lang.String str6 = cassandraHost1.getIp();
        java.lang.String str7 = cassandraHost1.getIp();
        boolean boolean8 = cassandraHost1.getUseSocketKeepalive();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1481");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("0.0.0.194", (int) (byte) 69);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1482");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160", (int) '4');
        int int3 = cassandraHost2.getPort();
        int int4 = cassandraHost2.getMaxActive();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1483");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):0", 101);
        java.lang.String str3 = cassandraHost2.getHost();
        boolean boolean4 = cassandraHost2.isPerformNameResolution();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient5 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient5.equals(null)", !hThriftClient5.equals(null));
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1484");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):9160", 0);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("10(0.0.0.10):-1", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray14);
        tSSLTransportParameters26.requireClientAuth(true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient29 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters26);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient29.equals(null)", !hThriftClient29.equals(null));
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1485");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        cassandraHost2.setUseSocketKeepalive(false);
        boolean boolean5 = cassandraHost2.getLifo();
        int int6 = cassandraHost2.getCassandraThriftSocketTimeout();
        cassandraHost2.setLifo(true);
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray20, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray20, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray20, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("97", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("196", strArray20, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":48", strArray20);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient33 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters32);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient33.equals(null)", !hThriftClient33.equals(null));
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1486");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        cassandraHost2.setUseSocketKeepalive(true);
        int int5 = cassandraHost2.getCassandraThriftSocketTimeout();
        boolean boolean6 = cassandraHost2.getUseSocketKeepalive();
        int int7 = cassandraHost2.getPort();
        int int8 = cassandraHost2.getPort();
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray20, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray20, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray20, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):32", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>:97", strArray20, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("-4", strArray20, true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient34 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters33);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient34.equals(null)", !hThriftClient34.equals(null));
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1487");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost(":9160:9160", 213);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):1", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!(hi!):9160", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":0", strArray12);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient21 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters20);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient21.equals(null)", !hThriftClient21.equals(null));
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1488");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("6(0.0.0.6):9160", (int) (byte) 3);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient3 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient3.equals(null)", !hThriftClient3.equals(null));
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1489");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        cassandraHost2.setUseSocketKeepalive(false);
        java.lang.String str5 = cassandraHost2.toString();
        boolean boolean6 = cassandraHost2.getUseSocketKeepalive();
        cassandraHost2.setMaxActive((int) (byte) -47);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1490");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", 99);
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):10", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):1", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:10", strArray13, true);
        tSSLTransportParameters25.setTrustStore("(127.0.0.1):9160", "hi!:10");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient29 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters25);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient29.equals(null)", !hThriftClient29.equals(null));
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1491");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("");
        int int2 = cassandraHost1.getCassandraThriftSocketTimeout();
        boolean boolean3 = cassandraHost1.getLifo();
        boolean boolean4 = cassandraHost1.isPerformNameResolution();
        java.lang.String[] strArray13 = new java.lang.String[] { "(127.0.0.1):1", "(127.0.0.1):10", "(127.0.0.1)((127.0.0.1)):32", "1:52", "10" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):32", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("6:10", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("196", strArray13);
        tSSLTransportParameters18.requireClientAuth(true);
        tSSLTransportParameters18.setKeyStore("12", "8");
        tSSLTransportParameters18.requireClientAuth(false);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient26 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1, tSSLTransportParameters18);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient26.equals(null)", !hThriftClient26.equals(null));
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1492");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost1 = new me.prettyprint.cassandra.service.CassandraHost("");
        java.lang.String str2 = cassandraHost1.getHost();
        java.lang.String str3 = cassandraHost1.getHost();
        boolean boolean4 = cassandraHost1.getLifo();
        java.lang.String str5 = cassandraHost1.getUrl();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient6 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost1);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient6.equals(null)", !hThriftClient6.equals(null));
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1493");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):194", (int) 'a');
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):97", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):9160", strArray14, true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient27 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters26);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient27.equals(null)", !hThriftClient27.equals(null));
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1494");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        int int3 = cassandraHost2.getPort();
        long long4 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        int int5 = cassandraHost2.getPort();
        java.lang.String str6 = cassandraHost2.getUrl();
        java.lang.String str7 = cassandraHost2.getName();
        java.lang.String str8 = cassandraHost2.toString();
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) (short) 35);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient11 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient11.equals(null)", !hThriftClient11.equals(null));
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1495");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 1);
        cassandraHost2.setMaxWaitTimeWhenExhausted((long) (short) 100);
        cassandraHost2.setUseThriftFramedTransport(true);
        cassandraHost2.setUseThriftFramedTransport(false);
        java.lang.String str9 = cassandraHost2.getUrl();
        cassandraHost2.setLifo(false);
        cassandraHost2.setCassandraThriftSocketTimeout((int) (short) 96);
        cassandraHost2.setUseSocketKeepalive(true);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray25, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray25, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray25);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("9160", strArray25, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("3", strArray25);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":1(:1):85", strArray25);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient35 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters34);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient35.equals(null)", !hThriftClient35.equals(null));
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1496");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        boolean boolean3 = cassandraHost2.getUseThriftFramedTransport();
        boolean boolean4 = cassandraHost2.isPerformNameResolution();
        boolean boolean5 = cassandraHost2.getUseSocketKeepalive();
        cassandraHost2.setMaxActive((int) (byte) 11);
        boolean boolean8 = cassandraHost2.getUseThriftFramedTransport();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient9 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient9.equals(null)", !hThriftClient9.equals(null));
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1497");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("416", 0);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):9160", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):9160", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0.0.0.0", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":0", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:9160", strArray15, true);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient31 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters30);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient31.equals(null)", !hThriftClient31.equals(null));
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1498");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):9160", (int) (short) 1);
        long long3 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        cassandraHost2.setLifo(false);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):32", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":10", strArray15);
        tSSLTransportParameters24.setTrustStore("126", "CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):97", "199", "CassandraClient<%s-%d>(CassandraClient<%s-%d>):100");
        tSSLTransportParameters24.setKeyStore(":10(:10):9160", "9160");
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient33 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters24);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient33.equals(null)", !hThriftClient33.equals(null));
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1499");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("", 10);
        java.util.concurrent.atomic.AtomicLong atomicLong3 = new java.util.concurrent.atomic.AtomicLong();
        long long5 = atomicLong3.addAndGet((long) (byte) -1);
        boolean boolean6 = cassandraHost2.equals((java.lang.Object) (byte) -1);
        boolean boolean7 = cassandraHost2.getUseSocketKeepalive();
        cassandraHost2.setLifo(false);
        java.lang.String str10 = cassandraHost2.getIp();
        long long11 = cassandraHost2.getMaxWaitTimeWhenExhausted();
        java.lang.String str12 = cassandraHost2.toString();
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient13 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient13.equals(null)", !hThriftClient13.equals(null));
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1500");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1", (int) '4');
        java.lang.String str3 = cassandraHost2.getIp();
        cassandraHost2.setLifo(true);
        java.lang.String[] strArray13 = new java.lang.String[] { "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:10", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>:1", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray13);
        me.prettyprint.cassandra.connection.client.HThriftClient hThriftClient21 = new me.prettyprint.cassandra.connection.client.HThriftClient(cassandraHost2, tSSLTransportParameters20);
        org.junit.Assert.assertTrue("Contract failed: !hThriftClient21.equals(null)", !hThriftClient21.equals(null));
    }
}

