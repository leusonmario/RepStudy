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
        java.lang.String[] strArray7 = new java.lang.String[] { "", "", "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters8 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray7);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray7);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray7, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray7, false);
        tSSLTransportParameters13.setKeyStore("hi!", "hi!", "", "hi!");
        tSSLTransportParameters13.setKeyStore("", "", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test15502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15502");
        java.lang.String[] strArray10 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, false);
        tSSLTransportParameters23.setTrustStore("hi!", "hi!");
        tSSLTransportParameters23.setTrustStore("", "hi!", "", "hi!");
        tSSLTransportParameters23.setTrustStore("", "hi!", "hi!", "hi!");
        tSSLTransportParameters23.setTrustStore("", "hi!");
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test15503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15503");
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        tSSLTransportParameters15.requireClientAuth(false);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test15504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15504");
        java.lang.String[] strArray16 = new java.lang.String[] { "", "", "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16, true);
        tSSLTransportParameters35.setTrustStore("hi!", "hi!");
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test15505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15505");
        java.lang.String[] strArray8 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8, false);
        tSSLTransportParameters20.setTrustStore("", "");
        tSSLTransportParameters20.requireClientAuth(false);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test15506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15506");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8);
        tSSLTransportParameters17.setTrustStore("", "", "", "");
        tSSLTransportParameters17.requireClientAuth(false);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test15507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15507");
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        tSSLTransportParameters29.requireClientAuth(true);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test15508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15508");
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, true);
        tSSLTransportParameters33.setTrustStore("hi!", "");
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test15509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15509");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        java.security.Provider provider2 = configuration0.getProvider();
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters4 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = configuration0.getParameters();
        java.lang.String str6 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters7 = configuration0.getParameters();
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters9 = configuration0.getParameters();
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters11 = configuration0.getParameters();
        configuration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.lang.String str14 = configuration0.getType();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test15510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15510");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, true);
        tSSLTransportParameters23.requireClientAuth(false);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test15511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15511");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters8 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray7);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray7, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray7);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray7, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray7, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray7, true);
        tSSLTransportParameters17.requireClientAuth(false);
        tSSLTransportParameters17.setKeyStore("", "hi!");
        tSSLTransportParameters17.setKeyStore("", "hi!", "", "");
        tSSLTransportParameters17.setKeyStore("hi!", "hi!", "", "");
        tSSLTransportParameters17.setKeyStore("hi!", "hi!");
        tSSLTransportParameters17.setTrustStore("", "hi!", "", "hi!");
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test15512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15512");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, true);
        tSSLTransportParameters23.setKeyStore("", "");
        tSSLTransportParameters23.setTrustStore("hi!", "", "hi!", "");
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test15513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15513");
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, true);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test15514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15514");
        java.lang.String[] strArray7 = new java.lang.String[] { "", "", "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters8 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray7);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray7, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray7);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray7);
        tSSLTransportParameters12.setKeyStore("hi!", "", "", "hi!");
        tSSLTransportParameters12.requireClientAuth(false);
        tSSLTransportParameters12.setTrustStore("", "", "", "hi!");
        tSSLTransportParameters12.setTrustStore("", "");
        tSSLTransportParameters12.requireClientAuth(false);
        tSSLTransportParameters12.setTrustStore("hi!", "");
        tSSLTransportParameters12.setTrustStore("", "hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test15515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15515");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters8 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray7);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray7, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray7, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray7);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray7);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray7);
        tSSLTransportParameters15.requireClientAuth(true);
        java.lang.Class<?> wildcardClass18 = tSSLTransportParameters15.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test15516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15516");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters2 = configuration0.getParameters();
        java.lang.String str3 = configuration0.getType();
        java.lang.String str4 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = configuration0.getParameters();
        java.lang.String str6 = configuration0.getType();
        java.security.Provider provider7 = configuration0.getProvider();
        configuration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.security.Provider provider10 = configuration0.getProvider();
        configuration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test15517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15517");
        java.lang.String[] strArray10 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        tSSLTransportParameters24.setTrustStore("hi!", "", "", "");
        tSSLTransportParameters24.setKeyStore("", "");
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test15518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15518");
        java.lang.String[] strArray2 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters3 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray2);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters5 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray2, false);
        tSSLTransportParameters5.setKeyStore("hi!", "hi!");
        tSSLTransportParameters5.setKeyStore("hi!", "hi!");
        tSSLTransportParameters5.setKeyStore("hi!", "");
        tSSLTransportParameters5.setTrustStore("", "");
        tSSLTransportParameters5.setTrustStore("", "hi!");
        tSSLTransportParameters5.setTrustStore("hi!", "hi!", "hi!", "hi!");
        tSSLTransportParameters5.setKeyStore("", "");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test15519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15519");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        java.lang.Class<?> wildcardClass25 = strArray11.getClass();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test15520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15520");
        java.lang.String[] strArray12 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test15521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15521");
        java.lang.String[] strArray4 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters6 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray4, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters8 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray4, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray4, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray4, true);
        tSSLTransportParameters12.requireClientAuth(true);
        tSSLTransportParameters12.setTrustStore("", "hi!");
        tSSLTransportParameters12.setTrustStore("", "hi!");
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test15522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15522");
        java.lang.String[] strArray9 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        tSSLTransportParameters22.setTrustStore("hi!", "hi!", "", "hi!");
        tSSLTransportParameters22.requireClientAuth(true);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test15523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15523");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9, true);
        tSSLTransportParameters22.setTrustStore("", "hi!");
        tSSLTransportParameters22.setTrustStore("hi!", "hi!", "", "");
        tSSLTransportParameters22.setKeyStore("hi!", "hi!");
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test15524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15524");
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test15525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15525");
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test15526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15526");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, false);
        tSSLTransportParameters26.requireClientAuth(false);
        tSSLTransportParameters26.setTrustStore("", "");
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test15527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15527");
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test15528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15528");
        java.lang.String[] strArray5 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters7 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray5, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters8 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray5);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray5);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray5);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray5, true);
        tSSLTransportParameters12.setTrustStore("hi!", "hi!", "", "");
        tSSLTransportParameters12.setTrustStore("", "");
        tSSLTransportParameters12.setKeyStore("", "", "", "");
        tSSLTransportParameters12.setTrustStore("hi!", "", "hi!", "");
        tSSLTransportParameters12.setTrustStore("", "");
        java.lang.Class<?> wildcardClass34 = tSSLTransportParameters12.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test15529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15529");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        java.security.Provider provider2 = configuration0.getProvider();
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters4 = configuration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.security.Provider provider7 = configuration0.getProvider();
        java.lang.String str8 = configuration0.getType();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters11 = configuration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        configuration0.refresh();
        java.security.Provider provider14 = configuration0.getProvider();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(provider14);
    }

    @Test
    public void test15530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15530");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters2 = configuration0.getParameters();
        java.lang.String str3 = configuration0.getType();
        configuration0.refresh();
        configuration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        configuration0.refresh();
        java.lang.String str8 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters9 = configuration0.getParameters();
        java.lang.String str10 = configuration0.getType();
        java.lang.String str11 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters12 = configuration0.getParameters();
        configuration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test15531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15531");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters7 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters8 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6, false);
        tSSLTransportParameters12.setTrustStore("", "");
        tSSLTransportParameters12.setKeyStore("", "", "hi!", "");
        tSSLTransportParameters12.setKeyStore("hi!", "hi!");
        tSSLTransportParameters12.requireClientAuth(false);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test15532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15532");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        java.security.Provider provider2 = configuration0.getProvider();
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters4 = configuration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.security.Provider provider7 = configuration0.getProvider();
        java.lang.String str8 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters9 = configuration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.lang.String str11 = configuration0.getType();
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters13 = configuration0.getParameters();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test15533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15533");
        java.lang.String[] strArray8 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8, false);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test15534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15534");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters8 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray7);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray7);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray7);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray7);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray7, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray7, true);
        tSSLTransportParameters15.setKeyStore("", "hi!", "hi!", "");
        tSSLTransportParameters15.setTrustStore("hi!", "", "", "");
        tSSLTransportParameters15.setTrustStore("hi!", "hi!");
        tSSLTransportParameters15.requireClientAuth(false);
        tSSLTransportParameters15.setTrustStore("hi!", "hi!", "hi!", "hi!");
        tSSLTransportParameters15.setTrustStore("", "hi!");
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test15535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15535");
        java.lang.String[] strArray1 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters2 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray1);
        tSSLTransportParameters2.requireClientAuth(true);
        tSSLTransportParameters2.setKeyStore("hi!", "");
        tSSLTransportParameters2.setTrustStore("hi!", "hi!");
        tSSLTransportParameters2.setTrustStore("", "hi!");
        tSSLTransportParameters2.setTrustStore("hi!", "hi!");
        tSSLTransportParameters2.setTrustStore("hi!", "", "", "hi!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test15536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15536");
        java.lang.String[] strArray7 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray7, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray7, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray7, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray7, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray7, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray7);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray7, false);
        java.lang.Class<?> wildcardClass21 = tSSLTransportParameters20.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test15537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15537");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters4 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray3);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters6 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray3, false);
        tSSLTransportParameters6.setKeyStore("", "hi!");
        tSSLTransportParameters6.setTrustStore("", "");
        tSSLTransportParameters6.setTrustStore("", "hi!");
        tSSLTransportParameters6.setTrustStore("hi!", "");
        tSSLTransportParameters6.setKeyStore("", "", "", "");
        tSSLTransportParameters6.setKeyStore("hi!", "");
        tSSLTransportParameters6.setKeyStore("", "");
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test15538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15538");
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters0 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters();
        tSSLTransportParameters0.setKeyStore("", "hi!");
        tSSLTransportParameters0.requireClientAuth(false);
        tSSLTransportParameters0.setTrustStore("hi!", "", "", "");
        tSSLTransportParameters0.setKeyStore("", "hi!");
        tSSLTransportParameters0.setKeyStore("", "hi!");
        tSSLTransportParameters0.setKeyStore("", "hi!", "hi!", "");
    }

    @Test
    public void test15539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15539");
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, true);
        tSSLTransportParameters32.setTrustStore("", "hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test15540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15540");
        java.lang.String[] strArray13 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, true);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test15541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15541");
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        tSSLTransportParameters31.setTrustStore("", "", "hi!", "");
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test15542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15542");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8);
        tSSLTransportParameters17.setKeyStore("hi!", "");
        tSSLTransportParameters17.setKeyStore("hi!", "");
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test15543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15543");
        java.lang.String[] strArray12 = new java.lang.String[] { "", "", "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, false);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test15544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15544");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters6 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray5);
        tSSLTransportParameters6.setTrustStore("", "", "", "hi!");
        tSSLTransportParameters6.requireClientAuth(true);
        tSSLTransportParameters6.requireClientAuth(false);
        java.lang.Class<?> wildcardClass16 = tSSLTransportParameters6.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test15545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15545");
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters0 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters();
        tSSLTransportParameters0.setKeyStore("", "hi!");
        tSSLTransportParameters0.requireClientAuth(false);
        tSSLTransportParameters0.setKeyStore("", "hi!", "", "");
        tSSLTransportParameters0.setTrustStore("", "hi!");
        tSSLTransportParameters0.setKeyStore("hi!", "", "", "");
        tSSLTransportParameters0.setTrustStore("hi!", "hi!");
    }

    @Test
    public void test15546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15546");
        java.lang.String[] strArray9 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9, false);
        tSSLTransportParameters22.setTrustStore("", "hi!");
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test15547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15547");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters2 = configuration0.getParameters();
        java.lang.String str3 = configuration0.getType();
        java.lang.String str4 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters6 = configuration0.getParameters();
        java.security.Provider provider7 = configuration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters8 = configuration0.getParameters();
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters10 = configuration0.getParameters();
        java.security.Provider provider11 = configuration0.getProvider();
        java.security.Provider provider12 = configuration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters13 = configuration0.getParameters();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test15548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15548");
        java.lang.String[] strArray14 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        tSSLTransportParameters33.setKeyStore("", "");
        tSSLTransportParameters33.requireClientAuth(false);
        tSSLTransportParameters33.requireClientAuth(true);
        java.lang.Class<?> wildcardClass41 = tSSLTransportParameters33.getClass();
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test15549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15549");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters8 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray7);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray7, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray7, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray7);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray7);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray7);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test15550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15550");
        java.lang.String[] strArray12 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test15551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15551");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters7 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6, true);
        tSSLTransportParameters11.setTrustStore("", "hi!");
        tSSLTransportParameters11.setTrustStore("hi!", "", "", "");
        tSSLTransportParameters11.setKeyStore("hi!", "", "", "hi!");
        tSSLTransportParameters11.setKeyStore("", "", "", "");
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test15552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15552");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        java.security.Provider provider2 = configuration0.getProvider();
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters4 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = configuration0.getParameters();
        java.security.Provider provider6 = configuration0.getProvider();
        java.lang.String str7 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters8 = configuration0.getParameters();
        java.security.Provider provider9 = configuration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters10 = configuration0.getParameters();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test15553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15553");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        tSSLTransportParameters24.setTrustStore("", "", "", "hi!");
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test15554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15554");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test15555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15555");
        java.lang.String[] strArray9 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9, false);
        tSSLTransportParameters21.setKeyStore("", "");
        tSSLTransportParameters21.setKeyStore("hi!", "hi!", "", "hi!");
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test15556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15556");
        java.lang.String[] strArray2 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters3 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray2);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters5 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray2, false);
        tSSLTransportParameters5.setKeyStore("hi!", "hi!");
        tSSLTransportParameters5.setTrustStore("", "hi!", "hi!", "hi!");
        tSSLTransportParameters5.setKeyStore("", "", "", "");
        tSSLTransportParameters5.requireClientAuth(false);
        tSSLTransportParameters5.requireClientAuth(true);
        tSSLTransportParameters5.setKeyStore("", "hi!");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test15557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15557");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters3 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray2);
        tSSLTransportParameters3.setKeyStore("", "hi!", "", "");
        tSSLTransportParameters3.setKeyStore("", "", "", "");
        tSSLTransportParameters3.requireClientAuth(false);
        tSSLTransportParameters3.requireClientAuth(true);
        tSSLTransportParameters3.requireClientAuth(true);
        tSSLTransportParameters3.setTrustStore("hi!", "");
        tSSLTransportParameters3.setKeyStore("", "");
        tSSLTransportParameters3.setTrustStore("", "");
        tSSLTransportParameters3.setTrustStore("", "", "hi!", "");
        tSSLTransportParameters3.setKeyStore("hi!", "hi!", "", "");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test15558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15558");
        java.lang.String[] strArray12 = new java.lang.String[] { "", "", "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, true);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test15559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15559");
        java.lang.String[] strArray9 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9, true);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test15560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15560");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, true);
        tSSLTransportParameters24.setTrustStore("", "hi!");
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test15561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15561");
        java.lang.String[] strArray11 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        tSSLTransportParameters28.requireClientAuth(true);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test15562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15562");
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, true);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test15563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15563");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        tSSLTransportParameters19.setKeyStore("hi!", "hi!");
        tSSLTransportParameters19.setKeyStore("hi!", "");
        tSSLTransportParameters19.requireClientAuth(false);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test15564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15564");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters4 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray3);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters6 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray3, true);
        tSSLTransportParameters6.setKeyStore("hi!", "");
        tSSLTransportParameters6.setTrustStore("hi!", "");
        tSSLTransportParameters6.setKeyStore("hi!", "");
        tSSLTransportParameters6.setKeyStore("hi!", "hi!");
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test15565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15565");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        configuration0.refresh();
        java.security.Provider provider3 = configuration0.getProvider();
        configuration0.refresh();
        java.lang.String str5 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters6 = configuration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.Parameters parameters8 = configuration0.getParameters();
        configuration0.refresh();
        java.security.Provider provider10 = configuration0.getProvider();
        java.security.Provider provider11 = configuration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters12 = configuration0.getParameters();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test15566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15566");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters2 = configuration0.getParameters();
        java.lang.String str3 = configuration0.getType();
        configuration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.Parameters parameters7 = configuration0.getParameters();
        java.lang.String str8 = configuration0.getType();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        configuration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test15567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15567");
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        tSSLTransportParameters13.requireClientAuth(true);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test15568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15568");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        java.security.Provider provider2 = configuration0.getProvider();
        java.lang.String str3 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = configuration0.getParameters();
        java.lang.String str5 = configuration0.getType();
        java.security.Provider provider6 = configuration0.getProvider();
        java.lang.String str7 = configuration0.getType();
        java.lang.String str8 = configuration0.getType();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test15569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15569");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        java.security.Provider provider2 = configuration0.getProvider();
        java.lang.String str3 = configuration0.getType();
        java.security.Provider provider4 = configuration0.getProvider();
        java.lang.String str5 = configuration0.getType();
        configuration0.refresh();
        java.security.Provider provider7 = configuration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters8 = configuration0.getParameters();
        configuration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test15570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15570");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, true);
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test15571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15571");
        java.lang.String[] strArray10 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        tSSLTransportParameters24.setKeyStore("", "");
        tSSLTransportParameters24.setTrustStore("", "");
        tSSLTransportParameters24.requireClientAuth(false);
        tSSLTransportParameters24.setKeyStore("hi!", "hi!");
        tSSLTransportParameters24.setKeyStore("hi!", "");
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test15572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15572");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters4 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray3);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters5 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray3);
        tSSLTransportParameters5.setKeyStore("hi!", "", "hi!", "hi!");
        tSSLTransportParameters5.setKeyStore("hi!", "hi!");
        tSSLTransportParameters5.setKeyStore("hi!", "hi!");
        tSSLTransportParameters5.setTrustStore("hi!", "hi!", "hi!", "");
        tSSLTransportParameters5.setTrustStore("hi!", "");
        tSSLTransportParameters5.setTrustStore("", "hi!");
        tSSLTransportParameters5.setTrustStore("hi!", "hi!", "", "");
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test15573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15573");
        java.lang.String[] strArray11 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test15574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15574");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9, true);
        tSSLTransportParameters20.setTrustStore("", "");
        tSSLTransportParameters20.setTrustStore("", "", "", "hi!");
        tSSLTransportParameters20.setKeyStore("hi!", "hi!");
        tSSLTransportParameters20.setKeyStore("hi!", "hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test15575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15575");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters2 = configuration0.getParameters();
        java.lang.String str3 = configuration0.getType();
        java.lang.String str4 = configuration0.getType();
        java.lang.String str5 = configuration0.getType();
        configuration0.refresh();
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters8 = configuration0.getParameters();
        java.security.Provider provider9 = configuration0.getProvider();
        java.security.Provider provider10 = configuration0.getProvider();
        java.security.Provider provider11 = configuration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters12 = configuration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test15576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15576");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters2 = configuration0.getParameters();
        java.lang.String str3 = configuration0.getType();
        java.lang.String str4 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = configuration0.getParameters();
        java.lang.String str6 = configuration0.getType();
        java.security.Provider provider7 = configuration0.getProvider();
        configuration0.refresh();
        java.lang.String str9 = configuration0.getType();
        java.lang.String str10 = configuration0.getType();
        java.lang.String str11 = configuration0.getType();
        configuration0.refresh();
        configuration0.refresh();
        configuration0.refresh();
        configuration0.refresh();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test15577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15577");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test15578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15578");
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test15579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15579");
        java.lang.String[] strArray10 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, true);
        tSSLTransportParameters25.setTrustStore("", "", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test15580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15580");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        tSSLTransportParameters19.setTrustStore("hi!", "", "", "");
        tSSLTransportParameters19.setKeyStore("hi!", "");
        java.lang.Class<?> wildcardClass28 = tSSLTransportParameters19.getClass();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test15581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15581");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters2 = configuration0.getParameters();
        java.lang.String str3 = configuration0.getType();
        configuration0.refresh();
        configuration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        configuration0.refresh();
        java.security.Provider provider8 = configuration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = configuration0.getParameters();
        java.lang.String str10 = configuration0.getType();
        java.security.Provider provider11 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        configuration0.refresh();
        java.security.Provider provider14 = configuration0.getProvider();
        java.security.Provider provider15 = configuration0.getProvider();
        java.lang.String str16 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters17 = configuration0.getParameters();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(parameters17);
    }

    @Test
    public void test15582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15582");
        java.lang.String[] strArray9 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        java.lang.Class<?> wildcardClass25 = tSSLTransportParameters24.getClass();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test15583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15583");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters7 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters8 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6);
        tSSLTransportParameters12.requireClientAuth(true);
        tSSLTransportParameters12.setKeyStore("hi!", "hi!", "hi!", "hi!");
        tSSLTransportParameters12.setKeyStore("", "");
        tSSLTransportParameters12.setKeyStore("hi!", "");
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test15584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15584");
        java.lang.String[] strArray1 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters2 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray1);
        tSSLTransportParameters2.setTrustStore("", "hi!");
        tSSLTransportParameters2.setKeyStore("", "", "", "");
        tSSLTransportParameters2.requireClientAuth(false);
        tSSLTransportParameters2.setKeyStore("hi!", "", "hi!", "hi!");
        tSSLTransportParameters2.setKeyStore("", "hi!");
        tSSLTransportParameters2.setTrustStore("hi!", "");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test15585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15585");
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters8 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray7);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray7);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray7, false);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test15586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15586");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        java.security.Provider provider2 = configuration0.getProvider();
        java.lang.String str3 = configuration0.getType();
        java.lang.String str4 = configuration0.getType();
        configuration0.refresh();
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters7 = configuration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.lang.String str9 = configuration0.getType();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test15587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15587");
        java.lang.String[] strArray15 = new java.lang.String[] { "", "", "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15);
        tSSLTransportParameters33.requireClientAuth(false);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test15588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15588");
        java.lang.String[] strArray4 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters6 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray4, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters7 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray4);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters8 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray4);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray4);
        tSSLTransportParameters9.requireClientAuth(true);
        tSSLTransportParameters9.setKeyStore("", "hi!", "", "hi!");
        tSSLTransportParameters9.setKeyStore("hi!", "hi!", "", "");
        tSSLTransportParameters9.setTrustStore("hi!", "");
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test15589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15589");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters2 = configuration0.getParameters();
        java.lang.String str3 = configuration0.getType();
        java.lang.String str4 = configuration0.getType();
        configuration0.refresh();
        configuration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        configuration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.security.Provider provider10 = configuration0.getProvider();
        java.lang.String str11 = configuration0.getType();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test15590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15590");
        java.lang.String[] strArray6 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters8 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6, true);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test15591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15591");
        java.lang.String[] strArray12 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, true);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test15592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15592");
        java.lang.String[] strArray12 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test15593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15593");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters2 = configuration0.getParameters();
        java.lang.String str3 = configuration0.getType();
        java.lang.String str4 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = configuration0.getParameters();
        java.lang.String str6 = configuration0.getType();
        java.security.Provider provider7 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        configuration0.refresh();
        configuration0.refresh();
        java.lang.String str12 = configuration0.getType();
        java.lang.String str13 = configuration0.getType();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.lang.String str15 = configuration0.getType();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test15594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15594");
        java.lang.String[] strArray13 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        tSSLTransportParameters30.setKeyStore("", "hi!");
        tSSLTransportParameters30.setTrustStore("hi!", "", "hi!", "");
        tSSLTransportParameters30.setTrustStore("", "");
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test15595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15595");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        java.lang.String str2 = configuration0.getType();
        java.security.Provider provider3 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters8 = configuration0.getParameters();
        configuration0.refresh();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test15596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15596");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, false);
        tSSLTransportParameters22.setKeyStore("", "", "", "hi!");
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test15597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15597");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        tSSLTransportParameters16.setTrustStore("", "");
        tSSLTransportParameters16.setTrustStore("", "", "", "");
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test15598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15598");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        java.security.Provider provider2 = configuration0.getProvider();
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters4 = configuration0.getParameters();
        java.lang.String str5 = configuration0.getType();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.lang.String str7 = configuration0.getType();
        java.security.Provider provider8 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.Parameters parameters11 = configuration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test15599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15599");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        java.security.Provider provider2 = configuration0.getProvider();
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters4 = configuration0.getParameters();
        java.lang.String str5 = configuration0.getType();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.Parameters parameters9 = configuration0.getParameters();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test15600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15600");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        java.lang.String str2 = configuration0.getType();
        java.lang.String str3 = configuration0.getType();
        configuration0.refresh();
        java.lang.String str5 = configuration0.getType();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.lang.String str7 = configuration0.getType();
        java.security.Provider provider8 = configuration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = configuration0.getParameters();
        java.security.Provider provider10 = configuration0.getProvider();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test15601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15601");
        java.lang.String[] strArray14 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, true);
        tSSLTransportParameters35.setKeyStore("hi!", "hi!", "", "");
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test15602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15602");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters2 = configuration0.getParameters();
        java.lang.String str3 = configuration0.getType();
        configuration0.refresh();
        java.security.Provider provider5 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.security.Provider provider7 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.lang.String str9 = configuration0.getType();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test15603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15603");
        java.lang.String[] strArray4 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters6 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray4, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters8 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray4, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray4, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray4, false);
        tSSLTransportParameters12.setTrustStore("", "hi!");
        tSSLTransportParameters12.setTrustStore("hi!", "hi!", "", "");
        tSSLTransportParameters12.setTrustStore("", "", "", "hi!");
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test15604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15604");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.Parameters parameters2 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters3 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters4 = configuration0.getParameters();
        configuration0.refresh();
        java.security.Provider provider6 = configuration0.getProvider();
        java.lang.String str7 = configuration0.getType();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test15605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15605");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters4 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray3);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters5 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray3);
        tSSLTransportParameters5.setKeyStore("hi!", "", "hi!", "hi!");
        tSSLTransportParameters5.setKeyStore("hi!", "hi!");
        tSSLTransportParameters5.setKeyStore("hi!", "hi!");
        tSSLTransportParameters5.setTrustStore("", "");
        tSSLTransportParameters5.requireClientAuth(true);
        java.lang.Class<?> wildcardClass22 = tSSLTransportParameters5.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test15606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15606");
        java.lang.String[] strArray8 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test15607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15607");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        java.security.Provider provider2 = configuration0.getProvider();
        java.lang.String str3 = configuration0.getType();
        java.security.Provider provider4 = configuration0.getProvider();
        java.lang.String str5 = configuration0.getType();
        configuration0.refresh();
        java.security.Provider provider7 = configuration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters8 = configuration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.lang.String str10 = configuration0.getType();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test15608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15608");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters2 = configuration0.getParameters();
        java.lang.String str3 = configuration0.getType();
        java.security.Provider provider4 = configuration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters5 = configuration0.getParameters();
        configuration0.refresh();
        java.lang.String str7 = configuration0.getType();
        configuration0.refresh();
        java.security.Provider provider9 = configuration0.getProvider();
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters11 = configuration0.getParameters();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test15609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15609");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        java.security.Provider provider2 = configuration0.getProvider();
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters4 = configuration0.getParameters();
        java.lang.String str5 = configuration0.getType();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.Parameters parameters7 = configuration0.getParameters();
        java.lang.String str8 = configuration0.getType();
        configuration0.refresh();
        java.security.Provider provider10 = configuration0.getProvider();
        configuration0.refresh();
        configuration0.refresh();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test15610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15610");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        java.lang.String str2 = configuration0.getType();
        java.lang.String str3 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = configuration0.getParameters();
        java.security.Provider provider5 = configuration0.getProvider();
        configuration0.refresh();
        java.lang.String str7 = configuration0.getType();
        java.security.Provider provider8 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.security.Provider provider10 = configuration0.getProvider();
        java.security.Provider provider11 = configuration0.getProvider();
        java.lang.String str12 = configuration0.getType();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test15611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15611");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters38 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters40 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters42 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters44 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17, true);
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test15612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15612");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters2 = configuration0.getParameters();
        java.lang.String str3 = configuration0.getType();
        configuration0.refresh();
        configuration0.refresh();
        java.lang.String str6 = configuration0.getType();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.Parameters parameters8 = configuration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.lang.String str10 = configuration0.getType();
        java.security.Provider provider11 = configuration0.getProvider();
        configuration0.refresh();
        configuration0.refresh();
        java.lang.String str14 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters15 = configuration0.getParameters();
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters17 = configuration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(parameters15);
        org.junit.Assert.assertNull(parameters17);
    }

    @Test
    public void test15613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15613");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters6 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray5);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters7 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray5);
        tSSLTransportParameters7.setTrustStore("", "");
        tSSLTransportParameters7.setTrustStore("hi!", "hi!");
        tSSLTransportParameters7.setKeyStore("hi!", "hi!");
        tSSLTransportParameters7.setKeyStore("", "", "hi!", "");
        tSSLTransportParameters7.requireClientAuth(false);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test15614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15614");
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        tSSLTransportParameters12.setTrustStore("", "hi!", "hi!", "hi!");
        tSSLTransportParameters12.setKeyStore("", "");
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test15615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15615");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8, false);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test15616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15616");
        java.lang.String[] strArray10 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        tSSLTransportParameters24.setKeyStore("", "hi!");
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test15617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15617");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.security.Provider provider3 = configuration0.getProvider();
        java.security.Provider provider4 = configuration0.getProvider();
        java.security.Provider provider5 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.lang.String str7 = configuration0.getType();
        java.security.Provider provider8 = configuration0.getProvider();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
    }

    @Test
    public void test15618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15618");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test15619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15619");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        java.lang.String str2 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters3 = configuration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.Parameters parameters5 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters6 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters7 = configuration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.security.Provider provider9 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.lang.String str11 = configuration0.getType();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test15620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15620");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters2 = configuration0.getParameters();
        java.lang.String str3 = configuration0.getType();
        configuration0.refresh();
        configuration0.refresh();
        java.lang.String str6 = configuration0.getType();
        java.lang.String str7 = configuration0.getType();
        java.security.Provider provider8 = configuration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters10 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters11 = configuration0.getParameters();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test15621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15621");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        tSSLTransportParameters25.setTrustStore("hi!", "");
        tSSLTransportParameters25.setKeyStore("hi!", "");
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test15622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15622");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "", "", "", "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        tSSLTransportParameters11.setTrustStore("hi!", "");
        tSSLTransportParameters11.requireClientAuth(false);
        tSSLTransportParameters11.setKeyStore("hi!", "");
        tSSLTransportParameters11.setTrustStore("", "", "hi!", "");
        java.lang.Class<?> wildcardClass25 = tSSLTransportParameters11.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test15623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15623");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.security.Provider provider3 = configuration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = configuration0.getParameters();
        configuration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.security.Provider provider7 = configuration0.getProvider();
        java.lang.String str8 = configuration0.getType();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test15624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15624");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        tSSLTransportParameters19.setKeyStore("", "");
        java.lang.Class<?> wildcardClass23 = tSSLTransportParameters19.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test15625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15625");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8, false);
        tSSLTransportParameters20.setTrustStore("hi!", "");
        tSSLTransportParameters20.setTrustStore("hi!", "");
        tSSLTransportParameters20.setKeyStore("", "");
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test15626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15626");
        java.lang.String[] strArray14 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, true);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test15627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15627");
        java.lang.String[] strArray6 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters8 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6);
        tSSLTransportParameters13.setTrustStore("hi!", "hi!");
        tSSLTransportParameters13.requireClientAuth(false);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test15628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15628");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters2 = configuration0.getParameters();
        java.lang.String str3 = configuration0.getType();
        configuration0.refresh();
        configuration0.refresh();
        java.lang.String str6 = configuration0.getType();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters9 = configuration0.getParameters();
        configuration0.refresh();
        java.lang.String str11 = configuration0.getType();
        java.lang.String str12 = configuration0.getType();
        java.lang.Class<?> wildcardClass13 = configuration0.getClass();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test15629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15629");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test15630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15630");
        java.lang.String[] strArray11 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, true);
        tSSLTransportParameters27.setTrustStore("", "");
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test15631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15631");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9, false);
        tSSLTransportParameters20.setKeyStore("", "hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test15632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15632");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        configuration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        configuration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
    }

    @Test
    public void test15633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15633");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test15634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15634");
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, true);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test15635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15635");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.security.Provider provider3 = configuration0.getProvider();
        java.security.Provider provider4 = configuration0.getProvider();
        java.security.Provider provider5 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        configuration0.refresh();
        java.security.Provider provider8 = configuration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = configuration0.getParameters();
        java.security.Provider provider10 = configuration0.getProvider();
        java.lang.String str11 = configuration0.getType();
        configuration0.refresh();
        java.lang.String str13 = configuration0.getType();
        java.security.Provider provider14 = configuration0.getProvider();
        java.lang.String str15 = configuration0.getType();
        java.lang.String str16 = configuration0.getType();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test15636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15636");
        java.lang.String[] strArray14 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, false);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test15637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15637");
        java.lang.String[] strArray9 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        tSSLTransportParameters22.setKeyStore("", "", "hi!", "");
        tSSLTransportParameters22.setKeyStore("", "hi!", "", "");
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test15638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15638");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        java.security.Provider provider2 = configuration0.getProvider();
        java.lang.String str3 = configuration0.getType();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.Parameters parameters5 = configuration0.getParameters();
        java.security.Provider provider6 = configuration0.getProvider();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
    }

    @Test
    public void test15639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15639");
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, false);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test15640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15640");
        java.lang.String[] strArray5 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters7 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray5, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray5, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray5);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray5);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray5);
        tSSLTransportParameters12.setKeyStore("hi!", "");
        tSSLTransportParameters12.setTrustStore("hi!", "", "", "");
        tSSLTransportParameters12.setKeyStore("hi!", "hi!");
        tSSLTransportParameters12.requireClientAuth(true);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test15641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15641");
        java.lang.String[] strArray12 = new java.lang.String[] { "", "", "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test15642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15642");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        java.lang.String str2 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters3 = configuration0.getParameters();
        java.lang.String str4 = configuration0.getType();
        java.security.Provider provider5 = configuration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters6 = configuration0.getParameters();
        java.lang.String str7 = configuration0.getType();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        configuration0.refresh();
        java.lang.String str10 = configuration0.getType();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test15643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15643");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        configuration0.refresh();
        java.security.Provider provider3 = configuration0.getProvider();
        configuration0.refresh();
        java.lang.String str5 = configuration0.getType();
        configuration0.refresh();
        java.lang.String str7 = configuration0.getType();
        java.lang.String str8 = configuration0.getType();
        java.security.Provider provider9 = configuration0.getProvider();
        java.security.Provider provider10 = configuration0.getProvider();
        java.security.Provider provider11 = configuration0.getProvider();
        java.lang.Class<?> wildcardClass12 = configuration0.getClass();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test15644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15644");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        java.lang.String str2 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters3 = configuration0.getParameters();
        java.lang.String str4 = configuration0.getType();
        java.security.Provider provider5 = configuration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters6 = configuration0.getParameters();
        java.lang.String str7 = configuration0.getType();
        configuration0.refresh();
        configuration0.refresh();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test15645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15645");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters7 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters8 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6, true);
        tSSLTransportParameters13.requireClientAuth(true);
        tSSLTransportParameters13.requireClientAuth(true);
        tSSLTransportParameters13.setTrustStore("hi!", "hi!", "hi!", "hi!");
        tSSLTransportParameters13.setKeyStore("", "", "", "hi!");
        tSSLTransportParameters13.setKeyStore("", "");
        tSSLTransportParameters13.setTrustStore("", "hi!", "hi!", "");
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test15646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15646");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test15647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15647");
        java.lang.String[] strArray10 = new java.lang.String[] { "", "", "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test15648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15648");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters2 = configuration0.getParameters();
        java.lang.String str3 = configuration0.getType();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.Parameters parameters5 = configuration0.getParameters();
        java.security.Provider provider6 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
    }

    @Test
    public void test15649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15649");
        java.lang.String[] strArray13 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        tSSLTransportParameters34.setTrustStore("hi!", "", "hi!", "");
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test15650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15650");
        java.lang.String[] strArray6 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters7 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6, true);
        tSSLTransportParameters17.setKeyStore("hi!", "", "hi!", "hi!");
        tSSLTransportParameters17.requireClientAuth(false);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test15651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15651");
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        tSSLTransportParameters33.setKeyStore("", "hi!");
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test15652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15652");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        java.security.Provider provider2 = configuration0.getProvider();
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters4 = configuration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.lang.String str7 = configuration0.getType();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test15653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15653");
        java.lang.String[] strArray13 = new java.lang.String[] { "", "", "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        tSSLTransportParameters27.setKeyStore("hi!", "hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test15654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15654");
        java.lang.String[] strArray2 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters3 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray2);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters4 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test15655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15655");
        java.lang.String[] strArray6 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters8 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6, false);
        tSSLTransportParameters14.setTrustStore("hi!", "");
        tSSLTransportParameters14.requireClientAuth(false);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test15656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15656");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.security.Provider provider3 = configuration0.getProvider();
        java.security.Provider provider4 = configuration0.getProvider();
        java.security.Provider provider5 = configuration0.getProvider();
        configuration0.refresh();
        java.lang.String str7 = configuration0.getType();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test15657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15657");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters2 = configuration0.getParameters();
        java.lang.String str3 = configuration0.getType();
        java.security.Provider provider4 = configuration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters5 = configuration0.getParameters();
        configuration0.refresh();
        java.security.Provider provider7 = configuration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters8 = configuration0.getParameters();
        configuration0.refresh();
        java.lang.Class<?> wildcardClass10 = configuration0.getClass();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test15658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15658");
        java.lang.String[] strArray10 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test15659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15659");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters6 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray5);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters8 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray5, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray5);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray5, true);
        tSSLTransportParameters11.setKeyStore("", "hi!", "hi!", "hi!");
        tSSLTransportParameters11.setKeyStore("", "", "", "hi!");
        tSSLTransportParameters11.setTrustStore("", "", "", "hi!");
        tSSLTransportParameters11.requireClientAuth(true);
        tSSLTransportParameters11.setTrustStore("hi!", "hi!");
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test15660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15660");
        java.lang.String[] strArray18 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters39 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters40 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters42 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters43 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters44 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test15661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15661");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters2 = configuration0.getParameters();
        java.lang.String str3 = configuration0.getType();
        java.lang.String str4 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = configuration0.getParameters();
        java.lang.String str6 = configuration0.getType();
        java.security.Provider provider7 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.security.Provider provider10 = configuration0.getProvider();
        java.security.Provider provider11 = configuration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters12 = configuration0.getParameters();
        configuration0.refresh();
        java.lang.String str14 = configuration0.getType();
        java.security.Provider provider15 = configuration0.getProvider();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(provider15);
    }

    @Test
    public void test15662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15662");
        java.lang.String[] strArray9 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9, true);
        tSSLTransportParameters23.setTrustStore("hi!", "hi!", "hi!", "");
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test15663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15663");
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test15664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15664");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters3 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray2);
        tSSLTransportParameters3.setKeyStore("", "hi!", "", "");
        tSSLTransportParameters3.setKeyStore("", "", "", "");
        tSSLTransportParameters3.requireClientAuth(false);
        tSSLTransportParameters3.requireClientAuth(true);
        tSSLTransportParameters3.requireClientAuth(true);
        tSSLTransportParameters3.setTrustStore("hi!", "");
        tSSLTransportParameters3.setKeyStore("", "");
        tSSLTransportParameters3.setTrustStore("", "");
        tSSLTransportParameters3.setTrustStore("hi!", "", "", "hi!");
        tSSLTransportParameters3.setTrustStore("", "", "", "");
        tSSLTransportParameters3.setKeyStore("", "hi!", "", "hi!");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test15665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15665");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9, true);
        java.lang.Class<?> wildcardClass23 = tSSLTransportParameters22.getClass();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test15666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15666");
        java.lang.String[] strArray6 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters8 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test15667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15667");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        java.security.Provider provider2 = configuration0.getProvider();
        java.lang.String str3 = configuration0.getType();
        java.security.Provider provider4 = configuration0.getProvider();
        java.lang.String str5 = configuration0.getType();
        java.security.Provider provider6 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.Parameters parameters9 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters10 = configuration0.getParameters();
        java.lang.String str11 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters12 = configuration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.security.Provider provider15 = configuration0.getProvider();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(provider15);
    }

    @Test
    public void test15668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15668");
        java.lang.String[] strArray11 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        tSSLTransportParameters26.setTrustStore("hi!", "");
        tSSLTransportParameters26.setTrustStore("", "hi!", "hi!", "");
        tSSLTransportParameters26.setKeyStore("", "hi!", "", "");
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test15669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15669");
        java.lang.String[] strArray6 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters8 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6, false);
        tSSLTransportParameters14.setTrustStore("", "hi!", "", "hi!");
        tSSLTransportParameters14.setKeyStore("", "", "hi!", "hi!");
        tSSLTransportParameters14.setKeyStore("", "");
        tSSLTransportParameters14.setKeyStore("hi!", "");
        tSSLTransportParameters14.setKeyStore("hi!", "", "", "hi!");
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test15670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15670");
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "", "", "", "", "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, true);
        tSSLTransportParameters22.setTrustStore("", "");
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test15671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15671");
        java.lang.String[] strArray10 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test15672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15672");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters2 = configuration0.getParameters();
        java.lang.String str3 = configuration0.getType();
        java.lang.String str4 = configuration0.getType();
        java.security.Provider provider5 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.lang.String str8 = configuration0.getType();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test15673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15673");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters2 = configuration0.getParameters();
        java.lang.String str3 = configuration0.getType();
        configuration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.Parameters parameters6 = configuration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.lang.String str8 = configuration0.getType();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test15674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15674");
        java.lang.String[] strArray10 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, false);
        tSSLTransportParameters26.setKeyStore("", "hi!");
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test15675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15675");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters8 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6);
        tSSLTransportParameters13.setTrustStore("", "hi!", "", "");
        tSSLTransportParameters13.setKeyStore("hi!", "", "", "");
        tSSLTransportParameters13.requireClientAuth(false);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test15676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15676");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        configuration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        configuration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.lang.String str7 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters8 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters9 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters10 = configuration0.getParameters();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test15677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15677");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters2 = configuration0.getParameters();
        java.lang.String str3 = configuration0.getType();
        configuration0.refresh();
        configuration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        configuration0.refresh();
        configuration0.refresh();
        configuration0.refresh();
        configuration0.refresh();
        java.lang.String str11 = configuration0.getType();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.lang.Class<?> wildcardClass13 = configuration0.getClass();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test15678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15678");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        java.security.Provider provider2 = configuration0.getProvider();
        java.security.Provider provider3 = configuration0.getProvider();
        configuration0.refresh();
        java.security.Provider provider5 = configuration0.getProvider();
        java.lang.String str6 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters7 = configuration0.getParameters();
        java.security.Provider provider8 = configuration0.getProvider();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
    }

    @Test
    public void test15679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15679");
        java.lang.String[] strArray7 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray7, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray7);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray7);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray7);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray7, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray7);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray7, false);
        tSSLTransportParameters17.setTrustStore("hi!", "", "hi!", "hi!");
        tSSLTransportParameters17.requireClientAuth(true);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test15680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15680");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters8 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6, false);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test15681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15681");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        java.security.Provider provider2 = configuration0.getProvider();
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters4 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = configuration0.getParameters();
        java.lang.String str6 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters7 = configuration0.getParameters();
        configuration0.refresh();
        configuration0.refresh();
        java.security.Provider provider10 = configuration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters11 = configuration0.getParameters();
        java.lang.String str12 = configuration0.getType();
        java.security.Provider provider13 = configuration0.getProvider();
        configuration0.refresh();
        java.security.Provider provider15 = configuration0.getProvider();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(provider15);
    }

    @Test
    public void test15682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15682");
        java.lang.String[] strArray10 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, true);
        tSSLTransportParameters24.setKeyStore("", "", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test15683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15683");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters4 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray3);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters6 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray3, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters8 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray3, false);
        tSSLTransportParameters8.requireClientAuth(true);
        tSSLTransportParameters8.setKeyStore("hi!", "hi!", "", "hi!");
        tSSLTransportParameters8.setKeyStore("", "hi!");
        tSSLTransportParameters8.requireClientAuth(true);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test15684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15684");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        java.security.Provider provider2 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        configuration0.refresh();
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters7 = configuration0.getParameters();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters7);
    }

    @Test
    public void test15685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15685");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters2 = configuration0.getParameters();
        java.lang.String str3 = configuration0.getType();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        configuration0.refresh();
        java.lang.String str7 = configuration0.getType();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test15686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15686");
        java.lang.String[] strArray9 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9, false);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test15687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15687");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8, true);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test15688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15688");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        java.security.Provider provider2 = configuration0.getProvider();
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters4 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = configuration0.getParameters();
        java.security.Provider provider6 = configuration0.getProvider();
        java.security.Provider provider7 = configuration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters8 = configuration0.getParameters();
        configuration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.lang.String str11 = configuration0.getType();
        java.lang.String str12 = configuration0.getType();
        configuration0.refresh();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test15689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15689");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, true);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test15690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15690");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        tSSLTransportParameters28.requireClientAuth(true);
        tSSLTransportParameters28.setTrustStore("hi!", "");
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test15691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15691");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters8 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray7);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray7, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray7);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray7, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray7, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray7, true);
        java.lang.Class<?> wildcardClass18 = tSSLTransportParameters17.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test15692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15692");
        java.lang.String[] strArray14 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, false);
        tSSLTransportParameters33.setTrustStore("hi!", "");
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test15693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15693");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, false);
        tSSLTransportParameters25.setKeyStore("", "");
        tSSLTransportParameters25.setKeyStore("hi!", "hi!", "hi!", "");
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test15694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15694");
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, true);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test15695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15695");
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test15696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15696");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters2 = configuration0.getParameters();
        java.lang.String str3 = configuration0.getType();
        java.lang.String str4 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = configuration0.getParameters();
        java.lang.String str6 = configuration0.getType();
        java.security.Provider provider7 = configuration0.getProvider();
        configuration0.refresh();
        java.lang.String str9 = configuration0.getType();
        java.lang.String str10 = configuration0.getType();
        java.lang.String str11 = configuration0.getType();
        configuration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        configuration0.refresh();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test15697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15697");
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, true);
        tSSLTransportParameters28.setKeyStore("hi!", "hi!", "", "hi!");
        tSSLTransportParameters28.setKeyStore("", "");
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test15698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15698");
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, true);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test15699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15699");
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, true);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test15700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15700");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        java.security.Provider provider2 = configuration0.getProvider();
        configuration0.refresh();
        java.lang.String str4 = configuration0.getType();
        java.lang.String str5 = configuration0.getType();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        configuration0.refresh();
        java.lang.String str8 = configuration0.getType();
        java.security.Provider provider9 = configuration0.getProvider();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider9);
    }

    @Test
    public void test15701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15701");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters7 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6);
        java.lang.Class<?> wildcardClass14 = tSSLTransportParameters13.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test15702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15702");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        configuration0.refresh();
        java.security.Provider provider3 = configuration0.getProvider();
        configuration0.refresh();
        java.lang.String str5 = configuration0.getType();
        java.security.Provider provider6 = configuration0.getProvider();
        configuration0.refresh();
        java.lang.String str8 = configuration0.getType();
        java.lang.String str9 = configuration0.getType();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.lang.String str11 = configuration0.getType();
        configuration0.refresh();
        configuration0.refresh();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test15703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15703");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters2 = configuration0.getParameters();
        java.lang.String str3 = configuration0.getType();
        configuration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.Parameters parameters6 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters7 = configuration0.getParameters();
        java.security.Provider provider8 = configuration0.getProvider();
        java.security.Provider provider9 = configuration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters10 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters11 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters12 = configuration0.getParameters();
        java.lang.String str13 = configuration0.getType();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test15704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15704");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters2 = configuration0.getParameters();
        java.lang.String str3 = configuration0.getType();
        configuration0.refresh();
        configuration0.refresh();
        java.lang.String str6 = configuration0.getType();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.Parameters parameters8 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters9 = configuration0.getParameters();
        java.security.Provider provider10 = configuration0.getProvider();
        java.security.Provider provider11 = configuration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters12 = configuration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        configuration0.refresh();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test15705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15705");
        java.lang.String[] strArray11 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, false);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test15706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15706");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.Parameters parameters2 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters3 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters4 = configuration0.getParameters();
        configuration0.refresh();
        configuration0.refresh();
        java.lang.String str7 = configuration0.getType();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test15707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15707");
        java.lang.String[] strArray4 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters6 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray4, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters7 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray4);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters8 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray4);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray4, true);
        tSSLTransportParameters10.setKeyStore("hi!", "hi!");
        tSSLTransportParameters10.setKeyStore("", "");
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test15708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15708");
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test15709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15709");
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, false);
        tSSLTransportParameters32.setKeyStore("hi!", "");
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test15710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15710");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.security.Provider provider3 = configuration0.getProvider();
        java.security.Provider provider4 = configuration0.getProvider();
        java.security.Provider provider5 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.security.Provider provider7 = configuration0.getProvider();
        java.lang.String str8 = configuration0.getType();
        java.security.Provider provider9 = configuration0.getProvider();
        configuration0.refresh();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider9);
    }

    @Test
    public void test15711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15711");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters5 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray3, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters6 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray3);
        tSSLTransportParameters6.requireClientAuth(false);
        tSSLTransportParameters6.setKeyStore("", "hi!");
        tSSLTransportParameters6.requireClientAuth(true);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test15712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15712");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        java.security.Provider provider2 = configuration0.getProvider();
        configuration0.refresh();
        java.lang.String str4 = configuration0.getType();
        java.lang.String str5 = configuration0.getType();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.Parameters parameters7 = configuration0.getParameters();
        configuration0.refresh();
        java.lang.String str9 = configuration0.getType();
        java.lang.Class<?> wildcardClass10 = configuration0.getClass();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test15713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15713");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        tSSLTransportParameters23.setTrustStore("", "", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test15714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15714");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        tSSLTransportParameters20.setTrustStore("hi!", "", "", "hi!");
        tSSLTransportParameters20.requireClientAuth(true);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test15715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15715");
        java.lang.String[] strArray12 = new java.lang.String[] { "", "", "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, true);
        tSSLTransportParameters26.setKeyStore("hi!", "");
        tSSLTransportParameters26.setTrustStore("", "");
        tSSLTransportParameters26.setTrustStore("hi!", "", "hi!", "");
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test15716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15716");
        java.lang.String[] strArray15 = new java.lang.String[] { "", "", "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, false);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test15717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15717");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters2 = configuration0.getParameters();
        java.lang.String str3 = configuration0.getType();
        java.lang.String str4 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = configuration0.getParameters();
        java.lang.String str6 = configuration0.getType();
        java.security.Provider provider7 = configuration0.getProvider();
        configuration0.refresh();
        configuration0.refresh();
        java.security.Provider provider10 = configuration0.getProvider();
        java.lang.String str11 = configuration0.getType();
        java.lang.String str12 = configuration0.getType();
        java.security.Provider provider13 = configuration0.getProvider();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test15718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15718");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        tSSLTransportParameters21.setKeyStore("", "hi!");
        tSSLTransportParameters21.setTrustStore("hi!", "", "hi!", "");
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test15719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15719");
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, false);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test15720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15720");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters2 = configuration0.getParameters();
        java.lang.String str3 = configuration0.getType();
        java.security.Provider provider4 = configuration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters5 = configuration0.getParameters();
        configuration0.refresh();
        java.lang.String str7 = configuration0.getType();
        configuration0.refresh();
        configuration0.refresh();
        java.lang.String str10 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters11 = configuration0.getParameters();
        java.lang.String str12 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters13 = configuration0.getParameters();
        java.lang.String str14 = configuration0.getType();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test15721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15721");
        java.lang.String[] strArray13 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test15722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15722");
        java.lang.String[] strArray8 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        tSSLTransportParameters18.requireClientAuth(true);
        tSSLTransportParameters18.setTrustStore("", "hi!");
        tSSLTransportParameters18.setTrustStore("hi!", "hi!", "", "hi!");
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test15723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15723");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters2 = configuration0.getParameters();
        java.lang.String str3 = configuration0.getType();
        java.lang.String str4 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = configuration0.getParameters();
        java.lang.String str6 = configuration0.getType();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.lang.String str8 = configuration0.getType();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.Parameters parameters10 = configuration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.lang.String str12 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters13 = configuration0.getParameters();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test15724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15724");
        java.lang.String[] strArray8 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8, false);
        tSSLTransportParameters20.setKeyStore("hi!", "", "hi!", "");
        tSSLTransportParameters20.requireClientAuth(false);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test15725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15725");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8, true);
        tSSLTransportParameters17.setKeyStore("", "hi!", "hi!", "");
        tSSLTransportParameters17.setTrustStore("", "", "", "hi!");
        tSSLTransportParameters17.requireClientAuth(false);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test15726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15726");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test15727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15727");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        java.lang.String str2 = configuration0.getType();
        java.lang.String str3 = configuration0.getType();
        configuration0.refresh();
        java.lang.String str5 = configuration0.getType();
        java.security.Provider provider6 = configuration0.getProvider();
        configuration0.refresh();
        java.security.Provider provider8 = configuration0.getProvider();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider8);
    }

    @Test
    public void test15728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15728");
        java.lang.String[] strArray12 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, false);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test15729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15729");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters7 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray5, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters8 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray5);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray5);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray5, false);
        tSSLTransportParameters11.setKeyStore("hi!", "hi!", "hi!", "hi!");
        tSSLTransportParameters11.setKeyStore("", "");
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test15730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15730");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters2 = configuration0.getParameters();
        java.lang.String str3 = configuration0.getType();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        configuration0.refresh();
        configuration0.refresh();
        java.security.Provider provider8 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.lang.String str10 = configuration0.getType();
        java.security.Provider provider11 = configuration0.getProvider();
        java.security.Provider provider12 = configuration0.getProvider();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(provider12);
    }

    @Test
    public void test15731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15731");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        java.security.Provider provider2 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.security.Provider provider5 = configuration0.getProvider();
        java.lang.String str6 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters7 = configuration0.getParameters();
        java.lang.String str8 = configuration0.getType();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        configuration0.refresh();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test15732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15732");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        java.lang.String str2 = configuration0.getType();
        java.lang.String str3 = configuration0.getType();
        configuration0.refresh();
        java.security.Provider provider5 = configuration0.getProvider();
        java.security.Provider provider6 = configuration0.getProvider();
        java.security.Provider provider7 = configuration0.getProvider();
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters9 = configuration0.getParameters();
        configuration0.refresh();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test15733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15733");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters2 = configuration0.getParameters();
        java.lang.String str3 = configuration0.getType();
        configuration0.refresh();
        configuration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        configuration0.refresh();
        java.lang.String str8 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters9 = configuration0.getParameters();
        java.lang.String str10 = configuration0.getType();
        configuration0.refresh();
        configuration0.refresh();
        java.lang.String str13 = configuration0.getType();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test15734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15734");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        java.lang.String str2 = configuration0.getType();
        java.lang.String str3 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = configuration0.getParameters();
        java.security.Provider provider5 = configuration0.getProvider();
        configuration0.refresh();
        java.lang.String str7 = configuration0.getType();
        java.security.Provider provider8 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.security.Provider provider10 = configuration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters11 = configuration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.security.Provider provider13 = configuration0.getProvider();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test15735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15735");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters6 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray5);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters7 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray5);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray5, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray5, true);
        tSSLTransportParameters11.requireClientAuth(true);
        java.lang.Class<?> wildcardClass14 = tSSLTransportParameters11.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test15736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15736");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        java.security.Provider provider2 = configuration0.getProvider();
        java.lang.String str3 = configuration0.getType();
        java.security.Provider provider4 = configuration0.getProvider();
        configuration0.refresh();
        java.lang.String str6 = configuration0.getType();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test15737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15737");
        java.lang.String[] strArray7 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray7, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray7, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray7);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray7);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray7, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray7, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray7);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test15738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15738");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        configuration0.refresh();
        java.security.Provider provider3 = configuration0.getProvider();
        configuration0.refresh();
        java.lang.String str5 = configuration0.getType();
        configuration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.security.Provider provider9 = configuration0.getProvider();
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters11 = configuration0.getParameters();
        java.lang.String str12 = configuration0.getType();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test15739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15739");
        java.lang.String[] strArray16 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters38 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16);
        java.lang.Class<?> wildcardClass39 = tSSLTransportParameters38.getClass();
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test15740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15740");
        java.lang.String[] strArray13 = new java.lang.String[] { "", "", "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        tSSLTransportParameters25.requireClientAuth(false);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test15741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15741");
        java.lang.String[] strArray9 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9, false);
        tSSLTransportParameters24.setKeyStore("", "hi!");
        tSSLTransportParameters24.setTrustStore("hi!", "");
        tSSLTransportParameters24.requireClientAuth(true);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test15742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15742");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        tSSLTransportParameters22.setKeyStore("", "hi!");
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test15743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15743");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters6 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray5);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters8 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray5, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray5, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray5);
        tSSLTransportParameters11.setTrustStore("hi!", "", "hi!", "");
        tSSLTransportParameters11.setKeyStore("", "hi!");
        java.lang.Class<?> wildcardClass20 = tSSLTransportParameters11.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test15744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15744");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        java.security.Provider provider2 = configuration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters3 = configuration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.lang.String str5 = configuration0.getType();
        java.security.Provider provider6 = configuration0.getProvider();
        configuration0.refresh();
        java.lang.String str8 = configuration0.getType();
        java.security.Provider provider9 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider9);
    }

    @Test
    public void test15745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15745");
        java.lang.String[] strArray7 = new java.lang.String[] { "", "", "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters8 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray7);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray7, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray7);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray7);
        tSSLTransportParameters12.setKeyStore("hi!", "", "", "hi!");
        tSSLTransportParameters12.requireClientAuth(false);
        tSSLTransportParameters12.requireClientAuth(true);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test15746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15746");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        java.lang.String str2 = configuration0.getType();
        java.security.Provider provider3 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.security.Provider provider6 = configuration0.getProvider();
        configuration0.refresh();
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters9 = configuration0.getParameters();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test15747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15747");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test15748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15748");
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters7 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters8 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6, true);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test15749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15749");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        tSSLTransportParameters17.setKeyStore("", "hi!", "", "");
        tSSLTransportParameters17.setKeyStore("hi!", "hi!", "", "hi!");
        tSSLTransportParameters17.setTrustStore("hi!", "");
        tSSLTransportParameters17.setKeyStore("hi!", "", "", "");
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test15750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15750");
        java.lang.String[] strArray6 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters8 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6, true);
        tSSLTransportParameters16.setKeyStore("", "hi!", "hi!", "hi!");
        tSSLTransportParameters16.setKeyStore("", "");
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test15751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15751");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters2 = configuration0.getParameters();
        java.lang.String str3 = configuration0.getType();
        java.lang.String str4 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = configuration0.getParameters();
        java.lang.String str6 = configuration0.getType();
        java.security.Provider provider7 = configuration0.getProvider();
        java.lang.String str8 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters9 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters10 = configuration0.getParameters();
        configuration0.refresh();
        configuration0.refresh();
        java.lang.Class<?> wildcardClass13 = configuration0.getClass();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test15752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15752");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        java.security.Provider provider2 = configuration0.getProvider();
        java.lang.String str3 = configuration0.getType();
        configuration0.refresh();
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = configuration0.getParameters();
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters8 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters9 = configuration0.getParameters();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test15753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15753");
        java.lang.String[] strArray12 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, false);
        tSSLTransportParameters31.setTrustStore("", "hi!", "", "");
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test15754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15754");
        java.lang.String[] strArray3 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters4 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray3);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters6 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray3, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters8 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray3, true);
        tSSLTransportParameters8.setTrustStore("", "hi!", "hi!", "");
        tSSLTransportParameters8.setKeyStore("hi!", "hi!", "hi!", "");
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test15755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15755");
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test15756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15756");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        configuration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.security.Provider provider4 = configuration0.getProvider();
        configuration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(provider4);
    }

    @Test
    public void test15757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15757");
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test15758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15758");
        java.lang.String[] strArray8 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        tSSLTransportParameters18.setTrustStore("", "");
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test15759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15759");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        java.lang.String str2 = configuration0.getType();
        java.lang.String str3 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = configuration0.getParameters();
        java.security.Provider provider5 = configuration0.getProvider();
        configuration0.refresh();
        java.lang.String str7 = configuration0.getType();
        java.lang.String str8 = configuration0.getType();
        java.security.Provider provider9 = configuration0.getProvider();
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters11 = configuration0.getParameters();
        java.lang.String str12 = configuration0.getType();
        java.security.Provider provider13 = configuration0.getProvider();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test15760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15760");
        java.lang.String[] strArray5 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters7 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray5, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray5, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray5, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray5);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray5, false);
        tSSLTransportParameters14.setKeyStore("hi!", "hi!", "hi!", "hi!");
        tSSLTransportParameters14.setKeyStore("", "hi!");
        tSSLTransportParameters14.setKeyStore("hi!", "");
        tSSLTransportParameters14.setTrustStore("hi!", "");
        tSSLTransportParameters14.setKeyStore("hi!", "hi!");
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test15761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15761");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters2 = configuration0.getParameters();
        java.lang.String str3 = configuration0.getType();
        java.lang.String str4 = configuration0.getType();
        configuration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.security.Provider provider9 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider9);
    }

    @Test
    public void test15762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15762");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        java.security.Provider provider2 = configuration0.getProvider();
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters4 = configuration0.getParameters();
        java.lang.String str5 = configuration0.getType();
        java.security.Provider provider6 = configuration0.getProvider();
        java.lang.String str7 = configuration0.getType();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.security.Provider provider9 = configuration0.getProvider();
        java.lang.String str10 = configuration0.getType();
        configuration0.refresh();
        configuration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test15763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15763");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.security.Provider provider3 = configuration0.getProvider();
        java.security.Provider provider4 = configuration0.getProvider();
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = configuration0.getParameters();
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters8 = configuration0.getParameters();
        java.lang.String str9 = configuration0.getType();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test15764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15764");
        java.lang.String[] strArray15 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, false);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test15765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15765");
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "", "", "", "", "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, false);
        tSSLTransportParameters22.setKeyStore("hi!", "", "", "");
        tSSLTransportParameters22.setTrustStore("", "", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test15766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15766");
        java.lang.String[] strArray6 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters8 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6, false);
        tSSLTransportParameters15.setTrustStore("hi!", "hi!", "hi!", "");
        tSSLTransportParameters15.setKeyStore("hi!", "hi!");
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test15767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15767");
        java.lang.String[] strArray12 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test15768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15768");
        java.lang.String[] strArray16 = new java.lang.String[] { "", "", "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, false);
        java.lang.Class<?> wildcardClass37 = tSSLTransportParameters36.getClass();
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test15769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15769");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters2 = configuration0.getParameters();
        java.lang.String str3 = configuration0.getType();
        java.lang.String str4 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = configuration0.getParameters();
        java.lang.String str6 = configuration0.getType();
        configuration0.refresh();
        java.security.Provider provider8 = configuration0.getProvider();
        configuration0.refresh();
        java.security.Provider provider10 = configuration0.getProvider();
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters12 = configuration0.getParameters();
        java.lang.String str13 = configuration0.getType();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test15770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15770");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        tSSLTransportParameters16.setTrustStore("hi!", "", "", "");
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test15771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15771");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, true);
        tSSLTransportParameters24.setTrustStore("hi!", "");
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test15772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15772");
        java.lang.String[] strArray7 = new java.lang.String[] { "", "", "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters8 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray7);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray7);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray7, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray7);
        tSSLTransportParameters12.setKeyStore("hi!", "", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test15773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15773");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters2 = configuration0.getParameters();
        java.lang.String str3 = configuration0.getType();
        java.lang.String str4 = configuration0.getType();
        configuration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.Parameters parameters7 = configuration0.getParameters();
        java.security.Provider provider8 = configuration0.getProvider();
        configuration0.refresh();
        configuration0.refresh();
        java.lang.String str11 = configuration0.getType();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test15774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15774");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters7 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters8 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6, true);
        tSSLTransportParameters13.setTrustStore("hi!", "hi!", "", "hi!");
        tSSLTransportParameters13.setKeyStore("hi!", "");
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test15775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15775");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        java.security.Provider provider2 = configuration0.getProvider();
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters4 = configuration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.security.Provider provider7 = configuration0.getProvider();
        java.security.Provider provider8 = configuration0.getProvider();
        java.lang.String str9 = configuration0.getType();
        configuration0.refresh();
        java.lang.String str11 = configuration0.getType();
        configuration0.refresh();
        java.lang.String str13 = configuration0.getType();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test15776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15776");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters6 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray5);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters7 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray5);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters8 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray5);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray5, false);
        tSSLTransportParameters10.setTrustStore("", "hi!", "hi!", "");
        tSSLTransportParameters10.setTrustStore("hi!", "", "hi!", "");
        tSSLTransportParameters10.setTrustStore("", "hi!");
        tSSLTransportParameters10.setKeyStore("", "");
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test15777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15777");
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters7 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6);
        tSSLTransportParameters14.setTrustStore("hi!", "", "hi!", "");
        tSSLTransportParameters14.setKeyStore("", "hi!");
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test15778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15778");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test15779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15779");
        java.lang.String[] strArray13 = new java.lang.String[] { "", "", "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, true);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test15780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15780");
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        tSSLTransportParameters28.requireClientAuth(false);
        tSSLTransportParameters28.setTrustStore("", "", "", "hi!");
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test15781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15781");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters2 = configuration0.getParameters();
        java.lang.String str3 = configuration0.getType();
        configuration0.refresh();
        configuration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.lang.String str11 = configuration0.getType();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.Parameters parameters13 = configuration0.getParameters();
        java.security.Provider provider14 = configuration0.getProvider();
        java.lang.String str15 = configuration0.getType();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.lang.String str17 = configuration0.getType();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test15782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15782");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        java.security.Provider provider2 = configuration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters3 = configuration0.getParameters();
        java.security.Provider provider4 = configuration0.getProvider();
        java.lang.String str5 = configuration0.getType();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        configuration0.refresh();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test15783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15783");
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8, false);
        tSSLTransportParameters16.setTrustStore("hi!", "hi!");
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test15784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15784");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        java.security.Provider provider2 = configuration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters3 = configuration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.lang.String str5 = configuration0.getType();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.Parameters parameters7 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters8 = configuration0.getParameters();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test15785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15785");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters2 = configuration0.getParameters();
        java.lang.String str3 = configuration0.getType();
        configuration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.lang.String str7 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters8 = configuration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters11 = configuration0.getParameters();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test15786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15786");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters6 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray4, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters7 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray4);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters8 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray4);
        tSSLTransportParameters8.setTrustStore("", "", "hi!", "");
        tSSLTransportParameters8.setKeyStore("", "");
        tSSLTransportParameters8.setKeyStore("hi!", "hi!", "hi!", "hi!");
        tSSLTransportParameters8.setTrustStore("", "");
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test15787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15787");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test15788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15788");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, true);
        tSSLTransportParameters28.setTrustStore("hi!", "", "", "hi!");
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test15789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15789");
        java.lang.String[] strArray3 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters4 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray3);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters6 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray3, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters8 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray3, true);
        tSSLTransportParameters8.setKeyStore("hi!", "hi!", "hi!", "hi!");
        tSSLTransportParameters8.setKeyStore("hi!", "hi!");
        tSSLTransportParameters8.setTrustStore("", "hi!");
        tSSLTransportParameters8.setKeyStore("", "hi!", "", "hi!");
        tSSLTransportParameters8.setKeyStore("", "hi!", "", "hi!");
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test15790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15790");
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters0 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters();
        tSSLTransportParameters0.setKeyStore("", "hi!");
        tSSLTransportParameters0.requireClientAuth(false);
        tSSLTransportParameters0.setKeyStore("", "hi!", "", "");
        tSSLTransportParameters0.setKeyStore("hi!", "", "hi!", "hi!");
        tSSLTransportParameters0.requireClientAuth(true);
        tSSLTransportParameters0.setTrustStore("hi!", "hi!", "", "");
        tSSLTransportParameters0.setKeyStore("hi!", "", "hi!", "");
    }

    @Test
    public void test15791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15791");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters4 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray2, true);
        tSSLTransportParameters4.setTrustStore("", "hi!");
        tSSLTransportParameters4.setKeyStore("", "");
        tSSLTransportParameters4.setKeyStore("hi!", "", "hi!", "");
        tSSLTransportParameters4.requireClientAuth(true);
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test15792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15792");
        java.lang.String[] strArray17 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters38 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters39 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters40 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17);
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test15793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15793");
        java.lang.String[] strArray11 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test15794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15794");
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test15795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15795");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters8 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray7);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray7, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray7, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray7);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray7, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray7);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test15796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15796");
        java.lang.String[] strArray9 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        tSSLTransportParameters21.setKeyStore("", "hi!", "hi!", "hi!");
        tSSLTransportParameters21.setKeyStore("", "hi!", "", "");
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test15797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15797");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8);
        tSSLTransportParameters20.setTrustStore("hi!", "");
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test15798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15798");
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        tSSLTransportParameters27.setKeyStore("hi!", "hi!");
        tSSLTransportParameters27.setTrustStore("hi!", "");
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test15799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15799");
        java.lang.String[] strArray6 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters8 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6, true);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test15800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15800");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters6 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray4, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters7 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray4);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters8 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray4);
        tSSLTransportParameters8.setTrustStore("hi!", "");
        tSSLTransportParameters8.setKeyStore("", "hi!", "hi!", "hi!");
        tSSLTransportParameters8.setKeyStore("hi!", "hi!");
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test15801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15801");
        java.lang.String[] strArray11 = new java.lang.String[] { "", "", "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        tSSLTransportParameters21.setKeyStore("", "");
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test15802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15802");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        java.lang.String str2 = configuration0.getType();
        java.lang.String str3 = configuration0.getType();
        configuration0.refresh();
        java.lang.String str5 = configuration0.getType();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        configuration0.refresh();
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters11 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters12 = configuration0.getParameters();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test15803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15803");
        java.lang.String[] strArray13 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, true);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test15804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15804");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        configuration0.refresh();
        java.security.Provider provider3 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        configuration0.refresh();
        java.security.Provider provider6 = configuration0.getProvider();
        java.security.Provider provider7 = configuration0.getProvider();
        java.security.Provider provider8 = configuration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = configuration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.Parameters parameters11 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters12 = configuration0.getParameters();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test15805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15805");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        java.security.Provider provider2 = configuration0.getProvider();
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters4 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = configuration0.getParameters();
        java.lang.String str6 = configuration0.getType();
        configuration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        configuration0.refresh();
        java.security.Provider provider10 = configuration0.getProvider();
        java.lang.String str11 = configuration0.getType();
        java.lang.String str12 = configuration0.getType();
        java.lang.String str13 = configuration0.getType();
        java.security.Provider provider14 = configuration0.getProvider();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(provider14);
    }

    @Test
    public void test15806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15806");
        java.lang.String[] strArray11 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        tSSLTransportParameters30.setKeyStore("hi!", "");
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test15807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15807");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters2 = configuration0.getParameters();
        java.lang.String str3 = configuration0.getType();
        configuration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.Parameters parameters7 = configuration0.getParameters();
        java.security.Provider provider8 = configuration0.getProvider();
        java.security.Provider provider9 = configuration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters10 = configuration0.getParameters();
        configuration0.refresh();
        java.security.Provider provider12 = configuration0.getProvider();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider12);
    }

    @Test
    public void test15808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15808");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        java.security.Provider provider2 = configuration0.getProvider();
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters4 = configuration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.security.Provider provider7 = configuration0.getProvider();
        java.lang.String str8 = configuration0.getType();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters11 = configuration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.Parameters parameters13 = configuration0.getParameters();
        configuration0.refresh();
        java.security.Provider provider15 = configuration0.getProvider();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(provider15);
    }

    @Test
    public void test15809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15809");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8, true);
        tSSLTransportParameters18.setTrustStore("", "", "", "hi!");
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test15810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15810");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, false);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test15811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15811");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters4 = configuration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        configuration0.refresh();
        java.security.Provider provider7 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.security.Provider provider9 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider9);
    }

    @Test
    public void test15812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15812");
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test15813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15813");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        tSSLTransportParameters21.setKeyStore("hi!", "");
        tSSLTransportParameters21.setTrustStore("", "");
        tSSLTransportParameters21.setKeyStore("hi!", "hi!");
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test15814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15814");
        java.lang.String[] strArray11 = new java.lang.String[] { "", "", "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        tSSLTransportParameters22.requireClientAuth(false);
        tSSLTransportParameters22.setKeyStore("", "hi!", "", "");
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test15815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15815");
        java.lang.String[] strArray6 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters7 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6);
        tSSLTransportParameters15.setKeyStore("", "hi!");
        tSSLTransportParameters15.setTrustStore("", "", "hi!", "");
        tSSLTransportParameters15.setTrustStore("", "");
        tSSLTransportParameters15.requireClientAuth(false);
        java.lang.Class<?> wildcardClass29 = tSSLTransportParameters15.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test15816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15816");
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test15817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15817");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        configuration0.refresh();
        java.security.Provider provider3 = configuration0.getProvider();
        configuration0.refresh();
        java.lang.String str5 = configuration0.getType();
        configuration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        configuration0.refresh();
        java.security.Provider provider9 = configuration0.getProvider();
        java.lang.String str10 = configuration0.getType();
        java.security.Provider provider11 = configuration0.getProvider();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(provider11);
    }

    @Test
    public void test15818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15818");
        java.lang.String[] strArray11 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        tSSLTransportParameters28.setKeyStore("", "hi!", "", "");
        tSSLTransportParameters28.setKeyStore("hi!", "");
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test15819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15819");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        java.lang.String str2 = configuration0.getType();
        java.lang.String str3 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = configuration0.getParameters();
        java.security.Provider provider5 = configuration0.getProvider();
        configuration0.refresh();
        java.lang.String str7 = configuration0.getType();
        java.lang.String str8 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters9 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters10 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters11 = configuration0.getParameters();
        configuration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test15820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15820");
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8, false);
        tSSLTransportParameters15.setTrustStore("hi!", "hi!");
        tSSLTransportParameters15.setKeyStore("hi!", "");
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test15821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15821");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        java.security.Provider provider2 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.security.Provider provider5 = configuration0.getProvider();
        java.lang.String str6 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters7 = configuration0.getParameters();
        java.lang.String str8 = configuration0.getType();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.security.Provider provider10 = configuration0.getProvider();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test15822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15822");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.security.Provider provider3 = configuration0.getProvider();
        java.security.Provider provider4 = configuration0.getProvider();
        java.security.Provider provider5 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.security.Provider provider7 = configuration0.getProvider();
        java.lang.String str8 = configuration0.getType();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        configuration0.refresh();
        configuration0.refresh();
        java.lang.String str15 = configuration0.getType();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test15823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15823");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        java.lang.String str1 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters2 = configuration0.getParameters();
        java.lang.String str3 = configuration0.getType();
        configuration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.lang.String str6 = configuration0.getType();
        configuration0.refresh();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test15824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15824");
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        tSSLTransportParameters27.setKeyStore("", "", "hi!", "hi!");
        tSSLTransportParameters27.setTrustStore("hi!", "");
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test15825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15825");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters6 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray5);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters7 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray5);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray5, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray5, false);
        tSSLTransportParameters11.setTrustStore("", "hi!", "hi!", "hi!");
        tSSLTransportParameters11.setTrustStore("hi!", "hi!");
        tSSLTransportParameters11.requireClientAuth(true);
        tSSLTransportParameters11.setKeyStore("hi!", "");
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test15826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15826");
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, false);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test15827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15827");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, true);
        tSSLTransportParameters23.setTrustStore("", "hi!");
        tSSLTransportParameters23.setKeyStore("", "hi!", "hi!", "");
        tSSLTransportParameters23.setKeyStore("hi!", "");
        tSSLTransportParameters23.setKeyStore("", "hi!");
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test15828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15828");
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, true);
        tSSLTransportParameters35.setKeyStore("", "", "hi!", "");
        tSSLTransportParameters35.setTrustStore("", "hi!");
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test15829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15829");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters8 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6);
        tSSLTransportParameters12.setTrustStore("hi!", "");
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test15830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15830");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters2 = configuration0.getParameters();
        java.lang.String str3 = configuration0.getType();
        configuration0.refresh();
        configuration0.refresh();
        java.lang.String str6 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters7 = configuration0.getParameters();
        java.lang.String str8 = configuration0.getType();
        configuration0.refresh();
        java.lang.String str10 = configuration0.getType();
        configuration0.refresh();
        java.lang.String str12 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters13 = configuration0.getParameters();
        java.security.Provider provider14 = configuration0.getProvider();
        configuration0.refresh();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(provider14);
    }

    @Test
    public void test15831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15831");
        java.lang.String[] strArray6 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters8 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6, true);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test15832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15832");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters6 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray5);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters7 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray5);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray5, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray5);
        tSSLTransportParameters10.setKeyStore("", "");
        tSSLTransportParameters10.setTrustStore("", "hi!", "hi!", "");
        tSSLTransportParameters10.setTrustStore("", "hi!");
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test15833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15833");
        java.lang.String[] strArray16 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters38 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters39 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16);
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test15834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15834");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, false);
        tSSLTransportParameters23.requireClientAuth(false);
        tSSLTransportParameters23.setKeyStore("hi!", "");
        tSSLTransportParameters23.setTrustStore("", "", "", "hi!");
        tSSLTransportParameters23.setKeyStore("", "hi!");
        tSSLTransportParameters23.setTrustStore("hi!", "hi!");
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test15835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15835");
        java.lang.String[] strArray13 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        tSSLTransportParameters29.setTrustStore("hi!", "", "hi!", "");
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test15836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15836");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters2 = configuration0.getParameters();
        java.lang.String str3 = configuration0.getType();
        java.lang.String str4 = configuration0.getType();
        configuration0.refresh();
        java.security.Provider provider6 = configuration0.getProvider();
        java.security.Provider provider7 = configuration0.getProvider();
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters9 = configuration0.getParameters();
        java.lang.String str10 = configuration0.getType();
        java.lang.String str11 = configuration0.getType();
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters13 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters14 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters15 = configuration0.getParameters();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test15837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15837");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        java.security.Provider provider2 = configuration0.getProvider();
        java.lang.String str3 = configuration0.getType();
        java.security.Provider provider4 = configuration0.getProvider();
        java.lang.String str5 = configuration0.getType();
        java.security.Provider provider6 = configuration0.getProvider();
        java.security.Provider provider7 = configuration0.getProvider();
        java.security.Provider provider8 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
    }

    @Test
    public void test15838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15838");
        java.lang.String[] strArray14 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, true);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test15839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15839");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, true);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test15840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15840");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters2 = configuration0.getParameters();
        java.lang.String str3 = configuration0.getType();
        configuration0.refresh();
        configuration0.refresh();
        java.lang.String str6 = configuration0.getType();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.Parameters parameters8 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters9 = configuration0.getParameters();
        java.security.Provider provider10 = configuration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters11 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters12 = configuration0.getParameters();
        java.lang.String str13 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters14 = configuration0.getParameters();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test15841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15841");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        java.security.Provider provider2 = configuration0.getProvider();
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters4 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = configuration0.getParameters();
        java.lang.String str6 = configuration0.getType();
        configuration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters10 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters11 = configuration0.getParameters();
        configuration0.refresh();
        configuration0.refresh();
        java.lang.String str14 = configuration0.getType();
        configuration0.refresh();
        java.security.Provider provider16 = configuration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters17 = configuration0.getParameters();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNull(parameters17);
    }

    @Test
    public void test15842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15842");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        configuration0.refresh();
        java.security.Provider provider3 = configuration0.getProvider();
        configuration0.refresh();
        java.security.Provider provider5 = configuration0.getProvider();
        java.lang.String str6 = configuration0.getType();
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters8 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters9 = configuration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        configuration0.refresh();
        java.security.Provider provider12 = configuration0.getProvider();
        java.lang.Class<?> wildcardClass13 = configuration0.getClass();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test15843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15843");
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        tSSLTransportParameters28.setTrustStore("", "");
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test15844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15844");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test15845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15845");
        java.lang.String[] strArray9 = new java.lang.String[] { "", "", "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9, true);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test15846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15846");
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters39 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters40 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters41 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test15847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15847");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "", "", "", "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        tSSLTransportParameters11.setTrustStore("hi!", "");
        tSSLTransportParameters11.requireClientAuth(false);
        tSSLTransportParameters11.setKeyStore("", "hi!");
        tSSLTransportParameters11.setKeyStore("hi!", "hi!", "hi!", "");
        tSSLTransportParameters11.requireClientAuth(false);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test15848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15848");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters2 = configuration0.getParameters();
        java.lang.String str3 = configuration0.getType();
        configuration0.refresh();
        configuration0.refresh();
        java.lang.String str6 = configuration0.getType();
        configuration0.refresh();
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters9 = configuration0.getParameters();
        java.security.Provider provider10 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test15849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15849");
        java.lang.String[] strArray14 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        tSSLTransportParameters32.setTrustStore("hi!", "hi!");
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test15850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15850");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters2 = configuration0.getParameters();
        java.lang.String str3 = configuration0.getType();
        configuration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.Parameters parameters6 = configuration0.getParameters();
        configuration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.lang.String str9 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters10 = configuration0.getParameters();
        java.lang.String str11 = configuration0.getType();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test15851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15851");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters2 = configuration0.getParameters();
        java.lang.String str3 = configuration0.getType();
        java.security.Provider provider4 = configuration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters5 = configuration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.security.Provider provider7 = configuration0.getProvider();
        java.security.Provider provider8 = configuration0.getProvider();
        java.security.Provider provider9 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.Parameters parameters11 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters12 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters13 = configuration0.getParameters();
        java.lang.String str14 = configuration0.getType();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        configuration0.refresh();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test15852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15852");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters7 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6);
        tSSLTransportParameters13.setKeyStore("hi!", "hi!");
        tSSLTransportParameters13.setTrustStore("hi!", "hi!", "", "hi!");
        tSSLTransportParameters13.setTrustStore("hi!", "");
        tSSLTransportParameters13.setTrustStore("", "", "hi!", "");
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test15853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15853");
        java.lang.String[] strArray12 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        tSSLTransportParameters29.setTrustStore("hi!", "", "hi!", "hi!");
        tSSLTransportParameters29.setKeyStore("", "", "", "");
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test15854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15854");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters2 = configuration0.getParameters();
        java.lang.String str3 = configuration0.getType();
        java.lang.String str4 = configuration0.getType();
        java.security.Provider provider5 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.Parameters parameters8 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters9 = configuration0.getParameters();
        java.security.Provider provider10 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        configuration0.refresh();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test15855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15855");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters5 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray4);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters7 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray4, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters8 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray4);
        tSSLTransportParameters8.requireClientAuth(true);
        tSSLTransportParameters8.requireClientAuth(false);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test15856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15856");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test15857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15857");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters2 = configuration0.getParameters();
        java.lang.String str3 = configuration0.getType();
        configuration0.refresh();
        configuration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.security.Provider provider8 = configuration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = configuration0.getParameters();
        java.security.Provider provider10 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.Parameters parameters12 = configuration0.getParameters();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test15858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15858");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters2 = configuration0.getParameters();
        java.lang.String str3 = configuration0.getType();
        java.lang.String str4 = configuration0.getType();
        configuration0.refresh();
        configuration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.Parameters parameters8 = configuration0.getParameters();
        java.lang.String str9 = configuration0.getType();
        java.security.Provider provider10 = configuration0.getProvider();
        java.lang.String str11 = configuration0.getType();
        java.lang.String str12 = configuration0.getType();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test15859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15859");
        java.lang.String[] strArray8 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8, false);
        tSSLTransportParameters21.setTrustStore("hi!", "hi!", "hi!", "hi!");
        tSSLTransportParameters21.requireClientAuth(false);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test15860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15860");
        java.lang.String[] strArray6 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters8 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6);
        tSSLTransportParameters14.setTrustStore("hi!", "hi!", "", "");
        tSSLTransportParameters14.setKeyStore("", "hi!", "", "");
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test15861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15861");
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        tSSLTransportParameters29.setKeyStore("", "hi!", "", "hi!");
        tSSLTransportParameters29.setTrustStore("", "", "", "");
        tSSLTransportParameters29.setTrustStore("hi!", "", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test15862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15862");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        tSSLTransportParameters25.requireClientAuth(false);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test15863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15863");
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test15864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15864");
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters0 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters();
        tSSLTransportParameters0.setKeyStore("", "hi!");
        tSSLTransportParameters0.requireClientAuth(false);
        tSSLTransportParameters0.setKeyStore("", "", "", "hi!");
        tSSLTransportParameters0.requireClientAuth(true);
        tSSLTransportParameters0.setTrustStore("", "", "hi!", "");
        tSSLTransportParameters0.setTrustStore("", "");
        tSSLTransportParameters0.setTrustStore("", "");
        tSSLTransportParameters0.requireClientAuth(false);
    }

    @Test
    public void test15865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15865");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        java.security.Provider provider2 = configuration0.getProvider();
        configuration0.refresh();
        configuration0.refresh();
        java.lang.String str5 = configuration0.getType();
        java.security.Provider provider6 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        configuration0.refresh();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider6);
    }

    @Test
    public void test15866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15866");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = configuration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.Parameters parameters5 = configuration0.getParameters();
        configuration0.refresh();
        java.security.Provider provider7 = configuration0.getProvider();
        java.security.Provider provider8 = configuration0.getProvider();
        java.security.Provider provider9 = configuration0.getProvider();
        java.lang.String str10 = configuration0.getType();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test15867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15867");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test15868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15868");
        java.lang.String[] strArray10 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, true);
        tSSLTransportParameters27.setTrustStore("hi!", "hi!");
        java.lang.Class<?> wildcardClass31 = tSSLTransportParameters27.getClass();
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test15869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15869");
        java.lang.String[] strArray10 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, false);
        tSSLTransportParameters25.setKeyStore("", "");
        tSSLTransportParameters25.setTrustStore("", "hi!");
        tSSLTransportParameters25.requireClientAuth(true);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test15870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15870");
        java.lang.String[] strArray8 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8, false);
        java.lang.Class<?> wildcardClass21 = strArray8.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test15871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15871");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        java.security.Provider provider2 = configuration0.getProvider();
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters4 = configuration0.getParameters();
        java.lang.String str5 = configuration0.getType();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.security.Provider provider7 = configuration0.getProvider();
        java.security.Provider provider8 = configuration0.getProvider();
        configuration0.refresh();
        java.lang.String str10 = configuration0.getType();
        java.lang.String str11 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters12 = configuration0.getParameters();
        java.lang.String str13 = configuration0.getType();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test15872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15872");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "", "", "", "", "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16, true);
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test15873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15873");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters2 = configuration0.getParameters();
        java.lang.String str3 = configuration0.getType();
        java.lang.String str4 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = configuration0.getParameters();
        java.lang.String str6 = configuration0.getType();
        configuration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters11 = configuration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.lang.String str13 = configuration0.getType();
        configuration0.refresh();
        configuration0.refresh();
        java.lang.Class<?> wildcardClass16 = configuration0.getClass();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test15874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15874");
        java.lang.String[] strArray9 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9, false);
        tSSLTransportParameters23.setTrustStore("hi!", "hi!", "", "");
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test15875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15875");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters2 = configuration0.getParameters();
        java.lang.String str3 = configuration0.getType();
        configuration0.refresh();
        configuration0.refresh();
        java.lang.String str6 = configuration0.getType();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.Parameters parameters8 = configuration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.lang.String str10 = configuration0.getType();
        java.security.Provider provider11 = configuration0.getProvider();
        java.security.Provider provider12 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        configuration0.refresh();
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters16 = configuration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(parameters16);
    }

    @Test
    public void test15876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15876");
        java.lang.String[] strArray10 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test15877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15877");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        tSSLTransportParameters22.setTrustStore("hi!", "hi!");
        tSSLTransportParameters22.setKeyStore("", "", "hi!", "hi!");
        tSSLTransportParameters22.setTrustStore("", "hi!");
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test15878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15878");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        java.security.Provider provider2 = configuration0.getProvider();
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters4 = configuration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.security.Provider provider7 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.security.Provider provider9 = configuration0.getProvider();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider9);
    }

    @Test
    public void test15879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15879");
        java.lang.String[] strArray11 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        tSSLTransportParameters26.setTrustStore("", "hi!", "", "");
        tSSLTransportParameters26.setKeyStore("hi!", "hi!");
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test15880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15880");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters2 = configuration0.getParameters();
        java.lang.String str3 = configuration0.getType();
        java.lang.String str4 = configuration0.getType();
        configuration0.refresh();
        configuration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.Parameters parameters8 = configuration0.getParameters();
        java.lang.String str9 = configuration0.getType();
        java.lang.String str10 = configuration0.getType();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test15881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15881");
        java.lang.String[] strArray12 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, false);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test15882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15882");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9, false);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test15883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15883");
        java.lang.String[] strArray5 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters7 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray5, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters8 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray5);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray5);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray5);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray5, true);
        tSSLTransportParameters12.setKeyStore("", "hi!", "hi!", "");
        tSSLTransportParameters12.setTrustStore("", "", "", "");
        tSSLTransportParameters12.requireClientAuth(false);
        java.lang.Class<?> wildcardClass25 = tSSLTransportParameters12.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test15884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15884");
        java.lang.String[] strArray9 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        tSSLTransportParameters19.setKeyStore("", "hi!", "", "hi!");
        tSSLTransportParameters19.setTrustStore("", "", "", "hi!");
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test15885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15885");
        java.lang.String[] strArray6 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters7 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6);
        tSSLTransportParameters14.setKeyStore("hi!", "");
        tSSLTransportParameters14.requireClientAuth(false);
        tSSLTransportParameters14.setTrustStore("", "hi!");
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test15886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15886");
        java.lang.String[] strArray11 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, false);
        tSSLTransportParameters28.setKeyStore("hi!", "hi!", "", "");
        tSSLTransportParameters28.setTrustStore("hi!", "", "", "");
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test15887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15887");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        java.lang.String str2 = configuration0.getType();
        java.security.Provider provider3 = configuration0.getProvider();
        java.security.Provider provider4 = configuration0.getProvider();
        java.security.Provider provider5 = configuration0.getProvider();
        java.security.Provider provider6 = configuration0.getProvider();
        configuration0.refresh();
        java.lang.String str8 = configuration0.getType();
        java.security.Provider provider9 = configuration0.getProvider();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider9);
    }

    @Test
    public void test15888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15888");
        java.lang.String[] strArray8 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        tSSLTransportParameters19.setKeyStore("hi!", "hi!", "hi!", "hi!");
        tSSLTransportParameters19.setTrustStore("hi!", "", "", "");
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test15889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15889");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters4 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray3);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters5 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray3);
        tSSLTransportParameters5.setTrustStore("hi!", "hi!", "", "hi!");
        tSSLTransportParameters5.requireClientAuth(true);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test15890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15890");
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        java.lang.Class<?> wildcardClass32 = strArray12.getClass();
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test15891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15891");
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test15892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15892");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        java.security.Provider provider2 = configuration0.getProvider();
        java.lang.String str3 = configuration0.getType();
        java.security.Provider provider4 = configuration0.getProvider();
        java.lang.String str5 = configuration0.getType();
        java.security.Provider provider6 = configuration0.getProvider();
        java.security.Provider provider7 = configuration0.getProvider();
        configuration0.refresh();
        java.lang.String str9 = configuration0.getType();
        java.lang.String str10 = configuration0.getType();
        java.lang.String str11 = configuration0.getType();
        java.lang.String str12 = configuration0.getType();
        configuration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test15893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15893");
        java.lang.String[] strArray8 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8, false);
        java.lang.Class<?> wildcardClass20 = strArray8.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test15894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15894");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters6 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray5);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters7 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray5);
        tSSLTransportParameters7.setKeyStore("hi!", "", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test15895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15895");
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, true);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test15896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15896");
        java.lang.String[] strArray6 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters7 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters8 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6, false);
        tSSLTransportParameters15.requireClientAuth(false);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test15897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15897");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        java.lang.String str2 = configuration0.getType();
        java.security.Provider provider3 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.security.Provider provider5 = configuration0.getProvider();
        java.lang.String str6 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters7 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters8 = configuration0.getParameters();
        java.lang.String str9 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters10 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters11 = configuration0.getParameters();
        java.security.Provider provider12 = configuration0.getProvider();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(provider12);
    }

    @Test
    public void test15898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15898");
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        java.lang.Class<?> wildcardClass28 = tSSLTransportParameters27.getClass();
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test15899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15899");
        java.lang.String[] strArray8 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8);
        tSSLTransportParameters21.requireClientAuth(false);
        tSSLTransportParameters21.requireClientAuth(true);
        tSSLTransportParameters21.requireClientAuth(true);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test15900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15900");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test15901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15901");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        tSSLTransportParameters21.setKeyStore("hi!", "hi!", "hi!", "");
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test15902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15902");
        java.lang.String[] strArray6 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters8 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6, true);
        tSSLTransportParameters14.setTrustStore("", "hi!", "", "hi!");
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test15903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15903");
        java.lang.String[] strArray10 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, false);
        tSSLTransportParameters26.setTrustStore("hi!", "");
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test15904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15904");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        java.security.Provider provider2 = configuration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters3 = configuration0.getParameters();
        java.lang.String str4 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = configuration0.getParameters();
        java.lang.String str6 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters7 = configuration0.getParameters();
        java.lang.String str8 = configuration0.getType();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        configuration0.refresh();
        java.lang.String str11 = configuration0.getType();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test15905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15905");
        java.lang.String[] strArray9 = new java.lang.String[] { "", "", "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9, true);
        tSSLTransportParameters17.setKeyStore("", "hi!", "", "hi!");
        tSSLTransportParameters17.setTrustStore("hi!", "");
        tSSLTransportParameters17.setTrustStore("", "hi!");
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test15906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15906");
        java.lang.String[] strArray9 = new java.lang.String[] { "", "", "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        tSSLTransportParameters17.requireClientAuth(false);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test15907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15907");
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, true);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test15908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15908");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters2 = configuration0.getParameters();
        java.lang.String str3 = configuration0.getType();
        configuration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.Parameters parameters6 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters7 = configuration0.getParameters();
        java.lang.String str8 = configuration0.getType();
        java.security.Provider provider9 = configuration0.getProvider();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider9);
    }

    @Test
    public void test15909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15909");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters2 = configuration0.getParameters();
        java.lang.String str3 = configuration0.getType();
        java.lang.String str4 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = configuration0.getParameters();
        configuration0.refresh();
        java.security.Provider provider7 = configuration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters8 = configuration0.getParameters();
        java.lang.String str9 = configuration0.getType();
        configuration0.refresh();
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters12 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters13 = configuration0.getParameters();
        java.lang.String str14 = configuration0.getType();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test15910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15910");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters7 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters8 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6, true);
        tSSLTransportParameters10.setTrustStore("", "");
        tSSLTransportParameters10.setKeyStore("hi!", "hi!", "", "hi!");
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test15911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15911");
        java.lang.String[] strArray13 = new java.lang.String[] { "", "", "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test15912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15912");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test15913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15913");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters5 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray4);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters6 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray4);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters7 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray4);
        tSSLTransportParameters7.setTrustStore("", "", "", "hi!");
        tSSLTransportParameters7.setKeyStore("", "hi!", "", "hi!");
        tSSLTransportParameters7.setTrustStore("hi!", "", "", "");
        tSSLTransportParameters7.setKeyStore("", "", "hi!", "hi!");
        tSSLTransportParameters7.setTrustStore("", "hi!", "", "");
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test15914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15914");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        java.security.Provider provider2 = configuration0.getProvider();
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters4 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = configuration0.getParameters();
        java.security.Provider provider6 = configuration0.getProvider();
        java.lang.String str7 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters8 = configuration0.getParameters();
        java.lang.String str9 = configuration0.getType();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.Parameters parameters11 = configuration0.getParameters();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test15915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15915");
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "", "", "", "", "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        tSSLTransportParameters26.requireClientAuth(false);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test15916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15916");
        java.lang.String[] strArray4 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters5 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray4);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters6 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray4);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters8 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray4, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray4);
        tSSLTransportParameters9.setKeyStore("hi!", "", "hi!", "hi!");
        tSSLTransportParameters9.setTrustStore("", "");
        tSSLTransportParameters9.setKeyStore("hi!", "", "", "");
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test15917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15917");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        java.lang.String str2 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters3 = configuration0.getParameters();
        java.lang.String str4 = configuration0.getType();
        java.security.Provider provider5 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.security.Provider provider8 = configuration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = configuration0.getParameters();
        java.lang.String str10 = configuration0.getType();
        java.security.Provider provider11 = configuration0.getProvider();
        java.lang.String str12 = configuration0.getType();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test15918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15918");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters2 = configuration0.getParameters();
        java.lang.String str3 = configuration0.getType();
        java.security.Provider provider4 = configuration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters5 = configuration0.getParameters();
        configuration0.refresh();
        java.security.Provider provider7 = configuration0.getProvider();
        java.lang.String str8 = configuration0.getType();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.lang.String str10 = configuration0.getType();
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters12 = configuration0.getParameters();
        java.security.Provider provider13 = configuration0.getProvider();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test15919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15919");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        tSSLTransportParameters29.setTrustStore("hi!", "hi!", "", "hi!");
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test15920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15920");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test15921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15921");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8);
        tSSLTransportParameters17.setTrustStore("hi!", "hi!");
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test15922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15922");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9, true);
        tSSLTransportParameters20.setTrustStore("hi!", "hi!", "", "");
        java.lang.Class<?> wildcardClass26 = tSSLTransportParameters20.getClass();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test15923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15923");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters2 = configuration0.getParameters();
        java.lang.String str3 = configuration0.getType();
        java.lang.String str4 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = configuration0.getParameters();
        java.lang.String str6 = configuration0.getType();
        java.security.Provider provider7 = configuration0.getProvider();
        configuration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.lang.String str10 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters11 = configuration0.getParameters();
        configuration0.refresh();
        java.security.Provider provider13 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test15924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15924");
        java.lang.String[] strArray13 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, true);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test15925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15925");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters5 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray3, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters6 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray3);
        tSSLTransportParameters6.requireClientAuth(false);
        tSSLTransportParameters6.setKeyStore("hi!", "");
        tSSLTransportParameters6.setTrustStore("", "", "", "hi!");
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test15926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15926");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters7 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters8 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6, false);
        tSSLTransportParameters13.setKeyStore("", "hi!", "hi!", "");
        tSSLTransportParameters13.setKeyStore("", "", "", "");
        tSSLTransportParameters13.setKeyStore("", "");
        tSSLTransportParameters13.setKeyStore("hi!", "hi!");
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test15927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15927");
        java.lang.String[] strArray3 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters5 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray3, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters6 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray3);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters7 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray3);
        tSSLTransportParameters7.setTrustStore("hi!", "");
        tSSLTransportParameters7.setKeyStore("", "", "", "");
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test15928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15928");
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, false);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test15929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15929");
        java.lang.String[] strArray12 = new java.lang.String[] { "", "", "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, true);
        tSSLTransportParameters25.setTrustStore("", "", "", "");
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test15930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15930");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        tSSLTransportParameters21.setKeyStore("", "", "", "");
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test15931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15931");
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8, false);
        tSSLTransportParameters16.setTrustStore("", "hi!");
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test15932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15932");
        java.lang.String[] strArray4 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters6 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray4, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters8 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray4, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray4, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray4);
        tSSLTransportParameters11.setTrustStore("", "");
        tSSLTransportParameters11.requireClientAuth(true);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test15933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15933");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        java.security.Provider provider2 = configuration0.getProvider();
        java.lang.String str3 = configuration0.getType();
        java.security.Provider provider4 = configuration0.getProvider();
        java.lang.String str5 = configuration0.getType();
        java.security.Provider provider6 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.Parameters parameters9 = configuration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.Parameters parameters13 = configuration0.getParameters();
        configuration0.refresh();
        java.lang.String str15 = configuration0.getType();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test15934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15934");
        java.lang.String[] strArray7 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray7, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray7, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray7, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray7, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray7);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray7);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray7, true);
        tSSLTransportParameters19.setTrustStore("hi!", "hi!", "", "");
        tSSLTransportParameters19.setTrustStore("hi!", "hi!");
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test15935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15935");
        java.lang.String[] strArray6 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters8 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6, true);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test15936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15936");
        java.lang.String[] strArray5 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters6 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray5);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters8 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray5, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray5);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray5, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test15937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15937");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        java.security.Provider provider2 = configuration0.getProvider();
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters4 = configuration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.security.Provider provider7 = configuration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters8 = configuration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.lang.String str10 = configuration0.getType();
        java.security.Provider provider11 = configuration0.getProvider();
        configuration0.refresh();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(provider11);
    }

    @Test
    public void test15938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15938");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters7 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6, false);
        tSSLTransportParameters14.setTrustStore("", "hi!");
        tSSLTransportParameters14.setKeyStore("", "");
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test15939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15939");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters7 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6);
        tSSLTransportParameters10.setTrustStore("", "hi!");
        tSSLTransportParameters10.setTrustStore("", "");
        tSSLTransportParameters10.setTrustStore("", "");
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test15940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15940");
        java.lang.String[] strArray12 = new java.lang.String[] { "", "", "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test15941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15941");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        configuration0.refresh();
        java.security.Provider provider3 = configuration0.getProvider();
        configuration0.refresh();
        java.security.Provider provider5 = configuration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters6 = configuration0.getParameters();
        java.security.Provider provider7 = configuration0.getProvider();
        configuration0.refresh();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
    }

    @Test
    public void test15942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15942");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9, false);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test15943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15943");
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, true);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test15944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15944");
        java.lang.String[] strArray12 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, true);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test15945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15945");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters2 = configuration0.getParameters();
        java.lang.String str3 = configuration0.getType();
        configuration0.refresh();
        configuration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        configuration0.refresh();
        java.lang.String str8 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters9 = configuration0.getParameters();
        configuration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.Parameters parameters12 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters13 = configuration0.getParameters();
        java.lang.String str14 = configuration0.getType();
        configuration0.refresh();
        configuration0.refresh();
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters18 = configuration0.getParameters();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(parameters18);
    }

    @Test
    public void test15946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15946");
        java.lang.String[] strArray11 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, false);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test15947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15947");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8, true);
        java.lang.Class<?> wildcardClass15 = tSSLTransportParameters14.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test15948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15948");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters2 = configuration0.getParameters();
        java.lang.String str3 = configuration0.getType();
        configuration0.refresh();
        configuration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        configuration0.refresh();
        java.lang.String str8 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters9 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters10 = configuration0.getParameters();
        java.lang.String str11 = configuration0.getType();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test15949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15949");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        java.lang.String str2 = configuration0.getType();
        java.security.Provider provider3 = configuration0.getProvider();
        java.security.Provider provider4 = configuration0.getProvider();
        java.security.Provider provider5 = configuration0.getProvider();
        java.security.Provider provider6 = configuration0.getProvider();
        configuration0.refresh();
        java.security.Provider provider8 = configuration0.getProvider();
        configuration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider8);
    }

    @Test
    public void test15950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15950");
        java.lang.String[] strArray11 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        tSSLTransportParameters28.setTrustStore("", "");
        tSSLTransportParameters28.setKeyStore("hi!", "");
        tSSLTransportParameters28.setTrustStore("hi!", "", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test15951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15951");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters8 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray7);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray7);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray7, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray7, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray7, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray7);
        tSSLTransportParameters16.setTrustStore("hi!", "");
        tSSLTransportParameters16.setKeyStore("", "");
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test15952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15952");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9, false);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test15953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15953");
        java.lang.String[] strArray10 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, true);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test15954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15954");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9, false);
        tSSLTransportParameters22.setKeyStore("", "hi!", "", "");
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test15955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15955");
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "", "", "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, true);
        tSSLTransportParameters22.setKeyStore("hi!", "");
        tSSLTransportParameters22.setTrustStore("hi!", "hi!", "", "hi!");
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test15956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15956");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8);
        tSSLTransportParameters16.setTrustStore("hi!", "hi!", "", "");
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test15957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15957");
        java.lang.String[] strArray3 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters5 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray3, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters7 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray3, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray3, true);
        tSSLTransportParameters9.setKeyStore("", "", "hi!", "");
        tSSLTransportParameters9.setTrustStore("", "");
        tSSLTransportParameters9.setKeyStore("hi!", "", "", "");
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test15958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15958");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        configuration0.refresh();
        java.security.Provider provider3 = configuration0.getProvider();
        configuration0.refresh();
        java.security.Provider provider5 = configuration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters6 = configuration0.getParameters();
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters8 = configuration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.security.Provider provider10 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters13 = configuration0.getParameters();
        configuration0.refresh();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test15959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15959");
        java.lang.String[] strArray13 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, true);
        tSSLTransportParameters33.setTrustStore("hi!", "");
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test15960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15960");
        java.lang.String[] strArray1 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters2 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray1);
        tSSLTransportParameters2.requireClientAuth(true);
        tSSLTransportParameters2.setKeyStore("hi!", "");
        tSSLTransportParameters2.requireClientAuth(false);
        java.lang.Class<?> wildcardClass10 = tSSLTransportParameters2.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test15961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15961");
        java.lang.String[] strArray7 = new java.lang.String[] { "", "", "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters8 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray7);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray7);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray7, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray7, false);
        tSSLTransportParameters13.setKeyStore("", "");
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test15962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15962");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test15963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15963");
        java.lang.String[] strArray15 = new java.lang.String[] { "", "", "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, true);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test15964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15964");
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test15965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15965");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters3 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray2);
        tSSLTransportParameters3.setKeyStore("", "", "", "hi!");
        tSSLTransportParameters3.setKeyStore("hi!", "hi!");
        tSSLTransportParameters3.setKeyStore("", "hi!");
        tSSLTransportParameters3.setKeyStore("hi!", "", "", "hi!");
        tSSLTransportParameters3.setTrustStore("", "hi!");
        tSSLTransportParameters3.setKeyStore("", "", "hi!", "hi!");
        tSSLTransportParameters3.setTrustStore("hi!", "hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test15966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15966");
        java.lang.String[] strArray1 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters2 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray1);
        tSSLTransportParameters2.setTrustStore("hi!", "hi!");
        tSSLTransportParameters2.setTrustStore("", "");
        tSSLTransportParameters2.setTrustStore("", "");
        tSSLTransportParameters2.setTrustStore("", "hi!", "", "");
        tSSLTransportParameters2.setKeyStore("", "hi!");
        tSSLTransportParameters2.requireClientAuth(true);
        tSSLTransportParameters2.setTrustStore("hi!", "", "hi!", "");
        tSSLTransportParameters2.setKeyStore("", "", "hi!", "");
        tSSLTransportParameters2.setTrustStore("hi!", "hi!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test15967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15967");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test15968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15968");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        java.security.Provider provider2 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.lang.String str4 = configuration0.getType();
        java.security.Provider provider5 = configuration0.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = provider5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
    }

    @Test
    public void test15969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15969");
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        tSSLTransportParameters29.requireClientAuth(true);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test15970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15970");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray9, true);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test15971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15971");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        configuration0.refresh();
        java.security.Provider provider3 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.Parameters parameters6 = configuration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters6);
    }

    @Test
    public void test15972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15972");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters2 = configuration0.getParameters();
        java.lang.String str3 = configuration0.getType();
        configuration0.refresh();
        java.lang.String str5 = configuration0.getType();
        configuration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        configuration0.refresh();
        configuration0.refresh();
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters11 = configuration0.getParameters();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test15973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15973");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters2 = configuration0.getParameters();
        java.lang.String str3 = configuration0.getType();
        java.lang.String str4 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters6 = configuration0.getParameters();
        configuration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        configuration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.security.Provider provider11 = configuration0.getProvider();
        java.lang.String str12 = configuration0.getType();
        configuration0.refresh();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test15974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15974");
        java.lang.String[] strArray10 = new java.lang.String[] { "", "", "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        tSSLTransportParameters20.setKeyStore("hi!", "");
        tSSLTransportParameters20.requireClientAuth(false);
        tSSLTransportParameters20.setTrustStore("", "");
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test15975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15975");
        java.lang.String[] strArray4 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters5 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray4);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters7 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray4, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters8 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray4);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray4, false);
        tSSLTransportParameters10.setTrustStore("hi!", "");
        tSSLTransportParameters10.requireClientAuth(false);
        tSSLTransportParameters10.setTrustStore("", "", "", "");
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test15976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15976");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, true);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test15977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15977");
        java.lang.String[] strArray5 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters7 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray5, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray5, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray5, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray5, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray5, false);
        java.lang.Class<?> wildcardClass16 = tSSLTransportParameters15.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test15978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15978");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.security.Provider provider3 = configuration0.getProvider();
        java.security.Provider provider4 = configuration0.getProvider();
        java.security.Provider provider5 = configuration0.getProvider();
        java.lang.String str6 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters7 = configuration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        configuration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.security.Provider provider12 = configuration0.getProvider();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider12);
    }

    @Test
    public void test15979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15979");
        java.lang.String[] strArray11 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, false);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test15980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15980");
        java.lang.String[] strArray10 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, false);
        tSSLTransportParameters25.setTrustStore("hi!", "");
        tSSLTransportParameters25.setKeyStore("", "hi!", "hi!", "");
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test15981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15981");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        java.lang.String str2 = configuration0.getType();
        java.lang.String str3 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = configuration0.getParameters();
        java.security.Provider provider5 = configuration0.getProvider();
        configuration0.refresh();
        java.lang.String str7 = configuration0.getType();
        java.lang.String str8 = configuration0.getType();
        java.security.Provider provider9 = configuration0.getProvider();
        configuration0.refresh();
        java.lang.String str11 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters12 = configuration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.lang.String str14 = configuration0.getType();
        java.security.Provider provider15 = configuration0.getProvider();
        java.security.Provider provider16 = configuration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters17 = configuration0.getParameters();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNull(parameters17);
    }

    @Test
    public void test15982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15982");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        java.lang.Class<?> wildcardClass30 = strArray11.getClass();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test15983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15983");
        java.lang.String[] strArray8 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8, false);
        tSSLTransportParameters22.setTrustStore("hi!", "", "", "hi!");
        tSSLTransportParameters22.setKeyStore("hi!", "hi!");
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test15984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15984");
        java.lang.String[] strArray10 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, true);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test15985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15985");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters2 = configuration0.getParameters();
        java.lang.String str3 = configuration0.getType();
        configuration0.refresh();
        configuration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        configuration0.refresh();
        java.lang.String str8 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters9 = configuration0.getParameters();
        java.security.Provider provider10 = configuration0.getProvider();
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters12 = configuration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.lang.String str14 = configuration0.getType();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.lang.String str17 = configuration0.getType();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test15986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15986");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        java.lang.String str2 = configuration0.getType();
        java.lang.String str3 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = configuration0.getParameters();
        java.security.Provider provider5 = configuration0.getProvider();
        configuration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.lang.String str8 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters9 = configuration0.getParameters();
        java.lang.String str10 = configuration0.getType();
        configuration0.refresh();
        configuration0.refresh();
        configuration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.Parameters parameters15 = configuration0.getParameters();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test15987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15987");
        java.lang.String[] strArray10 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        tSSLTransportParameters26.setTrustStore("", "", "", "hi!");
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test15988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15988");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        java.security.Provider provider2 = configuration0.getProvider();
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters4 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = configuration0.getParameters();
        java.lang.String str6 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters7 = configuration0.getParameters();
        java.lang.String str8 = configuration0.getType();
        java.lang.String str9 = configuration0.getType();
        configuration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.Parameters parameters13 = configuration0.getParameters();
        configuration0.refresh();
        configuration0.refresh();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test15989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15989");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        configuration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        configuration0.refresh();
        java.security.Provider provider6 = configuration0.getProvider();
        java.lang.String str7 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters8 = configuration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test15990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15990");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.Parameters parameters1 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters2 = configuration0.getParameters();
        java.lang.String str3 = configuration0.getType();
        configuration0.refresh();
        configuration0.refresh();
        java.lang.String str6 = configuration0.getType();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.Parameters parameters8 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters9 = configuration0.getParameters();
        java.security.Provider provider10 = configuration0.getProvider();
        java.security.Provider provider11 = configuration0.getProvider();
        configuration0.refresh();
        configuration0.refresh();
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters15 = configuration0.getParameters();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test15991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15991");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.security.Provider provider2 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        configuration0.refresh();
        java.security.Provider provider5 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(provider5);
    }

    @Test
    public void test15992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15992");
        java.lang.String[] strArray6 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters7 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray6);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray6, true);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test15993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15993");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8);
        tSSLTransportParameters18.setKeyStore("", "hi!");
        java.lang.Class<?> wildcardClass22 = tSSLTransportParameters18.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test15994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15994");
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        tSSLTransportParameters34.requireClientAuth(false);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test15995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15995");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        java.lang.String str1 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters2 = configuration0.getParameters();
        java.lang.String str3 = configuration0.getType();
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = configuration0.getParameters();
        java.security.Provider provider6 = configuration0.getProvider();
        configuration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
    }

    @Test
    public void test15996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15996");
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, false);
        tSSLTransportParameters33.setTrustStore("", "hi!", "hi!", "");
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test15997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15997");
        java.lang.String[] strArray7 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray7, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray7);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray7);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray7);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray7);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray7);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray7, true);
        tSSLTransportParameters16.setKeyStore("hi!", "", "hi!", "");
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test15998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15998");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test15999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test15999");
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, true);
        tSSLTransportParameters30.setTrustStore("hi!", "");
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test16000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test16000");
        java.lang.String[] strArray13 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.recognizedOptions;
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.junit.Assert.assertNotNull(strArray13);
    }
}

