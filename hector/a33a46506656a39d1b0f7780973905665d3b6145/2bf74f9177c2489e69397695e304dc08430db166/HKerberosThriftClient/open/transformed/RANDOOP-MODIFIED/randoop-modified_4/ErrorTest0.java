import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0001");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost2 = new me.prettyprint.cassandra.service.CassandraHost("");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient4 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost2, "");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient4.equals(null)", !hKerberosThriftClient4.equals(null));
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0002");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 100);
        boolean boolean4 = cassandraHost3.getUseThriftFramedTransport();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient6 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost3, "");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient6.equals(null)", !hKerberosThriftClient6.equals(null));
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0003");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 100);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient5 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost3, "hi!");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient5.equals(null)", !hKerberosThriftClient5.equals(null));
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0004");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        subject0.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):9160", 1);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters6 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters();
        tSSLTransportParameters6.setKeyStore("hi!", "");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient10 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost4, "CassandraClient<%s-%d>", tSSLTransportParameters6);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient10.equals(null)", !hKerberosThriftClient10.equals(null));
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0005");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) (short) -1);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters5 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters();
        tSSLTransportParameters5.setKeyStore("hi!", "");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient9 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost3, "", tSSLTransportParameters5);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient9.equals(null)", !hKerberosThriftClient9.equals(null));
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0006");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):9160", 1);
        boolean boolean4 = cassandraHost3.getUseThriftFramedTransport();
        cassandraHost3.setMaxWaitTimeWhenExhausted(10L);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient8 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost3, "(127.0.0.1):9160");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient8.equals(null)", !hKerberosThriftClient8.equals(null));
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0007");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = new me.prettyprint.cassandra.service.CassandraHost("");
        cassandraHost4.setMaxWaitTimeWhenExhausted((long) (short) 10);
        java.lang.String str7 = cassandraHost4.toString();
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters();
        tSSLTransportParameters9.setKeyStore("hi!", "");
        tSSLTransportParameters9.setKeyStore("hi!", "");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient16 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost4, "(127.0.0.1):9160", tSSLTransportParameters9);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient16.equals(null)", !hKerberosThriftClient16.equals(null));
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0008");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):9160", 1);
        boolean boolean6 = cassandraHost5.getUseThriftFramedTransport();
        cassandraHost5.setMaxWaitTimeWhenExhausted(10L);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray17, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient21 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost5, "CassandraClient<%s-%d>", tSSLTransportParameters20);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient21.equals(null)", !hKerberosThriftClient21.equals(null));
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0009");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = new me.prettyprint.cassandra.service.CassandraHost("");
        cassandraHost4.setMaxWaitTimeWhenExhausted((long) (short) 10);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient8 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost4, "");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient8.equals(null)", !hKerberosThriftClient8.equals(null));
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0010");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):9160", 1);
        cassandraHost5.setMaxWaitTimeWhenExhausted(0L);
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient20 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost5, "CassandraClient<%s-%d>", tSSLTransportParameters19);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient20.equals(null)", !hKerberosThriftClient20.equals(null));
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0011");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 100);
        cassandraHost5.setMaxWaitTimeWhenExhausted(0L);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray17, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray17);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient22 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost5, "(127.0.0.1):9160", tSSLTransportParameters21);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient22.equals(null)", !hKerberosThriftClient22.equals(null));
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0012");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = new me.prettyprint.cassandra.service.CassandraHost("");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient6 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost4, "127.0.0.1");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient6.equals(null)", !hKerberosThriftClient6.equals(null));
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0013");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (byte) 100);
        java.lang.String[] strArray14 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray14);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient17 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost4, "127.0.0.1", tSSLTransportParameters16);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient17.equals(null)", !hKerberosThriftClient17.equals(null));
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0014");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = new me.prettyprint.cassandra.service.CassandraHost("", 0);
        cassandraHost5.setMaxWaitTimeWhenExhausted((long) '4');
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient9 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost5, "(127.0.0.1):9160");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient9.equals(null)", !hKerberosThriftClient9.equals(null));
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0015");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        java.lang.String str4 = subject0.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("", 0);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient9 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost7, "CassandraClient<%s-%d>");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient9.equals(null)", !hKerberosThriftClient9.equals(null));
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0016");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):9160", 1);
        boolean boolean5 = cassandraHost4.isPerformNameResolution();
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters7 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters();
        tSSLTransportParameters7.setKeyStore("hi!", "");
        tSSLTransportParameters7.setTrustStore("", "hi!");
        tSSLTransportParameters7.setTrustStore("", "CassandraClient<%s-%d>", "", "");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient19 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost4, "CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1", tSSLTransportParameters7);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient19.equals(null)", !hKerberosThriftClient19.equals(null));
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0017");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        java.lang.String str4 = subject0.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("hi!");
        int int7 = cassandraHost6.getMaxActive();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient9 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost6, "hi!:9160");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient9.equals(null)", !hKerberosThriftClient9.equals(null));
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0018");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):9160", 1);
        boolean boolean5 = cassandraHost4.getUseThriftFramedTransport();
        cassandraHost4.setMaxWaitTimeWhenExhausted(10L);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient9 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost4, "127.0.0.1");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient9.equals(null)", !hKerberosThriftClient9.equals(null));
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0019");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 100);
        cassandraHost4.setMaxWaitTimeWhenExhausted((long) 10);
        cassandraHost4.setCassandraThriftSocketTimeout((int) (short) 0);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters();
        tSSLTransportParameters10.setKeyStore("hi!", "");
        tSSLTransportParameters10.setKeyStore("CassandraClient<%s-%d>", "CassandraClient<%s-%d>");
        tSSLTransportParameters10.requireClientAuth(true);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient19 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost4, "(127.0.0.1):9160", tSSLTransportParameters10);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient19.equals(null)", !hKerberosThriftClient19.equals(null));
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0020");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        java.lang.String str4 = subject0.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("");
        boolean boolean8 = cassandraHost6.equals((java.lang.Object) 0.0f);
        int int9 = cassandraHost6.getCassandraThriftSocketTimeout();
        java.lang.String[] strArray14 = new java.lang.String[] { "-1", "CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:9160", strArray14);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient16 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost6, "CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1", tSSLTransportParameters15);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient16.equals(null)", !hKerberosThriftClient16.equals(null));
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0021");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = new me.prettyprint.cassandra.service.CassandraHost("");
        cassandraHost4.setMaxWaitTimeWhenExhausted((long) (short) 10);
        boolean boolean7 = cassandraHost4.isPerformNameResolution();
        java.lang.String[] strArray16 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16);
        tSSLTransportParameters17.setKeyStore("CassandraClient<%s-%d>", "Subject:\n", "CassandraClient<%s-%d>", "Subject:\n");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient23 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost4, "(127.0.0.1):9160", tSSLTransportParameters17);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient23.equals(null)", !hKerberosThriftClient23.equals(null));
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0022");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        java.lang.String str4 = subject0.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (byte) 100);
        java.lang.String str8 = cassandraHost7.getUrl();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient10 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost7, "(127.0.0.1):9160");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient10.equals(null)", !hKerberosThriftClient10.equals(null));
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0023");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = new me.prettyprint.cassandra.service.CassandraHost("", 0);
        java.lang.String str6 = cassandraHost5.getHost();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient8 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost5, "");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient8.equals(null)", !hKerberosThriftClient8.equals(null));
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0024");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = new me.prettyprint.cassandra.service.CassandraHost("hi!");
        cassandraHost4.setMaxActive((int) (short) 0);
        int int7 = cassandraHost4.getPort();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient9 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost4, "");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient9.equals(null)", !hKerberosThriftClient9.equals(null));
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0025");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = new me.prettyprint.cassandra.service.CassandraHost("", 0);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters7 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters();
        tSSLTransportParameters7.setKeyStore("hi!", "");
        tSSLTransportParameters7.setKeyStore("hi!", "");
        tSSLTransportParameters7.requireClientAuth(false);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient16 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost5, "hi!:9160", tSSLTransportParameters7);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient16.equals(null)", !hKerberosThriftClient16.equals(null));
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0026");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1", (-1));
        boolean boolean5 = cassandraHost4.getUseThriftFramedTransport();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient7 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost4, "hi!");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient7.equals(null)", !hKerberosThriftClient7.equals(null));
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0027");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = new me.prettyprint.cassandra.service.CassandraHost("");
        boolean boolean6 = cassandraHost4.equals((java.lang.Object) 0.0f);
        int int7 = cassandraHost4.getCassandraThriftSocketTimeout();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient9 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost4, "-1");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient9.equals(null)", !hKerberosThriftClient9.equals(null));
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0028");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        java.lang.String str4 = subject0.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 100);
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray18, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray18, true);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient25 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost7, "hi!", tSSLTransportParameters24);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient25.equals(null)", !hKerberosThriftClient25.equals(null));
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0029");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1", (-1));
        java.lang.String[] strArray14 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient16 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost5, "CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1", tSSLTransportParameters15);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient16.equals(null)", !hKerberosThriftClient16.equals(null));
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0030");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = new me.prettyprint.cassandra.service.CassandraHost("");
        cassandraHost3.setMaxWaitTimeWhenExhausted((long) (short) 10);
        java.lang.String str6 = cassandraHost3.toString();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient8 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost3, "");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient8.equals(null)", !hKerberosThriftClient8.equals(null));
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0031");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        boolean boolean3 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("");
        cassandraHost6.setMaxWaitTimeWhenExhausted((long) (short) 10);
        java.lang.String str9 = cassandraHost6.toString();
        int int10 = cassandraHost6.getMaxActive();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient12 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost6, "");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient12.equals(null)", !hKerberosThriftClient12.equals(null));
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0032");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):9160", 1);
        boolean boolean6 = cassandraHost5.getUseThriftFramedTransport();
        cassandraHost5.setMaxWaitTimeWhenExhausted(10L);
        cassandraHost5.setLifo(false);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray21, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray21);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray21);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray21, true);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient28 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost5, "", tSSLTransportParameters27);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient28.equals(null)", !hKerberosThriftClient28.equals(null));
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0033");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = new me.prettyprint.cassandra.service.CassandraHost("");
        boolean boolean6 = cassandraHost4.equals((java.lang.Object) 0.0f);
        int int7 = cassandraHost4.getPort();
        java.lang.String str8 = cassandraHost4.getName();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient10 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient10.equals(null)", !hKerberosThriftClient10.equals(null));
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0034");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        subject0.setReadOnly();
        subject0.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):9160", 1);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient7 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost5, "0");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient7.equals(null)", !hKerberosThriftClient7.equals(null));
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0035");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient6 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost4, "0");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient6.equals(null)", !hKerberosThriftClient6.equals(null));
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0036");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1", (-1));
        boolean boolean5 = cassandraHost4.getUseThriftFramedTransport();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient7 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost4, "hi!:100");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient7.equals(null)", !hKerberosThriftClient7.equals(null));
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0037");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        boolean boolean4 = subject0.isReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1", (-1));
        boolean boolean8 = cassandraHost7.getUseThriftFramedTransport();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient10 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost7, "0");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient10.equals(null)", !hKerberosThriftClient10.equals(null));
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0038");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 100);
        cassandraHost6.setMaxWaitTimeWhenExhausted((long) 10);
        cassandraHost6.setCassandraThriftSocketTimeout((int) (short) 0);
        java.lang.String str11 = cassandraHost6.toString();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient13 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost6, "");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient13.equals(null)", !hKerberosThriftClient13.equals(null));
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0039");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        subject0.setReadOnly();
        javax.security.auth.Subject subject2 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet3 = subject2.getPublicCredentials();
        subject2.setReadOnly();
        java.lang.String str5 = subject2.toString();
        java.lang.String str6 = subject2.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = new me.prettyprint.cassandra.service.CassandraHost("");
        boolean boolean10 = cassandraHost8.equals((java.lang.Object) 0.0f);
        java.lang.String str11 = cassandraHost8.getName();
        boolean boolean12 = subject2.equals((java.lang.Object) cassandraHost8);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient14 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost8, "-1");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient14.equals(null)", !hKerberosThriftClient14.equals(null));
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0040");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        subject0.setReadOnly();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = new me.prettyprint.cassandra.service.CassandraHost("hi!");
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray12, true);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient15 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost4, "CassandraClient<%s-%d>", tSSLTransportParameters14);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient15.equals(null)", !hKerberosThriftClient15.equals(null));
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0041");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1", (-1));
        cassandraHost5.setUseThriftFramedTransport(true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters();
        tSSLTransportParameters9.setKeyStore("hi!", "");
        tSSLTransportParameters9.setTrustStore("CassandraClient<%s-%d>", "hi!");
        tSSLTransportParameters9.requireClientAuth(false);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient18 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost5, "CassandraClient<%s-%d>", tSSLTransportParameters9);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient18.equals(null)", !hKerberosThriftClient18.equals(null));
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0042");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.lang.String str2 = subject0.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = new me.prettyprint.cassandra.service.CassandraHost("");
        cassandraHost4.setMaxWaitTimeWhenExhausted((long) (short) 10);
        java.lang.String str7 = cassandraHost4.toString();
        int int8 = cassandraHost4.getCassandraThriftSocketTimeout();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient10 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost4, "0");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient10.equals(null)", !hKerberosThriftClient10.equals(null));
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0043");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        boolean boolean3 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient8 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost6, "100");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient8.equals(null)", !hKerberosThriftClient8.equals(null));
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0044");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1");
        boolean boolean6 = cassandraHost5.getLifo();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient8 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost5, "(127.0.0.1):100");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient8.equals(null)", !hKerberosThriftClient8.equals(null));
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0045");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = new me.prettyprint.cassandra.service.CassandraHost("");
        java.lang.String[] strArray15 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray15);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient18 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost5, "-1", tSSLTransportParameters17);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient18.equals(null)", !hKerberosThriftClient18.equals(null));
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0046");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.lang.String str2 = subject0.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = new me.prettyprint.cassandra.service.CassandraHost("");
        cassandraHost4.setMaxWaitTimeWhenExhausted((long) (short) 10);
        java.lang.String str7 = cassandraHost4.toString();
        int int8 = cassandraHost4.getMaxActive();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient10 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost4, "CassandraClient<%s-%d>");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient10.equals(null)", !hKerberosThriftClient10.equals(null));
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0047");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) '4');
        long long5 = cassandraHost4.getMaxWaitTimeWhenExhausted();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = new java.util.concurrent.atomic.AtomicLong();
        long long7 = atomicLong6.get();
        int int8 = atomicLong6.intValue();
        boolean boolean11 = atomicLong6.compareAndSet((-1L), (long) (byte) -1);
        boolean boolean12 = cassandraHost4.equals((java.lang.Object) (-1L));
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient14 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost4, "hi!:100");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient14.equals(null)", !hKerberosThriftClient14.equals(null));
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0048");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.lang.String str2 = subject0.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 100);
        cassandraHost5.setMaxWaitTimeWhenExhausted(0L);
        java.lang.String str8 = cassandraHost5.getHost();
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters();
        tSSLTransportParameters10.setKeyStore("hi!", "");
        tSSLTransportParameters10.setKeyStore("hi!", "");
        tSSLTransportParameters10.requireClientAuth(false);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient19 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost5, "CassandraClient<%s-%d>", tSSLTransportParameters10);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient19.equals(null)", !hKerberosThriftClient19.equals(null));
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0049");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet4 = subject0.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (byte) 100);
        cassandraHost7.setMaxActive((int) (byte) 10);
        cassandraHost7.setMaxWaitTimeWhenExhausted(103L);
        java.lang.String[] strArray20 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray20);
        tSSLTransportParameters21.setTrustStore("hi!:9160", "CassandraClient<%s-%d>");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient25 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost7, "32", tSSLTransportParameters21);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient25.equals(null)", !hKerberosThriftClient25.equals(null));
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0050");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet4 = subject0.getPrincipals();
        boolean boolean5 = subject0.isReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("");
        boolean boolean9 = cassandraHost7.equals((java.lang.Object) 0.0f);
        int int10 = cassandraHost7.getCassandraThriftSocketTimeout();
        java.lang.String str11 = cassandraHost7.getName();
        boolean boolean12 = cassandraHost7.getUseThriftFramedTransport();
        cassandraHost7.setMaxActive(100);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient16 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost7, "hi!");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient16.equals(null)", !hKerberosThriftClient16.equals(null));
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0051");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        subject0.setReadOnly();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        boolean boolean3 = subject0.isReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>");
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "127.0.0.1", "-1", "Subject:\n" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray13, false);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient16 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost5, "127.0.0.1", tSSLTransportParameters15);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient16.equals(null)", !hKerberosThriftClient16.equals(null));
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0052");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 100);
        cassandraHost5.setMaxWaitTimeWhenExhausted((long) 10);
        cassandraHost5.setCassandraThriftSocketTimeout((int) (short) 0);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient11 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost5, "CassandraClient<%s-%d>");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient11.equals(null)", !hKerberosThriftClient11.equals(null));
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0053");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        subject0.setReadOnly();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = new me.prettyprint.cassandra.service.CassandraHost("", 0);
        java.lang.String str6 = cassandraHost5.getHost();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient8 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost5, "(127.0.0.1):9160");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient8.equals(null)", !hKerberosThriftClient8.equals(null));
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0054");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.lang.String str2 = subject0.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 100);
        cassandraHost5.setMaxWaitTimeWhenExhausted((long) 10);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray17, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient22 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost5, "CassandraClient<%s-%d>", tSSLTransportParameters21);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient22.equals(null)", !hKerberosThriftClient22.equals(null));
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0055");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = new me.prettyprint.cassandra.service.CassandraHost("");
        boolean boolean6 = cassandraHost4.equals((java.lang.Object) 0.0f);
        int int7 = cassandraHost4.getCassandraThriftSocketTimeout();
        java.lang.String str8 = cassandraHost4.getName();
        int int9 = cassandraHost4.getCassandraThriftSocketTimeout();
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray18, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient22 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost4, "Subject", tSSLTransportParameters21);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient22.equals(null)", !hKerberosThriftClient22.equals(null));
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0056");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        subject0.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = new me.prettyprint.cassandra.service.CassandraHost("");
        boolean boolean6 = cassandraHost4.equals((java.lang.Object) 0.0f);
        cassandraHost4.setUseSocketKeepalive(false);
        int int9 = cassandraHost4.getCassandraThriftSocketTimeout();
        boolean boolean10 = cassandraHost4.isPerformNameResolution();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient12 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost4, "hi!:9160");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient12.equals(null)", !hKerberosThriftClient12.equals(null));
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0057");
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
        me.prettyprint.cassandra.service.CassandraHost cassandraHost18 = new me.prettyprint.cassandra.service.CassandraHost("hi!");
        cassandraHost18.setMaxActive((int) (short) 0);
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray32, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray32);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray32);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters38 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:100", strArray32, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters40 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray32, false);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient41 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost18, "(127.0.0.1)", tSSLTransportParameters40);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient41.equals(null)", !hKerberosThriftClient41.equals(null));
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0058");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = new me.prettyprint.cassandra.service.CassandraHost("");
        cassandraHost4.setMaxWaitTimeWhenExhausted((long) (short) 10);
        java.lang.String str7 = cassandraHost4.toString();
        cassandraHost4.setMaxWaitTimeWhenExhausted((long) (short) 1);
        boolean boolean10 = cassandraHost4.getLifo();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient12 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost4, "-1");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient12.equals(null)", !hKerberosThriftClient12.equals(null));
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0059");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        boolean boolean3 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient8 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost6, "0");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient8.equals(null)", !hKerberosThriftClient8.equals(null));
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0060");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        boolean boolean4 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet5 = subject0.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):9160", 1);
        boolean boolean9 = cassandraHost8.getUseSocketKeepalive();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient11 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost8, "CassandraClient<%s-%d>");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient11.equals(null)", !hKerberosThriftClient11.equals(null));
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0061");
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
        me.prettyprint.cassandra.service.CassandraHost cassandraHost18 = new me.prettyprint.cassandra.service.CassandraHost("");
        long long19 = cassandraHost18.getMaxWaitTimeWhenExhausted();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient21 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost18, "100");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient21.equals(null)", !hKerberosThriftClient21.equals(null));
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0062");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>");
        java.lang.String str6 = cassandraHost5.getIp();
        int int7 = cassandraHost5.getMaxActive();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient9 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost5, "100");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient9.equals(null)", !hKerberosThriftClient9.equals(null));
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0063");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.lang.String str2 = subject0.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = new me.prettyprint.cassandra.service.CassandraHost("");
        cassandraHost4.setMaxWaitTimeWhenExhausted((long) (short) 10);
        java.lang.String str7 = cassandraHost4.toString();
        cassandraHost4.setMaxWaitTimeWhenExhausted((long) (short) 1);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient11 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost4, "");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient11.equals(null)", !hKerberosThriftClient11.equals(null));
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0064");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        subject0.setReadOnly();
        subject0.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = new me.prettyprint.cassandra.service.CassandraHost("");
        cassandraHost4.setMaxWaitTimeWhenExhausted((long) (short) 10);
        java.lang.String str7 = cassandraHost4.toString();
        cassandraHost4.setMaxWaitTimeWhenExhausted((long) (short) 1);
        cassandraHost4.setMaxWaitTimeWhenExhausted((long) (byte) 1);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray21, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray21);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1", strArray21);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient26 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost4, "CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1", tSSLTransportParameters25);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient26.equals(null)", !hKerberosThriftClient26.equals(null));
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0065");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (byte) 100);
        cassandraHost6.setMaxActive((int) (byte) 10);
        cassandraHost6.setMaxWaitTimeWhenExhausted(103L);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters();
        tSSLTransportParameters12.setKeyStore("hi!", "");
        tSSLTransportParameters12.setTrustStore("", "hi!");
        tSSLTransportParameters12.setKeyStore("hi!", "hi!", "hi!", "hi!");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient24 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost6, "CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1", tSSLTransportParameters12);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient24.equals(null)", !hKerberosThriftClient24.equals(null));
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0066");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) '4');
        long long7 = cassandraHost6.getMaxWaitTimeWhenExhausted();
        cassandraHost6.setCassandraThriftSocketTimeout((-1));
        java.lang.String[] strArray22 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray22);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray22);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray22, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray22, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray22, true);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient31 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost6, "(127.0.0.1)((127.0.0.1)):9260", tSSLTransportParameters30);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient31.equals(null)", !hKerberosThriftClient31.equals(null));
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0067");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        subject0.setReadOnly();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        boolean boolean3 = subject0.isReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 100);
        cassandraHost6.setMaxWaitTimeWhenExhausted((long) 10);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost10 = new me.prettyprint.cassandra.service.CassandraHost("");
        boolean boolean11 = cassandraHost6.equals((java.lang.Object) cassandraHost10);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient13 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost10, "100");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient13.equals(null)", !hKerberosThriftClient13.equals(null));
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0068");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        subject0.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = new me.prettyprint.cassandra.service.CassandraHost("");
        cassandraHost3.setMaxWaitTimeWhenExhausted((long) (short) 10);
        java.lang.String str6 = cassandraHost3.toString();
        cassandraHost3.setMaxActive(9160);
        cassandraHost3.setCassandraThriftSocketTimeout((int) (short) 100);
        java.lang.String[] strArray19 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray19);
        tSSLTransportParameters20.setTrustStore("hi!:9160", "CassandraClient<%s-%d>");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient24 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost3, "(127.0.0.1):9160", tSSLTransportParameters20);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient24.equals(null)", !hKerberosThriftClient24.equals(null));
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0069");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        subject0.setReadOnly();
        subject0.setReadOnly();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 100);
        cassandraHost6.setMaxWaitTimeWhenExhausted(0L);
        cassandraHost6.setMaxWaitTimeWhenExhausted(1L);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient12 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost6, "0");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient12.equals(null)", !hKerberosThriftClient12.equals(null));
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0070");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        boolean boolean3 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet5 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = new me.prettyprint.cassandra.service.CassandraHost("", 0);
        cassandraHost8.setMaxWaitTimeWhenExhausted((long) '4');
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray21, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray21);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray21);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:100", strArray21, false);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient28 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost8, "32", tSSLTransportParameters27);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient28.equals(null)", !hKerberosThriftClient28.equals(null));
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0071");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = new me.prettyprint.cassandra.service.CassandraHost("", 0);
        boolean boolean6 = cassandraHost5.getLifo();
        cassandraHost5.setCassandraThriftSocketTimeout(100);
        cassandraHost5.setMaxActive(0);
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray22, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray22);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray22);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:9160", strArray22);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("100", strArray22, true);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient30 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost5, "(127.0.0.1)", tSSLTransportParameters29);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient30.equals(null)", !hKerberosThriftClient30.equals(null));
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0072");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = new me.prettyprint.cassandra.service.CassandraHost("");
        boolean boolean7 = cassandraHost5.equals((java.lang.Object) 0.0f);
        int int8 = cassandraHost5.getCassandraThriftSocketTimeout();
        cassandraHost5.setMaxActive((int) '4');
        java.lang.String str11 = cassandraHost5.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost14 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):9160", 1);
        cassandraHost14.setMaxWaitTimeWhenExhausted(0L);
        boolean boolean17 = cassandraHost5.equals((java.lang.Object) 0L);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient19 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost5, "");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient19.equals(null)", !hKerberosThriftClient19.equals(null));
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0073");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = new me.prettyprint.cassandra.service.CassandraHost("");
        boolean boolean6 = cassandraHost4.equals((java.lang.Object) 0.0f);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters8 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters();
        tSSLTransportParameters8.setKeyStore("hi!", "");
        tSSLTransportParameters8.setTrustStore("CassandraClient<%s-%d>", "hi!");
        tSSLTransportParameters8.requireClientAuth(false);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient17 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost4, "hi!:100", tSSLTransportParameters8);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient17.equals(null)", !hKerberosThriftClient17.equals(null));
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0074");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPublicCredentials();
        java.lang.String str3 = subject0.toString();
        boolean boolean4 = subject0.isReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("");
        boolean boolean8 = cassandraHost6.equals((java.lang.Object) 0.0f);
        int int9 = cassandraHost6.getCassandraThriftSocketTimeout();
        cassandraHost6.setUseSocketKeepalive(false);
        cassandraHost6.setLifo(false);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost16 = new me.prettyprint.cassandra.service.CassandraHost("", 0);
        java.lang.String str17 = cassandraHost16.getHost();
        boolean boolean18 = cassandraHost16.getUseSocketKeepalive();
        java.lang.String str19 = cassandraHost16.getName();
        boolean boolean20 = cassandraHost6.equals((java.lang.Object) cassandraHost16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters();
        tSSLTransportParameters22.setKeyStore("hi!", "");
        tSSLTransportParameters22.setKeyStore("hi!", "");
        tSSLTransportParameters22.setTrustStore("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1", "CassandraClient<%s-%d>", "", "");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient34 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost6, "", tSSLTransportParameters22);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient34.equals(null)", !hKerberosThriftClient34.equals(null));
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0075");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("", 0);
        boolean boolean7 = cassandraHost6.getUseSocketKeepalive();
        boolean boolean8 = cassandraHost6.getLifo();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient10 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost6, "(127.0.0.1):0");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient10.equals(null)", !hKerberosThriftClient10.equals(null));
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0076");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        subject0.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = new me.prettyprint.cassandra.service.CassandraHost("-1");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:9160", strArray16);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient23 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost4, "127.0.0.1(127.0.0.1):10", tSSLTransportParameters22);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient23.equals(null)", !hKerberosThriftClient23.equals(null));
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0077");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        subject0.setReadOnly();
        subject0.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = new me.prettyprint.cassandra.service.CassandraHost("hi!");
        cassandraHost4.setMaxActive((int) (short) 0);
        int int7 = cassandraHost4.getPort();
        cassandraHost4.setUseThriftFramedTransport(false);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient11 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost4, "(127.0.0.1):0");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient11.equals(null)", !hKerberosThriftClient11.equals(null));
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0078");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        subject0.setReadOnly();
        subject0.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) (short) 1);
        cassandraHost5.setCassandraThriftSocketTimeout((int) (short) 1);
        int int8 = cassandraHost5.getPort();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient10 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost5, "100");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient10.equals(null)", !hKerberosThriftClient10.equals(null));
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0079");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        subject0.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = new me.prettyprint.cassandra.service.CassandraHost("");
        boolean boolean5 = cassandraHost3.equals((java.lang.Object) 0.0f);
        int int6 = cassandraHost3.getCassandraThriftSocketTimeout();
        cassandraHost3.setMaxActive((int) '4');
        java.lang.String str9 = cassandraHost3.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost12 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):9160", 1);
        cassandraHost12.setMaxWaitTimeWhenExhausted(0L);
        boolean boolean15 = cassandraHost3.equals((java.lang.Object) 0L);
        java.lang.String[] strArray30 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray30);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray30);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray30, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray30, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters38 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray30, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters39 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray30);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters41 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):0", strArray30, false);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient42 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost3, "-1", tSSLTransportParameters41);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient42.equals(null)", !hKerberosThriftClient42.equals(null));
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0080");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        subject0.setReadOnly();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        boolean boolean3 = subject0.isReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (byte) 100);
        cassandraHost6.setMaxActive((int) (byte) 10);
        cassandraHost6.setMaxWaitTimeWhenExhausted(103L);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters();
        tSSLTransportParameters12.setKeyStore("hi!", "");
        tSSLTransportParameters12.setTrustStore("", "hi!");
        tSSLTransportParameters12.setTrustStore("", "CassandraClient<%s-%d>", "", "");
        tSSLTransportParameters12.setTrustStore("hi!:9160", "", "0", "CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient29 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost6, "Subject:\n", tSSLTransportParameters12);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient29.equals(null)", !hKerberosThriftClient29.equals(null));
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0081");
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
        me.prettyprint.cassandra.service.CassandraHost cassandraHost18 = new me.prettyprint.cassandra.service.CassandraHost("");
        boolean boolean20 = cassandraHost18.equals((java.lang.Object) 0.0f);
        int int21 = cassandraHost18.getPort();
        java.lang.String str22 = cassandraHost18.getName();
        java.lang.String str23 = cassandraHost18.getHost();
        int int24 = cassandraHost18.getCassandraThriftSocketTimeout();
        boolean boolean25 = cassandraHost18.isPerformNameResolution();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient27 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost18, "CassandraClient<%s-%d>(CassandraClient<%s-%d>)");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient27.equals(null)", !hKerberosThriftClient27.equals(null));
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0082");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        subject0.setReadOnly();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>");
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray20, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:9160", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray20, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:100", strArray20, false);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient33 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost4, "CassandraClient<%s-%d>", tSSLTransportParameters32);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient33.equals(null)", !hKerberosThriftClient33.equals(null));
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0083");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        java.lang.String str4 = subject0.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("");
        int int7 = cassandraHost6.getMaxActive();
        cassandraHost6.setUseThriftFramedTransport(true);
        cassandraHost6.setMaxWaitTimeWhenExhausted(101L);
        cassandraHost6.setUseSocketKeepalive(false);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient15 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost6, "");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient15.equals(null)", !hKerberosThriftClient15.equals(null));
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0084");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        boolean boolean3 = subject0.isReadOnly();
        java.lang.String[] strArray12 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray12);
        boolean boolean15 = subject0.equals((java.lang.Object) tSSLTransportParameters14);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost17 = new me.prettyprint.cassandra.service.CassandraHost("hi!");
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray27, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray27, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:100", strArray27, true);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient34 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost17, "Subject:35", tSSLTransportParameters33);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient34.equals(null)", !hKerberosThriftClient34.equals(null));
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0085");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet4 = subject0.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("");
        boolean boolean8 = cassandraHost6.equals((java.lang.Object) 0.0f);
        int int9 = cassandraHost6.getPort();
        java.lang.String str10 = cassandraHost6.getName();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient12 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost6, "32");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient12.equals(null)", !hKerberosThriftClient12.equals(null));
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0086");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        java.lang.String str4 = subject0.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("");
        boolean boolean8 = cassandraHost6.equals((java.lang.Object) 0.0f);
        java.lang.String str9 = cassandraHost6.getName();
        boolean boolean10 = subject0.equals((java.lang.Object) cassandraHost6);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost13 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):9160", 1);
        boolean boolean14 = cassandraHost13.getUseThriftFramedTransport();
        cassandraHost13.setMaxActive((int) (byte) -1);
        cassandraHost13.setCassandraThriftSocketTimeout((int) (short) 102);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient20 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost13, "(127.0.0.1)((127.0.0.1)):35");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient20.equals(null)", !hKerberosThriftClient20.equals(null));
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0087");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)", (int) (short) 100);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient5 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost3, "(127.0.0.1)((127.0.0.1)):35");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient5.equals(null)", !hKerberosThriftClient5.equals(null));
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0088");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPublicCredentials();
        java.lang.String str3 = subject0.toString();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("");
        cassandraHost6.setMaxWaitTimeWhenExhausted((long) (short) 10);
        java.lang.String str9 = cassandraHost6.toString();
        cassandraHost6.setMaxWaitTimeWhenExhausted((long) (short) 1);
        cassandraHost6.setLifo(false);
        boolean boolean14 = cassandraHost6.getUseSocketKeepalive();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient16 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost6, "10");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient16.equals(null)", !hKerberosThriftClient16.equals(null));
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0089");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        boolean boolean3 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):100");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray16);
        tSSLTransportParameters20.setTrustStore("CassandraClient<%s-%d>(CassandraClient<%s-%d>)", "127.0.0.1(127.0.0.1):10", "CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1", "CassandraClient<%s-%d>");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient26 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost6, "Subject:35", tSSLTransportParameters20);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient26.equals(null)", !hKerberosThriftClient26.equals(null));
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0090");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        boolean boolean3 = subject0.isReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 100);
        boolean boolean7 = cassandraHost6.getUseThriftFramedTransport();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray23, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray23);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray23);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray23);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:9160", strArray23);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray23, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray23);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray23);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:100", strArray23, false);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient36 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost6, "127.0.0.1(127.0.0.1):10", tSSLTransportParameters35);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient36.equals(null)", !hKerberosThriftClient36.equals(null));
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0091");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        subject0.setReadOnly();
        subject0.setReadOnly();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1", (int) (short) -1);
        java.lang.String[] strArray16 = new java.lang.String[] { "-1", "CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:9160", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray16);
        tSSLTransportParameters21.setTrustStore("Subject:35", "(127.0.0.1):0", "hi!", "Subject:\n");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient27 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost7, "Subject:35", tSSLTransportParameters21);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient27.equals(null)", !hKerberosThriftClient27.equals(null));
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0092");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        boolean boolean3 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet5 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.util.Set<java.lang.Object> objSet7 = subject0.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost10 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) '4');
        long long11 = cassandraHost10.getMaxWaitTimeWhenExhausted();
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray21, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray21);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("100", strArray21, false);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient27 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost10, "", tSSLTransportParameters26);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient27.equals(null)", !hKerberosThriftClient27.equals(null));
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0093");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet4 = subject0.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1", (int) (short) -1);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient9 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost7, "(127.0.0.1):0");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient9.equals(null)", !hKerberosThriftClient9.equals(null));
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0094");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        subject0.setReadOnly();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        boolean boolean3 = subject0.isReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = new me.prettyprint.cassandra.service.CassandraHost("hi!:9160");
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters7 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters();
        tSSLTransportParameters7.setKeyStore("hi!", "");
        tSSLTransportParameters7.setKeyStore("hi!", "");
        tSSLTransportParameters7.setKeyStore("", "0", "-1", "hi!:100");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient19 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost5, "(127.0.0.1):9160", tSSLTransportParameters7);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient19.equals(null)", !hKerberosThriftClient19.equals(null));
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0095");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = new java.util.concurrent.atomic.AtomicLong((long) 1);
        boolean boolean8 = atomicLong5.compareAndSet((long) 50, (-1L));
        boolean boolean9 = subject0.equals((java.lang.Object) 50);
        java.util.Set<java.lang.Object> objSet10 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost12 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>");
        int int13 = cassandraHost12.getCassandraThriftSocketTimeout();
        java.lang.String[] strArray29 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray29);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray29);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray29, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray29, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray29, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters38 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray29);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters40 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):0", strArray29, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters41 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("100", strArray29);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient42 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost12, "(127.0.0.1):9160", tSSLTransportParameters41);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient42.equals(null)", !hKerberosThriftClient42.equals(null));
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0096");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        boolean boolean3 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):9160", 1);
        boolean boolean8 = cassandraHost7.getUseThriftFramedTransport();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient10 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost7, "9269");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient10.equals(null)", !hKerberosThriftClient10.equals(null));
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0097");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1", (int) (byte) 0);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient9 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost7, "10");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient9.equals(null)", !hKerberosThriftClient9.equals(null));
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0098");
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
        me.prettyprint.cassandra.service.CassandraHost cassandraHost19 = new me.prettyprint.cassandra.service.CassandraHost("");
        boolean boolean21 = cassandraHost19.equals((java.lang.Object) 0.0f);
        int int22 = cassandraHost19.getCassandraThriftSocketTimeout();
        cassandraHost19.setUseSocketKeepalive(false);
        cassandraHost19.setLifo(false);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost29 = new me.prettyprint.cassandra.service.CassandraHost("", 0);
        java.lang.String str30 = cassandraHost29.getHost();
        boolean boolean31 = cassandraHost29.getUseSocketKeepalive();
        java.lang.String str32 = cassandraHost29.getName();
        boolean boolean33 = cassandraHost19.equals((java.lang.Object) cassandraHost29);
        boolean boolean34 = cassandraHost19.getUseThriftFramedTransport();
        java.lang.String[] strArray46 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters47 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray46);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters48 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray46);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters50 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray46, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters51 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray46);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient52 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost19, "hi!:9160", tSSLTransportParameters51);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient52.equals(null)", !hKerberosThriftClient52.equals(null));
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0099");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 100);
        int int7 = cassandraHost6.getMaxActive();
        java.lang.String[] strArray18 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("10", strArray18, true);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient23 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost6, "-1", tSSLTransportParameters22);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient23.equals(null)", !hKerberosThriftClient23.equals(null));
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0100");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPrivateCredentials();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 10);
        float float6 = atomicLong5.floatValue();
        long long7 = atomicLong5.incrementAndGet();
        double double8 = atomicLong5.doubleValue();
        boolean boolean9 = subject0.equals((java.lang.Object) double8);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost12 = new me.prettyprint.cassandra.service.CassandraHost("Subject:\n", (int) '4');
        java.lang.String[] strArray25 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray25);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray25);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray25, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray25, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray25, true);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient34 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost12, "CassandraClient<%s-%d>", tSSLTransportParameters33);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient34.equals(null)", !hKerberosThriftClient34.equals(null));
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0101");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        java.util.Set<java.security.Principal> principalSet4 = subject0.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("");
        cassandraHost6.setMaxWaitTimeWhenExhausted((long) (short) 10);
        java.lang.String str9 = cassandraHost6.toString();
        int int10 = cassandraHost6.getMaxActive();
        java.lang.String str11 = cassandraHost6.getName();
        boolean boolean12 = cassandraHost6.isPerformNameResolution();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient14 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost6, "100:0");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient14.equals(null)", !hKerberosThriftClient14.equals(null));
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0102");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = new me.prettyprint.cassandra.service.CassandraHost("Subject");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient7 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost5, "(127.0.0.1)((127.0.0.1)):35");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient7.equals(null)", !hKerberosThriftClient7.equals(null));
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0103");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = new me.prettyprint.cassandra.service.CassandraHost("hi!:100");
        long long6 = cassandraHost5.getMaxWaitTimeWhenExhausted();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient8 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost5, "9269");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient8.equals(null)", !hKerberosThriftClient8.equals(null));
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0104");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet3 = subject0.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("Subject:\n", (int) (short) 102);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1");
        cassandraHost8.setUseThriftFramedTransport(true);
        boolean boolean11 = cassandraHost6.equals((java.lang.Object) cassandraHost8);
        java.lang.String[] strArray21 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray21);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray21, false);
        tSSLTransportParameters24.requireClientAuth(false);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient27 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost8, "Subject:35", tSSLTransportParameters24);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient27.equals(null)", !hKerberosThriftClient27.equals(null));
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0105");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.lang.String str2 = subject0.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1(127.0.0.1):102");
        java.lang.String[] strArray17 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17, true);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient24 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost4, "127.0.0.1(127.0.0.1):10", tSSLTransportParameters23);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient24.equals(null)", !hKerberosThriftClient24.equals(null));
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0106");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        boolean boolean3 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1", (-1));
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient9 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost7, "CassandraClient<%s-%d>(CassandraClient<%s-%d>):9160");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient9.equals(null)", !hKerberosThriftClient9.equals(null));
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0107");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = new me.prettyprint.cassandra.service.CassandraHost("");
        cassandraHost4.setMaxWaitTimeWhenExhausted((long) (short) 10);
        java.lang.String str7 = cassandraHost4.toString();
        int int8 = cassandraHost4.getMaxActive();
        java.lang.String str9 = cassandraHost4.getName();
        boolean boolean10 = cassandraHost4.isPerformNameResolution();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient12 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost4, "100");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient12.equals(null)", !hKerberosThriftClient12.equals(null));
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0108");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        subject0.setReadOnly();
        boolean boolean4 = subject0.isReadOnly();
        java.lang.String str5 = subject0.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (byte) 100);
        cassandraHost8.setMaxActive((int) (byte) 10);
        boolean boolean11 = cassandraHost8.getUseThriftFramedTransport();
        java.lang.String[] strArray26 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray26);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray26);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray26, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray26, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray26, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray26, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray26);
        tSSLTransportParameters37.setTrustStore("100:0", "127.0.0.1(127.0.0.1):102");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient41 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost8, "", tSSLTransportParameters37);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient41.equals(null)", !hKerberosThriftClient41.equals(null));
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0109");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        java.lang.String str4 = subject0.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("");
        boolean boolean8 = cassandraHost6.equals((java.lang.Object) 0.0f);
        java.lang.String str9 = cassandraHost6.getName();
        boolean boolean10 = subject0.equals((java.lang.Object) cassandraHost6);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost13 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):9160", (int) '#');
        java.lang.String str14 = cassandraHost13.toString();
        int int15 = cassandraHost13.getMaxActive();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient17 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost13, "hi!:9160");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient17.equals(null)", !hKerberosThriftClient17.equals(null));
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0110");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = new me.prettyprint.cassandra.service.CassandraHost("hi!");
        cassandraHost4.setMaxActive((int) (short) 0);
        java.lang.String str7 = cassandraHost4.getUrl();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient9 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost4, "(127.0.0.1)((127.0.0.1)):9260");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient9.equals(null)", !hKerberosThriftClient9.equals(null));
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0111");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (byte) 100);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient9 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost7, "");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient9.equals(null)", !hKerberosThriftClient9.equals(null));
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0112");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        boolean boolean3 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet5 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.util.Set<java.lang.Object> objSet7 = subject0.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost10 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) (byte) 10);
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray22, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray22);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray22);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray22);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray22);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient29 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost10, "CassandraClient<%s-%d>", tSSLTransportParameters28);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient29.equals(null)", !hKerberosThriftClient29.equals(null));
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0113");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.lang.String str2 = subject0.toString();
        java.lang.String str3 = subject0.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):9160", 1);
        cassandraHost6.setMaxWaitTimeWhenExhausted(0L);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient10 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost6, "127.0.0.1(127.0.0.1):102");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient10.equals(null)", !hKerberosThriftClient10.equals(null));
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0114");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        subject0.setReadOnly();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.lang.String str3 = subject0.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1", 9160);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient8 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost6, "10");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient8.equals(null)", !hKerberosThriftClient8.equals(null));
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0115");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet3 = subject0.getPrincipals();
        java.util.Set<java.security.Principal> principalSet4 = subject0.getPrincipals();
        java.util.Set<java.security.Principal> principalSet5 = subject0.getPrincipals();
        java.lang.String str6 = subject0.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = new me.prettyprint.cassandra.service.CassandraHost("100:0");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient10 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost8, "9269");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient10.equals(null)", !hKerberosThriftClient10.equals(null));
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0116");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        boolean boolean4 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet5 = subject0.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) '4');
        long long9 = cassandraHost8.getMaxWaitTimeWhenExhausted();
        cassandraHost8.setCassandraThriftSocketTimeout((-1));
        cassandraHost8.setMaxWaitTimeWhenExhausted(1L);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient15 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost8, "0.0.0.0");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient15.equals(null)", !hKerberosThriftClient15.equals(null));
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0117");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet3 = subject0.getPrincipals();
        java.util.Set<java.security.Principal> principalSet4 = subject0.getPrincipals();
        javax.security.auth.Subject subject5 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet6 = subject5.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet7 = subject5.getPrivateCredentials();
        boolean boolean8 = subject5.isReadOnly();
        java.util.Set<java.lang.Object> objSet9 = subject5.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet10 = subject5.getPublicCredentials();
        subject5.setReadOnly();
        java.util.Set<java.lang.Object> objSet12 = subject5.getPublicCredentials();
        boolean boolean13 = subject0.equals((java.lang.Object) objSet12);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost15 = new me.prettyprint.cassandra.service.CassandraHost("");
        boolean boolean17 = cassandraHost15.equals((java.lang.Object) 0.0f);
        int int18 = cassandraHost15.getPort();
        java.lang.String str19 = cassandraHost15.getName();
        boolean boolean20 = cassandraHost15.getUseSocketKeepalive();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient22 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost15, "0.0.0.0(0.0.0.0):101");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient22.equals(null)", !hKerberosThriftClient22.equals(null));
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0118");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        subject0.setReadOnly();
        boolean boolean2 = subject0.isReadOnly();
        java.util.Set<java.security.Principal> principalSet3 = subject0.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1", 9160);
        java.util.concurrent.atomic.AtomicLong atomicLong8 = new java.util.concurrent.atomic.AtomicLong((long) '#');
        boolean boolean9 = cassandraHost6.equals((java.lang.Object) '#');
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters();
        tSSLTransportParameters11.setKeyStore("hi!", "");
        tSSLTransportParameters11.setTrustStore("", "hi!");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient18 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost6, "(127.0.0.1)((127.0.0.1)):35", tSSLTransportParameters11);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient18.equals(null)", !hKerberosThriftClient18.equals(null));
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0119");
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
        me.prettyprint.cassandra.service.CassandraHost cassandraHost19 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) '4');
        long long20 = cassandraHost19.getMaxWaitTimeWhenExhausted();
        java.lang.String[] strArray29 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray29);
        tSSLTransportParameters30.setKeyStore("CassandraClient<%s-%d>", "Subject:\n", "CassandraClient<%s-%d>", "Subject:\n");
        tSSLTransportParameters30.setKeyStore("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1", "hi!:9160", "-1", "");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient41 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost19, "100", tSSLTransportParameters30);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient41.equals(null)", !hKerberosThriftClient41.equals(null));
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0120");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        boolean boolean4 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet5 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1", (-1));
        boolean boolean10 = cassandraHost9.getUseThriftFramedTransport();
        java.lang.String[] strArray21 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray21);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray21);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray21);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient25 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost9, "127.0.0.1", tSSLTransportParameters24);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient25.equals(null)", !hKerberosThriftClient25.equals(null));
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0121");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        java.lang.String str4 = subject0.toString();
        subject0.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 100);
        cassandraHost8.setMaxWaitTimeWhenExhausted(0L);
        int int11 = cassandraHost8.getPort();
        boolean boolean12 = cassandraHost8.getLifo();
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters();
        tSSLTransportParameters14.setKeyStore("hi!", "");
        tSSLTransportParameters14.setTrustStore("CassandraClient<%s-%d>", "hi!");
        tSSLTransportParameters14.requireClientAuth(false);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient23 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost8, "0.0.0.100", tSSLTransportParameters14);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient23.equals(null)", !hKerberosThriftClient23.equals(null));
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0122");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet4 = subject0.getPrincipals();
        boolean boolean5 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet6 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = new me.prettyprint.cassandra.service.CassandraHost("hi!", 0);
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray22, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray22);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray22);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray22);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:9160", strArray22);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray22);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient30 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost9, "0.0.0.100", tSSLTransportParameters29);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient30.equals(null)", !hKerberosThriftClient30.equals(null));
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0123");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.lang.String str2 = subject0.toString();
        java.lang.String str3 = subject0.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):9160");
        long long6 = cassandraHost5.getMaxWaitTimeWhenExhausted();
        boolean boolean7 = cassandraHost5.getLifo();
        java.lang.String str8 = cassandraHost5.getUrl();
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters();
        tSSLTransportParameters10.setKeyStore("hi!", "");
        tSSLTransportParameters10.setKeyStore("CassandraClient<%s-%d>", "CassandraClient<%s-%d>");
        tSSLTransportParameters10.requireClientAuth(true);
        tSSLTransportParameters10.setKeyStore("CassandraClient<%s-%d>(CassandraClient<%s-%d>)", "Subject:\n", "0.0.0.0", "0");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient24 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost5, "hi!:9160", tSSLTransportParameters10);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient24.equals(null)", !hKerberosThriftClient24.equals(null));
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0124");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPrivateCredentials();
        java.lang.String str4 = subject0.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("", 0);
        boolean boolean8 = cassandraHost7.getLifo();
        java.lang.String[] strArray21 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray21);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray21);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray21);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject", strArray21);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1", strArray21, false);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient28 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost7, "", tSSLTransportParameters27);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient28.equals(null)", !hKerberosThriftClient28.equals(null));
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0125");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.lang.String str2 = subject0.toString();
        java.lang.String str3 = subject0.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) (short) 10);
        long long7 = cassandraHost6.getMaxWaitTimeWhenExhausted();
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1(127.0.0.1):10", strArray13);
        tSSLTransportParameters16.setTrustStore("0.0.0.100", "0", "(127.0.0.1)((127.0.0.1)):35", "10");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient22 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost6, "CassandraClient<%s-%d>(CassandraClient<%s-%d>)", tSSLTransportParameters16);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient22.equals(null)", !hKerberosThriftClient22.equals(null));
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0126");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        boolean boolean3 = subject0.isReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("", 0);
        java.lang.String str7 = cassandraHost6.getHost();
        boolean boolean8 = cassandraHost6.getUseSocketKeepalive();
        java.lang.String str9 = cassandraHost6.getName();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient11 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost6, "32");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient11.equals(null)", !hKerberosThriftClient11.equals(null));
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0127");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        subject0.setReadOnly();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):9160", (int) '#');
        java.lang.String str8 = cassandraHost7.toString();
        int int9 = cassandraHost7.getMaxActive();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient11 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost7, "hi!");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient11.equals(null)", !hKerberosThriftClient11.equals(null));
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0128");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        subject0.setReadOnly();
        subject0.setReadOnly();
        subject0.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("hi!:100", (int) (short) -1);
        java.lang.String[] strArray18 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray18);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient24 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost6, "32", tSSLTransportParameters23);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient24.equals(null)", !hKerberosThriftClient24.equals(null));
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0129");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        subject0.setReadOnly();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):35");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient7 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost5, "hi!:100");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient7.equals(null)", !hKerberosThriftClient7.equals(null));
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0130");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        subject0.setReadOnly();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1", 0);
        java.lang.String[] strArray21 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray21);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray21);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray21);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject", strArray21);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1", strArray21, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>:9160", strArray21);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient29 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost7, "CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1", tSSLTransportParameters28);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient29.equals(null)", !hKerberosThriftClient29.equals(null));
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0131");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPublicCredentials();
        java.lang.String str3 = subject0.toString();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("Subject:\n", (int) (byte) 10);
        cassandraHost7.setCassandraThriftSocketTimeout((int) (short) 1);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient11 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost7, "(127.0.0.1)((127.0.0.1)):35");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient11.equals(null)", !hKerberosThriftClient11.equals(null));
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0132");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        boolean boolean3 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet5 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.util.Set<java.lang.Object> objSet7 = subject0.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost10 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):9160", (int) '#');
        java.lang.String str11 = cassandraHost10.toString();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient13 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost10, "(127.0.0.1):100");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient13.equals(null)", !hKerberosThriftClient13.equals(null));
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0133");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet3 = subject0.getPrincipals();
        java.util.Set<java.security.Principal> principalSet4 = subject0.getPrincipals();
        javax.security.auth.Subject subject5 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet6 = subject5.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet7 = subject5.getPrivateCredentials();
        boolean boolean8 = subject5.isReadOnly();
        java.util.Set<java.lang.Object> objSet9 = subject5.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet10 = subject5.getPublicCredentials();
        subject5.setReadOnly();
        java.util.Set<java.lang.Object> objSet12 = subject5.getPublicCredentials();
        boolean boolean13 = subject0.equals((java.lang.Object) objSet12);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost15 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>");
        java.lang.String str16 = cassandraHost15.getIp();
        java.lang.String str17 = cassandraHost15.getHost();
        int int18 = cassandraHost15.getPort();
        long long19 = cassandraHost15.getMaxWaitTimeWhenExhausted();
        java.lang.String[] strArray32 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray32);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray32);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray32, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters38 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray32, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters40 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:9160", strArray32, true);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient41 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost15, "(127.0.0.1)((127.0.0.1)):9260", tSSLTransportParameters40);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient41.equals(null)", !hKerberosThriftClient41.equals(null));
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0134");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        subject0.setReadOnly();
        boolean boolean4 = subject0.isReadOnly();
        java.lang.String str5 = subject0.toString();
        java.util.Set<java.lang.Object> objSet6 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) '4');
        long long10 = cassandraHost9.getMaxWaitTimeWhenExhausted();
        cassandraHost9.setCassandraThriftSocketTimeout(0);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient14 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost9, "(127.0.0.1)");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient14.equals(null)", !hKerberosThriftClient14.equals(null));
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0135");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPublicCredentials();
        java.lang.String str3 = subject0.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("32", 50);
        cassandraHost6.setCassandraThriftSocketTimeout(0);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient10 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost6, "127.0.0.1(127.0.0.1)");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient10.equals(null)", !hKerberosThriftClient10.equals(null));
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0136");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        boolean boolean3 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet5 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):9160", 1);
        cassandraHost9.setMaxWaitTimeWhenExhausted(0L);
        boolean boolean13 = cassandraHost9.equals((java.lang.Object) ' ');
        boolean boolean14 = cassandraHost9.isPerformNameResolution();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient16 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost9, "-2");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient16.equals(null)", !hKerberosThriftClient16.equals(null));
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0137");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        boolean boolean4 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet5 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet6 = subject0.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) (short) 1);
        cassandraHost9.setCassandraThriftSocketTimeout((int) (short) 1);
        java.lang.String str12 = cassandraHost9.getIp();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient14 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost9, "0");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient14.equals(null)", !hKerberosThriftClient14.equals(null));
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0138");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPrivateCredentials();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 10);
        float float6 = atomicLong5.floatValue();
        long long7 = atomicLong5.incrementAndGet();
        double double8 = atomicLong5.doubleValue();
        boolean boolean9 = subject0.equals((java.lang.Object) double8);
        boolean boolean10 = subject0.isReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost13 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 100);
        cassandraHost13.setMaxWaitTimeWhenExhausted(0L);
        cassandraHost13.setMaxActive(0);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters();
        tSSLTransportParameters19.setKeyStore("hi!", "");
        tSSLTransportParameters19.setKeyStore("CassandraClient<%s-%d>", "CassandraClient<%s-%d>");
        tSSLTransportParameters19.setTrustStore("Subject:\n", "hi!:100", "", "CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient31 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost13, "98", tSSLTransportParameters19);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient31.equals(null)", !hKerberosThriftClient31.equals(null));
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0139");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        subject0.setReadOnly();
        boolean boolean2 = subject0.isReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1(127.0.0.1)");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient6 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost4, "100");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient6.equals(null)", !hKerberosThriftClient6.equals(null));
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0140");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = new me.prettyprint.cassandra.service.CassandraHost("hi!");
        boolean boolean7 = cassandraHost5.equals((java.lang.Object) (byte) 10);
        int int8 = cassandraHost5.getCassandraThriftSocketTimeout();
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray19, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray19, false);
        tSSLTransportParameters25.setTrustStore("32", "CassandraClient<%s-%d>");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient29 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost5, "32", tSSLTransportParameters25);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient29.equals(null)", !hKerberosThriftClient29.equals(null));
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0141");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        boolean boolean4 = subject0.isReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("");
        boolean boolean8 = cassandraHost6.equals((java.lang.Object) 0.0f);
        int int9 = cassandraHost6.getPort();
        java.lang.String str10 = cassandraHost6.getName();
        java.lang.String str11 = cassandraHost6.getHost();
        int int12 = cassandraHost6.getCassandraThriftSocketTimeout();
        boolean boolean13 = cassandraHost6.isPerformNameResolution();
        int int14 = cassandraHost6.getPort();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray23, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray23);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient27 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost6, "CassandraClient<%s-%d>:9160", tSSLTransportParameters26);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient27.equals(null)", !hKerberosThriftClient27.equals(null));
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0142");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        boolean boolean3 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet5 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("");
        cassandraHost7.setMaxWaitTimeWhenExhausted((long) (short) 10);
        java.lang.String str10 = cassandraHost7.toString();
        cassandraHost7.setMaxWaitTimeWhenExhausted((long) (short) 1);
        boolean boolean13 = cassandraHost7.getLifo();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray23, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray23, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):35", strArray23, false);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient30 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost7, "", tSSLTransportParameters29);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient30.equals(null)", !hKerberosThriftClient30.equals(null));
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0143");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet4 = subject0.getPrincipals();
        boolean boolean5 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet6 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet7 = subject0.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost10 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1", 0);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient12 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost10, "");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient12.equals(null)", !hKerberosThriftClient12.equals(null));
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0144");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPublicCredentials();
        java.lang.String str3 = subject0.toString();
        boolean boolean4 = subject0.isReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("hi!");
        cassandraHost6.setMaxActive((int) (short) 0);
        int int9 = cassandraHost6.getCassandraThriftSocketTimeout();
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):9260", strArray14);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient17 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost6, "(127.0.0.1)((127.0.0.1)):35", tSSLTransportParameters16);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient17.equals(null)", !hKerberosThriftClient17.equals(null));
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0145");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = new java.util.concurrent.atomic.AtomicLong((long) 1);
        boolean boolean8 = atomicLong5.compareAndSet((long) 50, (-1L));
        boolean boolean9 = subject0.equals((java.lang.Object) 50);
        java.util.Set<java.lang.Object> objSet10 = subject0.getPrivateCredentials();
        subject0.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost14 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 100);
        cassandraHost14.setMaxWaitTimeWhenExhausted((long) 10);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost18 = new me.prettyprint.cassandra.service.CassandraHost("");
        boolean boolean19 = cassandraHost14.equals((java.lang.Object) cassandraHost18);
        java.lang.String str20 = cassandraHost14.getHost();
        cassandraHost14.setUseSocketKeepalive(true);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient24 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost14, "-1");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient24.equals(null)", !hKerberosThriftClient24.equals(null));
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0146");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        boolean boolean4 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet5 = subject0.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 100);
        cassandraHost8.setMaxWaitTimeWhenExhausted(0L);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient12 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost8, "Subject:\n");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient12.equals(null)", !hKerberosThriftClient12.equals(null));
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0147");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet4 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet5 = subject0.getPublicCredentials();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 100);
        atomicLong7.set((long) (short) 10);
        boolean boolean10 = subject0.equals((java.lang.Object) (short) 10);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost12 = new me.prettyprint.cassandra.service.CassandraHost("hi!");
        cassandraHost12.setMaxActive((int) (short) 0);
        int int15 = cassandraHost12.getPort();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient17 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost12, "9269(0.0.36.53):1");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient17.equals(null)", !hKerberosThriftClient17.equals(null));
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0148");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        java.lang.String str4 = subject0.toString();
        java.lang.String str5 = subject0.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = new me.prettyprint.cassandra.service.CassandraHost("9269", (int) (byte) 10);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient10 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost8, "CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>))");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient10.equals(null)", !hKerberosThriftClient10.equals(null));
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0149");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet3 = subject0.getPrincipals();
        java.util.Set<java.security.Principal> principalSet4 = subject0.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("");
        cassandraHost6.setMaxWaitTimeWhenExhausted((long) (short) 10);
        java.lang.String str9 = cassandraHost6.toString();
        cassandraHost6.setMaxWaitTimeWhenExhausted((long) (short) 1);
        cassandraHost6.setMaxWaitTimeWhenExhausted((long) (byte) 1);
        java.lang.String str14 = cassandraHost6.toString();
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray25, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray25);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray25);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray25, false);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient32 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost6, ":9160", tSSLTransportParameters31);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient32.equals(null)", !hKerberosThriftClient32.equals(null));
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0150");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (byte) 100);
        cassandraHost6.setMaxActive((int) (byte) 10);
        boolean boolean9 = cassandraHost6.getUseThriftFramedTransport();
        javax.security.auth.Subject subject11 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet12 = subject11.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet13 = subject11.getPrincipals();
        java.util.Set<java.lang.Object> objSet14 = subject11.getPrivateCredentials();
        java.util.concurrent.atomic.AtomicLong atomicLong16 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 10);
        float float17 = atomicLong16.floatValue();
        long long18 = atomicLong16.incrementAndGet();
        double double19 = atomicLong16.doubleValue();
        boolean boolean20 = subject11.equals((java.lang.Object) double19);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray31, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray31);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray31);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:9160", strArray31);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters38 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("100", strArray31, true);
        tSSLTransportParameters38.setTrustStore("", "(127.0.0.1)((127.0.0.1)):9260");
        boolean boolean42 = subject11.equals((java.lang.Object) tSSLTransportParameters38);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient43 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost6, "hi!", tSSLTransportParameters38);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient43.equals(null)", !hKerberosThriftClient43.equals(null));
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0151");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        subject0.setReadOnly();
        boolean boolean4 = subject0.isReadOnly();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray13);
        boolean boolean18 = subject0.equals((java.lang.Object) tSSLTransportParameters17);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost21 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):9160", 1);
        boolean boolean22 = cassandraHost21.isPerformNameResolution();
        cassandraHost21.setCassandraThriftSocketTimeout(10);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient26 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost21, "Subject:\n");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient26.equals(null)", !hKerberosThriftClient26.equals(null));
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0152");
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
        me.prettyprint.cassandra.service.CassandraHost cassandraHost18 = new me.prettyprint.cassandra.service.CassandraHost("hi!");
        int int19 = cassandraHost18.getMaxActive();
        java.lang.String str20 = cassandraHost18.getIp();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient22 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost18, "CassandraClient<%s-%d>(CassandraClient<%s-%d>):9160");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient22.equals(null)", !hKerberosThriftClient22.equals(null));
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0153");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        subject0.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) (byte) 10);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient8 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost6, "CassandraClient<%s-%d>(CassandraClient<%s-%d>):1");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient8.equals(null)", !hKerberosThriftClient8.equals(null));
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0154");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = new me.prettyprint.cassandra.service.CassandraHost("");
        boolean boolean7 = cassandraHost5.equals((java.lang.Object) 0.0f);
        int int8 = cassandraHost5.getPort();
        java.lang.String str9 = cassandraHost5.getName();
        java.lang.String str10 = cassandraHost5.getHost();
        int int11 = cassandraHost5.getCassandraThriftSocketTimeout();
        boolean boolean12 = cassandraHost5.isPerformNameResolution();
        int int13 = cassandraHost5.getPort();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient15 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost5, "98");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient15.equals(null)", !hKerberosThriftClient15.equals(null));
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0155");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        subject0.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = new me.prettyprint.cassandra.service.CassandraHost("hi!");
        cassandraHost5.setMaxActive((int) (short) 0);
        int int8 = cassandraHost5.getPort();
        cassandraHost5.setUseThriftFramedTransport(false);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient12 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost5, "");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient12.equals(null)", !hKerberosThriftClient12.equals(null));
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0156");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet4 = subject0.getPrincipals();
        javax.security.auth.Subject subject5 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet6 = subject5.getPublicCredentials();
        boolean boolean7 = subject0.equals((java.lang.Object) objSet6);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>");
        java.lang.String str10 = cassandraHost9.getIp();
        java.lang.String str11 = cassandraHost9.getName();
        boolean boolean12 = cassandraHost9.getLifo();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient14 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost9, ":0");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient14.equals(null)", !hKerberosThriftClient14.equals(null));
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0157");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        subject0.setReadOnly();
        boolean boolean4 = subject0.isReadOnly();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray13);
        boolean boolean18 = subject0.equals((java.lang.Object) tSSLTransportParameters17);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost21 = new me.prettyprint.cassandra.service.CassandraHost("-1", (int) (byte) 0);
        java.lang.String str22 = cassandraHost21.getUrl();
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters38 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray36, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters39 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray36);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters40 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray36);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters41 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray36);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters42 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:9160", strArray36);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters44 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray36, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters45 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray36);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient46 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost21, "CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):10", tSSLTransportParameters45);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient46.equals(null)", !hKerberosThriftClient46.equals(null));
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0158");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = new me.prettyprint.cassandra.service.CassandraHost("");
        int int4 = cassandraHost3.getMaxActive();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient6 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost3, "98");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient6.equals(null)", !hKerberosThriftClient6.equals(null));
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0159");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = new me.prettyprint.cassandra.service.CassandraHost("");
        boolean boolean6 = cassandraHost4.equals((java.lang.Object) 0.0f);
        int int7 = cassandraHost4.getCassandraThriftSocketTimeout();
        cassandraHost4.setMaxActive((int) '4');
        java.lang.String str10 = cassandraHost4.toString();
        java.lang.String str11 = cassandraHost4.getHost();
        cassandraHost4.setUseSocketKeepalive(false);
        boolean boolean14 = cassandraHost4.getUseSocketKeepalive();
        java.lang.String[] strArray28 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray28);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray28);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("10", strArray28, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("100", strArray28);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):35", strArray28, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):0", strArray28, true);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient38 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost4, "Subject:\n", tSSLTransportParameters37);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient38.equals(null)", !hKerberosThriftClient38.equals(null));
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0160");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        subject0.setReadOnly();
        subject0.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) '4');
        long long6 = cassandraHost5.getMaxWaitTimeWhenExhausted();
        cassandraHost5.setCassandraThriftSocketTimeout((-1));
        cassandraHost5.setMaxWaitTimeWhenExhausted(1L);
        cassandraHost5.setMaxActive(0);
        java.lang.String[] strArray22 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray22);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray22);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient25 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost5, ":0", tSSLTransportParameters24);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient25.equals(null)", !hKerberosThriftClient25.equals(null));
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0161");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = new me.prettyprint.cassandra.service.CassandraHost("", 0);
        boolean boolean6 = cassandraHost5.getUseSocketKeepalive();
        boolean boolean7 = cassandraHost5.getLifo();
        java.lang.String str8 = cassandraHost5.getName();
        int int9 = cassandraHost5.getPort();
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray25, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray25);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray25);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray25);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:9160", strArray25);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray25, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray25);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray25, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray25);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient38 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost5, "(127.0.0.1):0", tSSLTransportParameters37);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient38.equals(null)", !hKerberosThriftClient38.equals(null));
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0162");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet4 = subject0.getPrincipals();
        boolean boolean5 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet6 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = new me.prettyprint.cassandra.service.CassandraHost("");
        boolean boolean10 = cassandraHost8.equals((java.lang.Object) 0.0f);
        int int11 = cassandraHost8.getCassandraThriftSocketTimeout();
        cassandraHost8.setMaxActive((int) '4');
        java.lang.String str14 = cassandraHost8.toString();
        java.lang.String str15 = cassandraHost8.getHost();
        cassandraHost8.setUseSocketKeepalive(false);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient19 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost8, "");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient19.equals(null)", !hKerberosThriftClient19.equals(null));
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0163");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:100", strArray12, false);
        boolean boolean19 = subject0.equals((java.lang.Object) strArray12);
        boolean boolean20 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet21 = subject0.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost24 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 100);
        cassandraHost24.setMaxWaitTimeWhenExhausted(0L);
        int int27 = cassandraHost24.getPort();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient29 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost24, "100:0");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient29.equals(null)", !hKerberosThriftClient29.equals(null));
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0164");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet4 = subject0.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("");
        boolean boolean8 = cassandraHost6.equals((java.lang.Object) 0.0f);
        int int9 = cassandraHost6.getCassandraThriftSocketTimeout();
        cassandraHost6.setMaxActive((int) '4');
        java.lang.String str12 = cassandraHost6.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost15 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):9160", 1);
        cassandraHost15.setMaxWaitTimeWhenExhausted(0L);
        boolean boolean18 = cassandraHost6.equals((java.lang.Object) 0L);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient20 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost6, "102");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient20.equals(null)", !hKerberosThriftClient20.equals(null));
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0165");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet3 = subject0.getPrincipals();
        java.util.Set<java.security.Principal> principalSet4 = subject0.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("Subject", 32);
        java.lang.String[] strArray19 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray19, false);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient25 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost7, "0.0.0.0(0.0.0.0):101", tSSLTransportParameters24);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient25.equals(null)", !hKerberosThriftClient25.equals(null));
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0166");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        boolean boolean3 = subject0.isReadOnly();
        java.lang.String[] strArray12 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray12);
        boolean boolean15 = subject0.equals((java.lang.Object) tSSLTransportParameters14);
        java.util.Set<java.lang.Object> objSet16 = subject0.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost18 = new me.prettyprint.cassandra.service.CassandraHost("hi!");
        cassandraHost18.setMaxActive((int) (short) 0);
        int int21 = cassandraHost18.getPort();
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray34, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray34);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters38 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray34);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters40 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:100", strArray34, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters41 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray34);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters42 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:9160", strArray34);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient43 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost18, "102", tSSLTransportParameters42);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient43.equals(null)", !hKerberosThriftClient43.equals(null));
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0167");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        boolean boolean3 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1", (int) (short) -1);
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray19, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:9160", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("10", strArray19, false);
        tSSLTransportParameters26.setTrustStore("hi!:100", "127.0.0.1");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient30 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost7, "102", tSSLTransportParameters26);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient30.equals(null)", !hKerberosThriftClient30.equals(null));
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0168");
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
        me.prettyprint.cassandra.service.CassandraHost cassandraHost32 = new me.prettyprint.cassandra.service.CassandraHost("");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient34 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost32, "127.0.0.1(127.0.0.1):10");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient34.equals(null)", !hKerberosThriftClient34.equals(null));
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0169");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = new java.util.concurrent.atomic.AtomicLong((long) 1);
        boolean boolean8 = atomicLong5.compareAndSet((long) 50, (-1L));
        boolean boolean9 = subject0.equals((java.lang.Object) 50);
        java.util.Set<java.lang.Object> objSet10 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost13 = new me.prettyprint.cassandra.service.CassandraHost("", 0);
        boolean boolean14 = cassandraHost13.getUseSocketKeepalive();
        boolean boolean15 = cassandraHost13.getLifo();
        cassandraHost13.setMaxWaitTimeWhenExhausted(9261L);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient19 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost13, "98");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient19.equals(null)", !hKerberosThriftClient19.equals(null));
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0170");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        boolean boolean4 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet5 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = new me.prettyprint.cassandra.service.CassandraHost("", 0);
        boolean boolean10 = cassandraHost9.getUseSocketKeepalive();
        cassandraHost9.setCassandraThriftSocketTimeout(35);
        java.lang.String str13 = cassandraHost9.toString();
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray29, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray29);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray29);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray29);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:9160", strArray29);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray29, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters38 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray29);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters40 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray29, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters41 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("10", strArray29);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient42 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost9, "(127.0.0.1):9160", tSSLTransportParameters41);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient42.equals(null)", !hKerberosThriftClient42.equals(null));
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0171");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (byte) 100);
        cassandraHost6.setMaxActive((int) (byte) 10);
        boolean boolean9 = cassandraHost6.getUseThriftFramedTransport();
        java.lang.String str10 = cassandraHost6.getUrl();
        cassandraHost6.setUseSocketKeepalive(false);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray26, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray26);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray26);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray26, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray26, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):10", strArray26);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray26);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient37 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost6, "CassandraClient<%s-%d>(CassandraClient<%s-%d>)", tSSLTransportParameters36);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient37.equals(null)", !hKerberosThriftClient37.equals(null));
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0172");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:100", strArray12, false);
        boolean boolean19 = subject0.equals((java.lang.Object) strArray12);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost22 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)", 9160);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient24 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost22, "");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient24.equals(null)", !hKerberosThriftClient24.equals(null));
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0173");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        subject0.setReadOnly();
        subject0.setReadOnly();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 1);
        boolean boolean7 = cassandraHost6.getUseThriftFramedTransport();
        java.lang.String[] strArray18 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray18, false);
        tSSLTransportParameters22.setTrustStore("", "");
        tSSLTransportParameters22.setTrustStore("Subject", "CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>))", "32", "(127.0.0.1):100");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient31 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost6, "Subject:\n", tSSLTransportParameters22);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient31.equals(null)", !hKerberosThriftClient31.equals(null));
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0174");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet4 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet5 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet6 = subject0.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = new me.prettyprint.cassandra.service.CassandraHost("");
        boolean boolean10 = cassandraHost8.equals((java.lang.Object) 0.0f);
        int int11 = cassandraHost8.getPort();
        java.lang.String str12 = cassandraHost8.getName();
        java.lang.String str13 = cassandraHost8.getHost();
        boolean boolean14 = cassandraHost8.getUseThriftFramedTransport();
        java.lang.String[] strArray20 = new java.lang.String[] { "-1", "CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:9160", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject", strArray20, false);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient24 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost8, "hi!:100", tSSLTransportParameters23);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient24.equals(null)", !hKerberosThriftClient24.equals(null));
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0175");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        boolean boolean4 = subject0.isReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("", 0);
        boolean boolean8 = cassandraHost7.getUseSocketKeepalive();
        boolean boolean9 = cassandraHost7.getLifo();
        java.lang.String str10 = cassandraHost7.getName();
        boolean boolean11 = cassandraHost7.getUseSocketKeepalive();
        javax.security.auth.Subject subject13 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet14 = subject13.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet15 = subject13.getPrincipals();
        subject13.setReadOnly();
        boolean boolean17 = subject13.isReadOnly();
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray26, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray26);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray26);
        boolean boolean31 = subject13.equals((java.lang.Object) tSSLTransportParameters30);
        tSSLTransportParameters30.requireClientAuth(false);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient34 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost7, "32", tSSLTransportParameters30);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient34.equals(null)", !hKerberosThriftClient34.equals(null));
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0176");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        boolean boolean3 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet5 = subject0.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) (short) 1);
        cassandraHost8.setCassandraThriftSocketTimeout((int) (short) 1);
        int int11 = cassandraHost8.getPort();
        java.lang.String str12 = cassandraHost8.getName();
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray30, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray30);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray30);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray30);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:9160", strArray30);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters38 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray30, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters39 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray30);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters40 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray30);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters42 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:100", strArray30, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters44 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0", strArray30, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters46 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0.0.0.0(0.0.0.0):101", strArray30, true);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient47 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost8, "CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1", tSSLTransportParameters46);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient47.equals(null)", !hKerberosThriftClient47.equals(null));
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0177");
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
        me.prettyprint.cassandra.service.CassandraHost cassandraHost21 = new me.prettyprint.cassandra.service.CassandraHost("-1:0", (int) (byte) 1);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray31, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray31);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray31);
        tSSLTransportParameters35.setKeyStore("-1", "127.0.0.1");
        tSSLTransportParameters35.setKeyStore("(127.0.0.1):9160", "0.0.0.0(0.0.0.0):101", "(127.0.0.1):100", "(127.0.0.1)((127.0.0.1)):35");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient44 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost21, "CassandraClient<%s-%d>(CassandraClient<%s-%d>):1", tSSLTransportParameters35);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient44.equals(null)", !hKerberosThriftClient44.equals(null));
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0178");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPrivateCredentials();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 10);
        float float6 = atomicLong5.floatValue();
        long long7 = atomicLong5.incrementAndGet();
        double double8 = atomicLong5.doubleValue();
        boolean boolean9 = subject0.equals((java.lang.Object) double8);
        javax.security.auth.Subject subject10 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet11 = subject10.getPublicCredentials();
        subject10.setReadOnly();
        java.lang.String str13 = subject10.toString();
        java.lang.String str14 = subject10.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost16 = new me.prettyprint.cassandra.service.CassandraHost("");
        boolean boolean18 = cassandraHost16.equals((java.lang.Object) 0.0f);
        java.lang.String str19 = cassandraHost16.getName();
        boolean boolean20 = subject10.equals((java.lang.Object) cassandraHost16);
        java.lang.String str21 = cassandraHost16.toString();
        int int22 = cassandraHost16.getPort();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient24 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost16, "(127.0.0.1):0");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient24.equals(null)", !hKerberosThriftClient24.equals(null));
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0179");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        boolean boolean3 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet5 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = new me.prettyprint.cassandra.service.CassandraHost("hi!");
        cassandraHost8.setMaxActive((int) (short) 0);
        int int11 = cassandraHost8.getPort();
        cassandraHost8.setUseThriftFramedTransport(false);
        boolean boolean14 = cassandraHost8.getUseSocketKeepalive();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient16 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost8, "127.0.0.1(127.0.0.1)");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient16.equals(null)", !hKerberosThriftClient16.equals(null));
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0180");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        subject0.setReadOnly();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = new me.prettyprint.cassandra.service.CassandraHost("hi!");
        cassandraHost5.setMaxActive((int) (short) 0);
        int int8 = cassandraHost5.getPort();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient10 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost5, "100:0");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient10.equals(null)", !hKerberosThriftClient10.equals(null));
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0181");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPrivateCredentials();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 10);
        float float6 = atomicLong5.floatValue();
        long long7 = atomicLong5.incrementAndGet();
        double double8 = atomicLong5.doubleValue();
        boolean boolean9 = subject0.equals((java.lang.Object) double8);
        boolean boolean10 = subject0.isReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost12 = new me.prettyprint.cassandra.service.CassandraHost("");
        cassandraHost12.setMaxWaitTimeWhenExhausted((long) (short) 10);
        java.lang.String str15 = cassandraHost12.toString();
        cassandraHost12.setMaxWaitTimeWhenExhausted((long) (short) 1);
        boolean boolean18 = cassandraHost12.getLifo();
        cassandraHost12.setCassandraThriftSocketTimeout((int) (byte) -2);
        cassandraHost12.setCassandraThriftSocketTimeout(101);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient24 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost12, "127.0.0.1(127.0.0.1):10");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient24.equals(null)", !hKerberosThriftClient24.equals(null));
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0182");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        boolean boolean3 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet5 = subject0.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 100);
        cassandraHost8.setMaxWaitTimeWhenExhausted((long) 10);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient12 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost8, "Subject:35");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient12.equals(null)", !hKerberosThriftClient12.equals(null));
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0183");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        java.lang.String str4 = subject0.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("");
        boolean boolean8 = cassandraHost6.equals((java.lang.Object) 0.0f);
        java.lang.String str9 = cassandraHost6.getName();
        boolean boolean10 = subject0.equals((java.lang.Object) cassandraHost6);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost13 = new me.prettyprint.cassandra.service.CassandraHost("100", (int) (short) 100);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient15 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost13, "32");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient15.equals(null)", !hKerberosThriftClient15.equals(null));
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0184");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        subject0.setReadOnly();
        javax.security.auth.Subject subject4 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet5 = subject4.getPublicCredentials();
        subject4.setReadOnly();
        java.lang.String str7 = subject4.toString();
        java.lang.String str8 = subject4.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost10 = new me.prettyprint.cassandra.service.CassandraHost("");
        boolean boolean12 = cassandraHost10.equals((java.lang.Object) 0.0f);
        java.lang.String str13 = cassandraHost10.getName();
        boolean boolean14 = subject4.equals((java.lang.Object) cassandraHost10);
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray25, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray25);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray25);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1", strArray25, true);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient32 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost10, "0.0.0.0", tSSLTransportParameters31);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient32.equals(null)", !hKerberosThriftClient32.equals(null));
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0185");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        java.lang.String str4 = subject0.toString();
        java.lang.String str5 = subject0.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>");
        java.lang.String str8 = cassandraHost7.getIp();
        int int9 = cassandraHost7.getMaxActive();
        java.lang.String[] strArray24 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray24);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray24);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray24, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray24, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray24, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray24);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):0", strArray24, false);
        tSSLTransportParameters35.setKeyStore("(127.0.0.1):100", "hi!:9160", "127.0.0.1(127.0.0.1):102", "");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient41 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost7, "9269(0.0.36.53):1", tSSLTransportParameters35);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient41.equals(null)", !hKerberosThriftClient41.equals(null));
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0186");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet3 = subject0.getPrincipals();
        java.util.Set<java.security.Principal> principalSet4 = subject0.getPrincipals();
        javax.security.auth.Subject subject5 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet6 = subject5.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet7 = subject5.getPrivateCredentials();
        boolean boolean8 = subject5.isReadOnly();
        java.util.Set<java.lang.Object> objSet9 = subject5.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet10 = subject5.getPublicCredentials();
        subject5.setReadOnly();
        java.util.Set<java.lang.Object> objSet12 = subject5.getPublicCredentials();
        boolean boolean13 = subject0.equals((java.lang.Object) objSet12);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost15 = new me.prettyprint.cassandra.service.CassandraHost("hi!");
        boolean boolean17 = cassandraHost15.equals((java.lang.Object) (byte) 10);
        java.lang.String str18 = cassandraHost15.getUrl();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient20 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost15, "0.0.0.0(0.0.0.0):101");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient20.equals(null)", !hKerberosThriftClient20.equals(null));
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0187");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPublicCredentials();
        java.lang.String str3 = subject0.toString();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):9160", 1);
        boolean boolean8 = cassandraHost7.getUseThriftFramedTransport();
        boolean boolean9 = cassandraHost7.getUseSocketKeepalive();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient11 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost7, "100");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient11.equals(null)", !hKerberosThriftClient11.equals(null));
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0188");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:100", strArray12, false);
        boolean boolean19 = subject0.equals((java.lang.Object) strArray12);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost21 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>");
        java.lang.String str22 = cassandraHost21.getIp();
        java.lang.String str23 = cassandraHost21.getName();
        java.lang.String[] strArray30 = new java.lang.String[] { "(127.0.0.1):9160", "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1", strArray30, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1(127.0.0.1):10", strArray30);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient34 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost21, "CassandraClient<%s-%d>(CassandraClient<%s-%d>)", tSSLTransportParameters33);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient34.equals(null)", !hKerberosThriftClient34.equals(null));
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0189");
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
        javax.security.auth.Subject subject31 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet32 = subject31.getPublicCredentials();
        subject31.setReadOnly();
        java.lang.String str34 = subject31.toString();
        java.lang.String str35 = subject31.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost37 = new me.prettyprint.cassandra.service.CassandraHost("");
        boolean boolean39 = cassandraHost37.equals((java.lang.Object) 0.0f);
        java.lang.String str40 = cassandraHost37.getName();
        boolean boolean41 = subject31.equals((java.lang.Object) cassandraHost37);
        java.lang.String str42 = cassandraHost37.toString();
        int int43 = cassandraHost37.getPort();
        int int44 = cassandraHost37.getPort();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient46 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost37, "301");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient46.equals(null)", !hKerberosThriftClient46.equals(null));
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0190");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient7 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost5, "127.0.0.1(127.0.0.1):102");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient7.equals(null)", !hKerberosThriftClient7.equals(null));
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0191");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        java.util.Set<java.security.Principal> principalSet4 = subject0.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):9260");
        cassandraHost6.setUseThriftFramedTransport(true);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient10 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost6, "CassandraClient<%s-%d>");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient10.equals(null)", !hKerberosThriftClient10.equals(null));
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0192");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        subject0.setReadOnly();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.lang.String str3 = subject0.toString();
        subject0.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("hi!", 0);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient9 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost7, "CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):10");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient9.equals(null)", !hKerberosThriftClient9.equals(null));
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0193");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.util.Set<java.security.Principal> principalSet3 = subject0.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = new me.prettyprint.cassandra.service.CassandraHost("");
        boolean boolean7 = cassandraHost5.equals((java.lang.Object) 0.0f);
        int int8 = cassandraHost5.getCassandraThriftSocketTimeout();
        java.lang.String str9 = cassandraHost5.getName();
        boolean boolean10 = cassandraHost5.getUseThriftFramedTransport();
        java.lang.String str11 = cassandraHost5.toString();
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray21, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray21);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray21);
        tSSLTransportParameters25.setKeyStore("-1", "127.0.0.1");
        tSSLTransportParameters25.requireClientAuth(false);
        tSSLTransportParameters25.requireClientAuth(false);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient33 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost5, "hi!:100", tSSLTransportParameters25);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient33.equals(null)", !hKerberosThriftClient33.equals(null));
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0194");
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
        java.lang.String str31 = subject0.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost33 = new me.prettyprint.cassandra.service.CassandraHost("");
        cassandraHost33.setMaxWaitTimeWhenExhausted((long) (short) 10);
        java.lang.String str36 = cassandraHost33.toString();
        cassandraHost33.setMaxWaitTimeWhenExhausted((long) (short) 1);
        boolean boolean39 = cassandraHost33.getLifo();
        java.lang.String[] strArray46 = new java.lang.String[] { "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters47 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray46);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters48 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray46);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters49 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1(127.0.0.1):10", strArray46);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters50 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray46);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient51 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost33, "-1", tSSLTransportParameters50);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient51.equals(null)", !hKerberosThriftClient51.equals(null));
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0195");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        boolean boolean3 = subject0.isReadOnly();
        java.lang.String[] strArray12 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray12);
        boolean boolean15 = subject0.equals((java.lang.Object) tSSLTransportParameters14);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost17 = new me.prettyprint.cassandra.service.CassandraHost("");
        int int18 = cassandraHost17.getMaxActive();
        cassandraHost17.setUseThriftFramedTransport(true);
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray30, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray30, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>:9160", strArray30);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient36 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost17, "214", tSSLTransportParameters35);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient36.equals(null)", !hKerberosThriftClient36.equals(null));
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0196");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPrivateCredentials();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 10);
        float float6 = atomicLong5.floatValue();
        long long7 = atomicLong5.incrementAndGet();
        double double8 = atomicLong5.doubleValue();
        boolean boolean9 = subject0.equals((java.lang.Object) double8);
        boolean boolean10 = subject0.isReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost12 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost15 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1", 9160);
        java.util.concurrent.atomic.AtomicLong atomicLong17 = new java.util.concurrent.atomic.AtomicLong((long) '#');
        boolean boolean18 = cassandraHost15.equals((java.lang.Object) '#');
        java.lang.String str19 = cassandraHost15.getHost();
        boolean boolean20 = cassandraHost12.equals((java.lang.Object) cassandraHost15);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient22 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost12, "102");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient22.equals(null)", !hKerberosThriftClient22.equals(null));
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0197");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet5 = subject0.getPrincipals();
        subject0.setReadOnly();
        java.util.Set<java.security.Principal> principalSet7 = subject0.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost10 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):0", 0);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient12 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost10, "11");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient12.equals(null)", !hKerberosThriftClient12.equals(null));
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0198");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        subject0.setReadOnly();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) 1);
        boolean boolean6 = cassandraHost5.getUseThriftFramedTransport();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient8 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost5, "hi!(hi!)");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient8.equals(null)", !hKerberosThriftClient8.equals(null));
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0199");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        subject0.setReadOnly();
        boolean boolean4 = subject0.isReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (byte) 100);
        java.lang.String str8 = cassandraHost7.getUrl();
        boolean boolean9 = cassandraHost7.isPerformNameResolution();
        java.lang.String[] strArray18 = new java.lang.String[] { "-1", "CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:9160", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("32", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray18, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!(hi!):9160", strArray18);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient26 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost7, "hi!", tSSLTransportParameters25);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient26.equals(null)", !hKerberosThriftClient26.equals(null));
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0200");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPrivateCredentials();
        java.lang.String str4 = subject0.toString();
        java.util.Set<java.security.Principal> principalSet5 = subject0.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("");
        boolean boolean9 = cassandraHost7.equals((java.lang.Object) 0.0f);
        int int10 = cassandraHost7.getCassandraThriftSocketTimeout();
        java.lang.String str11 = cassandraHost7.getName();
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray22, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray22);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray22);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:9160", strArray22);
        tSSLTransportParameters27.setTrustStore("hi!:100", "hi!:100");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient31 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost7, "101", tSSLTransportParameters27);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient31.equals(null)", !hKerberosThriftClient31.equals(null));
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0201");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:100", strArray12, false);
        boolean boolean19 = subject0.equals((java.lang.Object) strArray12);
        java.util.Set<java.lang.Object> objSet20 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost22 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost25 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1", 9160);
        java.util.concurrent.atomic.AtomicLong atomicLong27 = new java.util.concurrent.atomic.AtomicLong((long) '#');
        boolean boolean28 = cassandraHost25.equals((java.lang.Object) '#');
        java.lang.String str29 = cassandraHost25.getHost();
        boolean boolean30 = cassandraHost22.equals((java.lang.Object) cassandraHost25);
        cassandraHost25.setLifo(false);
        boolean boolean33 = cassandraHost25.isPerformNameResolution();
        java.lang.String[] strArray42 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters43 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray42);
        tSSLTransportParameters43.setKeyStore("CassandraClient<%s-%d>", "Subject:\n", "CassandraClient<%s-%d>", "Subject:\n");
        tSSLTransportParameters43.setKeyStore("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1", "hi!:9160", "-1", "");
        tSSLTransportParameters43.setTrustStore("(127.0.0.1)", "(127.0.0.1)((127.0.0.1)):9260", "Subject:35", "(127.0.0.1)((127.0.0.1)):35");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient59 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost25, "-2", tSSLTransportParameters43);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient59.equals(null)", !hKerberosThriftClient59.equals(null));
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0202");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.lang.String str1 = subject0.toString();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = new me.prettyprint.cassandra.service.CassandraHost("", 0);
        java.lang.String str6 = cassandraHost5.getHost();
        boolean boolean7 = cassandraHost5.getUseSocketKeepalive();
        java.lang.String str8 = cassandraHost5.getName();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient10 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost5, "(127.0.0.1):100");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient10.equals(null)", !hKerberosThriftClient10.equals(null));
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0203");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        boolean boolean4 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet5 = subject0.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):100", 9260);
        java.lang.String str9 = cassandraHost8.toString();
        java.lang.String[] strArray24 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray24);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray24);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray24, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray24, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray24, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray24, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray24);
        tSSLTransportParameters35.setTrustStore("CassandraClient<%s-%d>", "127.0.0.1(127.0.0.1):10");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient39 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost8, "", tSSLTransportParameters35);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient39.equals(null)", !hKerberosThriftClient39.equals(null));
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0204");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 100);
        cassandraHost6.setMaxWaitTimeWhenExhausted(0L);
        int int9 = cassandraHost6.getPort();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient11 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost6, "CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>))");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient11.equals(null)", !hKerberosThriftClient11.equals(null));
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0205");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet4 = subject0.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("-1", (int) (byte) 0);
        java.lang.String str8 = cassandraHost7.getUrl();
        cassandraHost7.setMaxActive((int) (short) 50);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray21, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray21);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray21);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray21, false);
        tSSLTransportParameters27.setTrustStore("32", "CassandraClient<%s-%d>");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient31 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost7, "101", tSSLTransportParameters27);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient31.equals(null)", !hKerberosThriftClient31.equals(null));
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0206");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPrivateCredentials();
        boolean boolean4 = subject0.isReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) (short) 1);
        cassandraHost7.setCassandraThriftSocketTimeout((int) (short) 1);
        java.lang.String str10 = cassandraHost7.getIp();
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters();
        tSSLTransportParameters12.setKeyStore("hi!", "");
        tSSLTransportParameters12.setKeyStore("CassandraClient<%s-%d>", "CassandraClient<%s-%d>");
        tSSLTransportParameters12.requireClientAuth(true);
        tSSLTransportParameters12.setKeyStore("CassandraClient<%s-%d>(CassandraClient<%s-%d>)", "Subject:\n", "0.0.0.0", "0");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient26 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost7, "hi!(hi!):9160", tSSLTransportParameters12);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient26.equals(null)", !hKerberosThriftClient26.equals(null));
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0207");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        boolean boolean3 = subject0.isReadOnly();
        java.lang.String[] strArray12 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray12);
        boolean boolean15 = subject0.equals((java.lang.Object) tSSLTransportParameters14);
        java.util.Set<java.lang.Object> objSet16 = subject0.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost19 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (byte) 100);
        cassandraHost19.setMaxActive((int) (byte) 10);
        boolean boolean22 = cassandraHost19.getUseThriftFramedTransport();
        java.util.concurrent.atomic.AtomicLong atomicLong24 = new java.util.concurrent.atomic.AtomicLong((long) (short) 0);
        boolean boolean25 = cassandraHost19.equals((java.lang.Object) (short) 0);
        cassandraHost19.setUseSocketKeepalive(false);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient29 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost19, "10");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient29.equals(null)", !hKerberosThriftClient29.equals(null));
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0208");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        boolean boolean3 = subject0.isReadOnly();
        java.lang.String[] strArray12 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray12);
        boolean boolean15 = subject0.equals((java.lang.Object) tSSLTransportParameters14);
        java.util.Set<java.lang.Object> objSet16 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet17 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet18 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost20 = new me.prettyprint.cassandra.service.CassandraHost("");
        cassandraHost20.setMaxWaitTimeWhenExhausted((long) (short) 10);
        java.lang.String str23 = cassandraHost20.toString();
        cassandraHost20.setMaxWaitTimeWhenExhausted((long) (short) 1);
        cassandraHost20.setLifo(false);
        int int28 = cassandraHost20.getMaxActive();
        boolean boolean29 = cassandraHost20.getLifo();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient31 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost20, "hi!(hi!):9160");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient31.equals(null)", !hKerberosThriftClient31.equals(null));
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0209");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet4 = subject0.getPrincipals();
        boolean boolean5 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet6 = subject0.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 100);
        cassandraHost9.setMaxWaitTimeWhenExhausted(0L);
        java.lang.String str12 = cassandraHost9.getHost();
        cassandraHost9.setMaxActive(100);
        cassandraHost9.setMaxActive(100);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray26, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray26);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray26);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient31 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost9, "CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1", tSSLTransportParameters30);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient31.equals(null)", !hKerberosThriftClient31.equals(null));
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0210");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPrivateCredentials();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 10);
        float float6 = atomicLong5.floatValue();
        long long7 = atomicLong5.incrementAndGet();
        double double8 = atomicLong5.doubleValue();
        boolean boolean9 = subject0.equals((java.lang.Object) double8);
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray20, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:9160", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("100", strArray20, true);
        tSSLTransportParameters27.setTrustStore("", "(127.0.0.1)((127.0.0.1)):9260");
        boolean boolean31 = subject0.equals((java.lang.Object) tSSLTransportParameters27);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost34 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (byte) 100);
        cassandraHost34.setMaxActive((int) (byte) 10);
        java.lang.String[] strArray42 = new java.lang.String[] { "(127.0.0.1):9160", "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters44 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1", strArray42, false);
        tSSLTransportParameters44.setKeyStore("Subject:\n", "(127.0.0.1)((127.0.0.1)):35", "9269", "hi!:100");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient50 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost34, "9269(0.0.36.53):1", tSSLTransportParameters44);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient50.equals(null)", !hKerberosThriftClient50.equals(null));
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0211");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        subject0.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost3 = new me.prettyprint.cassandra.service.CassandraHost("");
        boolean boolean5 = cassandraHost3.equals((java.lang.Object) 0.0f);
        int int6 = cassandraHost3.getPort();
        java.lang.String str7 = cassandraHost3.getName();
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters();
        tSSLTransportParameters9.setKeyStore("hi!", "");
        tSSLTransportParameters9.setKeyStore("CassandraClient<%s-%d>", "CassandraClient<%s-%d>");
        tSSLTransportParameters9.requireClientAuth(true);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient18 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost3, "(127.0.0.1):100", tSSLTransportParameters9);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient18.equals(null)", !hKerberosThriftClient18.equals(null));
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0212");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        subject0.setReadOnly();
        subject0.setReadOnly();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPublicCredentials();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = new java.util.concurrent.atomic.AtomicLong();
        float float5 = atomicLong4.floatValue();
        long long6 = atomicLong4.get();
        long long8 = atomicLong4.getAndSet(0L);
        long long9 = atomicLong4.incrementAndGet();
        atomicLong4.lazySet((long) (short) 102);
        boolean boolean12 = subject0.equals((java.lang.Object) atomicLong4);
        java.lang.String str13 = subject0.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost15 = new me.prettyprint.cassandra.service.CassandraHost("hi!(hi!):9160");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient17 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost15, "CassandraClient<%s-%d>");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient17.equals(null)", !hKerberosThriftClient17.equals(null));
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0213");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = new me.prettyprint.cassandra.service.CassandraHost("");
        boolean boolean6 = cassandraHost4.equals((java.lang.Object) 0.0f);
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray20, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:9160", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray20, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray20);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient30 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost4, "214", tSSLTransportParameters29);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient30.equals(null)", !hKerberosThriftClient30.equals(null));
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0214");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        subject0.setReadOnly();
        boolean boolean4 = subject0.isReadOnly();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray13);
        boolean boolean18 = subject0.equals((java.lang.Object) tSSLTransportParameters17);
        boolean boolean19 = subject0.isReadOnly();
        boolean boolean20 = subject0.isReadOnly();
        subject0.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost23 = new me.prettyprint.cassandra.service.CassandraHost("100");
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient26 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost23, "9269", tSSLTransportParameters25);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient26.equals(null)", !hKerberosThriftClient26.equals(null));
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0215");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        java.lang.String str3 = subject0.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = new me.prettyprint.cassandra.service.CassandraHost("hi!");
        boolean boolean7 = cassandraHost5.equals((java.lang.Object) (byte) 10);
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray23, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray23);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray23);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray23);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:9160", strArray23);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray23, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray23);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray23);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:100", strArray23, false);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient36 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost5, "0.0.0.100", tSSLTransportParameters35);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient36.equals(null)", !hKerberosThriftClient36.equals(null));
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0216");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        java.lang.String str4 = subject0.toString();
        java.lang.String str5 = subject0.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("hi!:9160");
        cassandraHost7.setLifo(true);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient11 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost7, "CassandraClient<%s-%d>(CassandraClient<%s-%d>):52");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient11.equals(null)", !hKerberosThriftClient11.equals(null));
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0217");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        boolean boolean4 = subject0.isReadOnly();
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters5 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters();
        tSSLTransportParameters5.setKeyStore("hi!", "");
        tSSLTransportParameters5.setKeyStore("CassandraClient<%s-%d>", "CassandraClient<%s-%d>");
        tSSLTransportParameters5.setTrustStore("Subject:\n", "hi!:100", "", "CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1");
        boolean boolean17 = subject0.equals((java.lang.Object) "CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost20 = new me.prettyprint.cassandra.service.CassandraHost("Subject:\n", (int) (short) 102);
        java.lang.String[] strArray35 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray35);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray35);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters39 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray35, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters41 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray35, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters43 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray35, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters44 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray35);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters46 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):0", strArray35, false);
        tSSLTransportParameters46.setKeyStore("(127.0.0.1):100", "hi!:9160", "127.0.0.1(127.0.0.1):102", "");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient52 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost20, ":9160", tSSLTransportParameters46);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient52.equals(null)", !hKerberosThriftClient52.equals(null));
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0218");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet5 = subject0.getPrincipals();
        subject0.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = new me.prettyprint.cassandra.service.CassandraHost("100");
        cassandraHost8.setCassandraThriftSocketTimeout((int) (byte) 53);
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray25, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray25);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray25);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray25);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:9160", strArray25);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray25, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray25);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):100", strArray25);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient36 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost8, "CassandraClient<%s-%d>", tSSLTransportParameters35);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient36.equals(null)", !hKerberosThriftClient36.equals(null));
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0219");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        subject0.setReadOnly();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("-1", 101);
        java.lang.String str7 = cassandraHost6.getUrl();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient9 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost6, "127.0.0.1(127.0.0.1)");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient9.equals(null)", !hKerberosThriftClient9.equals(null));
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0220");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.util.Set<java.security.Principal> principalSet3 = subject0.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("", 101);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient8 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost6, "hi!(hi!):100");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient8.equals(null)", !hKerberosThriftClient8.equals(null));
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0221");
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
        java.lang.String str31 = subject0.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost34 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 100);
        int int35 = cassandraHost34.getMaxActive();
        boolean boolean36 = cassandraHost34.isPerformNameResolution();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient38 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost34, "CassandraClient<%s-%d>(CassandraClient<%s-%d>)");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient38.equals(null)", !hKerberosThriftClient38.equals(null));
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0222");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        subject0.setReadOnly();
        subject0.setReadOnly();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.util.Set<java.lang.Object> objSet5 = subject0.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1", 10);
        int int9 = cassandraHost8.getCassandraThriftSocketTimeout();
        java.lang.String[] strArray24 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray24);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray24);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray24, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray24, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray24, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray24);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):0", strArray24, false);
        tSSLTransportParameters35.setTrustStore("hi!:100", "", "(127.0.0.1)((127.0.0.1)):9260", "(127.0.0.1)");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient41 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost8, "CassandraClient<%s-%d>:9160", tSSLTransportParameters35);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient41.equals(null)", !hKerberosThriftClient41.equals(null));
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0223");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.lang.String str1 = subject0.toString();
        subject0.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = new me.prettyprint.cassandra.service.CassandraHost("");
        int int5 = cassandraHost4.getMaxActive();
        cassandraHost4.setUseThriftFramedTransport(true);
        cassandraHost4.setMaxWaitTimeWhenExhausted(101L);
        cassandraHost4.setUseSocketKeepalive(false);
        java.lang.String str12 = cassandraHost4.getUrl();
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray21, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray21);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient25 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost4, "(127.0.0.1):9160", tSSLTransportParameters24);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient25.equals(null)", !hKerberosThriftClient25.equals(null));
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0224");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        subject0.setReadOnly();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.lang.String str3 = subject0.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) (byte) 10);
        int int7 = cassandraHost6.getPort();
        java.lang.String[] strArray14 = new java.lang.String[] { "-1", "CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:9160", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):0", strArray14, false);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient19 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost6, "301", tSSLTransportParameters18);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient19.equals(null)", !hKerberosThriftClient19.equals(null));
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0225");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        subject0.setReadOnly();
        boolean boolean4 = subject0.isReadOnly();
        java.lang.String str5 = subject0.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = new me.prettyprint.cassandra.service.CassandraHost("", 0);
        boolean boolean9 = cassandraHost8.getUseSocketKeepalive();
        cassandraHost8.setCassandraThriftSocketTimeout(35);
        java.lang.String str12 = cassandraHost8.toString();
        java.lang.String str13 = cassandraHost8.getIp();
        java.lang.String[] strArray27 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray27);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray27);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray27, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray27, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray27, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray27, true);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient38 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost8, "0.0.0.100", tSSLTransportParameters37);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient38.equals(null)", !hKerberosThriftClient38.equals(null));
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0226");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        subject0.setReadOnly();
        boolean boolean4 = subject0.isReadOnly();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray13);
        boolean boolean18 = subject0.equals((java.lang.Object) tSSLTransportParameters17);
        boolean boolean19 = subject0.isReadOnly();
        boolean boolean20 = subject0.isReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost22 = new me.prettyprint.cassandra.service.CassandraHost("32");
        java.lang.String[] strArray29 = new java.lang.String[] { "-1", "CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:9160", strArray29);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1", strArray29);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0", strArray29);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient33 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost22, "102", tSSLTransportParameters32);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient33.equals(null)", !hKerberosThriftClient33.equals(null));
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0227");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        subject0.setReadOnly();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.lang.String str3 = subject0.toString();
        subject0.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("");
        boolean boolean8 = cassandraHost6.equals((java.lang.Object) 0.0f);
        int int9 = cassandraHost6.getPort();
        java.lang.String str10 = cassandraHost6.getName();
        java.lang.String str11 = cassandraHost6.getHost();
        boolean boolean12 = cassandraHost6.getUseThriftFramedTransport();
        boolean boolean13 = cassandraHost6.getLifo();
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray26, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray26);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray26);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:100", strArray26, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray26);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:9160", strArray26);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient35 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost6, "0.0.0.0(0.0.0.0)", tSSLTransportParameters34);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient35.equals(null)", !hKerberosThriftClient35.equals(null));
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0228");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        boolean boolean3 = subject0.isReadOnly();
        java.lang.String[] strArray12 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray12);
        boolean boolean15 = subject0.equals((java.lang.Object) tSSLTransportParameters14);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost17 = new me.prettyprint.cassandra.service.CassandraHost("");
        boolean boolean19 = cassandraHost17.equals((java.lang.Object) 0.0f);
        int int20 = cassandraHost17.getPort();
        java.lang.String str21 = cassandraHost17.getName();
        boolean boolean22 = cassandraHost17.getUseSocketKeepalive();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient24 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost17, ":9160");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient24.equals(null)", !hKerberosThriftClient24.equals(null));
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0229");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        boolean boolean3 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet5 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = new me.prettyprint.cassandra.service.CassandraHost("");
        boolean boolean10 = cassandraHost8.equals((java.lang.Object) 0.0f);
        int int11 = cassandraHost8.getCassandraThriftSocketTimeout();
        cassandraHost8.setMaxActive((int) '4');
        java.lang.String str14 = cassandraHost8.toString();
        java.lang.String str15 = cassandraHost8.getHost();
        cassandraHost8.setUseSocketKeepalive(false);
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray27, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray27);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray27, true);
        tSSLTransportParameters32.setKeyStore("hi!", "", "-1", "");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient38 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost8, "100:0", tSSLTransportParameters32);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient38.equals(null)", !hKerberosThriftClient38.equals(null));
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0230");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:100", strArray12, false);
        boolean boolean19 = subject0.equals((java.lang.Object) strArray12);
        java.util.Set<java.security.Principal> principalSet20 = subject0.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost22 = new me.prettyprint.cassandra.service.CassandraHost("");
        cassandraHost22.setMaxWaitTimeWhenExhausted((long) (short) 10);
        java.lang.String str25 = cassandraHost22.toString();
        cassandraHost22.setMaxWaitTimeWhenExhausted((long) (short) 1);
        cassandraHost22.setLifo(false);
        boolean boolean30 = cassandraHost22.getUseSocketKeepalive();
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters45 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray43, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters46 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray43);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters47 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray43);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters49 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:100", strArray43, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters51 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray43, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters53 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray43, true);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient54 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost22, "(127.0.0.1):0", tSSLTransportParameters53);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient54.equals(null)", !hKerberosThriftClient54.equals(null));
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0231");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        subject0.setReadOnly();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.lang.String str3 = subject0.toString();
        java.util.Set<java.security.Principal> principalSet4 = subject0.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):-1", (-1));
        java.lang.String[] strArray21 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray21);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray21);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("10", strArray21, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("100", strArray21);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):35", strArray21, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):0", strArray21, true);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient31 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost7, "hi!:100", tSSLTransportParameters30);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient31.equals(null)", !hKerberosThriftClient31.equals(null));
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0232");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        subject0.setReadOnly();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        boolean boolean3 = subject0.isReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1", (int) ' ');
        int int7 = cassandraHost6.getMaxActive();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient9 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost6, "");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient9.equals(null)", !hKerberosThriftClient9.equals(null));
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0233");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = new java.util.concurrent.atomic.AtomicLong((long) 1);
        boolean boolean8 = atomicLong5.compareAndSet((long) 50, (-1L));
        boolean boolean9 = subject0.equals((java.lang.Object) 50);
        java.util.Set<java.lang.Object> objSet10 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost13 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):1", 98);
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray27, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray27);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray27);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:100", strArray27, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray27, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray27, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters39 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:35", strArray27, true);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient40 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost13, "0.0.0.0(0.0.0.0):101", tSSLTransportParameters39);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient40.equals(null)", !hKerberosThriftClient40.equals(null));
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0234");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet4 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet5 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("");
        boolean boolean9 = cassandraHost7.equals((java.lang.Object) 0.0f);
        cassandraHost7.setUseSocketKeepalive(false);
        cassandraHost7.setLifo(true);
        java.lang.String str14 = cassandraHost7.getName();
        java.lang.String[] strArray23 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray23);
        tSSLTransportParameters24.setKeyStore("CassandraClient<%s-%d>", "Subject:\n", "CassandraClient<%s-%d>", "Subject:\n");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient30 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost7, "hi!(hi!):100", tSSLTransportParameters24);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient30.equals(null)", !hKerberosThriftClient30.equals(null));
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0235");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:100", strArray12, false);
        boolean boolean19 = subject0.equals((java.lang.Object) strArray12);
        boolean boolean20 = subject0.isReadOnly();
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray30, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray30);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray30);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray30);
        boolean boolean36 = subject0.equals((java.lang.Object) strArray30);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost39 = new me.prettyprint.cassandra.service.CassandraHost(":0", (-1));
        long long40 = cassandraHost39.getMaxWaitTimeWhenExhausted();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient42 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost39, "");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient42.equals(null)", !hKerberosThriftClient42.equals(null));
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0236");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        boolean boolean3 = subject0.isReadOnly();
        java.lang.String[] strArray12 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray12);
        boolean boolean15 = subject0.equals((java.lang.Object) tSSLTransportParameters14);
        java.util.Set<java.lang.Object> objSet16 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet17 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost20 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1", (-1));
        java.lang.String str21 = cassandraHost20.getIp();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient23 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost20, "");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient23.equals(null)", !hKerberosThriftClient23.equals(null));
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0237");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        boolean boolean4 = subject0.isReadOnly();
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters5 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters();
        tSSLTransportParameters5.setKeyStore("hi!", "");
        tSSLTransportParameters5.setKeyStore("CassandraClient<%s-%d>", "CassandraClient<%s-%d>");
        tSSLTransportParameters5.setTrustStore("Subject:\n", "hi!:100", "", "CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1");
        boolean boolean17 = subject0.equals((java.lang.Object) "CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost19 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1))");
        java.lang.String[] strArray28 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray28);
        tSSLTransportParameters29.setTrustStore("hi!:9160", "CassandraClient<%s-%d>");
        tSSLTransportParameters29.setTrustStore("CassandraClient<%s-%d>(CassandraClient<%s-%d>):1", "CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>))");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient36 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost19, "127.0.0.1(127.0.0.1)", tSSLTransportParameters29);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient36.equals(null)", !hKerberosThriftClient36.equals(null));
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0238");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet4 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet5 = subject0.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>");
        java.lang.String str8 = cassandraHost7.getIp();
        java.lang.String str9 = cassandraHost7.getHost();
        int int10 = cassandraHost7.getPort();
        long long11 = cassandraHost7.getMaxWaitTimeWhenExhausted();
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters();
        tSSLTransportParameters13.setKeyStore("hi!", "");
        tSSLTransportParameters13.setKeyStore("CassandraClient<%s-%d>", "CassandraClient<%s-%d>");
        tSSLTransportParameters13.requireClientAuth(true);
        tSSLTransportParameters13.setTrustStore("hi!", "(127.0.0.1):9160");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient25 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost7, "9269:9160", tSSLTransportParameters13);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient25.equals(null)", !hKerberosThriftClient25.equals(null));
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0239");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        boolean boolean4 = subject0.isReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("", 0);
        java.lang.String str8 = cassandraHost7.getHost();
        boolean boolean9 = cassandraHost7.getUseSocketKeepalive();
        java.lang.String str10 = cassandraHost7.getName();
        cassandraHost7.setLifo(true);
        javax.security.auth.Subject subject14 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet15 = subject14.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet16 = subject14.getPrincipals();
        java.util.Set<java.lang.Object> objSet17 = subject14.getPrivateCredentials();
        java.util.concurrent.atomic.AtomicLong atomicLong19 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 10);
        float float20 = atomicLong19.floatValue();
        long long21 = atomicLong19.incrementAndGet();
        double double22 = atomicLong19.doubleValue();
        boolean boolean23 = subject14.equals((java.lang.Object) double22);
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray34, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray34);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters38 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray34);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters39 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:9160", strArray34);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters41 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("100", strArray34, true);
        tSSLTransportParameters41.setTrustStore("", "(127.0.0.1)((127.0.0.1)):9260");
        boolean boolean45 = subject14.equals((java.lang.Object) tSSLTransportParameters41);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient46 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost7, "1", tSSLTransportParameters41);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient46.equals(null)", !hKerberosThriftClient46.equals(null));
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0240");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        subject0.setReadOnly();
        boolean boolean4 = subject0.isReadOnly();
        java.lang.String str5 = subject0.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = new me.prettyprint.cassandra.service.CassandraHost(":9160", (int) (short) 11);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient10 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost8, "hi!(hi!):100");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient10.equals(null)", !hKerberosThriftClient10.equals(null));
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0241");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        boolean boolean3 = subject0.isReadOnly();
        java.lang.String[] strArray12 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray12);
        boolean boolean15 = subject0.equals((java.lang.Object) tSSLTransportParameters14);
        java.util.Set<java.lang.Object> objSet16 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet17 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet18 = subject0.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost20 = new me.prettyprint.cassandra.service.CassandraHost("hi!");
        cassandraHost20.setMaxActive((int) (short) 0);
        int int23 = cassandraHost20.getCassandraThriftSocketTimeout();
        cassandraHost20.setCassandraThriftSocketTimeout(100);
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters39 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray37, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters40 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray37);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters41 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray37);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters43 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray37, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters45 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray37, false);
        tSSLTransportParameters45.setTrustStore("", "127.0.0.1", "(127.0.0.1):9160", "0");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient51 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost20, "0.0.0.100", tSSLTransportParameters45);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient51.equals(null)", !hKerberosThriftClient51.equals(null));
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0242");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        subject0.setReadOnly();
        boolean boolean4 = subject0.isReadOnly();
        java.lang.String str5 = subject0.toString();
        subject0.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1", (-1));
        java.lang.String str10 = cassandraHost9.getUrl();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient12 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost9, "");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient12.equals(null)", !hKerberosThriftClient12.equals(null));
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0243");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = new me.prettyprint.cassandra.service.CassandraHost("", 0);
        java.lang.String str6 = cassandraHost5.getHost();
        boolean boolean7 = cassandraHost5.getUseSocketKeepalive();
        java.lang.String str8 = cassandraHost5.getName();
        cassandraHost5.setLifo(true);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray21, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray21, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:100", strArray21, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("101", strArray21, false);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient30 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost5, ":9160", tSSLTransportParameters29);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient30.equals(null)", !hKerberosThriftClient30.equals(null));
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0244");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        subject0.setReadOnly();
        boolean boolean4 = subject0.isReadOnly();
        java.util.Set<java.security.Principal> principalSet5 = subject0.getPrincipals();
        boolean boolean6 = subject0.isReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = new me.prettyprint.cassandra.service.CassandraHost("hi!:9160");
        cassandraHost8.setUseSocketKeepalive(false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters();
        tSSLTransportParameters12.setKeyStore("hi!", "");
        tSSLTransportParameters12.setTrustStore("", "hi!");
        tSSLTransportParameters12.setTrustStore("", "CassandraClient<%s-%d>", "", "");
        tSSLTransportParameters12.setKeyStore("Subject:\n", "-1");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient27 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost8, "CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):10", tSSLTransportParameters12);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient27.equals(null)", !hKerberosThriftClient27.equals(null));
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0245");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        java.lang.String str3 = subject0.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = new me.prettyprint.cassandra.service.CassandraHost("0.0.0.0(0.0.0.0):101");
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray20, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:100", strArray20, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray20, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray20, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:35", strArray20, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:9160", strArray20);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient34 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost5, "Subject(Subject):9160", tSSLTransportParameters33);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient34.equals(null)", !hKerberosThriftClient34.equals(null));
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0246");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        boolean boolean1 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1(127.0.0.1):102");
        int int5 = cassandraHost4.getPort();
        java.lang.String[] strArray18 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18, true);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient25 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost4, "Subject:\n", tSSLTransportParameters24);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient25.equals(null)", !hKerberosThriftClient25.equals(null));
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0247");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        boolean boolean1 = subject0.isReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):-1", (-1));
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient6 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost4, "301");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient6.equals(null)", !hKerberosThriftClient6.equals(null));
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0248");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet4 = subject0.getPrincipals();
        javax.security.auth.Subject subject5 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet6 = subject5.getPublicCredentials();
        boolean boolean7 = subject0.equals((java.lang.Object) objSet6);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = new me.prettyprint.cassandra.service.CassandraHost("hi!:9160");
        cassandraHost9.setUseSocketKeepalive(false);
        int int12 = cassandraHost9.getPort();
        java.lang.String str13 = cassandraHost9.toString();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient15 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost9, "0");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient15.equals(null)", !hKerberosThriftClient15.equals(null));
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0249");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        boolean boolean4 = subject0.isReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("");
        int int7 = cassandraHost6.getMaxActive();
        cassandraHost6.setUseThriftFramedTransport(true);
        java.lang.String str10 = cassandraHost6.toString();
        cassandraHost6.setMaxActive((int) (short) 9);
        java.lang.String[] strArray27 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray27);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray27);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray27, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray27, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray27, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray27, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters38 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray27);
        tSSLTransportParameters38.setTrustStore("100:0", "127.0.0.1(127.0.0.1):102");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient42 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost6, "127.0.0.1", tSSLTransportParameters38);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient42.equals(null)", !hKerberosThriftClient42.equals(null));
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0250");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        subject0.setReadOnly();
        subject0.setReadOnly();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPublicCredentials();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = new java.util.concurrent.atomic.AtomicLong();
        float float5 = atomicLong4.floatValue();
        long long6 = atomicLong4.get();
        long long8 = atomicLong4.getAndSet(0L);
        long long9 = atomicLong4.incrementAndGet();
        atomicLong4.lazySet((long) (short) 102);
        boolean boolean12 = subject0.equals((java.lang.Object) atomicLong4);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost14 = new me.prettyprint.cassandra.service.CassandraHost("");
        cassandraHost14.setMaxWaitTimeWhenExhausted((long) (short) 10);
        java.lang.String str17 = cassandraHost14.toString();
        cassandraHost14.setMaxActive(9160);
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray32, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray32);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray32);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray32);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters38 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:9160", strArray32);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters39 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray32);
        tSSLTransportParameters39.setKeyStore("hi!:100", "(127.0.0.1):100");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient43 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost14, "127.0.0.1", tSSLTransportParameters39);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient43.equals(null)", !hKerberosThriftClient43.equals(null));
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0251");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        subject0.setReadOnly();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.lang.String str3 = subject0.toString();
        java.util.Set<java.security.Principal> principalSet4 = subject0.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):10", 100);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient9 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost7, "CassandraClient<%s-%d>:9160");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient9.equals(null)", !hKerberosThriftClient9.equals(null));
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0252");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPublicCredentials();
        java.lang.String str3 = subject0.toString();
        boolean boolean4 = subject0.isReadOnly();
        subject0.setReadOnly();
        java.util.Set<java.lang.Object> objSet6 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = new me.prettyprint.cassandra.service.CassandraHost("");
        boolean boolean10 = cassandraHost8.equals((java.lang.Object) 0.0f);
        int int11 = cassandraHost8.getPort();
        java.lang.String str12 = cassandraHost8.getName();
        java.lang.String str13 = cassandraHost8.toString();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient15 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost8, "CassandraClient<%s-%d>(CassandraClient<%s-%d>):1");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient15.equals(null)", !hKerberosThriftClient15.equals(null));
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0253");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        boolean boolean3 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet5 = subject0.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("Subject");
        java.lang.String str8 = cassandraHost7.toString();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient10 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost7, "1");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient10.equals(null)", !hKerberosThriftClient10.equals(null));
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0254");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet3 = subject0.getPrincipals();
        java.util.Set<java.security.Principal> principalSet4 = subject0.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("hi!:100", 102);
        boolean boolean8 = cassandraHost7.isPerformNameResolution();
        int int9 = cassandraHost7.getMaxActive();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient11 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost7, "8");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient11.equals(null)", !hKerberosThriftClient11.equals(null));
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0255");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.lang.String str1 = subject0.toString();
        subject0.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):100", (int) (byte) 100);
        boolean boolean6 = cassandraHost5.isPerformNameResolution();
        cassandraHost5.setMaxWaitTimeWhenExhausted((long) (short) 11);
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray23, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray23);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray23);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:100", strArray23, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray23, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray23, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:35", strArray23, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:9160", strArray23);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient37 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost5, ":9160", tSSLTransportParameters36);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient37.equals(null)", !hKerberosThriftClient37.equals(null));
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0256");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        subject0.setReadOnly();
        boolean boolean4 = subject0.isReadOnly();
        java.lang.String str5 = subject0.toString();
        java.util.Set<java.lang.Object> objSet6 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = new me.prettyprint.cassandra.service.CassandraHost("", 0);
        cassandraHost9.setMaxWaitTimeWhenExhausted((long) '4');
        java.lang.String str12 = cassandraHost9.getHost();
        java.lang.String str13 = cassandraHost9.getName();
        java.lang.String str14 = cassandraHost9.toString();
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray28, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray28);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray28);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray28);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:9160", strArray28);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray28, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray28);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters39 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject", strArray28, false);
        boolean boolean40 = cassandraHost9.equals((java.lang.Object) tSSLTransportParameters39);
        java.lang.String[] strArray53 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters55 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray53, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters56 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray53);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters57 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray53);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters59 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray53, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters61 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray53, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters62 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray53);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient63 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost9, "(127.0.0.1):1", tSSLTransportParameters62);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient63.equals(null)", !hKerberosThriftClient63.equals(null));
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0257");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet5 = subject0.getPrincipals();
        subject0.setReadOnly();
        java.util.Set<java.security.Principal> principalSet7 = subject0.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = new me.prettyprint.cassandra.service.CassandraHost("");
        boolean boolean11 = cassandraHost9.equals((java.lang.Object) 0.0f);
        int int12 = cassandraHost9.getPort();
        java.lang.String str13 = cassandraHost9.getName();
        java.lang.String str14 = cassandraHost9.getHost();
        int int15 = cassandraHost9.getCassandraThriftSocketTimeout();
        boolean boolean16 = cassandraHost9.isPerformNameResolution();
        boolean boolean17 = cassandraHost9.getUseThriftFramedTransport();
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray28, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray28);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray28);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray28, false);
        tSSLTransportParameters34.setTrustStore("32", "CassandraClient<%s-%d>");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient38 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost9, "-1:101", tSSLTransportParameters34);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient38.equals(null)", !hKerberosThriftClient38.equals(null));
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0258");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        subject0.setReadOnly();
        boolean boolean4 = subject0.isReadOnly();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray13);
        boolean boolean18 = subject0.equals((java.lang.Object) tSSLTransportParameters17);
        boolean boolean19 = subject0.isReadOnly();
        boolean boolean20 = subject0.isReadOnly();
        subject0.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost23 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1");
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray33, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray33, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters38 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>:9160", strArray33);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient39 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost23, "Subject(Subject):10", tSSLTransportParameters38);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient39.equals(null)", !hKerberosThriftClient39.equals(null));
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0259");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        subject0.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = new me.prettyprint.cassandra.service.CassandraHost("Subject:\n", (int) (short) 102);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1");
        cassandraHost7.setUseThriftFramedTransport(true);
        boolean boolean10 = cassandraHost5.equals((java.lang.Object) cassandraHost7);
        boolean boolean11 = cassandraHost7.getLifo();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient13 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost7, ":0");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient13.equals(null)", !hKerberosThriftClient13.equals(null));
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0260");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet5 = subject0.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("");
        boolean boolean9 = cassandraHost7.equals((java.lang.Object) 0.0f);
        int int10 = cassandraHost7.getCassandraThriftSocketTimeout();
        cassandraHost7.setMaxActive((int) '4');
        java.lang.String str13 = cassandraHost7.toString();
        java.lang.String str14 = cassandraHost7.getHost();
        boolean boolean15 = cassandraHost7.getUseThriftFramedTransport();
        javax.security.auth.Subject subject17 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet18 = subject17.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet19 = subject17.getPrivateCredentials();
        boolean boolean20 = subject17.isReadOnly();
        java.lang.String[] strArray29 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray29);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray29);
        boolean boolean32 = subject17.equals((java.lang.Object) tSSLTransportParameters31);
        tSSLTransportParameters31.setKeyStore("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1", "(127.0.0.1):100", "Subject:35", "CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>))");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient38 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost7, "127.0.0.1(127.0.0.1):10", tSSLTransportParameters31);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient38.equals(null)", !hKerberosThriftClient38.equals(null));
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0261");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.lang.String str2 = subject0.toString();
        java.lang.String str3 = subject0.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) '4');
        long long7 = cassandraHost6.getMaxWaitTimeWhenExhausted();
        cassandraHost6.setCassandraThriftSocketTimeout(0);
        boolean boolean10 = cassandraHost6.getUseSocketKeepalive();
        java.lang.String str11 = cassandraHost6.toString();
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray28, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray28);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray28);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray28, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray28, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters38 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0", strArray28, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters39 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray28);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters40 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("9269", strArray28);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters42 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject", strArray28, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters44 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("-1:101", strArray28, false);
        tSSLTransportParameters44.setKeyStore("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1", "-1:101");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient48 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost6, "-1:101", tSSLTransportParameters44);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient48.equals(null)", !hKerberosThriftClient48.equals(null));
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0262");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        boolean boolean3 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet5 = subject0.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1(127.0.0.1):102");
        int int8 = cassandraHost7.getMaxActive();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient10 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost7, "(127.0.0.1):100");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient10.equals(null)", !hKerberosThriftClient10.equals(null));
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0263");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        subject0.setReadOnly();
        boolean boolean2 = subject0.isReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = new me.prettyprint.cassandra.service.CassandraHost("");
        boolean boolean6 = cassandraHost4.equals((java.lang.Object) 0.0f);
        int int7 = cassandraHost4.getCassandraThriftSocketTimeout();
        cassandraHost4.setMaxActive((int) '4');
        java.lang.String str10 = cassandraHost4.toString();
        java.lang.String str11 = cassandraHost4.getHost();
        cassandraHost4.setUseSocketKeepalive(false);
        boolean boolean14 = cassandraHost4.getUseSocketKeepalive();
        cassandraHost4.setMaxActive(0);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient18 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost4, "0.0.0.10");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient18.equals(null)", !hKerberosThriftClient18.equals(null));
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0264");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        subject0.setReadOnly();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        boolean boolean3 = subject0.isReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 100);
        cassandraHost6.setMaxWaitTimeWhenExhausted(0L);
        cassandraHost6.setMaxWaitTimeWhenExhausted(1L);
        boolean boolean11 = cassandraHost6.isPerformNameResolution();
        cassandraHost6.setCassandraThriftSocketTimeout((int) (byte) -2);
        long long14 = cassandraHost6.getMaxWaitTimeWhenExhausted();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient16 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost6, "11");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient16.equals(null)", !hKerberosThriftClient16.equals(null));
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0265");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet5 = subject0.getPrincipals();
        subject0.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = new me.prettyprint.cassandra.service.CassandraHost("");
        boolean boolean10 = cassandraHost8.equals((java.lang.Object) 0.0f);
        cassandraHost8.setUseSocketKeepalive(false);
        int int13 = cassandraHost8.getCassandraThriftSocketTimeout();
        boolean boolean14 = cassandraHost8.isPerformNameResolution();
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray25, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray25);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1", strArray25);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("32", strArray25);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient31 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost8, "Subject(Subject):10", tSSLTransportParameters30);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient31.equals(null)", !hKerberosThriftClient31.equals(null));
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0266");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = new me.prettyprint.cassandra.service.CassandraHost("hi!", 100);
        boolean boolean6 = subject0.equals((java.lang.Object) "hi!");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = new me.prettyprint.cassandra.service.CassandraHost("");
        boolean boolean10 = cassandraHost8.equals((java.lang.Object) 0.0f);
        cassandraHost8.setUseSocketKeepalive(false);
        cassandraHost8.setLifo(true);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient16 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost8, "hi!(hi!):9160");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient16.equals(null)", !hKerberosThriftClient16.equals(null));
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0267");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet4 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet5 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet6 = subject0.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = new me.prettyprint.cassandra.service.CassandraHost("Subject:\n", 50);
        java.lang.String[] strArray22 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray22);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray22);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray22);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject", strArray22);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray22, true);
        tSSLTransportParameters28.setTrustStore("Subject:35", "0.0.0.100", "127.0.0.1(127.0.0.1):10", "127.0.0.1");
        tSSLTransportParameters28.setKeyStore("0.0.0.0(0.0.0.0):101", "0.0.0.0", "100", "CassandraClient<%s-%d>:9160");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient39 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost9, "Subject(Subject):50", tSSLTransportParameters28);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient39.equals(null)", !hKerberosThriftClient39.equals(null));
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0268");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        subject0.setReadOnly();
        boolean boolean4 = subject0.isReadOnly();
        java.lang.String str5 = subject0.toString();
        subject0.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1", 9160);
        java.util.concurrent.atomic.AtomicLong atomicLong11 = new java.util.concurrent.atomic.AtomicLong((long) '#');
        boolean boolean12 = cassandraHost9.equals((java.lang.Object) '#');
        java.lang.String str13 = cassandraHost9.getHost();
        cassandraHost9.setMaxActive(98);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient17 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost9, "127.0.0.1(127.0.0.1):1");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient17.equals(null)", !hKerberosThriftClient17.equals(null));
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0269");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        boolean boolean3 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPrivateCredentials();
        java.lang.String[] strArray13 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject(Subject):10", strArray13);
        boolean boolean16 = subject0.equals((java.lang.Object) "Subject(Subject):10");
        java.util.Set<java.security.Principal> principalSet17 = subject0.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost20 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (byte) 100);
        cassandraHost20.setMaxActive((int) (byte) 10);
        boolean boolean23 = cassandraHost20.getUseThriftFramedTransport();
        java.lang.String str24 = cassandraHost20.getUrl();
        cassandraHost20.setUseSocketKeepalive(false);
        boolean boolean27 = cassandraHost20.isPerformNameResolution();
        java.lang.String str28 = cassandraHost20.getIp();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient30 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost20, "CassandraClient<%s-%d>(CassandraClient<%s-%d>):9160");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient30.equals(null)", !hKerberosThriftClient30.equals(null));
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0270");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet3 = subject0.getPrincipals();
        java.util.Set<java.security.Principal> principalSet4 = subject0.getPrincipals();
        java.util.Set<java.security.Principal> principalSet5 = subject0.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = new me.prettyprint.cassandra.service.CassandraHost("Subject", 50);
        cassandraHost8.setLifo(true);
        java.lang.String str11 = cassandraHost8.getIp();
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray24, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray24);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray24);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:9160", strArray24);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("10", strArray24, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray24, false);
        tSSLTransportParameters33.setKeyStore("(127.0.0.1):9160", "32", "", "CassandraClient<%s-%d>(CassandraClient<%s-%d>):9160");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient39 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost8, "0", tSSLTransportParameters33);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient39.equals(null)", !hKerberosThriftClient39.equals(null));
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0271");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong();
        float float2 = atomicLong1.floatValue();
        long long3 = atomicLong1.get();
        int int4 = atomicLong1.intValue();
        boolean boolean7 = atomicLong1.weakCompareAndSet((long) 100, (long) ' ');
        int int8 = atomicLong1.intValue();
        boolean boolean9 = subject0.equals((java.lang.Object) atomicLong1);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost11 = new me.prettyprint.cassandra.service.CassandraHost("");
        cassandraHost11.setMaxWaitTimeWhenExhausted((long) (short) 10);
        java.lang.String str14 = cassandraHost11.toString();
        cassandraHost11.setMaxWaitTimeWhenExhausted((long) (short) 1);
        cassandraHost11.setMaxWaitTimeWhenExhausted((long) (byte) 1);
        cassandraHost11.setCassandraThriftSocketTimeout(50);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient22 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost11, "127.0.0.1");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient22.equals(null)", !hKerberosThriftClient22.equals(null));
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0272");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        boolean boolean3 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet5 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.util.Set<java.lang.Object> objSet7 = subject0.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost10 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):100", 9);
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray28, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray28);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray28);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray28);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:9160", strArray28);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray28, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray28);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters39 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray28, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters40 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("10", strArray28);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters42 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!(hi!)", strArray28, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters43 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0.0.0.0", strArray28);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient44 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost10, "CassandraClient<%s-%d>", tSSLTransportParameters43);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient44.equals(null)", !hKerberosThriftClient44.equals(null));
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0273");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:100", strArray12, false);
        boolean boolean19 = subject0.equals((java.lang.Object) strArray12);
        boolean boolean20 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet21 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet22 = subject0.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost24 = new me.prettyprint.cassandra.service.CassandraHost("");
        cassandraHost24.setMaxWaitTimeWhenExhausted((long) (short) 10);
        java.lang.String str27 = cassandraHost24.toString();
        cassandraHost24.setMaxWaitTimeWhenExhausted((long) (short) 1);
        cassandraHost24.setLifo(false);
        boolean boolean32 = cassandraHost24.getUseSocketKeepalive();
        int int33 = cassandraHost24.getPort();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient35 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost24, "CassandraClient<%s-%d>:9160");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient35.equals(null)", !hKerberosThriftClient35.equals(null));
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0274");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1", (-1));
        javax.security.auth.Subject subject9 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet10 = subject9.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet11 = subject9.getPrincipals();
        java.util.Set<java.security.Principal> principalSet12 = subject9.getPrincipals();
        subject9.setReadOnly();
        java.lang.String[] strArray24 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray24);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray24);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("10", strArray24, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("100", strArray24);
        boolean boolean30 = subject9.equals((java.lang.Object) tSSLTransportParameters29);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient31 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost7, "-2", tSSLTransportParameters29);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient31.equals(null)", !hKerberosThriftClient31.equals(null));
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0275");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.lang.String str1 = subject0.toString();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.lang.String str3 = subject0.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1", (-1));
        java.lang.String str7 = cassandraHost6.getUrl();
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray18, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray18, true);
        tSSLTransportParameters24.requireClientAuth(true);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient27 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost6, "hi!:9160", tSSLTransportParameters24);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient27.equals(null)", !hKerberosThriftClient27.equals(null));
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0276");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPublicCredentials();
        java.lang.String str3 = subject0.toString();
        boolean boolean4 = subject0.isReadOnly();
        subject0.setReadOnly();
        java.util.Set<java.lang.Object> objSet6 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) (short) 1);
        cassandraHost9.setCassandraThriftSocketTimeout((int) (short) 1);
        int int12 = cassandraHost9.getPort();
        java.lang.String str13 = cassandraHost9.getName();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient15 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost9, "(127.0.0.1):9160");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient15.equals(null)", !hKerberosThriftClient15.equals(null));
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0277");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        boolean boolean4 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet5 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet6 = subject0.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = new me.prettyprint.cassandra.service.CassandraHost("hi!:9160");
        cassandraHost8.setLifo(true);
        cassandraHost8.setUseThriftFramedTransport(false);
        cassandraHost8.setMaxWaitTimeWhenExhausted((long) 50);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient16 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost8, "98");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient16.equals(null)", !hKerberosThriftClient16.equals(null));
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0278");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("Subject:\n", (int) (short) 102);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1");
        cassandraHost9.setUseThriftFramedTransport(true);
        boolean boolean12 = cassandraHost7.equals((java.lang.Object) cassandraHost9);
        long long13 = cassandraHost9.getMaxWaitTimeWhenExhausted();
        java.lang.String str14 = cassandraHost9.toString();
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray29, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray29);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray29);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray29, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray29, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters39 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0", strArray29, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters40 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray29);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters41 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("9269", strArray29);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient42 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost9, "CassandraClient<%s-%d>(CassandraClient<%s-%d>):10", tSSLTransportParameters41);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient42.equals(null)", !hKerberosThriftClient42.equals(null));
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0279");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet3 = subject0.getPrincipals();
        java.util.Set<java.security.Principal> principalSet4 = subject0.getPrincipals();
        java.util.Set<java.security.Principal> principalSet5 = subject0.getPrincipals();
        java.util.Set<java.security.Principal> principalSet6 = subject0.getPrincipals();
        java.util.Set<java.security.Principal> principalSet7 = subject0.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost10 = new me.prettyprint.cassandra.service.CassandraHost("Subject:\n", (int) (short) 102);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost12 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1");
        cassandraHost12.setUseThriftFramedTransport(true);
        boolean boolean15 = cassandraHost10.equals((java.lang.Object) cassandraHost12);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient17 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost10, "(127.0.0.1):9160");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient17.equals(null)", !hKerberosThriftClient17.equals(null));
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0280");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong();
        float float2 = atomicLong1.floatValue();
        long long3 = atomicLong1.get();
        int int4 = atomicLong1.intValue();
        boolean boolean7 = atomicLong1.weakCompareAndSet((long) 100, (long) ' ');
        int int8 = atomicLong1.intValue();
        boolean boolean9 = subject0.equals((java.lang.Object) atomicLong1);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost11 = new me.prettyprint.cassandra.service.CassandraHost("hi!");
        boolean boolean13 = cassandraHost11.equals((java.lang.Object) (byte) 10);
        int int14 = cassandraHost11.getCassandraThriftSocketTimeout();
        java.lang.String[] strArray21 = new java.lang.String[] { "-1", "CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:9160", strArray21);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1", strArray21);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("32", strArray21, false);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient26 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost11, "101", tSSLTransportParameters25);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient26.equals(null)", !hKerberosThriftClient26.equals(null));
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0281");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet4 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet5 = subject0.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("hi!");
        cassandraHost7.setMaxActive((int) (short) 0);
        int int10 = cassandraHost7.getPort();
        java.lang.String[] strArray19 = new java.lang.String[] { "-1", "CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:9160", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:9160", strArray19, false);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient26 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost7, "(127.0.0.1):0", tSSLTransportParameters25);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient26.equals(null)", !hKerberosThriftClient26.equals(null));
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0282");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet5 = subject0.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("");
        boolean boolean9 = cassandraHost7.equals((java.lang.Object) 0.0f);
        int int10 = cassandraHost7.getCassandraThriftSocketTimeout();
        java.lang.String str11 = cassandraHost7.getName();
        boolean boolean12 = cassandraHost7.getUseThriftFramedTransport();
        cassandraHost7.setMaxActive(100);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient16 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost7, "(127.0.0.1):100");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient16.equals(null)", !hKerberosThriftClient16.equals(null));
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0283");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        subject0.setReadOnly();
        boolean boolean4 = subject0.isReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) (short) 1);
        int int8 = cassandraHost7.getMaxActive();
        boolean boolean9 = cassandraHost7.getUseThriftFramedTransport();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient11 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost7, "(127.0.0.1)");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient11.equals(null)", !hKerberosThriftClient11.equals(null));
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0284");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        boolean boolean4 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet5 = subject0.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("");
        boolean boolean9 = cassandraHost7.equals((java.lang.Object) 0.0f);
        int int10 = cassandraHost7.getCassandraThriftSocketTimeout();
        java.lang.String str11 = cassandraHost7.getName();
        boolean boolean12 = cassandraHost7.getUseThriftFramedTransport();
        cassandraHost7.setMaxActive(100);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient16 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost7, "Subject(Subject):52");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient16.equals(null)", !hKerberosThriftClient16.equals(null));
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0285");
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
        me.prettyprint.cassandra.service.CassandraHost cassandraHost20 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 100);
        cassandraHost20.setMaxWaitTimeWhenExhausted(0L);
        boolean boolean23 = cassandraHost20.getUseThriftFramedTransport();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient25 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost20, "Subject(Subject):52");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient25.equals(null)", !hKerberosThriftClient25.equals(null));
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0286");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet4 = subject0.getPrincipals();
        javax.security.auth.Subject subject5 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet6 = subject5.getPublicCredentials();
        boolean boolean7 = subject0.equals((java.lang.Object) objSet6);
        java.util.Set<java.security.Principal> principalSet8 = subject0.getPrincipals();
        java.lang.String str9 = subject0.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost12 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) (short) 1);
        boolean boolean13 = cassandraHost12.getLifo();
        java.lang.String[] strArray30 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray30);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray30);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray30, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray30, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters38 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray30, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters40 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray30, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters41 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray30);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters42 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:100", strArray30);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters43 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("-2", strArray30);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient44 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost12, "127.0.0.1(127.0.0.1)", tSSLTransportParameters43);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient44.equals(null)", !hKerberosThriftClient44.equals(null));
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0287");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.lang.String str1 = subject0.toString();
        subject0.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):9160", 1);
        cassandraHost5.setMaxWaitTimeWhenExhausted(0L);
        cassandraHost5.setMaxWaitTimeWhenExhausted((long) (short) -1);
        java.lang.String str10 = cassandraHost5.getUrl();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient12 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost5, "(127.0.0.1)");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient12.equals(null)", !hKerberosThriftClient12.equals(null));
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0288");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet5 = subject0.getPrincipals();
        subject0.setReadOnly();
        java.util.Set<java.security.Principal> principalSet7 = subject0.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost10 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):9160", 1);
        boolean boolean11 = cassandraHost10.isPerformNameResolution();
        cassandraHost10.setCassandraThriftSocketTimeout((int) (short) 100);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient15 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost10, "CassandraClient<%s-%d>(CassandraClient<%s-%d>)");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient15.equals(null)", !hKerberosThriftClient15.equals(null));
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0289");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        java.lang.String str4 = subject0.toString();
        java.lang.String str5 = subject0.toString();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = new java.util.concurrent.atomic.AtomicLong();
        float float7 = atomicLong6.floatValue();
        long long9 = atomicLong6.getAndSet((long) (byte) 100);
        long long10 = atomicLong6.incrementAndGet();
        long long11 = atomicLong6.getAndIncrement();
        long long12 = atomicLong6.incrementAndGet();
        long long14 = atomicLong6.getAndSet((long) ' ');
        java.lang.String str15 = atomicLong6.toString();
        atomicLong6.set((long) (byte) 1);
        atomicLong6.lazySet((long) 50);
        long long20 = atomicLong6.decrementAndGet();
        boolean boolean21 = subject0.equals((java.lang.Object) long20);
        subject0.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost24 = new me.prettyprint.cassandra.service.CassandraHost("");
        boolean boolean26 = cassandraHost24.equals((java.lang.Object) 0.0f);
        int int27 = cassandraHost24.getCassandraThriftSocketTimeout();
        cassandraHost24.setMaxActive((int) '4');
        java.lang.String str30 = cassandraHost24.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost33 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):9160", 1);
        cassandraHost33.setMaxWaitTimeWhenExhausted(0L);
        boolean boolean36 = cassandraHost24.equals((java.lang.Object) 0L);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient38 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost24, ":9160(:9160):11");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient38.equals(null)", !hKerberosThriftClient38.equals(null));
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0290");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPrivateCredentials();
        java.lang.String str4 = subject0.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("", 0);
        cassandraHost7.setMaxWaitTimeWhenExhausted((long) '4');
        java.lang.String str10 = cassandraHost7.getHost();
        java.lang.String str11 = cassandraHost7.getName();
        cassandraHost7.setMaxActive(100);
        cassandraHost7.setLifo(false);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient17 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost7, "100");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient17.equals(null)", !hKerberosThriftClient17.equals(null));
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0291");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        subject0.setReadOnly();
        subject0.setReadOnly();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPublicCredentials();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = new java.util.concurrent.atomic.AtomicLong();
        float float5 = atomicLong4.floatValue();
        long long6 = atomicLong4.get();
        long long8 = atomicLong4.getAndSet(0L);
        long long9 = atomicLong4.incrementAndGet();
        atomicLong4.lazySet((long) (short) 102);
        boolean boolean12 = subject0.equals((java.lang.Object) atomicLong4);
        java.util.Set<java.lang.Object> objSet13 = subject0.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost16 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):9160", 1);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient18 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost16, "-1:0");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient18.equals(null)", !hKerberosThriftClient18.equals(null));
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0292");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet4 = subject0.getPrincipals();
        javax.security.auth.Subject subject5 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet6 = subject5.getPublicCredentials();
        boolean boolean7 = subject0.equals((java.lang.Object) objSet6);
        java.util.Set<java.security.Principal> principalSet8 = subject0.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost11 = new me.prettyprint.cassandra.service.CassandraHost(":0(:0):-1", (int) (short) 50);
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray20, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray20, false);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient25 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost11, "(127.0.0.1):9160", tSSLTransportParameters24);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient25.equals(null)", !hKerberosThriftClient25.equals(null));
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0293");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        boolean boolean3 = subject0.isReadOnly();
        java.lang.String[] strArray12 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray12);
        boolean boolean15 = subject0.equals((java.lang.Object) tSSLTransportParameters14);
        java.util.Set<java.lang.Object> objSet16 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet17 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost19 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>");
        java.lang.String str20 = cassandraHost19.getIp();
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray29, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray29);
        tSSLTransportParameters32.setTrustStore("CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>))", "(127.0.0.1):0", "Subject(Subject):10", "CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):10");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient38 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost19, "0.0.0.0(0.0.0.0)", tSSLTransportParameters32);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient38.equals(null)", !hKerberosThriftClient38.equals(null));
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0294");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPublicCredentials();
        java.lang.String str3 = subject0.toString();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("0.0.0.0", 101);
        java.lang.String str8 = cassandraHost7.toString();
        cassandraHost7.setCassandraThriftSocketTimeout(0);
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray18, true);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient21 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost7, "9269", tSSLTransportParameters20);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient21.equals(null)", !hKerberosThriftClient21.equals(null));
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0295");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet4 = subject0.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):-1", (-1));
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient9 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost7, "hi!(hi!):100");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient9.equals(null)", !hKerberosThriftClient9.equals(null));
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0296");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:100", strArray12, false);
        boolean boolean19 = subject0.equals((java.lang.Object) strArray12);
        java.util.Set<java.security.Principal> principalSet20 = subject0.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost23 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) '4');
        long long24 = cassandraHost23.getMaxWaitTimeWhenExhausted();
        cassandraHost23.setCassandraThriftSocketTimeout((-1));
        cassandraHost23.setMaxWaitTimeWhenExhausted(9269L);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient30 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost23, "CassandraClient<%s-%d>(CassandraClient<%s-%d>):9160");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient30.equals(null)", !hKerberosThriftClient30.equals(null));
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0297");
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
        me.prettyprint.cassandra.service.CassandraHost cassandraHost19 = new me.prettyprint.cassandra.service.CassandraHost("hi!");
        cassandraHost19.setUseSocketKeepalive(false);
        cassandraHost19.setLifo(false);
        boolean boolean24 = subject0.equals((java.lang.Object) cassandraHost19);
        subject0.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost28 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1", 10);
        int int29 = cassandraHost28.getCassandraThriftSocketTimeout();
        cassandraHost28.setLifo(true);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient33 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost28, "100:0");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient33.equals(null)", !hKerberosThriftClient33.equals(null));
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0298");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet4 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet5 = subject0.getPublicCredentials();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 100);
        atomicLong7.set((long) (short) 10);
        boolean boolean10 = subject0.equals((java.lang.Object) (short) 10);
        java.lang.String str11 = subject0.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost14 = new me.prettyprint.cassandra.service.CassandraHost("Subject:35", 98);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray24, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray24, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0.0.0.100", strArray24);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient30 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost14, ":9160(:9160):11", tSSLTransportParameters29);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient30.equals(null)", !hKerberosThriftClient30.equals(null));
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0299");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        boolean boolean3 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet5 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet6 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet7 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost10 = new me.prettyprint.cassandra.service.CassandraHost("Subject(Subject):52", (int) (byte) 10);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray24, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray24);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray24);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray24, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray24, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0", strArray24, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1(127.0.0.1):9160", strArray24, false);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient37 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost10, "101", tSSLTransportParameters36);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient37.equals(null)", !hKerberosThriftClient37.equals(null));
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0300");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        boolean boolean3 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet5 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1", (int) (short) 102);
        boolean boolean10 = subject0.equals((java.lang.Object) "127.0.0.1");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost13 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 100);
        cassandraHost13.setMaxWaitTimeWhenExhausted((long) 10);
        cassandraHost13.setCassandraThriftSocketTimeout((int) (short) 0);
        java.lang.String str18 = cassandraHost13.toString();
        cassandraHost13.setUseSocketKeepalive(false);
        java.lang.String[] strArray30 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray30);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray30, false);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient34 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost13, "(127.0.0.1)", tSSLTransportParameters33);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient34.equals(null)", !hKerberosThriftClient34.equals(null));
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0301");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray10, false);
        boolean boolean15 = subject0.equals((java.lang.Object) "Subject:\n");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost18 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1(127.0.0.1):102", (int) 'a');
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient20 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost18, "1");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient20.equals(null)", !hKerberosThriftClient20.equals(null));
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0302");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        java.lang.String str4 = subject0.toString();
        java.lang.String str5 = subject0.toString();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = new java.util.concurrent.atomic.AtomicLong();
        float float7 = atomicLong6.floatValue();
        long long9 = atomicLong6.getAndSet((long) (byte) 100);
        long long10 = atomicLong6.incrementAndGet();
        long long11 = atomicLong6.getAndIncrement();
        long long12 = atomicLong6.incrementAndGet();
        long long14 = atomicLong6.getAndSet((long) ' ');
        java.lang.String str15 = atomicLong6.toString();
        atomicLong6.set((long) (byte) 1);
        atomicLong6.lazySet((long) 50);
        long long20 = atomicLong6.decrementAndGet();
        boolean boolean21 = subject0.equals((java.lang.Object) long20);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost24 = new me.prettyprint.cassandra.service.CassandraHost("hi!", 0);
        cassandraHost24.setLifo(false);
        boolean boolean27 = cassandraHost24.getLifo();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient29 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost24, "101");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient29.equals(null)", !hKerberosThriftClient29.equals(null));
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0303");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        subject0.setReadOnly();
        boolean boolean4 = subject0.isReadOnly();
        java.lang.String str5 = subject0.toString();
        java.util.Set<java.lang.Object> objSet6 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>:52", (int) (short) 8);
        java.lang.String[] strArray20 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray20, false);
        tSSLTransportParameters24.requireClientAuth(true);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient27 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost9, "127.0.0.1", tSSLTransportParameters24);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient27.equals(null)", !hKerberosThriftClient27.equals(null));
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0304");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        subject0.setReadOnly();
        boolean boolean4 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet5 = subject0.getPublicCredentials();
        boolean boolean7 = subject0.equals((java.lang.Object) (short) 9260);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1");
        boolean boolean10 = cassandraHost9.getLifo();
        java.lang.String str11 = cassandraHost9.getUrl();
        java.lang.String[] strArray16 = new java.lang.String[] { "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray16);
        tSSLTransportParameters18.requireClientAuth(false);
        tSSLTransportParameters18.setKeyStore("(127.0.0.1):1", "CassandraClient<%s-%d>", "", "Subject(Subject):10");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient26 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost9, "CassandraClient<%s-%d>:52", tSSLTransportParameters18);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient26.equals(null)", !hKerberosThriftClient26.equals(null));
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0305");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("-1", (int) (byte) 0);
        java.lang.String str7 = cassandraHost6.getUrl();
        cassandraHost6.setMaxActive((int) (short) 50);
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray23, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray23);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray23);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray23);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:9160", strArray23);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray23, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray23);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient33 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost6, "-1:0", tSSLTransportParameters32);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient33.equals(null)", !hKerberosThriftClient33.equals(null));
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0306");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPrivateCredentials();
        java.lang.String str4 = subject0.toString();
        subject0.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):9260", 10);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient10 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost8, ":0(:0)");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient10.equals(null)", !hKerberosThriftClient10.equals(null));
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0307");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        subject0.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("", 32);
        java.lang.String[] strArray19 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray19, true);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient28 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost6, "hi!(hi!):9160", tSSLTransportParameters27);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient28.equals(null)", !hKerberosThriftClient28.equals(null));
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0308");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        subject0.setReadOnly();
        subject0.setReadOnly();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("hi!");
        cassandraHost6.setUseSocketKeepalive(false);
        cassandraHost6.setLifo(false);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient12 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost6, "-1");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient12.equals(null)", !hKerberosThriftClient12.equals(null));
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0309");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet5 = subject0.getPrincipals();
        subject0.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) '4');
        long long10 = cassandraHost9.getMaxWaitTimeWhenExhausted();
        cassandraHost9.setCassandraThriftSocketTimeout((-1));
        cassandraHost9.setMaxWaitTimeWhenExhausted(9269L);
        boolean boolean15 = cassandraHost9.isPerformNameResolution();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient17 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost9, "98");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient17.equals(null)", !hKerberosThriftClient17.equals(null));
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0310");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet3 = subject0.getPrincipals();
        java.util.Set<java.security.Principal> principalSet4 = subject0.getPrincipals();
        java.util.Set<java.security.Principal> principalSet5 = subject0.getPrincipals();
        java.util.Set<java.security.Principal> principalSet6 = subject0.getPrincipals();
        subject0.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost10 = new me.prettyprint.cassandra.service.CassandraHost("0.0.0.0(0.0.0.0)", 101);
        cassandraHost10.setLifo(false);
        java.lang.String[] strArray27 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray27);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray27);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray27, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray27, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray27, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray27);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters38 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):0", strArray27, false);
        tSSLTransportParameters38.setTrustStore("hi!:100", "", "(127.0.0.1)((127.0.0.1)):9260", "(127.0.0.1)");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient44 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost10, "(127.0.0.1)((127.0.0.1)):35", tSSLTransportParameters38);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient44.equals(null)", !hKerberosThriftClient44.equals(null));
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0311");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        subject0.setReadOnly();
        subject0.setReadOnly();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):100", 9);
        java.lang.String str7 = cassandraHost6.getUrl();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient9 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost6, "CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient9.equals(null)", !hKerberosThriftClient9.equals(null));
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0312");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        java.lang.String str4 = subject0.toString();
        subject0.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = new me.prettyprint.cassandra.service.CassandraHost("11", (int) ' ');
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient10 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost8, "CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):-1");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient10.equals(null)", !hKerberosThriftClient10.equals(null));
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0313");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        boolean boolean3 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPrivateCredentials();
        java.lang.String[] strArray13 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject(Subject):10", strArray13);
        boolean boolean16 = subject0.equals((java.lang.Object) "Subject(Subject):10");
        java.util.Set<java.security.Principal> principalSet17 = subject0.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost20 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):9160", 1);
        boolean boolean21 = cassandraHost20.getUseThriftFramedTransport();
        cassandraHost20.setMaxWaitTimeWhenExhausted(10L);
        cassandraHost20.setMaxWaitTimeWhenExhausted(10L);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters();
        tSSLTransportParameters27.setKeyStore("hi!", "");
        tSSLTransportParameters27.setKeyStore("hi!", "");
        tSSLTransportParameters27.setTrustStore("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1", "CassandraClient<%s-%d>", "", "");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient39 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost20, "127.0.0.1", tSSLTransportParameters27);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient39.equals(null)", !hKerberosThriftClient39.equals(null));
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0314");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        subject0.setReadOnly();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):9160", 1);
        boolean boolean6 = cassandraHost5.getUseThriftFramedTransport();
        boolean boolean7 = cassandraHost5.getUseSocketKeepalive();
        boolean boolean8 = cassandraHost5.getLifo();
        java.lang.String[] strArray21 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray21);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray21);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray21, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray21, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):9260", strArray21, false);
        tSSLTransportParameters29.setKeyStore("(127.0.0.1)((127.0.0.1)):35", "127.0.0.1", "hi!:9160", "32");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient35 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost5, "CassandraClient<%s-%d>(CassandraClient<%s-%d>):10", tSSLTransportParameters29);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient35.equals(null)", !hKerberosThriftClient35.equals(null));
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0315");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        boolean boolean1 = subject0.isReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = new me.prettyprint.cassandra.service.CassandraHost("", 0);
        boolean boolean5 = cassandraHost4.getLifo();
        cassandraHost4.setCassandraThriftSocketTimeout(100);
        cassandraHost4.setMaxActive(0);
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray20, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1", strArray20, true);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient27 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost4, "9269", tSSLTransportParameters26);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient27.equals(null)", !hKerberosThriftClient27.equals(null));
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0316");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet3 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPrivateCredentials();
        subject0.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("");
        int int8 = cassandraHost7.getMaxActive();
        cassandraHost7.setUseThriftFramedTransport(true);
        java.lang.String str11 = cassandraHost7.toString();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient13 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost7, "1");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient13.equals(null)", !hKerberosThriftClient13.equals(null));
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0317");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        subject0.setReadOnly();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPublicCredentials();
        java.lang.String[] strArray7 = new java.lang.String[] { "(127.0.0.1)((127.0.0.1)):9260", "CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters8 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray7);
        boolean boolean9 = subject0.equals((java.lang.Object) tSSLTransportParameters8);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost12 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):1", 98);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray24, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray24);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray24);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray24);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject", strArray24, false);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient32 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost12, ":0(:0):10", tSSLTransportParameters31);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient32.equals(null)", !hKerberosThriftClient32.equals(null));
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0318");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.util.Set<java.security.Principal> principalSet3 = subject0.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) (short) 1);
        cassandraHost6.setCassandraThriftSocketTimeout((int) (short) 1);
        java.lang.String str9 = cassandraHost6.getIp();
        cassandraHost6.setUseThriftFramedTransport(true);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray21, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:9160", strArray21, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):9160", strArray21);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient27 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost6, "Subject:35", tSSLTransportParameters26);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient27.equals(null)", !hKerberosThriftClient27.equals(null));
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0319");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.util.Set<java.security.Principal> principalSet3 = subject0.getPrincipals();
        java.util.Set<java.security.Principal> principalSet4 = subject0.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("100");
        cassandraHost6.setLifo(true);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient10 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost6, "CassandraClient<%s-%d>(CassandraClient<%s-%d>):10");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient10.equals(null)", !hKerberosThriftClient10.equals(null));
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0320");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        subject0.setReadOnly();
        subject0.setReadOnly();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPublicCredentials();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = new java.util.concurrent.atomic.AtomicLong();
        float float5 = atomicLong4.floatValue();
        long long6 = atomicLong4.get();
        long long8 = atomicLong4.getAndSet(0L);
        long long9 = atomicLong4.incrementAndGet();
        atomicLong4.lazySet((long) (short) 102);
        boolean boolean12 = subject0.equals((java.lang.Object) atomicLong4);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost15 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):9160", 1);
        boolean boolean16 = cassandraHost15.getUseThriftFramedTransport();
        cassandraHost15.setMaxActive((int) (byte) -1);
        java.lang.String str19 = cassandraHost15.getHost();
        java.lang.String[] strArray26 = new java.lang.String[] { "-1", "CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:9160", strArray26);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1", strArray26);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray26);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient30 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost15, "0.0.0.32", tSSLTransportParameters29);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient30.equals(null)", !hKerberosThriftClient30.equals(null));
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0321");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1))");
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray19, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:9160", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("10", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray19, false);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient29 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost6, "199", tSSLTransportParameters28);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient29.equals(null)", !hKerberosThriftClient29.equals(null));
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0322");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        subject0.setReadOnly();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.lang.String str3 = subject0.toString();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("hi!:9160");
        java.lang.String[] strArray19 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray19, true);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient26 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost6, ":100", tSSLTransportParameters25);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient26.equals(null)", !hKerberosThriftClient26.equals(null));
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0323");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        subject0.setReadOnly();
        javax.security.auth.Subject subject4 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet5 = subject4.getPublicCredentials();
        subject4.setReadOnly();
        java.lang.String str7 = subject4.toString();
        java.lang.String str8 = subject4.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost10 = new me.prettyprint.cassandra.service.CassandraHost("");
        boolean boolean12 = cassandraHost10.equals((java.lang.Object) 0.0f);
        java.lang.String str13 = cassandraHost10.getName();
        boolean boolean14 = subject4.equals((java.lang.Object) cassandraHost10);
        java.lang.String str15 = cassandraHost10.toString();
        int int16 = cassandraHost10.getPort();
        java.lang.String str17 = cassandraHost10.toString();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient19 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost10, "");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient19.equals(null)", !hKerberosThriftClient19.equals(null));
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0324");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:100", strArray12, false);
        boolean boolean19 = subject0.equals((java.lang.Object) strArray12);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost21 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost24 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1", 9160);
        java.util.concurrent.atomic.AtomicLong atomicLong26 = new java.util.concurrent.atomic.AtomicLong((long) '#');
        boolean boolean27 = cassandraHost24.equals((java.lang.Object) '#');
        java.lang.String str28 = cassandraHost24.getHost();
        boolean boolean29 = cassandraHost21.equals((java.lang.Object) cassandraHost24);
        cassandraHost24.setLifo(false);
        java.lang.String[] strArray37 = new java.lang.String[] { "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters38 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray37);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters39 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray37);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters40 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1(127.0.0.1):10", strArray37);
        tSSLTransportParameters40.setTrustStore("0.0.0.100", "0", "(127.0.0.1)((127.0.0.1)):35", "10");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient46 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost24, "9269(0.0.36.53):1", tSSLTransportParameters40);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient46.equals(null)", !hKerberosThriftClient46.equals(null));
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0325");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPublicCredentials();
        java.lang.String str3 = subject0.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):100", 9);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient8 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost6, ":0(:0):-1");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient8.equals(null)", !hKerberosThriftClient8.equals(null));
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0326");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet3 = subject0.getPrincipals();
        java.util.Set<java.security.Principal> principalSet4 = subject0.getPrincipals();
        java.util.Set<java.security.Principal> principalSet5 = subject0.getPrincipals();
        java.lang.String str6 = subject0.toString();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = new java.util.concurrent.atomic.AtomicLong();
        float float8 = atomicLong7.floatValue();
        long long9 = atomicLong7.get();
        long long11 = atomicLong7.getAndSet(0L);
        long long12 = atomicLong7.incrementAndGet();
        boolean boolean15 = atomicLong7.compareAndSet(10L, (long) 1);
        boolean boolean16 = subject0.equals((java.lang.Object) boolean15);
        java.util.Set<java.security.Principal> principalSet17 = subject0.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost20 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):9160", 1);
        boolean boolean21 = cassandraHost20.getUseThriftFramedTransport();
        boolean boolean22 = cassandraHost20.getUseSocketKeepalive();
        cassandraHost20.setCassandraThriftSocketTimeout((int) 'a');
        boolean boolean25 = cassandraHost20.getUseThriftFramedTransport();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient27 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost20, "10");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient27.equals(null)", !hKerberosThriftClient27.equals(null));
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0327");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet5 = subject0.getPrincipals();
        boolean boolean6 = subject0.isReadOnly();
        subject0.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>");
        java.lang.String str10 = cassandraHost9.getIp();
        java.lang.String str11 = cassandraHost9.getHost();
        int int12 = cassandraHost9.getPort();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient14 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost9, "100:0");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient14.equals(null)", !hKerberosThriftClient14.equals(null));
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0328");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("");
        cassandraHost6.setMaxWaitTimeWhenExhausted((long) (short) 10);
        java.lang.String str9 = cassandraHost6.toString();
        cassandraHost6.setMaxWaitTimeWhenExhausted((long) (short) 1);
        boolean boolean12 = cassandraHost6.getLifo();
        cassandraHost6.setCassandraThriftSocketTimeout((int) (byte) -2);
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray27, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray27);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray27);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:100", strArray27, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):1", strArray27, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1(127.0.0.1):102", strArray27, false);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient38 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost6, "hi!(hi!):9160", tSSLTransportParameters37);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient38.equals(null)", !hKerberosThriftClient38.equals(null));
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0329");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)", (-1));
        boolean boolean6 = cassandraHost5.isPerformNameResolution();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient8 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost5, "32");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient8.equals(null)", !hKerberosThriftClient8.equals(null));
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0330");
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
        me.prettyprint.cassandra.service.CassandraHost cassandraHost32 = new me.prettyprint.cassandra.service.CassandraHost("");
        boolean boolean34 = cassandraHost32.equals((java.lang.Object) 0.0f);
        java.lang.String str35 = cassandraHost32.getName();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient37 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost32, ":9160");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient37.equals(null)", !hKerberosThriftClient37.equals(null));
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0331");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.lang.String str1 = subject0.toString();
        subject0.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):100", 9);
        java.lang.String str6 = cassandraHost5.getUrl();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient8 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost5, "32");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient8.equals(null)", !hKerberosThriftClient8.equals(null));
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0332");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:100", strArray12, false);
        boolean boolean19 = subject0.equals((java.lang.Object) strArray12);
        boolean boolean20 = subject0.isReadOnly();
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray30, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray30);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray30);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray30);
        boolean boolean36 = subject0.equals((java.lang.Object) strArray30);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost38 = new me.prettyprint.cassandra.service.CassandraHost("hi!");
        cassandraHost38.setUseSocketKeepalive(false);
        java.lang.String[] strArray50 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters52 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray50, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters54 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray50, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters56 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:100", strArray50, true);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient57 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost38, ":0(:0):-1", tSSLTransportParameters56);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient57.equals(null)", !hKerberosThriftClient57.equals(null));
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0333");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        boolean boolean3 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet5 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = new me.prettyprint.cassandra.service.CassandraHost("");
        boolean boolean10 = cassandraHost8.equals((java.lang.Object) 0.0f);
        int int11 = cassandraHost8.getCassandraThriftSocketTimeout();
        cassandraHost8.setUseSocketKeepalive(false);
        cassandraHost8.setLifo(false);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost18 = new me.prettyprint.cassandra.service.CassandraHost("", 0);
        java.lang.String str19 = cassandraHost18.getHost();
        boolean boolean20 = cassandraHost18.getUseSocketKeepalive();
        java.lang.String str21 = cassandraHost18.getName();
        boolean boolean22 = cassandraHost8.equals((java.lang.Object) cassandraHost18);
        java.lang.String str23 = cassandraHost18.getName();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient25 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost18, "0.0.0.32");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient25.equals(null)", !hKerberosThriftClient25.equals(null));
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0334");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet4 = subject0.getPrincipals();
        boolean boolean5 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet6 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet7 = subject0.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = new me.prettyprint.cassandra.service.CassandraHost("Subject");
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray19, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject(Subject):9160", strArray19);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient24 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost9, "0.0.0.10", tSSLTransportParameters23);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient24.equals(null)", !hKerberosThriftClient24.equals(null));
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0335");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1", (int) (byte) 1);
        int int7 = cassandraHost6.getMaxActive();
        int int8 = cassandraHost6.getMaxActive();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient10 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost6, "301");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient10.equals(null)", !hKerberosThriftClient10.equals(null));
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0336");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        boolean boolean4 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet5 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = new me.prettyprint.cassandra.service.CassandraHost("", 0);
        java.lang.String str10 = cassandraHost9.getHost();
        boolean boolean11 = cassandraHost9.getUseSocketKeepalive();
        java.lang.String str12 = cassandraHost9.getName();
        cassandraHost9.setMaxWaitTimeWhenExhausted((-1L));
        me.prettyprint.cassandra.service.CassandraHost cassandraHost17 = new me.prettyprint.cassandra.service.CassandraHost("Subject:\n", 101);
        cassandraHost17.setMaxActive(98);
        boolean boolean20 = cassandraHost9.equals((java.lang.Object) 98);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient22 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost9, "214");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient22.equals(null)", !hKerberosThriftClient22.equals(null));
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0337");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        boolean boolean3 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPrivateCredentials();
        java.lang.String str5 = subject0.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):9160", 1);
        boolean boolean9 = cassandraHost8.getUseThriftFramedTransport();
        boolean boolean10 = cassandraHost8.getUseSocketKeepalive();
        cassandraHost8.setLifo(false);
        long long13 = cassandraHost8.getMaxWaitTimeWhenExhausted();
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters();
        tSSLTransportParameters15.setKeyStore("hi!", "");
        tSSLTransportParameters15.setKeyStore("CassandraClient<%s-%d>", "CassandraClient<%s-%d>");
        tSSLTransportParameters15.requireClientAuth(true);
        tSSLTransportParameters15.setKeyStore("CassandraClient<%s-%d>(CassandraClient<%s-%d>)", "Subject:\n", "0.0.0.0", "0");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient29 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost8, "1", tSSLTransportParameters15);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient29.equals(null)", !hKerberosThriftClient29.equals(null));
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0338");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        subject0.setReadOnly();
        boolean boolean4 = subject0.isReadOnly();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray13);
        boolean boolean18 = subject0.equals((java.lang.Object) tSSLTransportParameters17);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost21 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) (short) 10);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient23 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost21, "(127.0.0.1)((127.0.0.1)):9260");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient23.equals(null)", !hKerberosThriftClient23.equals(null));
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0339");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet5 = subject0.getPrincipals();
        boolean boolean6 = subject0.isReadOnly();
        java.util.Set<java.security.Principal> principalSet7 = subject0.getPrincipals();
        javax.security.auth.Subject subject8 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet9 = subject8.getPublicCredentials();
        subject8.setReadOnly();
        javax.security.auth.Subject subject11 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet12 = subject11.getPublicCredentials();
        subject11.setReadOnly();
        java.lang.String str14 = subject11.toString();
        java.lang.String str15 = subject11.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost17 = new me.prettyprint.cassandra.service.CassandraHost("");
        boolean boolean19 = cassandraHost17.equals((java.lang.Object) 0.0f);
        java.lang.String str20 = cassandraHost17.getName();
        boolean boolean21 = subject11.equals((java.lang.Object) cassandraHost17);
        cassandraHost17.setUseThriftFramedTransport(false);
        boolean boolean24 = subject8.equals((java.lang.Object) cassandraHost17);
        java.lang.String str25 = subject8.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost27 = new me.prettyprint.cassandra.service.CassandraHost("hi!");
        cassandraHost27.setUseSocketKeepalive(false);
        cassandraHost27.setLifo(false);
        boolean boolean32 = subject8.equals((java.lang.Object) cassandraHost27);
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters44 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray42, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters46 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray42, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters47 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):0", strArray42);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient48 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost27, "", tSSLTransportParameters47);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient48.equals(null)", !hKerberosThriftClient48.equals(null));
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0340");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        subject0.setReadOnly();
        boolean boolean4 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet5 = subject0.getPublicCredentials();
        boolean boolean7 = subject0.equals((java.lang.Object) (short) 9260);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):52");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient11 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost9, "208");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient11.equals(null)", !hKerberosThriftClient11.equals(null));
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0341");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet5 = subject0.getPrincipals();
        subject0.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = new me.prettyprint.cassandra.service.CassandraHost("100", (int) (short) 100);
        java.lang.String[] strArray20 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray20, false);
        tSSLTransportParameters24.setTrustStore("", "");
        tSSLTransportParameters24.setTrustStore("Subject", "CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>))", "32", "(127.0.0.1):100");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient33 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost9, "100", tSSLTransportParameters24);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient33.equals(null)", !hKerberosThriftClient33.equals(null));
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0342");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet4 = subject0.getPrincipals();
        boolean boolean5 = subject0.isReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("hi!:100");
        java.lang.String[] strArray25 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray25);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray25);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray25, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray25, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray25, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray25, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray25);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters38 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0", strArray25, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters39 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):1", strArray25);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters40 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("1", strArray25);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient41 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost7, "(127.0.0.1)((127.0.0.1)):9260", tSSLTransportParameters40);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient41.equals(null)", !hKerberosThriftClient41.equals(null));
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0343");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = new java.util.concurrent.atomic.AtomicLong((long) 1);
        boolean boolean8 = atomicLong5.compareAndSet((long) 50, (-1L));
        boolean boolean9 = subject0.equals((java.lang.Object) 50);
        java.util.Set<java.lang.Object> objSet10 = subject0.getPrivateCredentials();
        java.util.concurrent.atomic.AtomicLong atomicLong12 = new java.util.concurrent.atomic.AtomicLong((long) 100);
        java.lang.String str13 = atomicLong12.toString();
        boolean boolean14 = subject0.equals((java.lang.Object) atomicLong12);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost17 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):10", (int) (short) 10);
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray28, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray28);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray28);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray28, true);
        tSSLTransportParameters34.setKeyStore("102", "(127.0.0.1):100", "", "CassandraClient<%s-%d>(CassandraClient<%s-%d>):9160");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient40 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost17, ":0(", tSSLTransportParameters34);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient40.equals(null)", !hKerberosThriftClient40.equals(null));
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0344");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        java.lang.String str4 = subject0.toString();
        java.lang.String str5 = subject0.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = new me.prettyprint.cassandra.service.CassandraHost("Subject:\n", (int) (byte) 53);
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray18, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray18);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient23 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost8, "102", tSSLTransportParameters22);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient23.equals(null)", !hKerberosThriftClient23.equals(null));
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0345");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("0", 9160);
        cassandraHost7.setMaxWaitTimeWhenExhausted((long) (byte) 102);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient11 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost7, "98");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient11.equals(null)", !hKerberosThriftClient11.equals(null));
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0346");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        boolean boolean3 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet5 = subject0.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("hi!:100");
        long long8 = cassandraHost7.getMaxWaitTimeWhenExhausted();
        boolean boolean9 = cassandraHost7.getUseThriftFramedTransport();
        java.lang.String str10 = cassandraHost7.toString();
        java.lang.String str11 = cassandraHost7.toString();
        java.lang.String[] strArray26 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray26);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray26);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray26, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray26, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray26, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray26, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray26);
        tSSLTransportParameters37.setTrustStore("CassandraClient<%s-%d>", "127.0.0.1(127.0.0.1):10");
        tSSLTransportParameters37.setTrustStore("CassandraClient<%s-%d>", "CassandraClient<%s-%d>(CassandraClient<%s-%d>):9160", "(127.0.0.1):100", "0.0.0.0");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient46 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost7, "127.0.0.1(127.0.0.1):102", tSSLTransportParameters37);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient46.equals(null)", !hKerberosThriftClient46.equals(null));
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0347");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        subject0.setReadOnly();
        subject0.setReadOnly();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPublicCredentials();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = new java.util.concurrent.atomic.AtomicLong();
        float float5 = atomicLong4.floatValue();
        long long6 = atomicLong4.get();
        long long8 = atomicLong4.getAndSet(0L);
        long long9 = atomicLong4.incrementAndGet();
        atomicLong4.lazySet((long) (short) 102);
        boolean boolean12 = subject0.equals((java.lang.Object) atomicLong4);
        java.lang.String str13 = subject0.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost16 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):9160", 1);
        boolean boolean17 = cassandraHost16.getUseSocketKeepalive();
        boolean boolean18 = cassandraHost16.getLifo();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient20 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost16, "Subject(Subject):52");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient20.equals(null)", !hKerberosThriftClient20.equals(null));
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0348");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        subject0.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = new me.prettyprint.cassandra.service.CassandraHost("", 0);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient7 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost5, "9269:9160");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient7.equals(null)", !hKerberosThriftClient7.equals(null));
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0349");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet5 = subject0.getPrincipals();
        subject0.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = new me.prettyprint.cassandra.service.CassandraHost("");
        boolean boolean10 = cassandraHost8.equals((java.lang.Object) 0.0f);
        int int11 = cassandraHost8.getCassandraThriftSocketTimeout();
        java.lang.String str12 = cassandraHost8.getName();
        boolean boolean13 = cassandraHost8.getUseThriftFramedTransport();
        cassandraHost8.setMaxActive((int) (short) 9);
        boolean boolean16 = cassandraHost8.getUseThriftFramedTransport();
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters();
        tSSLTransportParameters18.setKeyStore("hi!", "");
        tSSLTransportParameters18.setTrustStore("", "hi!");
        tSSLTransportParameters18.setTrustStore("", "CassandraClient<%s-%d>", "", "");
        tSSLTransportParameters18.setKeyStore("0.0.0.100", "(127.0.0.1)((127.0.0.1))", "CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):10", "-1:0");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient35 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost8, "", tSSLTransportParameters18);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient35.equals(null)", !hKerberosThriftClient35.equals(null));
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0350");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.util.Set<java.security.Principal> principalSet3 = subject0.getPrincipals();
        subject0.setReadOnly();
        java.lang.String[] strArray15 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("10", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("100", strArray15);
        boolean boolean21 = subject0.equals((java.lang.Object) tSSLTransportParameters20);
        java.util.Set<java.lang.Object> objSet22 = subject0.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost24 = new me.prettyprint.cassandra.service.CassandraHost("");
        boolean boolean26 = cassandraHost24.equals((java.lang.Object) 0.0f);
        int int27 = cassandraHost24.getCassandraThriftSocketTimeout();
        cassandraHost24.setMaxActive((int) '4');
        java.lang.String str30 = cassandraHost24.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost33 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):9160", 1);
        cassandraHost33.setMaxWaitTimeWhenExhausted(0L);
        boolean boolean36 = cassandraHost24.equals((java.lang.Object) 0L);
        java.lang.String[] strArray44 = new java.lang.String[] { "(127.0.0.1):9160", "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters46 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1", strArray44, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters48 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("199", strArray44, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters49 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("-1", strArray44);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient50 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost24, "", tSSLTransportParameters49);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient50.equals(null)", !hKerberosThriftClient50.equals(null));
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0351");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        boolean boolean3 = subject0.isReadOnly();
        boolean boolean4 = subject0.isReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("Subject:\n", (int) (byte) 10);
        cassandraHost7.setCassandraThriftSocketTimeout((int) (short) 1);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient11 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost7, "CassandraClient<%s-%d>:52");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient11.equals(null)", !hKerberosThriftClient11.equals(null));
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0352");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet5 = subject0.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1(127.0.0.1):10", (int) (byte) 9);
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray25, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray25);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray25);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray25);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:9160", strArray25);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray25, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray25);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray25, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray25);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters38 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>)", strArray25);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient39 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost8, "CassandraClient<%s-%d>(CassandraClient<%s-%d>):9160", tSSLTransportParameters38);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient39.equals(null)", !hKerberosThriftClient39.equals(null));
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0353");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        subject0.setReadOnly();
        boolean boolean4 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet5 = subject0.getPublicCredentials();
        boolean boolean7 = subject0.equals((java.lang.Object) (short) 9260);
        java.lang.String str8 = subject0.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost11 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):100", (int) (byte) 100);
        cassandraHost11.setMaxActive(100);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient15 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost11, "127.0.0.1(127.0.0.1):1");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient15.equals(null)", !hKerberosThriftClient15.equals(null));
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0354");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPrivateCredentials();
        java.lang.String str4 = subject0.toString();
        subject0.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("");
        boolean boolean9 = cassandraHost7.equals((java.lang.Object) 0.0f);
        int int10 = cassandraHost7.getPort();
        java.lang.String str11 = cassandraHost7.getName();
        java.lang.String str12 = cassandraHost7.getHost();
        boolean boolean13 = cassandraHost7.getUseThriftFramedTransport();
        cassandraHost7.setMaxWaitTimeWhenExhausted(103L);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient17 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost7, "(127.0.0.1)((127.0.0.1)):1");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient17.equals(null)", !hKerberosThriftClient17.equals(null));
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0355");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        boolean boolean4 = subject0.isReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):9160", 1);
        cassandraHost7.setMaxWaitTimeWhenExhausted(0L);
        cassandraHost7.setMaxWaitTimeWhenExhausted((long) (short) -1);
        cassandraHost7.setUseSocketKeepalive(true);
        java.lang.String[] strArray27 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray27);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray27);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray27, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray27, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray27, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray27);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient37 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost7, "0.0.0.10", tSSLTransportParameters36);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient37.equals(null)", !hKerberosThriftClient37.equals(null));
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0356");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPublicCredentials();
        java.lang.String str3 = subject0.toString();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("");
        boolean boolean8 = cassandraHost6.equals((java.lang.Object) 0.0f);
        int int9 = cassandraHost6.getCassandraThriftSocketTimeout();
        cassandraHost6.setMaxActive((int) '4');
        java.lang.String str12 = cassandraHost6.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost15 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):9160", 1);
        cassandraHost15.setMaxWaitTimeWhenExhausted(0L);
        boolean boolean18 = cassandraHost6.equals((java.lang.Object) 0L);
        java.lang.String[] strArray24 = new java.lang.String[] { "(127.0.0.1):9160", "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1", strArray24, false);
        tSSLTransportParameters26.setKeyStore("Subject:\n", "(127.0.0.1)((127.0.0.1)):35", "9269", "hi!:100");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient32 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost6, "9269", tSSLTransportParameters26);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient32.equals(null)", !hKerberosThriftClient32.equals(null));
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0357");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        subject0.setReadOnly();
        boolean boolean4 = subject0.isReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("");
        cassandraHost6.setMaxWaitTimeWhenExhausted((long) (short) 10);
        boolean boolean9 = cassandraHost6.isPerformNameResolution();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient11 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost6, "CassandraClient<%s-%d>:10");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient11.equals(null)", !hKerberosThriftClient11.equals(null));
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0358");
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
        me.prettyprint.cassandra.service.CassandraHost cassandraHost34 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) (short) 1);
        cassandraHost34.setCassandraThriftSocketTimeout((int) (short) 1);
        java.lang.String[] strArray49 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters50 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray49);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters51 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray49);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters52 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray49);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters54 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray49, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters55 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):9260", strArray49);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient56 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost34, "Subject:35", tSSLTransportParameters55);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient56.equals(null)", !hKerberosThriftClient56.equals(null));
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0359");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet4 = subject0.getPrincipals();
        boolean boolean5 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet6 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet7 = subject0.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost10 = new me.prettyprint.cassandra.service.CassandraHost("-1:101", 9260);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient12 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost10, "");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient12.equals(null)", !hKerberosThriftClient12.equals(null));
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0360");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        boolean boolean3 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet5 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet6 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet7 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet8 = subject0.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost10 = new me.prettyprint.cassandra.service.CassandraHost(":0");
        java.lang.String[] strArray18 = new java.lang.String[] { "-1", "CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:9160", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray18);
        tSSLTransportParameters22.requireClientAuth(true);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient25 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost10, "Subject:\n", tSSLTransportParameters22);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient25.equals(null)", !hKerberosThriftClient25.equals(null));
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0361");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet4 = subject0.getPrincipals();
        javax.security.auth.Subject subject5 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet6 = subject5.getPublicCredentials();
        boolean boolean7 = subject0.equals((java.lang.Object) objSet6);
        subject0.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost11 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1", 9160);
        java.util.concurrent.atomic.AtomicLong atomicLong13 = new java.util.concurrent.atomic.AtomicLong((long) '#');
        boolean boolean14 = cassandraHost11.equals((java.lang.Object) '#');
        java.lang.String str15 = cassandraHost11.getHost();
        java.lang.String str16 = cassandraHost11.getIp();
        boolean boolean17 = cassandraHost11.getUseThriftFramedTransport();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient19 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost11, "");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient19.equals(null)", !hKerberosThriftClient19.equals(null));
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0362");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet3 = subject0.getPrincipals();
        java.util.Set<java.security.Principal> principalSet4 = subject0.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) -1);
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray18, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18, false);
        tSSLTransportParameters24.setKeyStore("102", "hi!");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient28 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost7, "100(0.0.0.100):100", tSSLTransportParameters24);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient28.equals(null)", !hKerberosThriftClient28.equals(null));
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0363");
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
        me.prettyprint.cassandra.service.CassandraHost cassandraHost12 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1(127.0.0.1):102");
        int int13 = cassandraHost12.getPort();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient15 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost12, "100");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient15.equals(null)", !hKerberosThriftClient15.equals(null));
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0364");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):9160", 1);
        boolean boolean8 = cassandraHost7.getUseThriftFramedTransport();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient10 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost7, ":0");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient10.equals(null)", !hKerberosThriftClient10.equals(null));
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0365");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet5 = subject0.getPrincipals();
        subject0.setReadOnly();
        java.util.Set<java.security.Principal> principalSet7 = subject0.getPrincipals();
        boolean boolean8 = subject0.isReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost11 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):9160", 1);
        boolean boolean12 = cassandraHost11.getUseSocketKeepalive();
        long long13 = cassandraHost11.getMaxWaitTimeWhenExhausted();
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray24, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray24);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray24);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray24);
        tSSLTransportParameters29.setTrustStore("10", "0.0.0.0");
        tSSLTransportParameters29.setKeyStore("hi!", "hi!:100", "hi!(hi!)", "(127.0.0.1):9160");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient38 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost11, "100:0", tSSLTransportParameters29);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient38.equals(null)", !hKerberosThriftClient38.equals(null));
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0366");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        subject0.setReadOnly();
        boolean boolean4 = subject0.isReadOnly();
        java.lang.String str5 = subject0.toString();
        java.util.Set<java.lang.Object> objSet6 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = new me.prettyprint.cassandra.service.CassandraHost("Subject", 32);
        javax.security.auth.Subject subject11 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet12 = subject11.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet13 = subject11.getPrincipals();
        java.util.Set<java.security.Principal> principalSet14 = subject11.getPrincipals();
        subject11.setReadOnly();
        java.lang.String[] strArray26 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray26);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray26);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("10", strArray26, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("100", strArray26);
        boolean boolean32 = subject11.equals((java.lang.Object) tSSLTransportParameters31);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient33 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost9, "(127.0.0.1)((127.0.0.1))", tSSLTransportParameters31);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient33.equals(null)", !hKerberosThriftClient33.equals(null));
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0367");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        subject0.setReadOnly();
        boolean boolean4 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet5 = subject0.getPublicCredentials();
        boolean boolean7 = subject0.equals((java.lang.Object) (short) 9260);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):1");
        java.lang.String[] strArray20 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray20, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("214", strArray20, true);
        tSSLTransportParameters25.setKeyStore("-2", "CassandraClient<%s-%d>(CassandraClient<%s-%d>):9160");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient29 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost9, "Subject:\n", tSSLTransportParameters25);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient29.equals(null)", !hKerberosThriftClient29.equals(null));
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0368");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet3 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("hi!", 0);
        cassandraHost7.setLifo(false);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient11 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost7, "hi!(hi!):100");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient11.equals(null)", !hKerberosThriftClient11.equals(null));
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0369");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet3 = subject0.getPrincipals();
        subject0.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("100", 0);
        cassandraHost7.setLifo(false);
        cassandraHost7.setCassandraThriftSocketTimeout(13);
        cassandraHost7.setCassandraThriftSocketTimeout((int) (short) 12);
        java.lang.String[] strArray29 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray29);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray29);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray29, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray29);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray29);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):10", strArray29, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters39 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray29, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters41 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1(127.0.0.1):9160", strArray29, false);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient42 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost7, "hi!(hi!):9160", tSSLTransportParameters41);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient42.equals(null)", !hKerberosThriftClient42.equals(null));
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0370");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        subject0.setReadOnly();
        subject0.setReadOnly();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPublicCredentials();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = new java.util.concurrent.atomic.AtomicLong();
        float float5 = atomicLong4.floatValue();
        long long6 = atomicLong4.get();
        long long8 = atomicLong4.getAndSet(0L);
        long long9 = atomicLong4.incrementAndGet();
        atomicLong4.lazySet((long) (short) 102);
        boolean boolean12 = subject0.equals((java.lang.Object) atomicLong4);
        java.lang.String str13 = subject0.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost15 = new me.prettyprint.cassandra.service.CassandraHost("hi!");
        cassandraHost15.setMaxActive((int) (short) 0);
        int int18 = cassandraHost15.getPort();
        cassandraHost15.setUseThriftFramedTransport(false);
        boolean boolean21 = cassandraHost15.getUseSocketKeepalive();
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray34, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray34);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters38 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray34);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters39 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray34);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters40 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray34);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters41 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):10", strArray34);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient42 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost15, "CassandraClient<%s-%d>:52", tSSLTransportParameters41);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient42.equals(null)", !hKerberosThriftClient42.equals(null));
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0371");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        subject0.setReadOnly();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.lang.String str3 = subject0.toString();
        subject0.setReadOnly();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray15, false);
        boolean boolean24 = subject0.equals((java.lang.Object) false);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost26 = new me.prettyprint.cassandra.service.CassandraHost("hi!:100");
        long long27 = cassandraHost26.getMaxWaitTimeWhenExhausted();
        cassandraHost26.setLifo(false);
        long long30 = cassandraHost26.getMaxWaitTimeWhenExhausted();
        java.lang.String str31 = cassandraHost26.getUrl();
        java.lang.String str32 = cassandraHost26.getName();
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters50 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray48, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters51 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray48);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters52 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray48);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters53 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray48);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters54 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:9160", strArray48);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters56 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray48, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters57 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray48);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters59 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray48, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters60 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject(Subject):101", strArray48);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient61 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost26, ":0(:0)", tSSLTransportParameters60);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient61.equals(null)", !hKerberosThriftClient61.equals(null));
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0372");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = new java.util.concurrent.atomic.AtomicLong((long) 1);
        boolean boolean8 = atomicLong5.compareAndSet((long) 50, (-1L));
        boolean boolean9 = subject0.equals((java.lang.Object) 50);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost12 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):100", 9260);
        cassandraHost12.setUseSocketKeepalive(false);
        cassandraHost12.setUseSocketKeepalive(false);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray31, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray31);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray31);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:100", strArray31, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters39 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray31, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters41 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray31, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters43 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:35", strArray31, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters44 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:9160", strArray31);
        tSSLTransportParameters44.setTrustStore("hi!:9160", "(127.0.0.1)((127.0.0.1)):9260");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient48 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost12, "98", tSSLTransportParameters44);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient48.equals(null)", !hKerberosThriftClient48.equals(null));
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0373");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        boolean boolean1 = subject0.isReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = new me.prettyprint.cassandra.service.CassandraHost("", 0);
        boolean boolean5 = cassandraHost4.getUseSocketKeepalive();
        boolean boolean6 = cassandraHost4.getLifo();
        java.lang.String str7 = cassandraHost4.getName();
        cassandraHost4.setCassandraThriftSocketTimeout((int) ' ');
        boolean boolean10 = cassandraHost4.getUseSocketKeepalive();
        int int11 = cassandraHost4.getCassandraThriftSocketTimeout();
        int int12 = cassandraHost4.getPort();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient14 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost4, "(127.0.0.1)((127.0.0.1)):9160");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient14.equals(null)", !hKerberosThriftClient14.equals(null));
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0374");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPrivateCredentials();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 10);
        float float6 = atomicLong5.floatValue();
        long long7 = atomicLong5.incrementAndGet();
        double double8 = atomicLong5.doubleValue();
        boolean boolean9 = subject0.equals((java.lang.Object) double8);
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray20, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:9160", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("100", strArray20, true);
        tSSLTransportParameters27.setTrustStore("", "(127.0.0.1)((127.0.0.1)):9260");
        boolean boolean31 = subject0.equals((java.lang.Object) tSSLTransportParameters27);
        java.util.Set<java.lang.Object> objSet32 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost35 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (byte) 100);
        java.lang.String str36 = cassandraHost35.getUrl();
        boolean boolean37 = cassandraHost35.getUseThriftFramedTransport();
        int int38 = cassandraHost35.getCassandraThriftSocketTimeout();
        int int39 = cassandraHost35.getPort();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient41 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost35, "0.0.0.32");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient41.equals(null)", !hKerberosThriftClient41.equals(null));
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0375");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPrivateCredentials();
        java.lang.String str4 = subject0.toString();
        subject0.setReadOnly();
        java.util.Set<java.lang.Object> objSet6 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = new me.prettyprint.cassandra.service.CassandraHost("");
        cassandraHost8.setMaxWaitTimeWhenExhausted((long) (short) 10);
        java.lang.String str11 = cassandraHost8.toString();
        cassandraHost8.setMaxWaitTimeWhenExhausted((long) (short) 1);
        cassandraHost8.setMaxWaitTimeWhenExhausted((long) (byte) 1);
        cassandraHost8.setCassandraThriftSocketTimeout(50);
        java.lang.String[] strArray28 = new java.lang.String[] { "-1", "CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:9160", strArray28);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1", strArray28);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray28);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray28);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:9160", strArray28, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!(hi!)", strArray28, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("208", strArray28);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient38 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost8, "CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1", tSSLTransportParameters37);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient38.equals(null)", !hKerberosThriftClient38.equals(null));
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0376");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPublicCredentials();
        java.lang.String str3 = subject0.toString();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (byte) 100);
        java.lang.String str8 = cassandraHost7.getUrl();
        boolean boolean9 = subject0.equals((java.lang.Object) cassandraHost7);
        javax.security.auth.Subject subject10 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet11 = subject10.getPublicCredentials();
        subject10.setReadOnly();
        java.lang.String str13 = subject10.toString();
        java.lang.String str14 = subject10.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost16 = new me.prettyprint.cassandra.service.CassandraHost("");
        boolean boolean18 = cassandraHost16.equals((java.lang.Object) 0.0f);
        java.lang.String str19 = cassandraHost16.getName();
        boolean boolean20 = subject10.equals((java.lang.Object) cassandraHost16);
        java.lang.String str21 = cassandraHost16.toString();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient23 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost16, "32");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient23.equals(null)", !hKerberosThriftClient23.equals(null));
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0377");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet4 = subject0.getPrincipals();
        javax.security.auth.Subject subject5 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet6 = subject5.getPublicCredentials();
        boolean boolean7 = subject0.equals((java.lang.Object) objSet6);
        java.util.Set<java.security.Principal> principalSet8 = subject0.getPrincipals();
        java.lang.String str9 = subject0.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost12 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (byte) -1);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient14 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost12, "(127.0.0.1)((127.0.0.1)):1");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient14.equals(null)", !hKerberosThriftClient14.equals(null));
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0378");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPrivateCredentials();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 10);
        float float6 = atomicLong5.floatValue();
        long long7 = atomicLong5.incrementAndGet();
        double double8 = atomicLong5.doubleValue();
        boolean boolean9 = subject0.equals((java.lang.Object) double8);
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray20, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:9160", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("100", strArray20, true);
        tSSLTransportParameters27.setTrustStore("", "(127.0.0.1)((127.0.0.1)):9260");
        boolean boolean31 = subject0.equals((java.lang.Object) tSSLTransportParameters27);
        java.util.Set<java.lang.Object> objSet32 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost34 = new me.prettyprint.cassandra.service.CassandraHost("");
        boolean boolean36 = cassandraHost34.equals((java.lang.Object) 0.0f);
        int int37 = cassandraHost34.getCassandraThriftSocketTimeout();
        cassandraHost34.setUseSocketKeepalive(false);
        cassandraHost34.setLifo(false);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost44 = new me.prettyprint.cassandra.service.CassandraHost("", 0);
        java.lang.String str45 = cassandraHost44.getHost();
        boolean boolean46 = cassandraHost44.getUseSocketKeepalive();
        java.lang.String str47 = cassandraHost44.getName();
        boolean boolean48 = cassandraHost34.equals((java.lang.Object) cassandraHost44);
        boolean boolean49 = cassandraHost34.getUseThriftFramedTransport();
        java.lang.String[] strArray58 = new java.lang.String[] { "-1", "CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters59 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:9160", strArray58);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters60 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1", strArray58);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters61 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray58);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters62 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray58);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters64 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:9160", strArray58, false);
        tSSLTransportParameters64.setKeyStore("127.0.0.1(127.0.0.1):10", ":0");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient68 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost34, "32", tSSLTransportParameters64);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient68.equals(null)", !hKerberosThriftClient68.equals(null));
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0379");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        boolean boolean3 = subject0.isReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):52");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient7 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost5, "9");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient7.equals(null)", !hKerberosThriftClient7.equals(null));
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0380");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        boolean boolean1 = subject0.isReadOnly();
        boolean boolean2 = subject0.isReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = new me.prettyprint.cassandra.service.CassandraHost("0", 102);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient7 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost5, "CassandraClient<%s-%d>:10");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient7.equals(null)", !hKerberosThriftClient7.equals(null));
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0381");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPrivateCredentials();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 10);
        float float6 = atomicLong5.floatValue();
        long long7 = atomicLong5.incrementAndGet();
        double double8 = atomicLong5.doubleValue();
        boolean boolean9 = subject0.equals((java.lang.Object) double8);
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray20, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:9160", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("100", strArray20, true);
        tSSLTransportParameters27.setTrustStore("", "(127.0.0.1)((127.0.0.1)):9260");
        boolean boolean31 = subject0.equals((java.lang.Object) tSSLTransportParameters27);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost34 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", 50);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient36 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost34, "0.0.0.0(0.0.0.0):101");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient36.equals(null)", !hKerberosThriftClient36.equals(null));
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0382");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet4 = subject0.getPrincipals();
        boolean boolean5 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet6 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet7 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.util.Set<java.lang.Object> objSet9 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost11 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>");
        java.lang.String str12 = cassandraHost11.getIp();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient14 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost11, ":9160(:9160):11");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient14.equals(null)", !hKerberosThriftClient14.equals(null));
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0383");
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
        me.prettyprint.cassandra.service.CassandraHost cassandraHost13 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>)", 10);
        java.lang.String str14 = cassandraHost13.toString();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient16 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost13, "hi!(hi!)(hi!(hi!)):9261");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient16.equals(null)", !hKerberosThriftClient16.equals(null));
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0384");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet4 = subject0.getPrincipals();
        boolean boolean5 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet6 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet7 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.util.Set<java.lang.Object> objSet9 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost11 = new me.prettyprint.cassandra.service.CassandraHost("");
        cassandraHost11.setMaxWaitTimeWhenExhausted((long) (short) 10);
        java.lang.String str14 = cassandraHost11.toString();
        cassandraHost11.setMaxWaitTimeWhenExhausted((long) (short) 1);
        boolean boolean17 = cassandraHost11.getLifo();
        cassandraHost11.setUseThriftFramedTransport(false);
        boolean boolean20 = cassandraHost11.getUseSocketKeepalive();
        int int21 = cassandraHost11.getCassandraThriftSocketTimeout();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient23 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost11, "8");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient23.equals(null)", !hKerberosThriftClient23.equals(null));
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0385");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet3 = subject0.getPrincipals();
        java.util.Set<java.security.Principal> principalSet4 = subject0.getPrincipals();
        javax.security.auth.Subject subject5 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet6 = subject5.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet7 = subject5.getPrivateCredentials();
        boolean boolean8 = subject5.isReadOnly();
        java.util.Set<java.lang.Object> objSet9 = subject5.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet10 = subject5.getPublicCredentials();
        subject5.setReadOnly();
        java.util.Set<java.lang.Object> objSet12 = subject5.getPublicCredentials();
        boolean boolean13 = subject0.equals((java.lang.Object) objSet12);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost15 = new me.prettyprint.cassandra.service.CassandraHost("");
        cassandraHost15.setMaxWaitTimeWhenExhausted((long) (short) 10);
        java.lang.String str18 = cassandraHost15.toString();
        cassandraHost15.setMaxActive(9160);
        cassandraHost15.setCassandraThriftSocketTimeout((int) (short) 100);
        boolean boolean23 = cassandraHost15.getUseThriftFramedTransport();
        boolean boolean24 = subject0.equals((java.lang.Object) boolean23);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost27 = new me.prettyprint.cassandra.service.CassandraHost("", 101);
        java.lang.String[] strArray36 = new java.lang.String[] { "-1", "CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:9160", strArray36);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters38 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1", strArray36);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters40 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("32", strArray36, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters42 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray36, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters43 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!(hi!):9160", strArray36);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient44 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost27, "214", tSSLTransportParameters43);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient44.equals(null)", !hKerberosThriftClient44.equals(null));
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0386");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        subject0.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 100);
        cassandraHost6.setMaxWaitTimeWhenExhausted(0L);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient10 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost6, "(127.0.0.1)((127.0.0.1)):35");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient10.equals(null)", !hKerberosThriftClient10.equals(null));
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0387");
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
        java.lang.String str31 = subject0.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost33 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>");
        java.lang.String str34 = cassandraHost33.getIp();
        java.lang.String str35 = cassandraHost33.getName();
        boolean boolean36 = cassandraHost33.getLifo();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient38 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost33, "(127.0.0.1):9");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient38.equals(null)", !hKerberosThriftClient38.equals(null));
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0388");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        subject0.setReadOnly();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) (short) 10);
        boolean boolean8 = cassandraHost7.isPerformNameResolution();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient10 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost7, "CassandraClient<%s-%d>(CassandraClient<%s-%d>)");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient10.equals(null)", !hKerberosThriftClient10.equals(null));
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0389");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        java.lang.String str4 = subject0.toString();
        subject0.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = new me.prettyprint.cassandra.service.CassandraHost("301", 10);
        java.lang.String str9 = cassandraHost8.getHost();
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):9260", strArray14);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient17 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost8, "0.0.0.10", tSSLTransportParameters16);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient17.equals(null)", !hKerberosThriftClient17.equals(null));
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0390");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        subject0.setReadOnly();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        boolean boolean3 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet5 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = new me.prettyprint.cassandra.service.CassandraHost("Subject:\n", (int) (byte) 10);
        cassandraHost9.setCassandraThriftSocketTimeout((int) (short) 1);
        java.lang.String str12 = cassandraHost9.toString();
        boolean boolean13 = cassandraHost9.getLifo();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient15 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost9, "100");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient15.equals(null)", !hKerberosThriftClient15.equals(null));
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0391");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        subject0.setReadOnly();
        boolean boolean4 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet5 = subject0.getPublicCredentials();
        boolean boolean7 = subject0.equals((java.lang.Object) (short) 9260);
        java.lang.String str8 = subject0.toString();
        java.util.Set<java.security.Principal> principalSet9 = subject0.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost12 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 100);
        cassandraHost12.setMaxWaitTimeWhenExhausted((long) 10);
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray30, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray30);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray30);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray30, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters38 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray30, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters40 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0", strArray30, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters41 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray30);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters42 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("9269", strArray30);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters44 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject", strArray30, false);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient45 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost12, "100:0", tSSLTransportParameters44);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient45.equals(null)", !hKerberosThriftClient45.equals(null));
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0392");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        boolean boolean4 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet5 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        boolean boolean7 = subject0.isReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = new me.prettyprint.cassandra.service.CassandraHost("hi!");
        cassandraHost9.setMaxActive((int) (short) 0);
        int int12 = cassandraHost9.getPort();
        boolean boolean13 = cassandraHost9.getUseThriftFramedTransport();
        int int14 = cassandraHost9.getCassandraThriftSocketTimeout();
        cassandraHost9.setUseThriftFramedTransport(true);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient18 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost9, "");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient18.equals(null)", !hKerberosThriftClient18.equals(null));
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0393");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet4 = subject0.getPrincipals();
        boolean boolean5 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet6 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet7 = subject0.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost10 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1(127.0.0.1):10", (int) (byte) 9);
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray14);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient16 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost10, "", tSSLTransportParameters15);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient16.equals(null)", !hKerberosThriftClient16.equals(null));
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0394");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        subject0.setReadOnly();
        boolean boolean4 = subject0.isReadOnly();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray13);
        boolean boolean18 = subject0.equals((java.lang.Object) tSSLTransportParameters17);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost20 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>");
        java.lang.String str21 = cassandraHost20.getIp();
        int int22 = cassandraHost20.getMaxActive();
        java.lang.String str23 = cassandraHost20.getUrl();
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters44 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray42, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters45 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray42);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters46 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray42);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters47 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray42);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters48 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:9160", strArray42);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters50 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray42, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters51 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray42);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters53 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray42, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters54 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("10", strArray42);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters56 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!(hi!)", strArray42, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters57 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0.0.0.0", strArray42);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters59 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1))", strArray42, false);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient60 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost20, "32", tSSLTransportParameters59);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient60.equals(null)", !hKerberosThriftClient60.equals(null));
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0395");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("Subject(Subject):9160");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient8 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost6, "hi!(hi!):9160");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient8.equals(null)", !hKerberosThriftClient8.equals(null));
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0396");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet3 = subject0.getPrincipals();
        subject0.setReadOnly();
        subject0.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):10");
        java.lang.String[] strArray15 = new java.lang.String[] { "(127.0.0.1):9160", "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("199", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("-1", strArray15);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient21 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost7, "CassandraClient<%s-%d>:10", tSSLTransportParameters20);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient21.equals(null)", !hKerberosThriftClient21.equals(null));
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0397");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("", 0);
        java.lang.String str7 = cassandraHost6.getName();
        boolean boolean8 = subject0.equals((java.lang.Object) str7);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost11 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):9160", 1);
        boolean boolean12 = cassandraHost11.getUseThriftFramedTransport();
        boolean boolean13 = cassandraHost11.getUseSocketKeepalive();
        cassandraHost11.setLifo(false);
        boolean boolean16 = cassandraHost11.getLifo();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient18 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost11, "11");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient18.equals(null)", !hKerberosThriftClient18.equals(null));
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0398");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.lang.String str1 = subject0.toString();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.lang.String str3 = subject0.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):9260", 10);
        cassandraHost6.setUseSocketKeepalive(true);
        java.lang.String str9 = cassandraHost6.getHost();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient11 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost6, "");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient11.equals(null)", !hKerberosThriftClient11.equals(null));
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0399");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        subject0.setReadOnly();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.lang.String str5 = subject0.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("");
        boolean boolean9 = cassandraHost7.equals((java.lang.Object) 0.0f);
        cassandraHost7.setMaxActive(301);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient13 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost7, "0.0.0.10");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient13.equals(null)", !hKerberosThriftClient13.equals(null));
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0400");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        boolean boolean3 = subject0.isReadOnly();
        boolean boolean4 = subject0.isReadOnly();
        javax.security.auth.Subject subject5 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet6 = subject5.getPublicCredentials();
        subject5.setReadOnly();
        java.lang.String str8 = subject5.toString();
        java.lang.String str9 = subject5.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost11 = new me.prettyprint.cassandra.service.CassandraHost("");
        boolean boolean13 = cassandraHost11.equals((java.lang.Object) 0.0f);
        java.lang.String str14 = cassandraHost11.getName();
        boolean boolean15 = subject5.equals((java.lang.Object) cassandraHost11);
        java.lang.String str16 = cassandraHost11.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost19 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):9160", 1);
        cassandraHost19.setMaxWaitTimeWhenExhausted(0L);
        boolean boolean22 = cassandraHost11.equals((java.lang.Object) cassandraHost19);
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray34, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray34);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters38 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray34);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters39 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray34);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters40 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:9160", strArray34);
        tSSLTransportParameters40.setTrustStore("", "100", "Subject", "");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient46 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost19, "127.0.0.1(127.0.0.1):102", tSSLTransportParameters40);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient46.equals(null)", !hKerberosThriftClient46.equals(null));
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0401");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        boolean boolean3 = subject0.isReadOnly();
        java.lang.String[] strArray12 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray12);
        boolean boolean15 = subject0.equals((java.lang.Object) tSSLTransportParameters14);
        java.util.Set<java.lang.Object> objSet16 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet17 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet18 = subject0.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost21 = new me.prettyprint.cassandra.service.CassandraHost("", 0);
        java.lang.String str22 = cassandraHost21.getHost();
        boolean boolean23 = cassandraHost21.getUseSocketKeepalive();
        java.lang.String str24 = cassandraHost21.getName();
        cassandraHost21.setMaxWaitTimeWhenExhausted((-1L));
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters40 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray38, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters41 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray38);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters42 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray38);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters43 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>))", strArray38);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters45 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1(127.0.0.1)", strArray38, false);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient46 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost21, "301", tSSLTransportParameters45);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient46.equals(null)", !hKerberosThriftClient46.equals(null));
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0402");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        boolean boolean3 = subject0.isReadOnly();
        java.lang.String[] strArray12 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray12);
        boolean boolean15 = subject0.equals((java.lang.Object) tSSLTransportParameters14);
        java.util.Set<java.lang.Object> objSet16 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet17 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet18 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost21 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):9160", 1);
        boolean boolean22 = cassandraHost21.getUseSocketKeepalive();
        boolean boolean23 = cassandraHost21.getLifo();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient25 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost21, "CassandraClient<%s-%d>:9160");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient25.equals(null)", !hKerberosThriftClient25.equals(null));
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0403");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPublicCredentials();
        java.lang.String str3 = subject0.toString();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 100);
        boolean boolean8 = cassandraHost7.getUseThriftFramedTransport();
        java.lang.String str9 = cassandraHost7.getIp();
        java.lang.String str10 = cassandraHost7.getName();
        cassandraHost7.setCassandraThriftSocketTimeout((int) (byte) 111);
        int int13 = cassandraHost7.getCassandraThriftSocketTimeout();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient15 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost7, "127.0.0.1");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient15.equals(null)", !hKerberosThriftClient15.equals(null));
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0404");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.util.Set<java.security.Principal> principalSet3 = subject0.getPrincipals();
        subject0.setReadOnly();
        java.lang.String[] strArray15 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("10", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("100", strArray15);
        boolean boolean21 = subject0.equals((java.lang.Object) tSSLTransportParameters20);
        java.util.Set<java.lang.Object> objSet22 = subject0.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost25 = new me.prettyprint.cassandra.service.CassandraHost("10", (int) (byte) 100);
        java.lang.String str26 = cassandraHost25.getIp();
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters39 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray37, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters40 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray37);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters41 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray37);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters42 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:9160", strArray37);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient43 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost25, "-1:0", tSSLTransportParameters42);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient43.equals(null)", !hKerberosThriftClient43.equals(null));
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0405");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPrivateCredentials();
        java.lang.String str4 = subject0.toString();
        java.util.Set<java.security.Principal> principalSet5 = subject0.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("");
        cassandraHost7.setMaxWaitTimeWhenExhausted((long) (short) 10);
        java.lang.String str10 = cassandraHost7.toString();
        cassandraHost7.setMaxActive(9160);
        cassandraHost7.setCassandraThriftSocketTimeout((int) (short) 100);
        boolean boolean15 = cassandraHost7.getUseThriftFramedTransport();
        cassandraHost7.setLifo(true);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient19 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost7, "12");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient19.equals(null)", !hKerberosThriftClient19.equals(null));
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0406");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        subject0.setReadOnly();
        boolean boolean4 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet5 = subject0.getPublicCredentials();
        boolean boolean7 = subject0.equals((java.lang.Object) (short) 9260);
        java.lang.String str8 = subject0.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost10 = new me.prettyprint.cassandra.service.CassandraHost("");
        cassandraHost10.setMaxWaitTimeWhenExhausted((long) (short) 10);
        java.lang.String str13 = cassandraHost10.toString();
        cassandraHost10.setMaxActive(9160);
        cassandraHost10.setLifo(false);
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray28, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray28);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray28);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject(Subject):10", strArray28);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient34 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost10, "hi!(hi!)", tSSLTransportParameters33);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient34.equals(null)", !hKerberosThriftClient34.equals(null));
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0407");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet3 = subject0.getPrincipals();
        subject0.setReadOnly();
        java.util.Set<java.lang.Object> objSet5 = subject0.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) (short) 1);
        cassandraHost8.setCassandraThriftSocketTimeout((int) (short) 1);
        java.lang.String str11 = cassandraHost8.getIp();
        cassandraHost8.setUseThriftFramedTransport(true);
        java.lang.String[] strArray22 = new java.lang.String[] { "", "hi!", "127.0.0.1", "-1", "Subject:\n" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray22, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0.0.0.0(0.0.0.0):101", strArray22, false);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient27 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost8, "100", tSSLTransportParameters26);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient27.equals(null)", !hKerberosThriftClient27.equals(null));
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0408");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPublicCredentials();
        java.lang.String str3 = subject0.toString();
        boolean boolean4 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet5 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = new me.prettyprint.cassandra.service.CassandraHost("0", 9160);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient10 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost8, "CassandraClient<%s-%d>(CassandraClient<%s-%d>):10");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient10.equals(null)", !hKerberosThriftClient10.equals(null));
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0409");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        boolean boolean4 = subject0.isReadOnly();
        subject0.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost10 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1", 9160);
        java.util.concurrent.atomic.AtomicLong atomicLong12 = new java.util.concurrent.atomic.AtomicLong((long) '#');
        boolean boolean13 = cassandraHost10.equals((java.lang.Object) '#');
        java.lang.String str14 = cassandraHost10.getHost();
        boolean boolean15 = cassandraHost7.equals((java.lang.Object) cassandraHost10);
        cassandraHost10.setLifo(false);
        java.lang.String str18 = cassandraHost10.getName();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient20 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost10, "hi!");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient20.equals(null)", !hKerberosThriftClient20.equals(null));
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0410");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet4 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet5 = subject0.getPublicCredentials();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 100);
        atomicLong7.set((long) (short) 10);
        boolean boolean10 = subject0.equals((java.lang.Object) (short) 10);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost13 = new me.prettyprint.cassandra.service.CassandraHost("", 0);
        java.lang.String str14 = cassandraHost13.getName();
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray27, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray27);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray27);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:100", strArray27, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray27, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray27, true);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient38 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost13, "CassandraClient<%s-%d>(CassandraClient<%s-%d>):52", tSSLTransportParameters37);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient38.equals(null)", !hKerberosThriftClient38.equals(null));
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0411");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        boolean boolean3 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPrivateCredentials();
        java.lang.String str5 = subject0.toString();
        subject0.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (byte) 100);
        cassandraHost9.setMaxActive((int) (byte) 10);
        boolean boolean12 = cassandraHost9.getUseThriftFramedTransport();
        java.lang.String str13 = cassandraHost9.getUrl();
        cassandraHost9.setUseSocketKeepalive(false);
        boolean boolean16 = cassandraHost9.isPerformNameResolution();
        java.lang.String str17 = cassandraHost9.getIp();
        cassandraHost9.setMaxActive(100);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient21 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost9, "Subject");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient21.equals(null)", !hKerberosThriftClient21.equals(null));
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0412");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPrivateCredentials();
        java.lang.String str4 = subject0.toString();
        subject0.setReadOnly();
        java.util.Set<java.lang.Object> objSet6 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = new me.prettyprint.cassandra.service.CassandraHost("-1", (int) '#');
        boolean boolean10 = subject0.equals((java.lang.Object) cassandraHost9);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost13 = new me.prettyprint.cassandra.service.CassandraHost("Subject:\n", (int) (byte) 10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters();
        tSSLTransportParameters15.setKeyStore("hi!", "");
        tSSLTransportParameters15.setKeyStore("CassandraClient<%s-%d>", "CassandraClient<%s-%d>");
        tSSLTransportParameters15.setTrustStore("Subject:\n", "hi!:100", "", "CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient27 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost13, "CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):10", tSSLTransportParameters15);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient27.equals(null)", !hKerberosThriftClient27.equals(null));
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0413");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet3 = subject0.getPrincipals();
        java.util.Set<java.security.Principal> principalSet4 = subject0.getPrincipals();
        java.util.Set<java.security.Principal> principalSet5 = subject0.getPrincipals();
        java.lang.String str6 = subject0.toString();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = new java.util.concurrent.atomic.AtomicLong();
        float float8 = atomicLong7.floatValue();
        long long9 = atomicLong7.get();
        long long11 = atomicLong7.getAndSet(0L);
        long long12 = atomicLong7.incrementAndGet();
        boolean boolean15 = atomicLong7.compareAndSet(10L, (long) 1);
        boolean boolean16 = subject0.equals((java.lang.Object) boolean15);
        java.util.Set<java.lang.Object> objSet17 = subject0.getPrivateCredentials();
        javax.security.auth.Subject subject18 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet19 = subject18.getPublicCredentials();
        subject18.setReadOnly();
        java.lang.String str21 = subject18.toString();
        java.lang.String str22 = subject18.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost24 = new me.prettyprint.cassandra.service.CassandraHost("");
        boolean boolean26 = cassandraHost24.equals((java.lang.Object) 0.0f);
        java.lang.String str27 = cassandraHost24.getName();
        boolean boolean28 = subject18.equals((java.lang.Object) cassandraHost24);
        int int29 = cassandraHost24.getCassandraThriftSocketTimeout();
        java.lang.String str30 = cassandraHost24.getName();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient32 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost24, "127.0.0.1(127.0.0.1):97");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient32.equals(null)", !hKerberosThriftClient32.equals(null));
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0414");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        java.lang.String str4 = subject0.toString();
        java.lang.String str5 = subject0.toString();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = new java.util.concurrent.atomic.AtomicLong();
        float float7 = atomicLong6.floatValue();
        long long9 = atomicLong6.getAndSet((long) (byte) 100);
        long long10 = atomicLong6.incrementAndGet();
        long long11 = atomicLong6.getAndIncrement();
        long long12 = atomicLong6.incrementAndGet();
        long long14 = atomicLong6.getAndSet((long) ' ');
        java.lang.String str15 = atomicLong6.toString();
        atomicLong6.set((long) (byte) 1);
        atomicLong6.lazySet((long) 50);
        long long20 = atomicLong6.decrementAndGet();
        boolean boolean21 = subject0.equals((java.lang.Object) long20);
        subject0.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost24 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost27 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1", 9160);
        java.util.concurrent.atomic.AtomicLong atomicLong29 = new java.util.concurrent.atomic.AtomicLong((long) '#');
        boolean boolean30 = cassandraHost27.equals((java.lang.Object) '#');
        java.lang.String str31 = cassandraHost27.getHost();
        boolean boolean32 = cassandraHost24.equals((java.lang.Object) cassandraHost27);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient34 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost27, "0.0.0.0(0.0.0.0):101");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient34.equals(null)", !hKerberosThriftClient34.equals(null));
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0415");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPublicCredentials();
        java.lang.String str3 = subject0.toString();
        boolean boolean4 = subject0.isReadOnly();
        subject0.setReadOnly();
        java.util.Set<java.lang.Object> objSet6 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1", (int) ' ');
        int int10 = cassandraHost9.getMaxActive();
        int int11 = cassandraHost9.getCassandraThriftSocketTimeout();
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray25, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray25);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray25);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray25);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray25);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):10", strArray25);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("98", strArray25);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient34 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost9, "32", tSSLTransportParameters33);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient34.equals(null)", !hKerberosThriftClient34.equals(null));
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0416");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPrivateCredentials();
        java.lang.String str4 = subject0.toString();
        subject0.setReadOnly();
        java.util.Set<java.lang.Object> objSet6 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1(127.0.0.1):10", (int) (byte) -1);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient11 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost9, "Subject:\n");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient11.equals(null)", !hKerberosThriftClient11.equals(null));
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0417");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        subject0.setReadOnly();
        boolean boolean4 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet5 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet6 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (byte) 100);
        cassandraHost9.setMaxActive((int) (byte) 10);
        boolean boolean12 = cassandraHost9.getUseThriftFramedTransport();
        java.lang.String str13 = cassandraHost9.getUrl();
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters();
        tSSLTransportParameters15.setKeyStore("hi!", "");
        tSSLTransportParameters15.setKeyStore("hi!", "");
        tSSLTransportParameters15.setKeyStore("", "0", "-1", "hi!:100");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient27 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost9, "CassandraClient<%s-%d>:52", tSSLTransportParameters15);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient27.equals(null)", !hKerberosThriftClient27.equals(null));
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0418");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (byte) 100);
        cassandraHost7.setMaxActive((int) (byte) 10);
        boolean boolean10 = cassandraHost7.getUseThriftFramedTransport();
        java.util.concurrent.atomic.AtomicLong atomicLong12 = new java.util.concurrent.atomic.AtomicLong((long) (short) 0);
        boolean boolean13 = cassandraHost7.equals((java.lang.Object) (short) 0);
        cassandraHost7.setUseSocketKeepalive(false);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient17 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost7, "101");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient17.equals(null)", !hKerberosThriftClient17.equals(null));
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0419");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet3 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)", (-1));
        int int8 = cassandraHost7.getMaxActive();
        cassandraHost7.setLifo(false);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient12 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost7, "CassandraClient<%s-%d>");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient12.equals(null)", !hKerberosThriftClient12.equals(null));
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0420");
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
        java.lang.String str18 = cassandraHost12.getHost();
        java.lang.String str19 = cassandraHost12.getHost();
        java.lang.String str20 = cassandraHost12.toString();
        boolean boolean21 = cassandraHost12.getUseThriftFramedTransport();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient23 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost12, "0.0.0.32");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient23.equals(null)", !hKerberosThriftClient23.equals(null));
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0421");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet3 = subject0.getPrincipals();
        subject0.setReadOnly();
        subject0.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 60);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray26, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray26);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray26);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray26);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:9160", strArray26);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray26, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray26);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray26);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters38 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:100", strArray26, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters40 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0", strArray26, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters42 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0.0.0.0(0.0.0.0):101", strArray26, true);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient43 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost8, "CassandraClient<%s-%d>", tSSLTransportParameters42);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient43.equals(null)", !hKerberosThriftClient43.equals(null));
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0422");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (byte) 100);
        java.lang.String str7 = cassandraHost6.getUrl();
        boolean boolean8 = cassandraHost6.isPerformNameResolution();
        java.util.concurrent.atomic.AtomicLong atomicLong10 = new java.util.concurrent.atomic.AtomicLong((long) 1);
        boolean boolean11 = cassandraHost6.equals((java.lang.Object) atomicLong10);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient13 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost6, "Subject(Subject):35");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient13.equals(null)", !hKerberosThriftClient13.equals(null));
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0423");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPublicCredentials();
        java.lang.String str3 = subject0.toString();
        boolean boolean4 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet5 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet6 = subject0.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = new me.prettyprint.cassandra.service.CassandraHost(":0(:0):-1", (int) '#');
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray20, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray20, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>:9160", strArray20, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>)", strArray20, true);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient29 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost9, "CassandraClient<%s-%d>:52", tSSLTransportParameters28);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient29.equals(null)", !hKerberosThriftClient29.equals(null));
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0424");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        boolean boolean3 = subject0.isReadOnly();
        java.lang.String[] strArray12 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray12);
        boolean boolean15 = subject0.equals((java.lang.Object) tSSLTransportParameters14);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost18 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):100", 9);
        java.lang.String str19 = cassandraHost18.getUrl();
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters38 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray36, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters39 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray36);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters40 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray36);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters42 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray36, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters44 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray36, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters46 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0", strArray36, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters47 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray36);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters48 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("9269", strArray36);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters50 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject", strArray36, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters52 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("-1:101", strArray36, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters54 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray36, true);
        boolean boolean55 = cassandraHost18.equals((java.lang.Object) tSSLTransportParameters54);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient57 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost18, "-1:0");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient57.equals(null)", !hKerberosThriftClient57.equals(null));
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0425");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        boolean boolean3 = subject0.isReadOnly();
        java.lang.String[] strArray12 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray12);
        boolean boolean15 = subject0.equals((java.lang.Object) tSSLTransportParameters14);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost18 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):9160", 1);
        boolean boolean19 = cassandraHost18.getUseThriftFramedTransport();
        cassandraHost18.setMaxWaitTimeWhenExhausted(10L);
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray32, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray32);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray32);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject(Subject):10", strArray32);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient38 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost18, "hi!:100", tSSLTransportParameters37);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient38.equals(null)", !hKerberosThriftClient38.equals(null));
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0426");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPrivateCredentials();
        java.lang.String str4 = subject0.toString();
        java.util.Set<java.lang.Object> objSet5 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1", (-1));
        boolean boolean9 = cassandraHost8.getUseThriftFramedTransport();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient11 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost8, "Subject(Subject):35");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient11.equals(null)", !hKerberosThriftClient11.equals(null));
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0427");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPublicCredentials();
        java.lang.String str3 = subject0.toString();
        boolean boolean4 = subject0.isReadOnly();
        subject0.setReadOnly();
        java.util.Set<java.lang.Object> objSet6 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):9160");
        boolean boolean9 = cassandraHost8.isPerformNameResolution();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient11 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost8, "(127.0.0.1)((127.0.0.1)):1");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient11.equals(null)", !hKerberosThriftClient11.equals(null));
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0428");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        subject0.setReadOnly();
        java.util.Set<java.security.Principal> principalSet4 = subject0.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("Subject", (int) (short) 60);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient9 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost7, "CassandraClient<%s-%d>");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient9.equals(null)", !hKerberosThriftClient9.equals(null));
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0429");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        boolean boolean4 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet5 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1");
        boolean boolean8 = cassandraHost7.getLifo();
        java.lang.String str9 = cassandraHost7.getUrl();
        java.lang.String[] strArray20 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray20, false);
        tSSLTransportParameters24.setTrustStore("", "");
        tSSLTransportParameters24.setTrustStore("Subject", "CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>))", "32", "(127.0.0.1):100");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient33 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost7, "hi!(hi!)(hi!(hi!)):9261", tSSLTransportParameters24);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient33.equals(null)", !hKerberosThriftClient33.equals(null));
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0430");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost4 = new me.prettyprint.cassandra.service.CassandraHost("0.0.0.0(0.0.0.0)");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient6 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost4, "(127.0.0.1):11");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient6.equals(null)", !hKerberosThriftClient6.equals(null));
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0431");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet3 = subject0.getPrincipals();
        java.util.Set<java.security.Principal> principalSet4 = subject0.getPrincipals();
        java.util.Set<java.security.Principal> principalSet5 = subject0.getPrincipals();
        java.lang.String str6 = subject0.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = new me.prettyprint.cassandra.service.CassandraHost("0.0.0.100", (int) 'a');
        java.lang.String[] strArray19 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray19, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):9160", strArray19, false);
        boolean boolean25 = cassandraHost9.equals((java.lang.Object) false);
        java.lang.String str26 = cassandraHost9.getIp();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient28 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost9, "CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>))(CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>))):50");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient28.equals(null)", !hKerberosThriftClient28.equals(null));
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0432");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        boolean boolean4 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet5 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet6 = subject0.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = new me.prettyprint.cassandra.service.CassandraHost("9269:9160", 98);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient11 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost9, "CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):10");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient11.equals(null)", !hKerberosThriftClient11.equals(null));
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0433");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        subject0.setReadOnly();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) '4');
        long long7 = cassandraHost6.getMaxWaitTimeWhenExhausted();
        cassandraHost6.setCassandraThriftSocketTimeout((-1));
        cassandraHost6.setMaxWaitTimeWhenExhausted(1L);
        cassandraHost6.setMaxActive(0);
        cassandraHost6.setMaxActive(301);
        cassandraHost6.setLifo(false);
        java.lang.String[] strArray32 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray32);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray32);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray32, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters38 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray32, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters40 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray32, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters42 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray32, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters43 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray32);
        tSSLTransportParameters43.setTrustStore("CassandraClient<%s-%d>", "127.0.0.1(127.0.0.1):10");
        tSSLTransportParameters43.setTrustStore("CassandraClient<%s-%d>", "CassandraClient<%s-%d>(CassandraClient<%s-%d>):9160", "(127.0.0.1):100", "0.0.0.0");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient52 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost6, "0.0.0.0(0.0.0.0):101", tSSLTransportParameters43);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient52.equals(null)", !hKerberosThriftClient52.equals(null));
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0434");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        boolean boolean3 = subject0.isReadOnly();
        java.lang.String[] strArray13 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray13);
        boolean boolean17 = subject0.equals((java.lang.Object) tSSLTransportParameters16);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost19 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>:9160");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient21 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost19, "CassandraClient<%s-%d>(CassandraClient<%s-%d>):9160");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient21.equals(null)", !hKerberosThriftClient21.equals(null));
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0435");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.lang.String str1 = subject0.toString();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.lang.String str3 = subject0.toString();
        java.lang.String str4 = subject0.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("");
        boolean boolean8 = cassandraHost6.equals((java.lang.Object) 0.0f);
        cassandraHost6.setUseSocketKeepalive(false);
        int int11 = cassandraHost6.getCassandraThriftSocketTimeout();
        java.lang.String[] strArray27 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray27);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray27);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray27, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray27, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray27, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray27);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters38 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)", strArray27, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters39 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!(hi!)", strArray27);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient40 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost6, "102", tSSLTransportParameters39);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient40.equals(null)", !hKerberosThriftClient40.equals(null));
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0436");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        subject0.setReadOnly();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        boolean boolean3 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("hi!");
        boolean boolean8 = cassandraHost6.equals((java.lang.Object) (byte) 10);
        int int9 = cassandraHost6.getCassandraThriftSocketTimeout();
        java.lang.String[] strArray26 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray26);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray26);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray26);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject", strArray26);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1", strArray26, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>:9160", strArray26);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("100", strArray26);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray26, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!(hi!)", strArray26);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient38 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost6, "(127.0.0.1):9", tSSLTransportParameters37);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient38.equals(null)", !hKerberosThriftClient38.equals(null));
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0437");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        boolean boolean4 = subject0.isReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("");
        boolean boolean8 = cassandraHost6.equals((java.lang.Object) 0.0f);
        int int9 = cassandraHost6.getCassandraThriftSocketTimeout();
        cassandraHost6.setUseSocketKeepalive(false);
        java.lang.String str12 = cassandraHost6.getHost();
        cassandraHost6.setLifo(true);
        long long15 = cassandraHost6.getMaxWaitTimeWhenExhausted();
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray33, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray33);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray33);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters38 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray33);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters39 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:9160", strArray33);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters41 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray33, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters42 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray33);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters43 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray33);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters45 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>)", strArray33, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters46 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray33);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters48 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray33, true);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient49 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost6, "CassandraClient<%s-%d>(CassandraClient<%s-%d>)", tSSLTransportParameters48);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient49.equals(null)", !hKerberosThriftClient49.equals(null));
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0438");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        subject0.setReadOnly();
        boolean boolean4 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet5 = subject0.getPublicCredentials();
        java.lang.String str6 = subject0.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = new me.prettyprint.cassandra.service.CassandraHost("");
        cassandraHost8.setMaxWaitTimeWhenExhausted((long) (short) 10);
        java.lang.String str11 = cassandraHost8.toString();
        cassandraHost8.setMaxWaitTimeWhenExhausted((long) (short) 1);
        cassandraHost8.setLifo(false);
        boolean boolean16 = cassandraHost8.getUseSocketKeepalive();
        int int17 = cassandraHost8.getPort();
        java.lang.String[] strArray30 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray30);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray30);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray30, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):9160", strArray30, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":0(:0)", strArray30);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient38 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost8, "127.0.0.1(127.0.0.1):97", tSSLTransportParameters37);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient38.equals(null)", !hKerberosThriftClient38.equals(null));
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0439");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        boolean boolean4 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet5 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = new me.prettyprint.cassandra.service.CassandraHost("");
        boolean boolean10 = cassandraHost8.equals((java.lang.Object) 0.0f);
        int int11 = cassandraHost8.getPort();
        java.lang.String str12 = cassandraHost8.getName();
        java.lang.String str13 = cassandraHost8.getHost();
        boolean boolean14 = cassandraHost8.getUseThriftFramedTransport();
        cassandraHost8.setUseThriftFramedTransport(false);
        java.lang.String[] strArray29 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray29);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray29);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray29);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray29, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):9260", strArray29);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient36 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost8, "-1:101", tSSLTransportParameters35);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient36.equals(null)", !hKerberosThriftClient36.equals(null));
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0440");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet3 = subject0.getPrincipals();
        java.util.Set<java.security.Principal> principalSet4 = subject0.getPrincipals();
        java.util.Set<java.security.Principal> principalSet5 = subject0.getPrincipals();
        java.lang.String str6 = subject0.toString();
        java.util.concurrent.atomic.AtomicLong atomicLong7 = new java.util.concurrent.atomic.AtomicLong();
        float float8 = atomicLong7.floatValue();
        long long9 = atomicLong7.get();
        long long11 = atomicLong7.getAndSet(0L);
        long long12 = atomicLong7.incrementAndGet();
        boolean boolean15 = atomicLong7.compareAndSet(10L, (long) 1);
        boolean boolean16 = subject0.equals((java.lang.Object) boolean15);
        java.util.Set<java.security.Principal> principalSet17 = subject0.getPrincipals();
        javax.security.auth.Subject subject18 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet19 = subject18.getPublicCredentials();
        subject18.setReadOnly();
        java.lang.String str21 = subject18.toString();
        java.lang.String str22 = subject18.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost24 = new me.prettyprint.cassandra.service.CassandraHost("");
        boolean boolean26 = cassandraHost24.equals((java.lang.Object) 0.0f);
        java.lang.String str27 = cassandraHost24.getName();
        boolean boolean28 = subject18.equals((java.lang.Object) cassandraHost24);
        java.lang.String str29 = cassandraHost24.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost32 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):9160", 1);
        cassandraHost32.setMaxWaitTimeWhenExhausted(0L);
        boolean boolean35 = cassandraHost24.equals((java.lang.Object) cassandraHost32);
        java.lang.String[] strArray45 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters47 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray45, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters49 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":9160", strArray45, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters51 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>:9160", strArray45, false);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient52 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost32, "9269(0.0.36.53):1", tSSLTransportParameters51);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient52.equals(null)", !hKerberosThriftClient52.equals(null));
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0441");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        subject0.setReadOnly();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPublicCredentials();
        java.lang.String[] strArray7 = new java.lang.String[] { "(127.0.0.1)((127.0.0.1)):9260", "CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters8 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray7);
        boolean boolean9 = subject0.equals((java.lang.Object) tSSLTransportParameters8);
        java.util.Set<java.lang.Object> objSet10 = subject0.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost13 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1", (-1));
        java.lang.String str14 = cassandraHost13.getUrl();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient16 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost13, "127.0.0.1(127.0.0.1)(127.0.0.1(127.0.0.1)):9160");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient16.equals(null)", !hKerberosThriftClient16.equals(null));
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0442");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet4 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet5 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet6 = subject0.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = new me.prettyprint.cassandra.service.CassandraHost("");
        int int9 = cassandraHost8.getMaxActive();
        cassandraHost8.setUseThriftFramedTransport(true);
        cassandraHost8.setMaxWaitTimeWhenExhausted(101L);
        cassandraHost8.setUseThriftFramedTransport(false);
        cassandraHost8.setUseThriftFramedTransport(true);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient19 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost8, "10");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient19.equals(null)", !hKerberosThriftClient19.equals(null));
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0443");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        subject0.setReadOnly();
        subject0.setReadOnly();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.lang.String str5 = subject0.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):0", (int) (byte) -2);
        cassandraHost8.setUseThriftFramedTransport(false);
        java.lang.String str11 = cassandraHost8.getHost();
        java.lang.String[] strArray20 = new java.lang.String[] { "-1", "CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:9160", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray20, false);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient27 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost8, "hi!:9160", tSSLTransportParameters26);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient27.equals(null)", !hKerberosThriftClient27.equals(null));
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0444");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPrivateCredentials();
        boolean boolean4 = subject0.isReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("0.0.0.32");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient8 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost6, "127.0.0.1(127.0.0.1)");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient8.equals(null)", !hKerberosThriftClient8.equals(null));
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0445");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        subject0.setReadOnly();
        boolean boolean4 = subject0.isReadOnly();
        java.lang.String str5 = subject0.toString();
        boolean boolean6 = subject0.isReadOnly();
        javax.security.auth.Subject subject7 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet8 = subject7.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet9 = subject7.getPrincipals();
        subject7.setReadOnly();
        boolean boolean11 = subject7.isReadOnly();
        java.lang.String str12 = subject7.toString();
        java.util.concurrent.atomic.AtomicLong atomicLong14 = new java.util.concurrent.atomic.AtomicLong(9260L);
        int int15 = atomicLong14.intValue();
        boolean boolean16 = subject7.equals((java.lang.Object) int15);
        boolean boolean17 = subject7.isReadOnly();
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray29, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray29);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray29);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray29);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray29);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0.0.0.10", strArray29, true);
        boolean boolean38 = subject7.equals((java.lang.Object) strArray29);
        boolean boolean39 = subject0.equals((java.lang.Object) strArray29);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost42 = new me.prettyprint.cassandra.service.CassandraHost("0.0.0.0", (int) (byte) 100);
        cassandraHost42.setMaxActive(0);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient46 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost42, "-1:0");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient46.equals(null)", !hKerberosThriftClient46.equals(null));
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0446");
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
        java.util.Set<java.lang.Object> objSet31 = subject0.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost33 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1(127.0.0.1):102");
        int int34 = cassandraHost33.getPort();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient36 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost33, "Subject(Subject):101");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient36.equals(null)", !hKerberosThriftClient36.equals(null));
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0447");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        java.lang.String str4 = subject0.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("");
        boolean boolean8 = cassandraHost6.equals((java.lang.Object) 0.0f);
        java.lang.String str9 = cassandraHost6.getName();
        boolean boolean10 = subject0.equals((java.lang.Object) cassandraHost6);
        java.util.Set<java.security.Principal> principalSet11 = subject0.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost13 = new me.prettyprint.cassandra.service.CassandraHost("");
        cassandraHost13.setMaxWaitTimeWhenExhausted((long) (short) 10);
        java.lang.String str16 = cassandraHost13.toString();
        int int17 = cassandraHost13.getCassandraThriftSocketTimeout();
        java.lang.String str18 = cassandraHost13.getHost();
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray31, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray31);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray31);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray31, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters39 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray31, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters40 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject", strArray31);
        tSSLTransportParameters40.requireClientAuth(false);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient43 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost13, "100(0.0.0.100):100", tSSLTransportParameters40);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient43.equals(null)", !hKerberosThriftClient43.equals(null));
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0448");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        subject0.setReadOnly();
        subject0.setReadOnly();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.lang.String str5 = subject0.toString();
        boolean boolean6 = subject0.isReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = new me.prettyprint.cassandra.service.CassandraHost("", 0);
        java.lang.String str10 = cassandraHost9.getHost();
        boolean boolean11 = cassandraHost9.getUseSocketKeepalive();
        java.lang.String str12 = cassandraHost9.getName();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost14 = new me.prettyprint.cassandra.service.CassandraHost("hi!");
        boolean boolean16 = cassandraHost14.equals((java.lang.Object) (byte) 10);
        boolean boolean17 = cassandraHost9.equals((java.lang.Object) (byte) 10);
        java.lang.String str18 = cassandraHost9.toString();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient20 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost9, "CassandraClient<%s-%d>(CassandraClient<%s-%d>):1");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient20.equals(null)", !hKerberosThriftClient20.equals(null));
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0449");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        subject0.setReadOnly();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 100);
        cassandraHost6.setMaxWaitTimeWhenExhausted((long) 10);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost10 = new me.prettyprint.cassandra.service.CassandraHost("");
        boolean boolean11 = cassandraHost6.equals((java.lang.Object) cassandraHost10);
        java.lang.String str12 = cassandraHost6.getHost();
        cassandraHost6.setUseSocketKeepalive(true);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray24, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray24);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray24);
        tSSLTransportParameters28.setKeyStore("-1", "127.0.0.1");
        tSSLTransportParameters28.requireClientAuth(false);
        tSSLTransportParameters28.requireClientAuth(false);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient36 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost6, "-1", tSSLTransportParameters28);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient36.equals(null)", !hKerberosThriftClient36.equals(null));
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0450");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        boolean boolean3 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet5 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet6 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet7 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet8 = subject0.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost10 = new me.prettyprint.cassandra.service.CassandraHost("hi!");
        cassandraHost10.setUseSocketKeepalive(false);
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray23, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray23);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1", strArray23);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:100", strArray23, false);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient30 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost10, "CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1", tSSLTransportParameters29);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient30.equals(null)", !hKerberosThriftClient30.equals(null));
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0451");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet4 = subject0.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) (short) 1);
        int int8 = cassandraHost7.getMaxActive();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient10 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost7, "");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient10.equals(null)", !hKerberosThriftClient10.equals(null));
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0452");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPublicCredentials();
        java.lang.String str3 = subject0.toString();
        boolean boolean4 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet5 = subject0.getPrivateCredentials();
        java.lang.String str6 = subject0.toString();
        boolean boolean7 = subject0.isReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost10 = new me.prettyprint.cassandra.service.CassandraHost("1", (int) (byte) 10);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray15);
        tSSLTransportParameters17.requireClientAuth(false);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient20 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost10, "0", tSSLTransportParameters17);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient20.equals(null)", !hKerberosThriftClient20.equals(null));
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0453");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:100", strArray12, false);
        boolean boolean19 = subject0.equals((java.lang.Object) strArray12);
        boolean boolean20 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet21 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost25 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 100);
        cassandraHost25.setMaxWaitTimeWhenExhausted(0L);
        int int28 = cassandraHost25.getPort();
        boolean boolean29 = cassandraHost25.getLifo();
        int int30 = cassandraHost25.getCassandraThriftSocketTimeout();
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters48 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray46, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters49 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray46);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters50 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray46);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters52 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray46, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters54 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray46, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters55 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>)):10", strArray46);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters56 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray46);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters57 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0.0.0.10", strArray46);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters58 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>))(CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>))):50", strArray46);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient59 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost25, "-1", tSSLTransportParameters58);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient59.equals(null)", !hKerberosThriftClient59.equals(null));
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0454");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPrivateCredentials();
        java.lang.String str4 = subject0.toString();
        subject0.setReadOnly();
        java.util.Set<java.lang.Object> objSet6 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1(127.0.0.1):102");
        int int9 = cassandraHost8.getPort();
        javax.security.auth.Subject subject11 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet12 = subject11.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet13 = subject11.getPrincipals();
        java.util.Set<java.lang.Object> objSet14 = subject11.getPrivateCredentials();
        java.util.concurrent.atomic.AtomicLong atomicLong16 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 10);
        float float17 = atomicLong16.floatValue();
        long long18 = atomicLong16.incrementAndGet();
        double double19 = atomicLong16.doubleValue();
        boolean boolean20 = subject11.equals((java.lang.Object) double19);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray31, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray31);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray31);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:9160", strArray31);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters38 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("100", strArray31, true);
        tSSLTransportParameters38.setTrustStore("", "(127.0.0.1)((127.0.0.1)):9260");
        boolean boolean42 = subject11.equals((java.lang.Object) tSSLTransportParameters38);
        tSSLTransportParameters38.requireClientAuth(false);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient45 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost8, "214", tSSLTransportParameters38);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient45.equals(null)", !hKerberosThriftClient45.equals(null));
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0455");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        boolean boolean3 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet5 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.util.Set<java.lang.Object> objSet7 = subject0.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost10 = new me.prettyprint.cassandra.service.CassandraHost("0", 9160);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient12 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost10, "Subject:35");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient12.equals(null)", !hKerberosThriftClient12.equals(null));
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0456");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet3 = subject0.getPrincipals();
        subject0.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):1");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient8 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost6, "0");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient8.equals(null)", !hKerberosThriftClient8.equals(null));
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0457");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        subject0.setReadOnly();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        boolean boolean3 = subject0.isReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("hi!", 100);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient8 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost6, "127.0.0.1(127.0.0.1)");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient8.equals(null)", !hKerberosThriftClient8.equals(null));
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0458");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPublicCredentials();
        java.lang.String str3 = subject0.toString();
        boolean boolean4 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet5 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet6 = subject0.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (byte) 100);
        java.lang.String str10 = cassandraHost9.getUrl();
        boolean boolean11 = cassandraHost9.getUseThriftFramedTransport();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray23, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray23);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray23);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray23, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray23, false);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient32 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost9, "(127.0.0.1)((127.0.0.1)):-2", tSSLTransportParameters31);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient32.equals(null)", !hKerberosThriftClient32.equals(null));
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0459");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPrivateCredentials();
        java.lang.String str4 = subject0.toString();
        subject0.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = new me.prettyprint.cassandra.service.CassandraHost("0.0.0.0(0.0.0.0):101", (int) (short) 50);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient10 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost8, "100:0");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient10.equals(null)", !hKerberosThriftClient10.equals(null));
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0460");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        boolean boolean4 = subject0.isReadOnly();
        java.lang.String str5 = subject0.toString();
        java.lang.String[] strArray15 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):9160", strArray15);
        boolean boolean20 = subject0.equals((java.lang.Object) strArray15);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost23 = new me.prettyprint.cassandra.service.CassandraHost("-1:101", 9260);
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters40 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray38, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters41 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray38);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters42 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray38);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters43 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:9160", strArray38);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters45 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("100", strArray38, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters46 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):9160", strArray38);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters48 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!(hi!)(hi!(hi!)):9261", strArray38, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters50 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("-1:101", strArray38, false);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient51 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost23, "hi!(hi!)", tSSLTransportParameters50);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient51.equals(null)", !hKerberosThriftClient51.equals(null));
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0461");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        subject0.setReadOnly();
        boolean boolean4 = subject0.isReadOnly();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray13);
        boolean boolean18 = subject0.equals((java.lang.Object) tSSLTransportParameters17);
        boolean boolean19 = subject0.isReadOnly();
        subject0.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost23 = new me.prettyprint.cassandra.service.CassandraHost("", 0);
        java.lang.String str24 = cassandraHost23.getHost();
        java.lang.String str25 = cassandraHost23.getIp();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient27 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost23, "98");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient27.equals(null)", !hKerberosThriftClient27.equals(null));
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0462");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.lang.String str2 = subject0.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1", (int) (short) 102);
        java.lang.String str6 = cassandraHost5.getName();
        cassandraHost5.setMaxActive((int) (byte) 100);
        java.lang.String[] strArray22 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray22);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray22);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("10", strArray22, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("100", strArray22);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):35", strArray22, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):0", strArray22, true);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient32 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost5, "11", tSSLTransportParameters31);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient32.equals(null)", !hKerberosThriftClient32.equals(null));
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0463");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        subject0.setReadOnly();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        subject0.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):9160");
        long long6 = cassandraHost5.getMaxWaitTimeWhenExhausted();
        boolean boolean7 = cassandraHost5.getLifo();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient9 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost5, "214");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient9.equals(null)", !hKerberosThriftClient9.equals(null));
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0464");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        subject0.setReadOnly();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.lang.String str3 = subject0.toString();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet5 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):9160", 1);
        boolean boolean9 = cassandraHost8.getUseThriftFramedTransport();
        boolean boolean10 = cassandraHost8.getUseSocketKeepalive();
        cassandraHost8.setLifo(false);
        long long13 = cassandraHost8.getMaxWaitTimeWhenExhausted();
        java.lang.String[] strArray22 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray22);
        tSSLTransportParameters23.setTrustStore("hi!:9160", "CassandraClient<%s-%d>");
        tSSLTransportParameters23.setTrustStore("CassandraClient<%s-%d>(CassandraClient<%s-%d>):1", "CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>))");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient30 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost8, "0.0.0.100(0.0.0.100):9260", tSSLTransportParameters23);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient30.equals(null)", !hKerberosThriftClient30.equals(null));
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0465");
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
        me.prettyprint.cassandra.service.CassandraHost cassandraHost21 = new me.prettyprint.cassandra.service.CassandraHost("1", 1);
        int int22 = cassandraHost21.getMaxActive();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient24 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost21, "hi!(hi!)");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient24.equals(null)", !hKerberosThriftClient24.equals(null));
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0466");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        subject0.setReadOnly();
        subject0.setReadOnly();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1(127.0.0.1)", (int) (byte) -1);
        boolean boolean7 = cassandraHost6.getLifo();
        boolean boolean8 = cassandraHost6.getUseThriftFramedTransport();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient10 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost6, "Subject(Subject):9160");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient10.equals(null)", !hKerberosThriftClient10.equals(null));
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0467");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet3 = subject0.getPrincipals();
        java.util.Set<java.security.Principal> principalSet4 = subject0.getPrincipals();
        java.util.Set<java.security.Principal> principalSet5 = subject0.getPrincipals();
        java.lang.String str6 = subject0.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = new me.prettyprint.cassandra.service.CassandraHost("");
        boolean boolean10 = cassandraHost8.equals((java.lang.Object) 0.0f);
        int int11 = cassandraHost8.getCassandraThriftSocketTimeout();
        cassandraHost8.setUseSocketKeepalive(false);
        cassandraHost8.setLifo(false);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost18 = new me.prettyprint.cassandra.service.CassandraHost("", 0);
        java.lang.String str19 = cassandraHost18.getHost();
        boolean boolean20 = cassandraHost18.getUseSocketKeepalive();
        java.lang.String str21 = cassandraHost18.getName();
        boolean boolean22 = cassandraHost8.equals((java.lang.Object) cassandraHost18);
        boolean boolean23 = cassandraHost8.getUseThriftFramedTransport();
        java.lang.String str24 = cassandraHost8.getIp();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient26 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost8, "");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient26.equals(null)", !hKerberosThriftClient26.equals(null));
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0468");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:100", strArray12, false);
        boolean boolean19 = subject0.equals((java.lang.Object) strArray12);
        java.util.Set<java.security.Principal> principalSet20 = subject0.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost23 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1", (int) ' ');
        int int24 = cassandraHost23.getMaxActive();
        cassandraHost23.setMaxActive(32);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost30 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1", (int) ' ');
        int int31 = cassandraHost30.getPort();
        java.lang.String[] strArray47 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters49 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray47, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters50 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray47);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters51 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray47);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters52 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray47);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters53 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:9160", strArray47);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters55 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray47, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters56 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray47);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters58 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray47, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters59 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("10", strArray47);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters61 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!(hi!)", strArray47, true);
        boolean boolean62 = cassandraHost30.equals((java.lang.Object) tSSLTransportParameters61);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient63 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost23, "CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>))", tSSLTransportParameters61);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient63.equals(null)", !hKerberosThriftClient63.equals(null));
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0469");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:100", strArray12, false);
        boolean boolean19 = subject0.equals((java.lang.Object) strArray12);
        boolean boolean20 = subject0.isReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost22 = new me.prettyprint.cassandra.service.CassandraHost("");
        int int23 = cassandraHost22.getMaxActive();
        cassandraHost22.setUseThriftFramedTransport(true);
        cassandraHost22.setMaxWaitTimeWhenExhausted(101L);
        cassandraHost22.setUseThriftFramedTransport(false);
        java.lang.String str30 = cassandraHost22.toString();
        boolean boolean31 = cassandraHost22.getUseThriftFramedTransport();
        java.lang.String[] strArray41 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters43 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray41, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters44 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray41);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters46 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("100", strArray41, false);
        tSSLTransportParameters46.setTrustStore("10", "127.0.0.1(127.0.0.1):102", "(127.0.0.1):9160", "Subject:\n");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient52 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost22, ":0(:0):10", tSSLTransportParameters46);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient52.equals(null)", !hKerberosThriftClient52.equals(null));
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0470");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:100", strArray12, false);
        boolean boolean19 = subject0.equals((java.lang.Object) strArray12);
        java.util.Set<java.security.Principal> principalSet20 = subject0.getPrincipals();
        java.lang.String[] strArray33 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray33);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray33);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("10", strArray33, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters38 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("100", strArray33);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters40 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):35", strArray33, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters41 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("100", strArray33);
        boolean boolean42 = subject0.equals((java.lang.Object) "100");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost44 = new me.prettyprint.cassandra.service.CassandraHost("hi!");
        int int45 = cassandraHost44.getMaxActive();
        java.lang.String str46 = cassandraHost44.getIp();
        boolean boolean47 = cassandraHost44.getLifo();
        cassandraHost44.setMaxActive((int) (byte) 12);
        java.lang.String[] strArray69 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters71 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray69, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters72 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray69);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters73 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray69);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters74 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray69);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters75 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:9160", strArray69);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters77 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray69, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters78 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray69);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters79 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray69);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters81 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:100", strArray69, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters83 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0", strArray69, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters85 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0.0.0.0(0.0.0.0):101", strArray69, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters86 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("9269:9160", strArray69);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters87 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0.0.0.0", strArray69);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient88 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost44, "127.0.0.1", tSSLTransportParameters87);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient88.equals(null)", !hKerberosThriftClient88.equals(null));
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0471");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet4 = subject0.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("Subject(Subject):52");
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray20, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:9160", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("100", strArray20, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1)):9160", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!(hi!)(hi!(hi!)):9261", strArray20, false);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient31 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost6, "102", tSSLTransportParameters30);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient31.equals(null)", !hKerberosThriftClient31.equals(null));
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0472");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        subject0.setReadOnly();
        boolean boolean4 = subject0.isReadOnly();
        java.lang.String str5 = subject0.toString();
        java.util.Set<java.lang.Object> objSet6 = subject0.getPrivateCredentials();
        subject0.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1");
        cassandraHost9.setUseThriftFramedTransport(true);
        java.lang.String[] strArray27 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray27);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray27);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray27, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray27, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray27, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray27, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters38 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray27);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters40 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0", strArray27, false);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient41 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost9, "209", tSSLTransportParameters40);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient41.equals(null)", !hKerberosThriftClient41.equals(null));
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0473");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        subject0.setReadOnly();
        subject0.setReadOnly();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPublicCredentials();
        java.util.concurrent.atomic.AtomicLong atomicLong4 = new java.util.concurrent.atomic.AtomicLong();
        float float5 = atomicLong4.floatValue();
        long long6 = atomicLong4.get();
        long long8 = atomicLong4.getAndSet(0L);
        long long9 = atomicLong4.incrementAndGet();
        atomicLong4.lazySet((long) (short) 102);
        boolean boolean12 = subject0.equals((java.lang.Object) atomicLong4);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost14 = new me.prettyprint.cassandra.service.CassandraHost("");
        boolean boolean16 = cassandraHost14.equals((java.lang.Object) 0.0f);
        int int17 = cassandraHost14.getCassandraThriftSocketTimeout();
        cassandraHost14.setMaxActive((int) (short) 1);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient21 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost14, "9269");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient21.equals(null)", !hKerberosThriftClient21.equals(null));
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0474");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        subject0.setReadOnly();
        boolean boolean4 = subject0.isReadOnly();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray13);
        boolean boolean18 = subject0.equals((java.lang.Object) tSSLTransportParameters17);
        boolean boolean19 = subject0.isReadOnly();
        subject0.setReadOnly();
        java.util.Set<java.security.Principal> principalSet21 = subject0.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost24 = new me.prettyprint.cassandra.service.CassandraHost("", (int) (short) 100);
        cassandraHost24.setMaxWaitTimeWhenExhausted((long) 10);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost28 = new me.prettyprint.cassandra.service.CassandraHost("");
        boolean boolean29 = cassandraHost24.equals((java.lang.Object) cassandraHost28);
        java.lang.String str30 = cassandraHost24.getHost();
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters48 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray46, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters49 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray46);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters50 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray46);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters52 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray46, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters54 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray46, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters56 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0", strArray46, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters57 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray46);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters59 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0.0.0.0(0.0.0.0):101", strArray46, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters60 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("8", strArray46);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient61 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost24, "0.0.0.0(0.0.0.0):101", tSSLTransportParameters60);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient61.equals(null)", !hKerberosThriftClient61.equals(null));
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0475");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        subject0.setReadOnly();
        boolean boolean4 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet5 = subject0.getPublicCredentials();
        java.lang.String str6 = subject0.toString();
        subject0.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = new me.prettyprint.cassandra.service.CassandraHost("hi!");
        cassandraHost9.setMaxActive((int) (short) 0);
        int int12 = cassandraHost9.getPort();
        long long13 = cassandraHost9.getMaxWaitTimeWhenExhausted();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient15 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost9, "Subject(Subject):10");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient15.equals(null)", !hKerberosThriftClient15.equals(null));
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0476");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPrivateCredentials();
        boolean boolean4 = subject0.isReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):9160", 1);
        boolean boolean8 = cassandraHost7.getUseThriftFramedTransport();
        boolean boolean9 = cassandraHost7.getUseSocketKeepalive();
        cassandraHost7.setCassandraThriftSocketTimeout((int) 'a');
        boolean boolean12 = cassandraHost7.getUseThriftFramedTransport();
        int int13 = cassandraHost7.getPort();
        boolean boolean14 = cassandraHost7.isPerformNameResolution();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient16 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost7, "127.0.0.1(127.0.0.1):97");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient16.equals(null)", !hKerberosThriftClient16.equals(null));
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0477");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost5 = new me.prettyprint.cassandra.service.CassandraHost("0");
        cassandraHost5.setCassandraThriftSocketTimeout(111);
        long long8 = cassandraHost5.getMaxWaitTimeWhenExhausted();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient10 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost5, "9269");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient10.equals(null)", !hKerberosThriftClient10.equals(null));
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0478");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        boolean boolean3 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet5 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.util.Set<java.lang.Object> objSet7 = subject0.getPublicCredentials();
        boolean boolean8 = subject0.isReadOnly();
        java.util.Set<java.security.Principal> principalSet9 = subject0.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost12 = new me.prettyprint.cassandra.service.CassandraHost("", 0);
        boolean boolean13 = cassandraHost12.getUseSocketKeepalive();
        cassandraHost12.setCassandraThriftSocketTimeout(35);
        java.lang.String str16 = cassandraHost12.toString();
        java.lang.String str17 = cassandraHost12.getIp();
        int int18 = cassandraHost12.getMaxActive();
        java.lang.String[] strArray30 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray30);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray30, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("100", strArray30, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>):1", strArray30);
        tSSLTransportParameters36.requireClientAuth(true);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient39 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost12, "(127.0.0.1):1", tSSLTransportParameters36);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient39.equals(null)", !hKerberosThriftClient39.equals(null));
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0479");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        boolean boolean4 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet5 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost7 = new me.prettyprint.cassandra.service.CassandraHost("hi!");
        cassandraHost7.setMaxActive((int) (short) 0);
        int int10 = cassandraHost7.getPort();
        cassandraHost7.setUseThriftFramedTransport(false);
        boolean boolean13 = cassandraHost7.getUseSocketKeepalive();
        cassandraHost7.setUseSocketKeepalive(false);
        cassandraHost7.setUseSocketKeepalive(false);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient19 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost7, ":9160(:9160)");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient19.equals(null)", !hKerberosThriftClient19.equals(null));
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0480");
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
        java.util.Set<java.lang.Object> objSet31 = subject0.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost34 = new me.prettyprint.cassandra.service.CassandraHost("Subject:\n", (int) '4');
        boolean boolean35 = cassandraHost34.getLifo();
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters51 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray49, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters52 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray49);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters53 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray49);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters55 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray49, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters57 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray49, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters59 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0", strArray49, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters60 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray49);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters62 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0.0.0.0(0.0.0.0):101", strArray49, false);
        boolean boolean63 = cassandraHost34.equals((java.lang.Object) false);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient65 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost34, "Subject(Subject):102");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient65.equals(null)", !hKerberosThriftClient65.equals(null));
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0481");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPrivateCredentials();
        java.lang.String str5 = subject0.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1):9160", 1);
        boolean boolean9 = cassandraHost8.isPerformNameResolution();
        cassandraHost8.setUseThriftFramedTransport(true);
        cassandraHost8.setUseSocketKeepalive(false);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient15 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost8, "0.0.0.100:102");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient15.equals(null)", !hKerberosThriftClient15.equals(null));
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0482");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet4 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet5 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet6 = subject0.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (byte) 100);
        cassandraHost9.setMaxActive((int) (byte) 10);
        boolean boolean12 = cassandraHost9.getUseThriftFramedTransport();
        java.util.concurrent.atomic.AtomicLong atomicLong14 = new java.util.concurrent.atomic.AtomicLong((long) (short) 0);
        boolean boolean15 = cassandraHost9.equals((java.lang.Object) (short) 0);
        cassandraHost9.setUseSocketKeepalive(false);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient19 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost9, "CassandraClient<%s-%d>(CassandraClient<%s-%d>):1");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient19.equals(null)", !hKerberosThriftClient19.equals(null));
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0483");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        boolean boolean3 = subject0.isReadOnly();
        java.lang.String[] strArray12 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray12);
        boolean boolean15 = subject0.equals((java.lang.Object) tSSLTransportParameters14);
        java.util.Set<java.lang.Object> objSet16 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet17 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost20 = new me.prettyprint.cassandra.service.CassandraHost("Subject:\n", (int) '#');
        java.lang.String str21 = cassandraHost20.getUrl();
        cassandraHost20.setUseSocketKeepalive(true);
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray33, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray33, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters38 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters(":0", strArray33);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient39 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost20, "CassandraClient<%s-%d>(CassandraClient<%s-%d>):10", tSSLTransportParameters38);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient39.equals(null)", !hKerberosThriftClient39.equals(null));
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0484");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        boolean boolean3 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPrivateCredentials();
        java.lang.String[] strArray13 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject(Subject):10", strArray13);
        boolean boolean16 = subject0.equals((java.lang.Object) "Subject(Subject):10");
        java.util.Set<java.security.Principal> principalSet17 = subject0.getPrincipals();
        java.util.Set<java.security.Principal> principalSet18 = subject0.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost21 = new me.prettyprint.cassandra.service.CassandraHost("hi!(hi!):9160", (int) (byte) 100);
        boolean boolean22 = cassandraHost21.getUseSocketKeepalive();
        cassandraHost21.setLifo(true);
        java.lang.String[] strArray41 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters43 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray41, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters44 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray41);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters45 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray41);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters46 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray41);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters47 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:9160", strArray41);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters49 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray41, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters50 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray41);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters51 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray41);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters53 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>(CassandraClient<%s-%d>)", strArray41, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters55 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:35", strArray41, false);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient56 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost21, "(127.0.0.1):0", tSSLTransportParameters55);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient56.equals(null)", !hKerberosThriftClient56.equals(null));
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0485");
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
        me.prettyprint.cassandra.service.CassandraHost cassandraHost19 = new me.prettyprint.cassandra.service.CassandraHost("");
        cassandraHost19.setMaxWaitTimeWhenExhausted((long) (short) 10);
        java.lang.String str22 = cassandraHost19.toString();
        cassandraHost19.setMaxWaitTimeWhenExhausted((long) (short) 1);
        cassandraHost19.setMaxWaitTimeWhenExhausted((long) (byte) 1);
        java.lang.String str27 = cassandraHost19.toString();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient29 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost19, ":0");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient29.equals(null)", !hKerberosThriftClient29.equals(null));
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0486");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        subject0.setReadOnly();
        java.lang.String str3 = subject0.toString();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet5 = subject0.getPrincipals();
        boolean boolean6 = subject0.isReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = new me.prettyprint.cassandra.service.CassandraHost("-1", 0);
        boolean boolean10 = subject0.equals((java.lang.Object) "-1");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost12 = new me.prettyprint.cassandra.service.CassandraHost("hi!:100");
        long long13 = cassandraHost12.getMaxWaitTimeWhenExhausted();
        cassandraHost12.setLifo(true);
        int int16 = cassandraHost12.getPort();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient18 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost12, "-1(-1):35");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient18.equals(null)", !hKerberosThriftClient18.equals(null));
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0487");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        boolean boolean3 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet5 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        java.util.Set<java.lang.Object> objSet7 = subject0.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost10 = new me.prettyprint.cassandra.service.CassandraHost(":0(", (int) (byte) 0);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient12 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost10, "0");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient12.equals(null)", !hKerberosThriftClient12.equals(null));
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0488");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPrivateCredentials();
        java.lang.String str4 = subject0.toString();
        java.util.Set<java.lang.Object> objSet5 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = new me.prettyprint.cassandra.service.CassandraHost("", 0);
        java.lang.String str9 = cassandraHost8.getHost();
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray20, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1)((127.0.0.1))", strArray20, true);
        tSSLTransportParameters26.requireClientAuth(false);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient29 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost8, "CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1", tSSLTransportParameters26);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient29.equals(null)", !hKerberosThriftClient29.equals(null));
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0489");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:100", strArray12, false);
        boolean boolean19 = subject0.equals((java.lang.Object) strArray12);
        boolean boolean20 = subject0.isReadOnly();
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray30, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray30);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray30);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray30);
        boolean boolean36 = subject0.equals((java.lang.Object) strArray30);
        me.prettyprint.cassandra.service.CassandraHost cassandraHost38 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1");
        me.prettyprint.cassandra.service.CassandraHost cassandraHost41 = new me.prettyprint.cassandra.service.CassandraHost("127.0.0.1", 9160);
        java.util.concurrent.atomic.AtomicLong atomicLong43 = new java.util.concurrent.atomic.AtomicLong((long) '#');
        boolean boolean44 = cassandraHost41.equals((java.lang.Object) '#');
        java.lang.String str45 = cassandraHost41.getHost();
        boolean boolean46 = cassandraHost38.equals((java.lang.Object) cassandraHost41);
        cassandraHost41.setLifo(false);
        boolean boolean49 = cassandraHost41.isPerformNameResolution();
        java.lang.String[] strArray62 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters64 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray62, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters65 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray62);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters66 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray62);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters68 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray62, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters70 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray62, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters71 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray62);
        tSSLTransportParameters71.setTrustStore("9269", "CassandraClient<%s-%d>(CassandraClient<%s-%d>)(CassandraClient<%s-%d>(CassandraClient<%s-%d>))");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient75 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost41, "32(0.0.0.32):50", tSSLTransportParameters71);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient75.equals(null)", !hKerberosThriftClient75.equals(null));
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0490");
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
        me.prettyprint.cassandra.service.CassandraHost cassandraHost13 = new me.prettyprint.cassandra.service.CassandraHost("Subject", (int) (short) 60);
        int int14 = cassandraHost13.getPort();
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient16 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost13, "hi!");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient16.equals(null)", !hKerberosThriftClient16.equals(null));
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0491");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        boolean boolean3 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet5 = subject0.getPrivateCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>", (int) (short) -1);
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray20, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("-1", strArray20);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient27 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost8, "Subject(Subject)", tSSLTransportParameters26);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient27.equals(null)", !hKerberosThriftClient27.equals(null));
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0492");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        subject0.setReadOnly();
        boolean boolean4 = subject0.isReadOnly();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray13);
        boolean boolean18 = subject0.equals((java.lang.Object) tSSLTransportParameters17);
        boolean boolean19 = subject0.isReadOnly();
        subject0.setReadOnly();
        java.util.Set<java.security.Principal> principalSet21 = subject0.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost24 = new me.prettyprint.cassandra.service.CassandraHost("Subject:\n", 101);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient26 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost24, ":0(:0):-1");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient26.equals(null)", !hKerberosThriftClient26.equals(null));
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0493");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet3 = subject0.getPrincipals();
        javax.security.auth.Subject subject4 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet5 = subject4.getPublicCredentials();
        subject4.setReadOnly();
        java.lang.String str7 = subject4.toString();
        java.lang.String str8 = subject4.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost10 = new me.prettyprint.cassandra.service.CassandraHost("");
        boolean boolean12 = cassandraHost10.equals((java.lang.Object) 0.0f);
        java.lang.String str13 = cassandraHost10.getName();
        boolean boolean14 = subject4.equals((java.lang.Object) cassandraHost10);
        java.lang.String str15 = cassandraHost10.toString();
        int int16 = cassandraHost10.getPort();
        java.lang.String str17 = cassandraHost10.toString();
        cassandraHost10.setCassandraThriftSocketTimeout((int) (byte) 1);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient21 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost10, "9269");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient21.equals(null)", !hKerberosThriftClient21.equals(null));
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0494");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        subject0.setReadOnly();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        java.util.Set<java.lang.Object> objSet3 = subject0.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("hi!", (int) (byte) 100);
        cassandraHost6.setMaxActive((int) (byte) 10);
        boolean boolean9 = cassandraHost6.getUseThriftFramedTransport();
        java.lang.String str10 = cassandraHost6.getUrl();
        cassandraHost6.setUseSocketKeepalive(false);
        boolean boolean13 = cassandraHost6.isPerformNameResolution();
        java.lang.String str14 = cassandraHost6.getIp();
        java.lang.String[] strArray29 = new java.lang.String[] { "CassandraClient<%s-%d>", "hi!", "hi!", "hi!", "hi!", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray29);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray29);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray29, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1", strArray29, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray29, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters39 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray29, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters40 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray29);
        tSSLTransportParameters40.setTrustStore("CassandraClient<%s-%d>", "127.0.0.1(127.0.0.1):10");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient44 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost6, ":0", tSSLTransportParameters40);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient44.equals(null)", !hKerberosThriftClient44.equals(null));
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0495");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        boolean boolean3 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet5 = subject0.getPublicCredentials();
        java.util.Set<java.security.Principal> principalSet6 = subject0.getPrincipals();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost9 = new me.prettyprint.cassandra.service.CassandraHost("0", 9160);
        cassandraHost9.setMaxWaitTimeWhenExhausted((long) (byte) 102);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray24, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray24);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray24);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray24);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray24);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("0.0.0.10", strArray24, true);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient33 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost9, "9", tSSLTransportParameters32);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient33.equals(null)", !hKerberosThriftClient33.equals(null));
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0496");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPrivateCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        boolean boolean3 = subject0.isReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("Subject:\n", (int) '#');
        boolean boolean7 = cassandraHost6.isPerformNameResolution();
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray19, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("CassandraClient<%s-%d>", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray19);
        tSSLTransportParameters25.setKeyStore("-1:0", "102");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient29 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost6, "127.0.0.1(127.0.0.1):102", tSSLTransportParameters25);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient29.equals(null)", !hKerberosThriftClient29.equals(null));
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0497");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet2 = subject0.getPrivateCredentials();
        java.lang.String str3 = subject0.toString();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("Subject:\n", (int) '#');
        cassandraHost6.setMaxWaitTimeWhenExhausted((long) ' ');
        boolean boolean9 = cassandraHost6.getUseSocketKeepalive();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray23, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray23);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray23);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray23, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray23, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1(127.0.0.1):102", strArray23);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("127.0.0.1(127.0.0.1):102", strArray23);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient34 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost6, ":100", tSSLTransportParameters33);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient34.equals(null)", !hKerberosThriftClient34.equals(null));
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0498");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        subject0.setReadOnly();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        subject0.setReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("(127.0.0.1)((127.0.0.1)):1", (int) (short) 50);
        cassandraHost6.setUseSocketKeepalive(false);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient10 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost6, "9160");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient10.equals(null)", !hKerberosThriftClient10.equals(null));
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0499");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        java.util.Set<java.lang.Object> objSet1 = subject0.getPublicCredentials();
        subject0.setReadOnly();
        subject0.setReadOnly();
        boolean boolean4 = subject0.isReadOnly();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost6 = new me.prettyprint.cassandra.service.CassandraHost("CassandraClient<%s-%d>(CassandraClient<%s-%d>):-1");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "CassandraClient<%s-%d>", "(127.0.0.1):9160", "CassandraClient<%s-%d>", "(127.0.0.1):9160" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("(127.0.0.1):9160", strArray17, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("Subject:\n", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!:9160", strArray17);
        tSSLTransportParameters22.setTrustStore("hi!:9160", "Subject");
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient26 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost6, "(127.0.0.1)((127.0.0.1)):98", tSSLTransportParameters22);
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient26.equals(null)", !hKerberosThriftClient26.equals(null));
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0500");
        javax.security.auth.Subject subject0 = new javax.security.auth.Subject();
        subject0.setReadOnly();
        java.util.Set<java.security.Principal> principalSet2 = subject0.getPrincipals();
        boolean boolean3 = subject0.isReadOnly();
        java.util.Set<java.lang.Object> objSet4 = subject0.getPublicCredentials();
        java.util.Set<java.lang.Object> objSet5 = subject0.getPublicCredentials();
        me.prettyprint.cassandra.service.CassandraHost cassandraHost8 = new me.prettyprint.cassandra.service.CassandraHost("32", 50);
        cassandraHost8.setUseThriftFramedTransport(false);
        me.prettyprint.cassandra.connection.client.HKerberosThriftClient hKerberosThriftClient12 = new me.prettyprint.cassandra.connection.client.HKerberosThriftClient(subject0, cassandraHost8, "(127.0.0.1):0");
        org.junit.Assert.assertTrue("Contract failed: !hKerberosThriftClient12.equals(null)", !hKerberosThriftClient12.equals(null));
    }
}

