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
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "", "", "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, true);
        tSSLTransportParameters20.setTrustStore("", "");
        tSSLTransportParameters20.setKeyStore("", "hi!", "", "");
        tSSLTransportParameters20.setKeyStore("hi!", "");
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test13502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13502");
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "", "", "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        tSSLTransportParameters17.setTrustStore("", "");
        tSSLTransportParameters17.setKeyStore("", "hi!", "", "");
        tSSLTransportParameters17.setKeyStore("", "hi!");
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test13503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13503");
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "", "", "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, true);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test13504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13504");
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "", "", "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        tSSLTransportParameters19.setTrustStore("", "");
        tSSLTransportParameters19.setTrustStore("", "");
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test13505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13505");
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "", "", "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        tSSLTransportParameters21.requireClientAuth(false);
        tSSLTransportParameters21.setTrustStore("", "");
        tSSLTransportParameters21.setKeyStore("hi!", "hi!");
        tSSLTransportParameters21.requireClientAuth(false);
        tSSLTransportParameters21.setTrustStore("hi!", "hi!");
        tSSLTransportParameters21.setTrustStore("", "hi!", "", "");
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test13506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13506");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration1.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap4 = kerberosUserConfiguration1.getDEFAULT_KERBEROS_OPTIONS();
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap6 = kerberosUserConfiguration1.getDEFAULT_KERBEROS_OPTIONS();
        java.util.HashMap<java.lang.String, java.lang.String> strMap7 = kerberosUserConfiguration1.getDEFAULT_KERBEROS_OPTIONS();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration14 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration14.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration14);
        java.lang.String str18 = kerberosUserConfiguration14.getType();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration20 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration20.refresh();
        java.security.Provider provider22 = kerberosUserConfiguration20.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap23 = kerberosUserConfiguration20.getDEFAULT_KERBEROS_OPTIONS();
        java.util.HashMap<java.lang.String, java.lang.String> strMap24 = kerberosUserConfiguration20.getoptions();
        kerberosUserConfiguration14.options = strMap24;
        kerberosUserConfiguration1.setoptions(strMap24);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.util.HashMap<java.lang.String, java.lang.String> strMap28 = null;
        kerberosUserConfiguration1.setoptions(strMap28);
        java.util.HashMap<java.lang.String, java.lang.String> strMap30 = kerberosUserConfiguration1.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap31 = kerberosUserConfiguration1.getDEFAULT_KERBEROS_OPTIONS();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(provider22);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNull(strMap30);
        org.junit.Assert.assertNotNull(strMap31);
    }

    @Test
    public void test13507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13507");
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "", "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, false);
        java.lang.Class<?> wildcardClass29 = strArray14.getClass();
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test13508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13508");
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "", "", "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16);
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test13509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13509");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration1.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap4 = kerberosUserConfiguration1.getDEFAULT_KERBEROS_OPTIONS();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration6 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration6.refresh();
        java.security.Provider provider8 = kerberosUserConfiguration6.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap9 = kerberosUserConfiguration6.getDEFAULT_KERBEROS_OPTIONS();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration11 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration11.refresh();
        java.util.HashMap<java.lang.String, java.lang.String> strMap13 = kerberosUserConfiguration11.getoptions();
        kerberosUserConfiguration6.options = strMap13;
        kerberosUserConfiguration1.options = strMap13;
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration19 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration19.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration19);
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration22 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap23 = null;
        kerberosUserConfiguration22.setoptions(strMap23);
        java.util.HashMap<java.lang.String, java.lang.String> strMap25 = kerberosUserConfiguration22.options;
        kerberosUserConfiguration22.refresh();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration27 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap28 = null;
        kerberosUserConfiguration27.setoptions(strMap28);
        java.util.HashMap<java.lang.String, java.lang.String> strMap30 = kerberosUserConfiguration27.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap31 = kerberosUserConfiguration27.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap32 = kerberosUserConfiguration27.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration22.options = strMap32;
        kerberosUserConfiguration19.setoptions(strMap32);
        java.security.Provider provider35 = kerberosUserConfiguration19.getProvider();
        java.security.Provider provider36 = kerberosUserConfiguration19.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap37 = kerberosUserConfiguration19.getoptions();
        kerberosUserConfiguration1.setoptions(strMap37);
        java.util.HashMap<java.lang.String, java.lang.String> strMap39 = kerberosUserConfiguration1.getoptions();
        java.security.Provider provider40 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNull(strMap25);
        org.junit.Assert.assertNull(strMap30);
        org.junit.Assert.assertNull(strMap31);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNull(provider35);
        org.junit.Assert.assertNull(provider36);
        org.junit.Assert.assertNotNull(strMap37);
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertNull(provider40);
    }

    @Test
    public void test13510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13510");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap1 = null;
        kerberosUserConfiguration0.setoptions(strMap1);
        java.util.HashMap<java.lang.String, java.lang.String> strMap3 = kerberosUserConfiguration0.options;
        kerberosUserConfiguration0.refresh();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        java.lang.String str6 = kerberosUserConfiguration0.getType();
        java.util.HashMap<java.lang.String, java.lang.String> strMap7 = kerberosUserConfiguration0.getDEFAULT_KERBEROS_OPTIONS();
        java.util.HashMap<java.lang.String, java.lang.String> strMap8 = kerberosUserConfiguration0.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration0.refresh();
        java.util.HashMap<java.lang.String, java.lang.String> strMap10 = kerberosUserConfiguration0.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap11 = kerberosUserConfiguration0.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap12 = kerberosUserConfiguration0.getoptions();
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test13511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13511");
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, true);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test13512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13512");
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!", "", "", "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test13513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13513");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap1 = kerberosUserConfiguration0.getDEFAULT_KERBEROS_OPTIONS();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration3 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration3.refresh();
        java.security.Provider provider5 = kerberosUserConfiguration3.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap6 = kerberosUserConfiguration3.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration0.setoptions(strMap6);
        java.util.HashMap<java.lang.String, java.lang.String> strMap8 = kerberosUserConfiguration0.getoptions();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.util.HashMap<java.lang.String, java.lang.String> strMap14 = kerberosUserConfiguration0.getDEFAULT_KERBEROS_OPTIONS();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.lang.String str19 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters20 = kerberosUserConfiguration0.getParameters();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration22 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray24 = kerberosUserConfiguration22.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration22);
        java.lang.String str26 = kerberosUserConfiguration22.getType();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration28 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration28.refresh();
        java.security.Provider provider30 = kerberosUserConfiguration28.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap31 = kerberosUserConfiguration28.getDEFAULT_KERBEROS_OPTIONS();
        java.util.HashMap<java.lang.String, java.lang.String> strMap32 = kerberosUserConfiguration28.getoptions();
        kerberosUserConfiguration22.options = strMap32;
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration34 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap35 = kerberosUserConfiguration34.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap36 = null;
        kerberosUserConfiguration34.options = strMap36;
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration38 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap39 = kerberosUserConfiguration38.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration34.setoptions(strMap39);
        java.util.HashMap<java.lang.String, java.lang.String> strMap41 = kerberosUserConfiguration34.getDEFAULT_KERBEROS_OPTIONS();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration42 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap43 = kerberosUserConfiguration42.options;
        java.lang.String str44 = kerberosUserConfiguration42.getType();
        java.util.HashMap<java.lang.String, java.lang.String> strMap45 = kerberosUserConfiguration42.options;
        kerberosUserConfiguration42.refresh();
        java.util.HashMap<java.lang.String, java.lang.String> strMap47 = kerberosUserConfiguration42.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration34.setoptions(strMap47);
        kerberosUserConfiguration22.setoptions(strMap47);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration22);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray52 = kerberosUserConfiguration22.getAppConfigurationEntry("hi!");
        java.util.HashMap<java.lang.String, java.lang.String> strMap53 = kerberosUserConfiguration22.getoptions();
        kerberosUserConfiguration0.options = strMap53;
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(parameters20);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(provider30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNull(strMap35);
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertNotNull(strMap41);
        org.junit.Assert.assertNull(strMap43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(strMap45);
        org.junit.Assert.assertNotNull(strMap47);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray52);
        org.junit.Assert.assertNotNull(strMap53);
    }

    @Test
    public void test13514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13514");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap1 = null;
        kerberosUserConfiguration0.setoptions(strMap1);
        java.util.HashMap<java.lang.String, java.lang.String> strMap3 = kerberosUserConfiguration0.options;
        kerberosUserConfiguration0.refresh();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration5 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap6 = null;
        kerberosUserConfiguration5.setoptions(strMap6);
        java.util.HashMap<java.lang.String, java.lang.String> strMap8 = kerberosUserConfiguration5.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap9 = kerberosUserConfiguration5.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap10 = kerberosUserConfiguration5.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration0.options = strMap10;
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        java.security.Provider provider13 = kerberosUserConfiguration0.getProvider();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration15 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration15.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration15);
        java.lang.String str19 = kerberosUserConfiguration15.getType();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration21 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration21.refresh();
        java.security.Provider provider23 = kerberosUserConfiguration21.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap24 = kerberosUserConfiguration21.getDEFAULT_KERBEROS_OPTIONS();
        java.util.HashMap<java.lang.String, java.lang.String> strMap25 = kerberosUserConfiguration21.getoptions();
        kerberosUserConfiguration15.options = strMap25;
        java.util.HashMap<java.lang.String, java.lang.String> strMap27 = kerberosUserConfiguration15.getoptions();
        kerberosUserConfiguration0.setoptions(strMap27);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray31 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass32 = appConfigurationEntryArray31.getClass();
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(provider23);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test13515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13515");
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "", "", "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        tSSLTransportParameters19.setTrustStore("", "hi!", "", "");
        tSSLTransportParameters19.setKeyStore("hi!", "");
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test13516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13516");
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "", "hi!", "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8, false);
        tSSLTransportParameters13.requireClientAuth(false);
        tSSLTransportParameters13.setKeyStore("", "hi!", "hi!", "");
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test13517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13517");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap1 = null;
        kerberosUserConfiguration0.setoptions(strMap1);
        java.util.HashMap<java.lang.String, java.lang.String> strMap3 = kerberosUserConfiguration0.options;
        kerberosUserConfiguration0.refresh();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration5 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap6 = kerberosUserConfiguration5.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap7 = null;
        kerberosUserConfiguration5.options = strMap7;
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration9 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap10 = kerberosUserConfiguration9.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration5.setoptions(strMap10);
        kerberosUserConfiguration0.setoptions(strMap10);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.util.HashMap<java.lang.String, java.lang.String> strMap15 = kerberosUserConfiguration0.options;
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider18 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration20 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap21 = null;
        kerberosUserConfiguration20.setoptions(strMap21);
        java.util.HashMap<java.lang.String, java.lang.String> strMap23 = kerberosUserConfiguration20.options;
        kerberosUserConfiguration20.refresh();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration25 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap26 = null;
        kerberosUserConfiguration25.setoptions(strMap26);
        java.util.HashMap<java.lang.String, java.lang.String> strMap28 = kerberosUserConfiguration25.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap29 = kerberosUserConfiguration25.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap30 = kerberosUserConfiguration25.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration20.options = strMap30;
        javax.security.auth.login.Configuration.Parameters parameters32 = kerberosUserConfiguration20.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray34 = kerberosUserConfiguration20.getAppConfigurationEntry("hi!");
        java.util.HashMap<java.lang.String, java.lang.String> strMap35 = kerberosUserConfiguration20.options;
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray37 = kerberosUserConfiguration20.getAppConfigurationEntry("");
        kerberosUserConfiguration20.refresh();
        kerberosUserConfiguration20.refresh();
        java.util.HashMap<java.lang.String, java.lang.String> strMap40 = kerberosUserConfiguration20.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration0.setoptions(strMap40);
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration42 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap43 = null;
        kerberosUserConfiguration42.setoptions(strMap43);
        java.util.HashMap<java.lang.String, java.lang.String> strMap45 = kerberosUserConfiguration42.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap46 = kerberosUserConfiguration42.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap47 = kerberosUserConfiguration42.getDEFAULT_KERBEROS_OPTIONS();
        java.util.HashMap<java.lang.String, java.lang.String> strMap48 = kerberosUserConfiguration42.getDEFAULT_KERBEROS_OPTIONS();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration49 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap50 = null;
        kerberosUserConfiguration49.setoptions(strMap50);
        java.util.HashMap<java.lang.String, java.lang.String> strMap52 = kerberosUserConfiguration49.options;
        kerberosUserConfiguration49.refresh();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration54 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap55 = kerberosUserConfiguration54.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap56 = null;
        kerberosUserConfiguration54.options = strMap56;
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration58 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap59 = kerberosUserConfiguration58.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration54.setoptions(strMap59);
        kerberosUserConfiguration49.setoptions(strMap59);
        kerberosUserConfiguration42.options = strMap59;
        java.util.HashMap<java.lang.String, java.lang.String> strMap63 = kerberosUserConfiguration42.getDEFAULT_KERBEROS_OPTIONS();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration65 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration65.refresh();
        java.util.HashMap<java.lang.String, java.lang.String> strMap67 = kerberosUserConfiguration65.getoptions();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration65);
        java.util.HashMap<java.lang.String, java.lang.String> strMap69 = kerberosUserConfiguration65.options;
        java.security.Provider provider70 = kerberosUserConfiguration65.getProvider();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration71 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap72 = null;
        kerberosUserConfiguration71.setoptions(strMap72);
        java.util.HashMap<java.lang.String, java.lang.String> strMap74 = kerberosUserConfiguration71.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap75 = kerberosUserConfiguration71.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap76 = kerberosUserConfiguration71.getDEFAULT_KERBEROS_OPTIONS();
        java.util.HashMap<java.lang.String, java.lang.String> strMap77 = kerberosUserConfiguration71.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration65.options = strMap77;
        kerberosUserConfiguration42.setoptions(strMap77);
        kerberosUserConfiguration0.setoptions(strMap77);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNull(provider18);
        org.junit.Assert.assertNull(strMap23);
        org.junit.Assert.assertNull(strMap28);
        org.junit.Assert.assertNull(strMap29);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertNull(parameters32);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray34);
        org.junit.Assert.assertNotNull(strMap35);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray37);
        org.junit.Assert.assertNotNull(strMap40);
        org.junit.Assert.assertNull(strMap45);
        org.junit.Assert.assertNull(strMap46);
        org.junit.Assert.assertNotNull(strMap47);
        org.junit.Assert.assertNotNull(strMap48);
        org.junit.Assert.assertNull(strMap52);
        org.junit.Assert.assertNull(strMap55);
        org.junit.Assert.assertNotNull(strMap59);
        org.junit.Assert.assertNotNull(strMap63);
        org.junit.Assert.assertNotNull(strMap67);
        org.junit.Assert.assertNotNull(strMap69);
        org.junit.Assert.assertNull(provider70);
        org.junit.Assert.assertNull(strMap74);
        org.junit.Assert.assertNull(strMap75);
        org.junit.Assert.assertNotNull(strMap76);
        org.junit.Assert.assertNotNull(strMap77);
    }

    @Test
    public void test13518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13518");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration4 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap5 = null;
        kerberosUserConfiguration4.setoptions(strMap5);
        java.util.HashMap<java.lang.String, java.lang.String> strMap7 = kerberosUserConfiguration4.options;
        kerberosUserConfiguration4.refresh();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration9 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap10 = null;
        kerberosUserConfiguration9.setoptions(strMap10);
        java.util.HashMap<java.lang.String, java.lang.String> strMap12 = kerberosUserConfiguration9.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap13 = kerberosUserConfiguration9.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap14 = kerberosUserConfiguration9.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration4.options = strMap14;
        kerberosUserConfiguration1.setoptions(strMap14);
        kerberosUserConfiguration1.refresh();
        java.util.HashMap<java.lang.String, java.lang.String> strMap18 = kerberosUserConfiguration1.getDEFAULT_KERBEROS_OPTIONS();
        java.lang.String str19 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test13519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13519");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.util.HashMap<java.lang.String, java.lang.String> strMap3 = kerberosUserConfiguration1.getoptions();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration6 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap7 = kerberosUserConfiguration6.getDEFAULT_KERBEROS_OPTIONS();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration9 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration9.refresh();
        java.security.Provider provider11 = kerberosUserConfiguration9.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap12 = kerberosUserConfiguration9.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration6.setoptions(strMap12);
        java.util.HashMap<java.lang.String, java.lang.String> strMap14 = kerberosUserConfiguration6.getoptions();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration6);
        java.util.HashMap<java.lang.String, java.lang.String> strMap16 = kerberosUserConfiguration6.options;
        kerberosUserConfiguration1.options = strMap16;
        java.security.Provider provider18 = kerberosUserConfiguration1.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap19 = kerberosUserConfiguration1.getoptions();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration21 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration21.refresh();
        java.security.Provider provider23 = kerberosUserConfiguration21.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap24 = kerberosUserConfiguration21.getDEFAULT_KERBEROS_OPTIONS();
        java.security.Provider provider25 = kerberosUserConfiguration21.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray27 = kerberosUserConfiguration21.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray29 = kerberosUserConfiguration21.getAppConfigurationEntry("hi!");
        java.util.HashMap<java.lang.String, java.lang.String> strMap30 = kerberosUserConfiguration21.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration1.options = strMap30;
        kerberosUserConfiguration1.refresh();
        java.util.HashMap<java.lang.String, java.lang.String> strMap33 = null;
        kerberosUserConfiguration1.options = strMap33;
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(provider18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNull(provider23);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNull(provider25);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray27);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray29);
        org.junit.Assert.assertNotNull(strMap30);
    }

    @Test
    public void test13520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13520");
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!", "", "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17, true);
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test13521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13521");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap1 = kerberosUserConfiguration0.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap2 = kerberosUserConfiguration0.getDEFAULT_KERBEROS_OPTIONS();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration6 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider7 = kerberosUserConfiguration6.getProvider();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration8 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration8.refresh();
        kerberosUserConfiguration8.refresh();
        java.util.HashMap<java.lang.String, java.lang.String> strMap11 = kerberosUserConfiguration8.getoptions();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration12 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap13 = null;
        kerberosUserConfiguration12.setoptions(strMap13);
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration12.getParameters();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration17 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration17.refresh();
        java.security.Provider provider19 = kerberosUserConfiguration17.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap20 = kerberosUserConfiguration17.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration12.setoptions(strMap20);
        kerberosUserConfiguration8.options = strMap20;
        kerberosUserConfiguration6.setoptions(strMap20);
        kerberosUserConfiguration0.options = strMap20;
        java.util.HashMap<java.lang.String, java.lang.String> strMap25 = kerberosUserConfiguration0.options;
        java.security.Provider provider26 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNull(parameters15);
        org.junit.Assert.assertNull(provider19);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNull(provider26);
    }

    @Test
    public void test13522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13522");
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!", "", "", "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17);
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test13523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13523");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration1.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap4 = kerberosUserConfiguration1.getDEFAULT_KERBEROS_OPTIONS();
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap6 = kerberosUserConfiguration1.getDEFAULT_KERBEROS_OPTIONS();
        java.util.HashMap<java.lang.String, java.lang.String> strMap7 = kerberosUserConfiguration1.getDEFAULT_KERBEROS_OPTIONS();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        java.util.HashMap<java.lang.String, java.lang.String> strMap13 = kerberosUserConfiguration1.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.util.HashMap<java.lang.String, java.lang.String> strMap16 = kerberosUserConfiguration1.getoptions();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
    }

    @Test
    public void test13524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13524");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.util.HashMap<java.lang.String, java.lang.String> strMap4 = kerberosUserConfiguration1.options;
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.util.HashMap<java.lang.String, java.lang.String> strMap7 = kerberosUserConfiguration1.options;
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.util.HashMap<java.lang.String, java.lang.String> strMap10 = kerberosUserConfiguration1.options;
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration12 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration12.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration12);
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration12.getParameters();
        kerberosUserConfiguration12.refresh();
        kerberosUserConfiguration12.refresh();
        java.security.Provider provider18 = kerberosUserConfiguration12.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap19 = kerberosUserConfiguration12.getoptions();
        kerberosUserConfiguration1.setoptions(strMap19);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(parameters15);
        org.junit.Assert.assertNull(provider18);
        org.junit.Assert.assertNotNull(strMap19);
    }

    @Test
    public void test13525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13525");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap1 = null;
        kerberosUserConfiguration0.setoptions(strMap1);
        java.util.HashMap<java.lang.String, java.lang.String> strMap3 = kerberosUserConfiguration0.options;
        kerberosUserConfiguration0.refresh();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration5 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap6 = null;
        kerberosUserConfiguration5.setoptions(strMap6);
        java.util.HashMap<java.lang.String, java.lang.String> strMap8 = kerberosUserConfiguration5.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap9 = kerberosUserConfiguration5.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap10 = kerberosUserConfiguration5.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration0.options = strMap10;
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration13 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration13.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration13);
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration16 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap17 = null;
        kerberosUserConfiguration16.setoptions(strMap17);
        java.util.HashMap<java.lang.String, java.lang.String> strMap19 = kerberosUserConfiguration16.options;
        kerberosUserConfiguration16.refresh();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration21 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap22 = null;
        kerberosUserConfiguration21.setoptions(strMap22);
        java.util.HashMap<java.lang.String, java.lang.String> strMap24 = kerberosUserConfiguration21.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap25 = kerberosUserConfiguration21.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap26 = kerberosUserConfiguration21.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration16.options = strMap26;
        kerberosUserConfiguration13.setoptions(strMap26);
        kerberosUserConfiguration13.refresh();
        java.util.HashMap<java.lang.String, java.lang.String> strMap30 = kerberosUserConfiguration13.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration0.options = strMap30;
        java.lang.String str32 = kerberosUserConfiguration0.getType();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration34 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration34.refresh();
        java.security.Provider provider36 = kerberosUserConfiguration34.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap37 = kerberosUserConfiguration34.getDEFAULT_KERBEROS_OPTIONS();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration39 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration39.refresh();
        java.util.HashMap<java.lang.String, java.lang.String> strMap41 = kerberosUserConfiguration39.getoptions();
        kerberosUserConfiguration34.options = strMap41;
        java.lang.String str43 = kerberosUserConfiguration34.getType();
        java.util.HashMap<java.lang.String, java.lang.String> strMap44 = kerberosUserConfiguration34.options;
        kerberosUserConfiguration0.options = strMap44;
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration46 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap47 = kerberosUserConfiguration46.getDEFAULT_KERBEROS_OPTIONS();
        java.lang.String str48 = kerberosUserConfiguration46.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration46);
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration51 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration51.refresh();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration53 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap54 = kerberosUserConfiguration53.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration51.setoptions(strMap54);
        kerberosUserConfiguration46.setoptions(strMap54);
        java.util.HashMap<java.lang.String, java.lang.String> strMap57 = kerberosUserConfiguration46.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap58 = kerberosUserConfiguration46.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration0.setoptions(strMap58);
        java.util.HashMap<java.lang.String, java.lang.String> strMap60 = kerberosUserConfiguration0.getDEFAULT_KERBEROS_OPTIONS();
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(strMap19);
        org.junit.Assert.assertNull(strMap24);
        org.junit.Assert.assertNull(strMap25);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(provider36);
        org.junit.Assert.assertNotNull(strMap37);
        org.junit.Assert.assertNotNull(strMap41);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(strMap44);
        org.junit.Assert.assertNotNull(strMap47);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(strMap54);
        org.junit.Assert.assertNotNull(strMap57);
        org.junit.Assert.assertNotNull(strMap58);
        org.junit.Assert.assertNotNull(strMap60);
    }

    @Test
    public void test13526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13526");
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "", "", "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8, false);
        tSSLTransportParameters12.setKeyStore("", "hi!", "", "");
        tSSLTransportParameters12.setKeyStore("hi!", "");
        tSSLTransportParameters12.setKeyStore("", "");
        tSSLTransportParameters12.setKeyStore("", "");
        tSSLTransportParameters12.setKeyStore("", "hi!", "", "");
        tSSLTransportParameters12.setTrustStore("", "hi!", "", "hi!");
        tSSLTransportParameters12.setTrustStore("", "hi!", "hi!", "");
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test13527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13527");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration6 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap7 = null;
        kerberosUserConfiguration6.setoptions(strMap7);
        java.util.HashMap<java.lang.String, java.lang.String> strMap9 = kerberosUserConfiguration6.options;
        kerberosUserConfiguration6.refresh();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration11 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap12 = null;
        kerberosUserConfiguration11.setoptions(strMap12);
        java.util.HashMap<java.lang.String, java.lang.String> strMap14 = kerberosUserConfiguration11.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap15 = kerberosUserConfiguration11.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap16 = kerberosUserConfiguration11.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration6.options = strMap16;
        javax.security.auth.login.Configuration.Parameters parameters18 = kerberosUserConfiguration6.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray20 = kerberosUserConfiguration6.getAppConfigurationEntry("hi!");
        java.util.HashMap<java.lang.String, java.lang.String> strMap21 = kerberosUserConfiguration6.getoptions();
        java.security.Provider provider22 = kerberosUserConfiguration6.getProvider();
        java.lang.String str23 = kerberosUserConfiguration6.getType();
        java.util.HashMap<java.lang.String, java.lang.String> strMap24 = kerberosUserConfiguration6.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap25 = kerberosUserConfiguration6.options;
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration6);
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration27 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap28 = null;
        kerberosUserConfiguration27.setoptions(strMap28);
        java.util.HashMap<java.lang.String, java.lang.String> strMap30 = kerberosUserConfiguration27.options;
        kerberosUserConfiguration27.refresh();
        kerberosUserConfiguration27.refresh();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration34 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters35 = kerberosUserConfiguration34.getParameters();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration36 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap37 = null;
        kerberosUserConfiguration36.setoptions(strMap37);
        java.util.HashMap<java.lang.String, java.lang.String> strMap39 = kerberosUserConfiguration36.options;
        kerberosUserConfiguration36.refresh();
        kerberosUserConfiguration36.refresh();
        java.util.HashMap<java.lang.String, java.lang.String> strMap42 = kerberosUserConfiguration36.getoptions();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration43 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap44 = kerberosUserConfiguration43.getDEFAULT_KERBEROS_OPTIONS();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration43);
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration47 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration47.refresh();
        java.security.Provider provider49 = kerberosUserConfiguration47.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap50 = kerberosUserConfiguration47.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration43.setoptions(strMap50);
        kerberosUserConfiguration36.options = strMap50;
        kerberosUserConfiguration34.options = strMap50;
        java.util.HashMap<java.lang.String, java.lang.String> strMap54 = kerberosUserConfiguration34.getoptions();
        kerberosUserConfiguration27.setoptions(strMap54);
        java.util.HashMap<java.lang.String, java.lang.String> strMap56 = kerberosUserConfiguration27.getoptions();
        kerberosUserConfiguration6.setoptions(strMap56);
        kerberosUserConfiguration1.options = strMap56;
        java.util.HashMap<java.lang.String, java.lang.String> strMap59 = kerberosUserConfiguration1.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap60 = kerberosUserConfiguration1.getDEFAULT_KERBEROS_OPTIONS();
        java.util.HashMap<java.lang.String, java.lang.String> strMap61 = kerberosUserConfiguration1.options;
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(strMap14);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(parameters18);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray20);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNull(provider22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNull(strMap30);
        org.junit.Assert.assertNull(parameters35);
        org.junit.Assert.assertNull(strMap39);
        org.junit.Assert.assertNull(strMap42);
        org.junit.Assert.assertNotNull(strMap44);
        org.junit.Assert.assertNull(provider49);
        org.junit.Assert.assertNotNull(strMap50);
        org.junit.Assert.assertNotNull(strMap54);
        org.junit.Assert.assertNotNull(strMap56);
        org.junit.Assert.assertNotNull(strMap59);
        org.junit.Assert.assertNotNull(strMap60);
        org.junit.Assert.assertNotNull(strMap61);
    }

    @Test
    public void test13528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13528");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap1 = kerberosUserConfiguration0.getDEFAULT_KERBEROS_OPTIONS();
        java.lang.String str2 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration5 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration5.refresh();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration7 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap8 = kerberosUserConfiguration7.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration5.setoptions(strMap8);
        kerberosUserConfiguration0.setoptions(strMap8);
        java.util.HashMap<java.lang.String, java.lang.String> strMap11 = kerberosUserConfiguration0.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap12 = kerberosUserConfiguration0.getDEFAULT_KERBEROS_OPTIONS();
        java.util.HashMap<java.lang.String, java.lang.String> strMap13 = kerberosUserConfiguration0.getDEFAULT_KERBEROS_OPTIONS();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test13529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13529");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration7 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap8 = null;
        kerberosUserConfiguration7.setoptions(strMap8);
        java.util.HashMap<java.lang.String, java.lang.String> strMap10 = kerberosUserConfiguration7.options;
        kerberosUserConfiguration7.refresh();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration12 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap13 = null;
        kerberosUserConfiguration12.setoptions(strMap13);
        java.util.HashMap<java.lang.String, java.lang.String> strMap15 = kerberosUserConfiguration12.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap16 = kerberosUserConfiguration12.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap17 = kerberosUserConfiguration12.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration7.options = strMap17;
        javax.security.auth.login.Configuration.Parameters parameters19 = kerberosUserConfiguration7.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray21 = kerberosUserConfiguration7.getAppConfigurationEntry("hi!");
        java.util.HashMap<java.lang.String, java.lang.String> strMap22 = kerberosUserConfiguration7.getoptions();
        java.security.Provider provider23 = kerberosUserConfiguration7.getProvider();
        java.lang.String str24 = kerberosUserConfiguration7.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration7);
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration26 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap27 = null;
        kerberosUserConfiguration26.setoptions(strMap27);
        java.util.HashMap<java.lang.String, java.lang.String> strMap29 = kerberosUserConfiguration26.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap30 = kerberosUserConfiguration26.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap31 = kerberosUserConfiguration26.getoptions();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration33 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration33.refresh();
        java.security.Provider provider35 = kerberosUserConfiguration33.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap36 = kerberosUserConfiguration33.getDEFAULT_KERBEROS_OPTIONS();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration38 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration38.refresh();
        java.util.HashMap<java.lang.String, java.lang.String> strMap40 = kerberosUserConfiguration38.getoptions();
        kerberosUserConfiguration33.options = strMap40;
        java.util.HashMap<java.lang.String, java.lang.String> strMap42 = kerberosUserConfiguration33.getDEFAULT_KERBEROS_OPTIONS();
        java.security.Provider provider43 = kerberosUserConfiguration33.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap44 = kerberosUserConfiguration33.getDEFAULT_KERBEROS_OPTIONS();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration46 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration46.refresh();
        java.util.HashMap<java.lang.String, java.lang.String> strMap48 = kerberosUserConfiguration46.getoptions();
        java.security.Provider provider49 = kerberosUserConfiguration46.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters50 = kerberosUserConfiguration46.getParameters();
        java.util.HashMap<java.lang.String, java.lang.String> strMap51 = kerberosUserConfiguration46.options;
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration52 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap53 = null;
        kerberosUserConfiguration52.setoptions(strMap53);
        java.util.HashMap<java.lang.String, java.lang.String> strMap55 = kerberosUserConfiguration52.options;
        kerberosUserConfiguration52.refresh();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration57 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap58 = null;
        kerberosUserConfiguration57.setoptions(strMap58);
        java.util.HashMap<java.lang.String, java.lang.String> strMap60 = kerberosUserConfiguration57.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap61 = kerberosUserConfiguration57.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap62 = kerberosUserConfiguration57.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration52.options = strMap62;
        javax.security.auth.login.Configuration.Parameters parameters64 = kerberosUserConfiguration52.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray66 = kerberosUserConfiguration52.getAppConfigurationEntry("hi!");
        java.util.HashMap<java.lang.String, java.lang.String> strMap67 = kerberosUserConfiguration52.getDEFAULT_KERBEROS_OPTIONS();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration69 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration69.refresh();
        java.security.Provider provider71 = kerberosUserConfiguration69.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap72 = kerberosUserConfiguration69.getDEFAULT_KERBEROS_OPTIONS();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration74 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration74.refresh();
        java.security.Provider provider76 = kerberosUserConfiguration74.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap77 = kerberosUserConfiguration74.getDEFAULT_KERBEROS_OPTIONS();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration79 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration79.refresh();
        java.util.HashMap<java.lang.String, java.lang.String> strMap81 = kerberosUserConfiguration79.getoptions();
        kerberosUserConfiguration74.options = strMap81;
        kerberosUserConfiguration69.options = strMap81;
        javax.security.auth.login.Configuration.Parameters parameters84 = kerberosUserConfiguration69.getParameters();
        java.util.HashMap<java.lang.String, java.lang.String> strMap85 = kerberosUserConfiguration69.options;
        kerberosUserConfiguration52.setoptions(strMap85);
        kerberosUserConfiguration46.setoptions(strMap85);
        kerberosUserConfiguration33.options = strMap85;
        kerberosUserConfiguration26.setoptions(strMap85);
        kerberosUserConfiguration7.setoptions(strMap85);
        java.lang.String str91 = kerberosUserConfiguration7.getType();
        java.util.HashMap<java.lang.String, java.lang.String> strMap92 = kerberosUserConfiguration7.options;
        kerberosUserConfiguration1.setoptions(strMap92);
        java.lang.String str94 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNull(parameters19);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNull(provider23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(strMap29);
        org.junit.Assert.assertNull(strMap30);
        org.junit.Assert.assertNull(strMap31);
        org.junit.Assert.assertNull(provider35);
        org.junit.Assert.assertNotNull(strMap36);
        org.junit.Assert.assertNotNull(strMap40);
        org.junit.Assert.assertNotNull(strMap42);
        org.junit.Assert.assertNull(provider43);
        org.junit.Assert.assertNotNull(strMap44);
        org.junit.Assert.assertNotNull(strMap48);
        org.junit.Assert.assertNull(provider49);
        org.junit.Assert.assertNull(parameters50);
        org.junit.Assert.assertNotNull(strMap51);
        org.junit.Assert.assertNull(strMap55);
        org.junit.Assert.assertNull(strMap60);
        org.junit.Assert.assertNull(strMap61);
        org.junit.Assert.assertNotNull(strMap62);
        org.junit.Assert.assertNull(parameters64);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray66);
        org.junit.Assert.assertNotNull(strMap67);
        org.junit.Assert.assertNull(provider71);
        org.junit.Assert.assertNotNull(strMap72);
        org.junit.Assert.assertNull(provider76);
        org.junit.Assert.assertNotNull(strMap77);
        org.junit.Assert.assertNotNull(strMap81);
        org.junit.Assert.assertNull(parameters84);
        org.junit.Assert.assertNotNull(strMap85);
        org.junit.Assert.assertNull(str91);
        org.junit.Assert.assertNotNull(strMap92);
        org.junit.Assert.assertNull(str94);
    }

    @Test
    public void test13530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13530");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.util.HashMap<java.lang.String, java.lang.String> strMap3 = kerberosUserConfiguration1.getoptions();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.util.HashMap<java.lang.String, java.lang.String> strMap6 = kerberosUserConfiguration1.options;
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration7 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap8 = null;
        kerberosUserConfiguration7.setoptions(strMap8);
        java.util.HashMap<java.lang.String, java.lang.String> strMap10 = kerberosUserConfiguration7.options;
        kerberosUserConfiguration7.refresh();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration12 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap13 = null;
        kerberosUserConfiguration12.setoptions(strMap13);
        java.util.HashMap<java.lang.String, java.lang.String> strMap15 = kerberosUserConfiguration12.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap16 = kerberosUserConfiguration12.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap17 = kerberosUserConfiguration12.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration7.options = strMap17;
        javax.security.auth.login.Configuration.Parameters parameters19 = kerberosUserConfiguration7.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray21 = kerberosUserConfiguration7.getAppConfigurationEntry("hi!");
        java.util.HashMap<java.lang.String, java.lang.String> strMap22 = kerberosUserConfiguration7.getDEFAULT_KERBEROS_OPTIONS();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration24 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration24.refresh();
        java.security.Provider provider26 = kerberosUserConfiguration24.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap27 = kerberosUserConfiguration24.getDEFAULT_KERBEROS_OPTIONS();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration29 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration29.refresh();
        java.security.Provider provider31 = kerberosUserConfiguration29.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap32 = kerberosUserConfiguration29.getDEFAULT_KERBEROS_OPTIONS();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration34 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration34.refresh();
        java.util.HashMap<java.lang.String, java.lang.String> strMap36 = kerberosUserConfiguration34.getoptions();
        kerberosUserConfiguration29.options = strMap36;
        kerberosUserConfiguration24.options = strMap36;
        javax.security.auth.login.Configuration.Parameters parameters39 = kerberosUserConfiguration24.getParameters();
        java.util.HashMap<java.lang.String, java.lang.String> strMap40 = kerberosUserConfiguration24.options;
        kerberosUserConfiguration7.setoptions(strMap40);
        kerberosUserConfiguration1.setoptions(strMap40);
        java.security.Provider provider43 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray45 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.util.HashMap<java.lang.String, java.lang.String> strMap46 = kerberosUserConfiguration1.getoptions();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration47 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration47.refresh();
        java.util.HashMap<java.lang.String, java.lang.String> strMap49 = kerberosUserConfiguration47.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap50 = kerberosUserConfiguration47.getDEFAULT_KERBEROS_OPTIONS();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration47);
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration52 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration52.refresh();
        kerberosUserConfiguration52.refresh();
        java.util.HashMap<java.lang.String, java.lang.String> strMap55 = kerberosUserConfiguration52.getoptions();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration56 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap57 = kerberosUserConfiguration56.getDEFAULT_KERBEROS_OPTIONS();
        java.lang.String str58 = kerberosUserConfiguration56.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration56);
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration61 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration61.refresh();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration63 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap64 = kerberosUserConfiguration63.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration61.setoptions(strMap64);
        kerberosUserConfiguration56.setoptions(strMap64);
        java.util.HashMap<java.lang.String, java.lang.String> strMap67 = kerberosUserConfiguration56.getoptions();
        kerberosUserConfiguration52.options = strMap67;
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration69 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap70 = null;
        kerberosUserConfiguration69.setoptions(strMap70);
        java.util.HashMap<java.lang.String, java.lang.String> strMap72 = kerberosUserConfiguration69.options;
        kerberosUserConfiguration69.refresh();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration74 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap75 = null;
        kerberosUserConfiguration74.setoptions(strMap75);
        java.util.HashMap<java.lang.String, java.lang.String> strMap77 = kerberosUserConfiguration74.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap78 = kerberosUserConfiguration74.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap79 = kerberosUserConfiguration74.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration69.options = strMap79;
        javax.security.auth.login.Configuration.Parameters parameters81 = kerberosUserConfiguration69.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray83 = kerberosUserConfiguration69.getAppConfigurationEntry("hi!");
        java.util.HashMap<java.lang.String, java.lang.String> strMap84 = kerberosUserConfiguration69.getoptions();
        kerberosUserConfiguration52.setoptions(strMap84);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration52);
        java.util.HashMap<java.lang.String, java.lang.String> strMap87 = kerberosUserConfiguration52.options;
        javax.security.auth.login.Configuration.Parameters parameters88 = kerberosUserConfiguration52.getParameters();
        java.util.HashMap<java.lang.String, java.lang.String> strMap89 = kerberosUserConfiguration52.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration47.setoptions(strMap89);
        java.util.HashMap<java.lang.String, java.lang.String> strMap91 = kerberosUserConfiguration47.getoptions();
        kerberosUserConfiguration1.setoptions(strMap91);
        java.util.HashMap<java.lang.String, java.lang.String> strMap93 = kerberosUserConfiguration1.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap94 = kerberosUserConfiguration1.options;
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNull(parameters19);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNull(provider26);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNull(provider31);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNotNull(strMap36);
        org.junit.Assert.assertNull(parameters39);
        org.junit.Assert.assertNotNull(strMap40);
        org.junit.Assert.assertNull(provider43);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray45);
        org.junit.Assert.assertNotNull(strMap46);
        org.junit.Assert.assertNull(strMap49);
        org.junit.Assert.assertNotNull(strMap50);
        org.junit.Assert.assertNull(strMap55);
        org.junit.Assert.assertNotNull(strMap57);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNotNull(strMap64);
        org.junit.Assert.assertNotNull(strMap67);
        org.junit.Assert.assertNull(strMap72);
        org.junit.Assert.assertNull(strMap77);
        org.junit.Assert.assertNull(strMap78);
        org.junit.Assert.assertNotNull(strMap79);
        org.junit.Assert.assertNull(parameters81);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray83);
        org.junit.Assert.assertNotNull(strMap84);
        org.junit.Assert.assertNotNull(strMap87);
        org.junit.Assert.assertNull(parameters88);
        org.junit.Assert.assertNotNull(strMap89);
        org.junit.Assert.assertNotNull(strMap91);
        org.junit.Assert.assertNotNull(strMap93);
        org.junit.Assert.assertNotNull(strMap94);
    }

    @Test
    public void test13531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13531");
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!", "", "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17, false);
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test13532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13532");
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "", "", "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test13533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13533");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.util.HashMap<java.lang.String, java.lang.String> strMap3 = kerberosUserConfiguration1.getDEFAULT_KERBEROS_OPTIONS();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test13534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13534");
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "", "", "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        tSSLTransportParameters20.setTrustStore("hi!", "");
        tSSLTransportParameters20.setKeyStore("", "");
        tSSLTransportParameters20.setKeyStore("", "hi!", "", "hi!");
        tSSLTransportParameters20.setKeyStore("hi!", "hi!", "", "hi!");
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test13535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13535");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap1 = null;
        kerberosUserConfiguration0.setoptions(strMap1);
        java.util.HashMap<java.lang.String, java.lang.String> strMap3 = kerberosUserConfiguration0.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap4 = kerberosUserConfiguration0.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap5 = kerberosUserConfiguration0.getDEFAULT_KERBEROS_OPTIONS();
        java.util.HashMap<java.lang.String, java.lang.String> strMap6 = kerberosUserConfiguration0.getDEFAULT_KERBEROS_OPTIONS();
        java.util.HashMap<java.lang.String, java.lang.String> strMap7 = kerberosUserConfiguration0.getDEFAULT_KERBEROS_OPTIONS();
        java.util.HashMap<java.lang.String, java.lang.String> strMap8 = kerberosUserConfiguration0.getDEFAULT_KERBEROS_OPTIONS();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        java.security.Provider provider10 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.util.HashMap<java.lang.String, java.lang.String> strMap12 = kerberosUserConfiguration0.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap13 = kerberosUserConfiguration0.getoptions();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration0.getParameters();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration16 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration16.refresh();
        java.security.Provider provider18 = kerberosUserConfiguration16.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration16);
        javax.security.auth.login.Configuration.Parameters parameters20 = kerberosUserConfiguration16.getParameters();
        java.util.HashMap<java.lang.String, java.lang.String> strMap21 = kerberosUserConfiguration16.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration0.setoptions(strMap21);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray24 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(provider18);
        org.junit.Assert.assertNull(parameters20);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray24);
    }

    @Test
    public void test13536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13536");
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "", "", "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, false);
        tSSLTransportParameters19.requireClientAuth(true);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test13537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13537");
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "", "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        tSSLTransportParameters26.setKeyStore("hi!", "hi!", "hi!", "hi!");
        tSSLTransportParameters26.requireClientAuth(true);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test13538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13538");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap1 = kerberosUserConfiguration0.options;
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration3 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration3.refresh();
        java.security.Provider provider5 = kerberosUserConfiguration3.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap6 = kerberosUserConfiguration3.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration0.setoptions(strMap6);
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        java.util.HashMap<java.lang.String, java.lang.String> strMap10 = kerberosUserConfiguration0.getDEFAULT_KERBEROS_OPTIONS();
        java.util.HashMap<java.lang.String, java.lang.String> strMap11 = kerberosUserConfiguration0.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap12 = kerberosUserConfiguration0.getoptions();
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test13539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13539");
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "", "", "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, false);
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test13540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13540");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.util.HashMap<java.lang.String, java.lang.String> strMap2 = kerberosUserConfiguration1.getDEFAULT_KERBEROS_OPTIONS();
        java.security.Provider provider3 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.util.HashMap<java.lang.String, java.lang.String> strMap6 = kerberosUserConfiguration1.options;
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.util.HashMap<java.lang.String, java.lang.String> strMap11 = kerberosUserConfiguration1.options;
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration13 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration13.refresh();
        java.util.HashMap<java.lang.String, java.lang.String> strMap15 = kerberosUserConfiguration13.getoptions();
        java.security.Provider provider16 = kerberosUserConfiguration13.getProvider();
        java.lang.String str17 = kerberosUserConfiguration13.getType();
        java.lang.String str18 = kerberosUserConfiguration13.getType();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration20 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration20.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray23 = kerberosUserConfiguration20.getAppConfigurationEntry("");
        java.util.HashMap<java.lang.String, java.lang.String> strMap24 = kerberosUserConfiguration20.options;
        kerberosUserConfiguration13.setoptions(strMap24);
        java.security.Provider provider26 = kerberosUserConfiguration13.getProvider();
        kerberosUserConfiguration13.refresh();
        java.security.Provider provider28 = kerberosUserConfiguration13.getProvider();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration30 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider31 = kerberosUserConfiguration30.getProvider();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration32 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration32.refresh();
        kerberosUserConfiguration32.refresh();
        java.util.HashMap<java.lang.String, java.lang.String> strMap35 = kerberosUserConfiguration32.getoptions();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration36 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap37 = null;
        kerberosUserConfiguration36.setoptions(strMap37);
        javax.security.auth.login.Configuration.Parameters parameters39 = kerberosUserConfiguration36.getParameters();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration41 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration41.refresh();
        java.security.Provider provider43 = kerberosUserConfiguration41.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap44 = kerberosUserConfiguration41.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration36.setoptions(strMap44);
        kerberosUserConfiguration32.options = strMap44;
        kerberosUserConfiguration30.setoptions(strMap44);
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration48 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap49 = null;
        kerberosUserConfiguration48.setoptions(strMap49);
        java.util.HashMap<java.lang.String, java.lang.String> strMap51 = kerberosUserConfiguration48.options;
        kerberosUserConfiguration48.refresh();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration53 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap54 = null;
        kerberosUserConfiguration53.setoptions(strMap54);
        java.util.HashMap<java.lang.String, java.lang.String> strMap56 = kerberosUserConfiguration53.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap57 = kerberosUserConfiguration53.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap58 = kerberosUserConfiguration53.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration48.options = strMap58;
        javax.security.auth.login.Configuration.Parameters parameters60 = kerberosUserConfiguration48.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray62 = kerberosUserConfiguration48.getAppConfigurationEntry("hi!");
        java.util.HashMap<java.lang.String, java.lang.String> strMap63 = kerberosUserConfiguration48.getDEFAULT_KERBEROS_OPTIONS();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration65 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration65.refresh();
        java.security.Provider provider67 = kerberosUserConfiguration65.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap68 = kerberosUserConfiguration65.getDEFAULT_KERBEROS_OPTIONS();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration70 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration70.refresh();
        java.security.Provider provider72 = kerberosUserConfiguration70.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap73 = kerberosUserConfiguration70.getDEFAULT_KERBEROS_OPTIONS();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration75 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration75.refresh();
        java.util.HashMap<java.lang.String, java.lang.String> strMap77 = kerberosUserConfiguration75.getoptions();
        kerberosUserConfiguration70.options = strMap77;
        kerberosUserConfiguration65.options = strMap77;
        javax.security.auth.login.Configuration.Parameters parameters80 = kerberosUserConfiguration65.getParameters();
        java.util.HashMap<java.lang.String, java.lang.String> strMap81 = kerberosUserConfiguration65.options;
        kerberosUserConfiguration48.setoptions(strMap81);
        kerberosUserConfiguration30.setoptions(strMap81);
        java.util.HashMap<java.lang.String, java.lang.String> strMap84 = kerberosUserConfiguration30.options;
        kerberosUserConfiguration13.options = strMap84;
        java.util.HashMap<java.lang.String, java.lang.String> strMap86 = kerberosUserConfiguration13.options;
        kerberosUserConfiguration1.options = strMap86;
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray23);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNull(provider26);
        org.junit.Assert.assertNull(provider28);
        org.junit.Assert.assertNull(provider31);
        org.junit.Assert.assertNull(strMap35);
        org.junit.Assert.assertNull(parameters39);
        org.junit.Assert.assertNull(provider43);
        org.junit.Assert.assertNotNull(strMap44);
        org.junit.Assert.assertNull(strMap51);
        org.junit.Assert.assertNull(strMap56);
        org.junit.Assert.assertNull(strMap57);
        org.junit.Assert.assertNotNull(strMap58);
        org.junit.Assert.assertNull(parameters60);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray62);
        org.junit.Assert.assertNotNull(strMap63);
        org.junit.Assert.assertNull(provider67);
        org.junit.Assert.assertNotNull(strMap68);
        org.junit.Assert.assertNull(provider72);
        org.junit.Assert.assertNotNull(strMap73);
        org.junit.Assert.assertNotNull(strMap77);
        org.junit.Assert.assertNull(parameters80);
        org.junit.Assert.assertNotNull(strMap81);
        org.junit.Assert.assertNotNull(strMap84);
        org.junit.Assert.assertNotNull(strMap86);
    }

    @Test
    public void test13541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13541");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap1 = kerberosUserConfiguration0.options;
        java.lang.String str2 = kerberosUserConfiguration0.getType();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration4 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap5 = null;
        kerberosUserConfiguration4.setoptions(strMap5);
        java.util.HashMap<java.lang.String, java.lang.String> strMap7 = kerberosUserConfiguration4.options;
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration4);
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration9 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration9.refresh();
        kerberosUserConfiguration9.refresh();
        java.util.HashMap<java.lang.String, java.lang.String> strMap12 = kerberosUserConfiguration9.getoptions();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration13 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap14 = null;
        kerberosUserConfiguration13.setoptions(strMap14);
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration13.getParameters();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration18 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration18.refresh();
        java.security.Provider provider20 = kerberosUserConfiguration18.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap21 = kerberosUserConfiguration18.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration13.setoptions(strMap21);
        kerberosUserConfiguration9.options = strMap21;
        kerberosUserConfiguration4.options = strMap21;
        kerberosUserConfiguration4.refresh();
        java.lang.String str26 = kerberosUserConfiguration4.getType();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration28 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration28);
        java.util.HashMap<java.lang.String, java.lang.String> strMap30 = kerberosUserConfiguration28.getoptions();
        kerberosUserConfiguration4.options = strMap30;
        kerberosUserConfiguration0.options = strMap30;
        java.security.Provider provider33 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters34 = kerberosUserConfiguration0.getParameters();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration35 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap36 = null;
        kerberosUserConfiguration35.setoptions(strMap36);
        java.util.HashMap<java.lang.String, java.lang.String> strMap38 = kerberosUserConfiguration35.options;
        kerberosUserConfiguration35.refresh();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration40 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap41 = null;
        kerberosUserConfiguration40.setoptions(strMap41);
        java.util.HashMap<java.lang.String, java.lang.String> strMap43 = kerberosUserConfiguration40.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap44 = kerberosUserConfiguration40.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap45 = kerberosUserConfiguration40.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration35.options = strMap45;
        javax.security.auth.login.Configuration.Parameters parameters47 = kerberosUserConfiguration35.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray49 = kerberosUserConfiguration35.getAppConfigurationEntry("hi!");
        java.util.HashMap<java.lang.String, java.lang.String> strMap50 = kerberosUserConfiguration35.getDEFAULT_KERBEROS_OPTIONS();
        java.lang.String str51 = kerberosUserConfiguration35.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration35);
        java.util.HashMap<java.lang.String, java.lang.String> strMap53 = kerberosUserConfiguration35.options;
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration54 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap55 = kerberosUserConfiguration54.getDEFAULT_KERBEROS_OPTIONS();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration57 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration57.refresh();
        java.security.Provider provider59 = kerberosUserConfiguration57.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap60 = kerberosUserConfiguration57.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration54.setoptions(strMap60);
        java.security.Provider provider62 = kerberosUserConfiguration54.getProvider();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration63 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap64 = null;
        kerberosUserConfiguration63.setoptions(strMap64);
        java.util.HashMap<java.lang.String, java.lang.String> strMap66 = kerberosUserConfiguration63.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap67 = kerberosUserConfiguration63.getoptions();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration68 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap69 = kerberosUserConfiguration68.getDEFAULT_KERBEROS_OPTIONS();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration68);
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration72 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration72.refresh();
        java.security.Provider provider74 = kerberosUserConfiguration72.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap75 = kerberosUserConfiguration72.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration68.setoptions(strMap75);
        kerberosUserConfiguration63.setoptions(strMap75);
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration78 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap79 = null;
        kerberosUserConfiguration78.setoptions(strMap79);
        java.util.HashMap<java.lang.String, java.lang.String> strMap81 = kerberosUserConfiguration78.options;
        kerberosUserConfiguration78.refresh();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration83 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap84 = kerberosUserConfiguration83.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap85 = null;
        kerberosUserConfiguration83.options = strMap85;
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration87 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap88 = kerberosUserConfiguration87.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration83.setoptions(strMap88);
        kerberosUserConfiguration78.setoptions(strMap88);
        kerberosUserConfiguration63.setoptions(strMap88);
        kerberosUserConfiguration54.options = strMap88;
        kerberosUserConfiguration35.setoptions(strMap88);
        java.util.HashMap<java.lang.String, java.lang.String> strMap94 = kerberosUserConfiguration35.getoptions();
        kerberosUserConfiguration0.setoptions(strMap94);
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNull(provider20);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertNull(provider33);
        org.junit.Assert.assertNull(parameters34);
        org.junit.Assert.assertNull(strMap38);
        org.junit.Assert.assertNull(strMap43);
        org.junit.Assert.assertNull(strMap44);
        org.junit.Assert.assertNotNull(strMap45);
        org.junit.Assert.assertNull(parameters47);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray49);
        org.junit.Assert.assertNotNull(strMap50);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(strMap53);
        org.junit.Assert.assertNotNull(strMap55);
        org.junit.Assert.assertNull(provider59);
        org.junit.Assert.assertNotNull(strMap60);
        org.junit.Assert.assertNull(provider62);
        org.junit.Assert.assertNull(strMap66);
        org.junit.Assert.assertNull(strMap67);
        org.junit.Assert.assertNotNull(strMap69);
        org.junit.Assert.assertNull(provider74);
        org.junit.Assert.assertNotNull(strMap75);
        org.junit.Assert.assertNull(strMap81);
        org.junit.Assert.assertNull(strMap84);
        org.junit.Assert.assertNotNull(strMap88);
        org.junit.Assert.assertNotNull(strMap94);
    }

    @Test
    public void test13542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13542");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap1 = kerberosUserConfiguration0.options;
        java.lang.String str2 = kerberosUserConfiguration0.getType();
        java.util.HashMap<java.lang.String, java.lang.String> strMap3 = kerberosUserConfiguration0.options;
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.util.HashMap<java.lang.String, java.lang.String> strMap7 = kerberosUserConfiguration0.options;
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(strMap7);
    }

    @Test
    public void test13543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13543");
        java.lang.String[] strArray19 = new java.lang.String[] { "", "hi!", "", "", "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray19, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters39 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray19, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters40 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19);
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test13544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13544");
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "", "", "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        tSSLTransportParameters16.setTrustStore("", "hi!");
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test13545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13545");
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "", "", "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        tSSLTransportParameters23.setKeyStore("hi!", "hi!", "", "hi!");
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test13546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13546");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap1 = kerberosUserConfiguration0.options;
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration3 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration3.refresh();
        java.security.Provider provider5 = kerberosUserConfiguration3.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap6 = kerberosUserConfiguration3.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration0.setoptions(strMap6);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration13 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration13.refresh();
        java.util.HashMap<java.lang.String, java.lang.String> strMap15 = kerberosUserConfiguration13.getoptions();
        java.security.Provider provider16 = kerberosUserConfiguration13.getProvider();
        java.lang.String str17 = kerberosUserConfiguration13.getType();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration18 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap19 = kerberosUserConfiguration18.getDEFAULT_KERBEROS_OPTIONS();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration21 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration21.refresh();
        java.security.Provider provider23 = kerberosUserConfiguration21.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap24 = kerberosUserConfiguration21.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration18.setoptions(strMap24);
        java.util.HashMap<java.lang.String, java.lang.String> strMap26 = kerberosUserConfiguration18.getoptions();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration18);
        java.util.HashMap<java.lang.String, java.lang.String> strMap28 = kerberosUserConfiguration18.options;
        kerberosUserConfiguration13.options = strMap28;
        java.util.HashMap<java.lang.String, java.lang.String> strMap30 = me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration.DEFAULT_KERBEROS_OPTIONS;
        kerberosUserConfiguration13.setoptions(strMap30);
        kerberosUserConfiguration0.options = strMap30;
        java.util.HashMap<java.lang.String, java.lang.String> strMap33 = kerberosUserConfiguration0.options;
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNull(provider23);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertNotNull(strMap33);
    }

    @Test
    public void test13547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13547");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap1 = null;
        kerberosUserConfiguration0.setoptions(strMap1);
        java.util.HashMap<java.lang.String, java.lang.String> strMap3 = kerberosUserConfiguration0.options;
        kerberosUserConfiguration0.refresh();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration5 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap6 = null;
        kerberosUserConfiguration5.setoptions(strMap6);
        java.util.HashMap<java.lang.String, java.lang.String> strMap8 = kerberosUserConfiguration5.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap9 = kerberosUserConfiguration5.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap10 = kerberosUserConfiguration5.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration0.options = strMap10;
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.util.HashMap<java.lang.String, java.lang.String> strMap15 = kerberosUserConfiguration0.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap16 = kerberosUserConfiguration0.getoptions();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration18 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration18);
        java.util.HashMap<java.lang.String, java.lang.String> strMap20 = kerberosUserConfiguration18.getoptions();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration21 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap22 = null;
        kerberosUserConfiguration21.setoptions(strMap22);
        java.util.HashMap<java.lang.String, java.lang.String> strMap24 = kerberosUserConfiguration21.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap25 = kerberosUserConfiguration21.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap26 = kerberosUserConfiguration21.getDEFAULT_KERBEROS_OPTIONS();
        java.util.HashMap<java.lang.String, java.lang.String> strMap27 = kerberosUserConfiguration21.getDEFAULT_KERBEROS_OPTIONS();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration28 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap29 = null;
        kerberosUserConfiguration28.setoptions(strMap29);
        java.util.HashMap<java.lang.String, java.lang.String> strMap31 = kerberosUserConfiguration28.options;
        kerberosUserConfiguration28.refresh();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration33 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap34 = kerberosUserConfiguration33.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap35 = null;
        kerberosUserConfiguration33.options = strMap35;
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration37 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap38 = kerberosUserConfiguration37.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration33.setoptions(strMap38);
        kerberosUserConfiguration28.setoptions(strMap38);
        kerberosUserConfiguration21.options = strMap38;
        java.util.HashMap<java.lang.String, java.lang.String> strMap42 = kerberosUserConfiguration21.getoptions();
        kerberosUserConfiguration18.setoptions(strMap42);
        kerberosUserConfiguration0.options = strMap42;
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray47 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.util.HashMap<java.lang.String, java.lang.String> strMap48 = kerberosUserConfiguration0.options;
        kerberosUserConfiguration0.refresh();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration50 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap51 = kerberosUserConfiguration50.getDEFAULT_KERBEROS_OPTIONS();
        java.lang.String str52 = kerberosUserConfiguration50.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration50);
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration55 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration55.refresh();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration57 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap58 = kerberosUserConfiguration57.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration55.setoptions(strMap58);
        kerberosUserConfiguration50.setoptions(strMap58);
        java.util.HashMap<java.lang.String, java.lang.String> strMap61 = kerberosUserConfiguration50.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap62 = kerberosUserConfiguration50.getoptions();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray64 = kerberosUserConfiguration50.getAppConfigurationEntry("");
        java.security.Provider provider65 = kerberosUserConfiguration50.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters66 = kerberosUserConfiguration50.getParameters();
        java.util.HashMap<java.lang.String, java.lang.String> strMap67 = kerberosUserConfiguration50.options;
        kerberosUserConfiguration0.setoptions(strMap67);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNull(strMap24);
        org.junit.Assert.assertNull(strMap25);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNull(strMap31);
        org.junit.Assert.assertNull(strMap34);
        org.junit.Assert.assertNotNull(strMap38);
        org.junit.Assert.assertNotNull(strMap42);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray47);
        org.junit.Assert.assertNotNull(strMap48);
        org.junit.Assert.assertNotNull(strMap51);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(strMap58);
        org.junit.Assert.assertNotNull(strMap61);
        org.junit.Assert.assertNotNull(strMap62);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray64);
        org.junit.Assert.assertNull(provider65);
        org.junit.Assert.assertNull(parameters66);
        org.junit.Assert.assertNotNull(strMap67);
    }

    @Test
    public void test13548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13548");
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!", "", "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters8 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray7);
        tSSLTransportParameters8.requireClientAuth(true);
        tSSLTransportParameters8.setKeyStore("hi!", "hi!");
        tSSLTransportParameters8.setKeyStore("hi!", "hi!");
        tSSLTransportParameters8.requireClientAuth(false);
        tSSLTransportParameters8.setKeyStore("hi!", "", "", "hi!");
        tSSLTransportParameters8.setTrustStore("hi!", "", "", "");
        tSSLTransportParameters8.setTrustStore("hi!", "");
        tSSLTransportParameters8.setKeyStore("hi!", "", "hi!", "");
        tSSLTransportParameters8.setKeyStore("hi!", "");
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test13549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13549");
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!", "", "", "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray20, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray20, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray20, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray20, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray20, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray20, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters38 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray20, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters40 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray20, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters42 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray20, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters43 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray20);
        org.junit.Assert.assertNotNull(strArray20);
    }

    @Test
    public void test13550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13550");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap1 = null;
        kerberosUserConfiguration0.setoptions(strMap1);
        java.util.HashMap<java.lang.String, java.lang.String> strMap3 = kerberosUserConfiguration0.options;
        kerberosUserConfiguration0.refresh();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration5 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap6 = null;
        kerberosUserConfiguration5.setoptions(strMap6);
        java.util.HashMap<java.lang.String, java.lang.String> strMap8 = kerberosUserConfiguration5.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap9 = kerberosUserConfiguration5.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap10 = kerberosUserConfiguration5.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration0.options = strMap10;
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.util.HashMap<java.lang.String, java.lang.String> strMap15 = kerberosUserConfiguration0.getDEFAULT_KERBEROS_OPTIONS();
        java.lang.String str16 = kerberosUserConfiguration0.getType();
        java.lang.String str17 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray19 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.security.Provider provider20 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration22 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap23 = kerberosUserConfiguration22.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap24 = kerberosUserConfiguration22.getDEFAULT_KERBEROS_OPTIONS();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration22);
        java.security.Provider provider26 = kerberosUserConfiguration22.getProvider();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration27 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap28 = null;
        kerberosUserConfiguration27.setoptions(strMap28);
        java.util.HashMap<java.lang.String, java.lang.String> strMap30 = kerberosUserConfiguration27.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap31 = kerberosUserConfiguration27.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap32 = kerberosUserConfiguration27.getDEFAULT_KERBEROS_OPTIONS();
        java.util.HashMap<java.lang.String, java.lang.String> strMap33 = kerberosUserConfiguration27.getDEFAULT_KERBEROS_OPTIONS();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration34 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap35 = null;
        kerberosUserConfiguration34.setoptions(strMap35);
        java.util.HashMap<java.lang.String, java.lang.String> strMap37 = kerberosUserConfiguration34.options;
        java.lang.String str38 = kerberosUserConfiguration34.getType();
        java.util.HashMap<java.lang.String, java.lang.String> strMap39 = kerberosUserConfiguration34.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration27.setoptions(strMap39);
        kerberosUserConfiguration27.refresh();
        java.util.HashMap<java.lang.String, java.lang.String> strMap42 = kerberosUserConfiguration27.getoptions();
        kerberosUserConfiguration22.options = strMap42;
        kerberosUserConfiguration0.setoptions(strMap42);
        java.lang.String str45 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray47 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray19);
        org.junit.Assert.assertNull(provider20);
        org.junit.Assert.assertNull(strMap23);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNull(provider26);
        org.junit.Assert.assertNull(strMap30);
        org.junit.Assert.assertNull(strMap31);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertNull(strMap37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertNotNull(strMap42);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray47);
    }

    @Test
    public void test13551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13551");
        java.lang.String[] strArray19 = new java.lang.String[] { "", "hi!", "", "", "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray19, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters38 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters40 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19, false);
        tSSLTransportParameters40.setKeyStore("", "", "", "hi!");
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test13552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13552");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.util.HashMap<java.lang.String, java.lang.String> strMap3 = kerberosUserConfiguration1.getoptions();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
    }

    @Test
    public void test13553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13553");
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!", "", "", "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        tSSLTransportParameters28.requireClientAuth(false);
        tSSLTransportParameters28.setKeyStore("hi!", "", "", "hi!");
        tSSLTransportParameters28.setTrustStore("hi!", "", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test13554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13554");
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15);
        tSSLTransportParameters31.setTrustStore("hi!", "hi!");
        tSSLTransportParameters31.setTrustStore("hi!", "hi!", "", "");
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test13555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13555");
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "", "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test13556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13556");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap1 = null;
        kerberosUserConfiguration0.setoptions(strMap1);
        java.util.HashMap<java.lang.String, java.lang.String> strMap3 = kerberosUserConfiguration0.options;
        kerberosUserConfiguration0.refresh();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration5 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap6 = null;
        kerberosUserConfiguration5.setoptions(strMap6);
        java.util.HashMap<java.lang.String, java.lang.String> strMap8 = kerberosUserConfiguration5.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap9 = kerberosUserConfiguration5.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap10 = kerberosUserConfiguration5.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration0.options = strMap10;
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        java.util.HashMap<java.lang.String, java.lang.String> strMap14 = kerberosUserConfiguration0.getoptions();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration18 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration18);
        java.util.HashMap<java.lang.String, java.lang.String> strMap20 = kerberosUserConfiguration18.getoptions();
        kerberosUserConfiguration0.options = strMap20;
        java.util.HashMap<java.lang.String, java.lang.String> strMap22 = kerberosUserConfiguration0.options;
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(strMap22);
    }

    @Test
    public void test13557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13557");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap1 = null;
        kerberosUserConfiguration0.setoptions(strMap1);
        java.util.HashMap<java.lang.String, java.lang.String> strMap3 = kerberosUserConfiguration0.options;
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration5 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap6 = kerberosUserConfiguration5.getDEFAULT_KERBEROS_OPTIONS();
        java.lang.String str7 = kerberosUserConfiguration5.getType();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration5.getParameters();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration9 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap10 = kerberosUserConfiguration9.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap11 = null;
        kerberosUserConfiguration9.options = strMap11;
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration13 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap14 = kerberosUserConfiguration13.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration9.setoptions(strMap14);
        java.util.HashMap<java.lang.String, java.lang.String> strMap16 = kerberosUserConfiguration9.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration5.options = strMap16;
        kerberosUserConfiguration0.options = strMap16;
        java.lang.String str19 = kerberosUserConfiguration0.getType();
        java.util.HashMap<java.lang.String, java.lang.String> strMap20 = kerberosUserConfiguration0.getDEFAULT_KERBEROS_OPTIONS();
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(strMap20);
    }

    @Test
    public void test13558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13558");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration1.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap4 = kerberosUserConfiguration1.getDEFAULT_KERBEROS_OPTIONS();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration6 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration6.refresh();
        java.security.Provider provider8 = kerberosUserConfiguration6.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap9 = kerberosUserConfiguration6.getDEFAULT_KERBEROS_OPTIONS();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration11 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration11.refresh();
        java.util.HashMap<java.lang.String, java.lang.String> strMap13 = kerberosUserConfiguration11.getoptions();
        kerberosUserConfiguration6.options = strMap13;
        kerberosUserConfiguration1.options = strMap13;
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray19 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters20 = kerberosUserConfiguration1.getParameters();
        java.util.HashMap<java.lang.String, java.lang.String> strMap21 = kerberosUserConfiguration1.options;
        java.lang.Class<?> wildcardClass22 = strMap21.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray19);
        org.junit.Assert.assertNull(parameters20);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test13559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13559");
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "", "", "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test13560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13560");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.util.HashMap<java.lang.String, java.lang.String> strMap3 = kerberosUserConfiguration1.getoptions();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration6 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration6.refresh();
        java.security.Provider provider8 = kerberosUserConfiguration6.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap9 = kerberosUserConfiguration6.getDEFAULT_KERBEROS_OPTIONS();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration11 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration11.refresh();
        java.util.HashMap<java.lang.String, java.lang.String> strMap13 = kerberosUserConfiguration11.getoptions();
        kerberosUserConfiguration6.options = strMap13;
        java.util.HashMap<java.lang.String, java.lang.String> strMap15 = kerberosUserConfiguration6.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration1.setoptions(strMap15);
        kerberosUserConfiguration1.refresh();
        java.util.HashMap<java.lang.String, java.lang.String> strMap18 = kerberosUserConfiguration1.options;
        javax.security.auth.login.Configuration.Parameters parameters19 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNull(parameters19);
    }

    @Test
    public void test13561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13561");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.util.HashMap<java.lang.String, java.lang.String> strMap4 = kerberosUserConfiguration1.options;
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.util.HashMap<java.lang.String, java.lang.String> strMap7 = kerberosUserConfiguration1.options;
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration10 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap11 = kerberosUserConfiguration10.options;
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration13 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration13.refresh();
        java.security.Provider provider15 = kerberosUserConfiguration13.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap16 = kerberosUserConfiguration13.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration10.setoptions(strMap16);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray19 = kerberosUserConfiguration10.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration10);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration10);
        kerberosUserConfiguration10.refresh();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration23 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap24 = null;
        kerberosUserConfiguration23.setoptions(strMap24);
        java.util.HashMap<java.lang.String, java.lang.String> strMap26 = kerberosUserConfiguration23.options;
        kerberosUserConfiguration23.refresh();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration28 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap29 = null;
        kerberosUserConfiguration28.setoptions(strMap29);
        java.util.HashMap<java.lang.String, java.lang.String> strMap31 = kerberosUserConfiguration28.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap32 = kerberosUserConfiguration28.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap33 = kerberosUserConfiguration28.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration23.options = strMap33;
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration36 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration36.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration36);
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration39 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap40 = null;
        kerberosUserConfiguration39.setoptions(strMap40);
        java.util.HashMap<java.lang.String, java.lang.String> strMap42 = kerberosUserConfiguration39.options;
        kerberosUserConfiguration39.refresh();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration44 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap45 = null;
        kerberosUserConfiguration44.setoptions(strMap45);
        java.util.HashMap<java.lang.String, java.lang.String> strMap47 = kerberosUserConfiguration44.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap48 = kerberosUserConfiguration44.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap49 = kerberosUserConfiguration44.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration39.options = strMap49;
        kerberosUserConfiguration36.setoptions(strMap49);
        kerberosUserConfiguration36.refresh();
        java.util.HashMap<java.lang.String, java.lang.String> strMap53 = kerberosUserConfiguration36.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration23.options = strMap53;
        java.lang.String str55 = kerberosUserConfiguration23.getType();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration57 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration57.refresh();
        java.security.Provider provider59 = kerberosUserConfiguration57.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap60 = kerberosUserConfiguration57.getDEFAULT_KERBEROS_OPTIONS();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration62 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration62.refresh();
        java.util.HashMap<java.lang.String, java.lang.String> strMap64 = kerberosUserConfiguration62.getoptions();
        kerberosUserConfiguration57.options = strMap64;
        java.lang.String str66 = kerberosUserConfiguration57.getType();
        java.util.HashMap<java.lang.String, java.lang.String> strMap67 = kerberosUserConfiguration57.options;
        kerberosUserConfiguration23.options = strMap67;
        kerberosUserConfiguration10.setoptions(strMap67);
        kerberosUserConfiguration1.options = strMap67;
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters72 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray19);
        org.junit.Assert.assertNull(strMap26);
        org.junit.Assert.assertNull(strMap31);
        org.junit.Assert.assertNull(strMap32);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertNull(strMap42);
        org.junit.Assert.assertNull(strMap47);
        org.junit.Assert.assertNull(strMap48);
        org.junit.Assert.assertNotNull(strMap49);
        org.junit.Assert.assertNotNull(strMap53);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNull(provider59);
        org.junit.Assert.assertNotNull(strMap60);
        org.junit.Assert.assertNotNull(strMap64);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNotNull(strMap67);
        org.junit.Assert.assertNull(parameters72);
    }

    @Test
    public void test13562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13562");
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!", "", "", "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17);
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test13563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13563");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap1 = null;
        kerberosUserConfiguration0.setoptions(strMap1);
        java.util.HashMap<java.lang.String, java.lang.String> strMap3 = kerberosUserConfiguration0.options;
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration5 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration5.refresh();
        kerberosUserConfiguration5.refresh();
        java.util.HashMap<java.lang.String, java.lang.String> strMap8 = kerberosUserConfiguration5.getoptions();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration9 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap10 = null;
        kerberosUserConfiguration9.setoptions(strMap10);
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration9.getParameters();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration14 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration14.refresh();
        java.security.Provider provider16 = kerberosUserConfiguration14.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap17 = kerberosUserConfiguration14.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration9.setoptions(strMap17);
        kerberosUserConfiguration5.options = strMap17;
        kerberosUserConfiguration0.options = strMap17;
        kerberosUserConfiguration0.refresh();
        java.lang.String str22 = kerberosUserConfiguration0.getType();
        java.security.Provider provider23 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters24 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray26 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration27 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap28 = kerberosUserConfiguration27.options;
        java.lang.String str29 = kerberosUserConfiguration27.getType();
        java.util.HashMap<java.lang.String, java.lang.String> strMap30 = kerberosUserConfiguration27.options;
        kerberosUserConfiguration27.refresh();
        java.util.HashMap<java.lang.String, java.lang.String> strMap32 = kerberosUserConfiguration27.getoptions();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration34 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration34.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration34);
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration37 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap38 = null;
        kerberosUserConfiguration37.setoptions(strMap38);
        java.util.HashMap<java.lang.String, java.lang.String> strMap40 = kerberosUserConfiguration37.options;
        kerberosUserConfiguration37.refresh();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration42 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap43 = null;
        kerberosUserConfiguration42.setoptions(strMap43);
        java.util.HashMap<java.lang.String, java.lang.String> strMap45 = kerberosUserConfiguration42.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap46 = kerberosUserConfiguration42.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap47 = kerberosUserConfiguration42.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration37.options = strMap47;
        kerberosUserConfiguration34.setoptions(strMap47);
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration51 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration51.refresh();
        java.security.Provider provider53 = kerberosUserConfiguration51.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap54 = kerberosUserConfiguration51.getDEFAULT_KERBEROS_OPTIONS();
        java.util.HashMap<java.lang.String, java.lang.String> strMap55 = kerberosUserConfiguration51.getoptions();
        kerberosUserConfiguration34.options = strMap55;
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray58 = kerberosUserConfiguration34.getAppConfigurationEntry("");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration59 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap60 = null;
        kerberosUserConfiguration59.setoptions(strMap60);
        java.util.HashMap<java.lang.String, java.lang.String> strMap62 = kerberosUserConfiguration59.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap63 = kerberosUserConfiguration59.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap64 = kerberosUserConfiguration59.getDEFAULT_KERBEROS_OPTIONS();
        java.util.HashMap<java.lang.String, java.lang.String> strMap65 = kerberosUserConfiguration59.getDEFAULT_KERBEROS_OPTIONS();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration67 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration67.refresh();
        java.security.Provider provider69 = kerberosUserConfiguration67.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap70 = kerberosUserConfiguration67.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration59.setoptions(strMap70);
        java.util.HashMap<java.lang.String, java.lang.String> strMap72 = kerberosUserConfiguration59.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration34.options = strMap72;
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray75 = kerberosUserConfiguration34.getAppConfigurationEntry("hi!");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration76 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap77 = null;
        kerberosUserConfiguration76.setoptions(strMap77);
        java.util.HashMap<java.lang.String, java.lang.String> strMap79 = kerberosUserConfiguration76.options;
        kerberosUserConfiguration76.refresh();
        kerberosUserConfiguration76.refresh();
        java.security.Provider provider82 = kerberosUserConfiguration76.getProvider();
        java.lang.String str83 = kerberosUserConfiguration76.getType();
        java.security.Provider provider84 = kerberosUserConfiguration76.getProvider();
        java.security.Provider provider85 = kerberosUserConfiguration76.getProvider();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration87 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.util.HashMap<java.lang.String, java.lang.String> strMap88 = kerberosUserConfiguration87.getDEFAULT_KERBEROS_OPTIONS();
        java.security.Provider provider89 = kerberosUserConfiguration87.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray91 = kerberosUserConfiguration87.getAppConfigurationEntry("");
        java.util.HashMap<java.lang.String, java.lang.String> strMap92 = kerberosUserConfiguration87.options;
        kerberosUserConfiguration76.options = strMap92;
        kerberosUserConfiguration34.setoptions(strMap92);
        kerberosUserConfiguration27.setoptions(strMap92);
        kerberosUserConfiguration0.options = strMap92;
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(provider23);
        org.junit.Assert.assertNull(parameters24);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray26);
        org.junit.Assert.assertNull(strMap28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(strMap30);
        org.junit.Assert.assertNull(strMap32);
        org.junit.Assert.assertNull(strMap40);
        org.junit.Assert.assertNull(strMap45);
        org.junit.Assert.assertNull(strMap46);
        org.junit.Assert.assertNotNull(strMap47);
        org.junit.Assert.assertNull(provider53);
        org.junit.Assert.assertNotNull(strMap54);
        org.junit.Assert.assertNotNull(strMap55);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray58);
        org.junit.Assert.assertNull(strMap62);
        org.junit.Assert.assertNull(strMap63);
        org.junit.Assert.assertNotNull(strMap64);
        org.junit.Assert.assertNotNull(strMap65);
        org.junit.Assert.assertNull(provider69);
        org.junit.Assert.assertNotNull(strMap70);
        org.junit.Assert.assertNotNull(strMap72);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray75);
        org.junit.Assert.assertNull(strMap79);
        org.junit.Assert.assertNull(provider82);
        org.junit.Assert.assertNull(str83);
        org.junit.Assert.assertNull(provider84);
        org.junit.Assert.assertNull(provider85);
        org.junit.Assert.assertNotNull(strMap88);
        org.junit.Assert.assertNull(provider89);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray91);
        org.junit.Assert.assertNotNull(strMap92);
    }

    @Test
    public void test13564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13564");
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "", "", "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, false);
        tSSLTransportParameters17.setTrustStore("", "");
        tSSLTransportParameters17.setTrustStore("hi!", "", "hi!", "");
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test13565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13565");
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!", "", "", "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15);
        tSSLTransportParameters29.setTrustStore("hi!", "", "hi!", "");
        tSSLTransportParameters29.setKeyStore("hi!", "", "", "hi!");
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test13566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13566");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.util.HashMap<java.lang.String, java.lang.String> strMap3 = kerberosUserConfiguration1.getoptions();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.util.HashMap<java.lang.String, java.lang.String> strMap5 = kerberosUserConfiguration1.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap6 = kerberosUserConfiguration1.getoptions();
        kerberosUserConfiguration1.refresh();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration10 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap11 = kerberosUserConfiguration10.getDEFAULT_KERBEROS_OPTIONS();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration13 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration13.refresh();
        java.security.Provider provider15 = kerberosUserConfiguration13.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap16 = kerberosUserConfiguration13.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration10.setoptions(strMap16);
        java.security.Provider provider18 = kerberosUserConfiguration10.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration10);
        java.lang.String str20 = kerberosUserConfiguration10.getType();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration21 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap22 = null;
        kerberosUserConfiguration21.setoptions(strMap22);
        java.util.HashMap<java.lang.String, java.lang.String> strMap24 = kerberosUserConfiguration21.options;
        kerberosUserConfiguration21.refresh();
        kerberosUserConfiguration21.refresh();
        java.util.HashMap<java.lang.String, java.lang.String> strMap27 = kerberosUserConfiguration21.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap28 = kerberosUserConfiguration21.getDEFAULT_KERBEROS_OPTIONS();
        java.util.HashMap<java.lang.String, java.lang.String> strMap29 = kerberosUserConfiguration21.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration10.options = strMap29;
        kerberosUserConfiguration1.setoptions(strMap29);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(provider18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(strMap24);
        org.junit.Assert.assertNull(strMap27);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNotNull(strMap29);
    }

    @Test
    public void test13567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13567");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap1 = null;
        kerberosUserConfiguration0.setoptions(strMap1);
        java.util.HashMap<java.lang.String, java.lang.String> strMap3 = kerberosUserConfiguration0.options;
        kerberosUserConfiguration0.refresh();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration5 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap6 = null;
        kerberosUserConfiguration5.setoptions(strMap6);
        java.util.HashMap<java.lang.String, java.lang.String> strMap8 = kerberosUserConfiguration5.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap9 = kerberosUserConfiguration5.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap10 = kerberosUserConfiguration5.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration0.options = strMap10;
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.util.HashMap<java.lang.String, java.lang.String> strMap15 = kerberosUserConfiguration0.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap16 = kerberosUserConfiguration0.getoptions();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration18 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration18);
        java.util.HashMap<java.lang.String, java.lang.String> strMap20 = kerberosUserConfiguration18.getoptions();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration21 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap22 = null;
        kerberosUserConfiguration21.setoptions(strMap22);
        java.util.HashMap<java.lang.String, java.lang.String> strMap24 = kerberosUserConfiguration21.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap25 = kerberosUserConfiguration21.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap26 = kerberosUserConfiguration21.getDEFAULT_KERBEROS_OPTIONS();
        java.util.HashMap<java.lang.String, java.lang.String> strMap27 = kerberosUserConfiguration21.getDEFAULT_KERBEROS_OPTIONS();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration28 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap29 = null;
        kerberosUserConfiguration28.setoptions(strMap29);
        java.util.HashMap<java.lang.String, java.lang.String> strMap31 = kerberosUserConfiguration28.options;
        kerberosUserConfiguration28.refresh();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration33 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap34 = kerberosUserConfiguration33.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap35 = null;
        kerberosUserConfiguration33.options = strMap35;
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration37 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap38 = kerberosUserConfiguration37.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration33.setoptions(strMap38);
        kerberosUserConfiguration28.setoptions(strMap38);
        kerberosUserConfiguration21.options = strMap38;
        java.util.HashMap<java.lang.String, java.lang.String> strMap42 = kerberosUserConfiguration21.getoptions();
        kerberosUserConfiguration18.setoptions(strMap42);
        kerberosUserConfiguration0.options = strMap42;
        java.util.HashMap<java.lang.String, java.lang.String> strMap45 = kerberosUserConfiguration0.getoptions();
        javax.security.auth.login.Configuration.Parameters parameters46 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        java.lang.String str49 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNull(strMap24);
        org.junit.Assert.assertNull(strMap25);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNull(strMap31);
        org.junit.Assert.assertNull(strMap34);
        org.junit.Assert.assertNotNull(strMap38);
        org.junit.Assert.assertNotNull(strMap42);
        org.junit.Assert.assertNotNull(strMap45);
        org.junit.Assert.assertNull(parameters46);
        org.junit.Assert.assertNull(str49);
    }

    @Test
    public void test13568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13568");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.util.HashMap<java.lang.String, java.lang.String> strMap5 = kerberosUserConfiguration1.options;
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.util.HashMap<java.lang.String, java.lang.String> strMap7 = kerberosUserConfiguration1.getDEFAULT_KERBEROS_OPTIONS();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(strMap7);
    }

    @Test
    public void test13569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13569");
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, true);
        tSSLTransportParameters28.setKeyStore("hi!", "", "hi!", "");
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test13570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13570");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.util.HashMap<java.lang.String, java.lang.String> strMap2 = kerberosUserConfiguration1.getDEFAULT_KERBEROS_OPTIONS();
        java.security.Provider provider3 = kerberosUserConfiguration1.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap4 = kerberosUserConfiguration1.getDEFAULT_KERBEROS_OPTIONS();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(strMap4);
    }

    @Test
    public void test13571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13571");
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "", "", "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, true);
        tSSLTransportParameters20.setKeyStore("", "hi!");
        tSSLTransportParameters20.setTrustStore("hi!", "");
        tSSLTransportParameters20.setKeyStore("hi!", "", "", "");
        tSSLTransportParameters20.setTrustStore("", "");
        tSSLTransportParameters20.setTrustStore("", "", "hi!", "");
        tSSLTransportParameters20.setKeyStore("", "");
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test13572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13572");
        java.lang.String[] strArray19 = new java.lang.String[] { "", "hi!", "", "", "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray19, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters38 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters39 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19);
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test13573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13573");
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "", "", "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16, true);
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test13574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13574");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test13575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13575");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration4 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap5 = null;
        kerberosUserConfiguration4.setoptions(strMap5);
        java.util.HashMap<java.lang.String, java.lang.String> strMap7 = kerberosUserConfiguration4.options;
        kerberosUserConfiguration4.refresh();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration9 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap10 = null;
        kerberosUserConfiguration9.setoptions(strMap10);
        java.util.HashMap<java.lang.String, java.lang.String> strMap12 = kerberosUserConfiguration9.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap13 = kerberosUserConfiguration9.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap14 = kerberosUserConfiguration9.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration4.options = strMap14;
        kerberosUserConfiguration1.setoptions(strMap14);
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration18 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration18.refresh();
        java.security.Provider provider20 = kerberosUserConfiguration18.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap21 = kerberosUserConfiguration18.getDEFAULT_KERBEROS_OPTIONS();
        java.util.HashMap<java.lang.String, java.lang.String> strMap22 = kerberosUserConfiguration18.getoptions();
        kerberosUserConfiguration1.options = strMap22;
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray25 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration26 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap27 = null;
        kerberosUserConfiguration26.setoptions(strMap27);
        java.util.HashMap<java.lang.String, java.lang.String> strMap29 = kerberosUserConfiguration26.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap30 = kerberosUserConfiguration26.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap31 = kerberosUserConfiguration26.getDEFAULT_KERBEROS_OPTIONS();
        java.util.HashMap<java.lang.String, java.lang.String> strMap32 = kerberosUserConfiguration26.getDEFAULT_KERBEROS_OPTIONS();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration34 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration34.refresh();
        java.security.Provider provider36 = kerberosUserConfiguration34.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap37 = kerberosUserConfiguration34.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration26.setoptions(strMap37);
        java.util.HashMap<java.lang.String, java.lang.String> strMap39 = kerberosUserConfiguration26.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration1.options = strMap39;
        java.util.HashMap<java.lang.String, java.lang.String> strMap41 = kerberosUserConfiguration1.getoptions();
        java.lang.String str42 = kerberosUserConfiguration1.getType();
        java.util.HashMap<java.lang.String, java.lang.String> strMap43 = kerberosUserConfiguration1.getoptions();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.util.HashMap<java.lang.String, java.lang.String> strMap45 = null;
        kerberosUserConfiguration1.setoptions(strMap45);
        java.lang.String str47 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(provider20);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray25);
        org.junit.Assert.assertNull(strMap29);
        org.junit.Assert.assertNull(strMap30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNull(provider36);
        org.junit.Assert.assertNotNull(strMap37);
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertNotNull(strMap41);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(strMap43);
        org.junit.Assert.assertNull(str47);
    }

    @Test
    public void test13576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13576");
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        tSSLTransportParameters30.setTrustStore("", "");
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test13577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13577");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap1 = null;
        kerberosUserConfiguration0.setoptions(strMap1);
        java.util.HashMap<java.lang.String, java.lang.String> strMap3 = kerberosUserConfiguration0.options;
        kerberosUserConfiguration0.refresh();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration5 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap6 = null;
        kerberosUserConfiguration5.setoptions(strMap6);
        java.util.HashMap<java.lang.String, java.lang.String> strMap8 = kerberosUserConfiguration5.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap9 = kerberosUserConfiguration5.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap10 = kerberosUserConfiguration5.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration0.options = strMap10;
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.util.HashMap<java.lang.String, java.lang.String> strMap15 = kerberosUserConfiguration0.getDEFAULT_KERBEROS_OPTIONS();
        java.lang.String str16 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray19 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.util.HashMap<java.lang.String, java.lang.String> strMap20 = kerberosUserConfiguration0.getoptions();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray22 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration23 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap24 = null;
        kerberosUserConfiguration23.setoptions(strMap24);
        java.util.HashMap<java.lang.String, java.lang.String> strMap26 = kerberosUserConfiguration23.options;
        kerberosUserConfiguration23.refresh();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration28 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap29 = null;
        kerberosUserConfiguration28.setoptions(strMap29);
        java.util.HashMap<java.lang.String, java.lang.String> strMap31 = kerberosUserConfiguration28.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap32 = kerberosUserConfiguration28.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap33 = kerberosUserConfiguration28.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration23.options = strMap33;
        javax.security.auth.login.Configuration.Parameters parameters35 = kerberosUserConfiguration23.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray37 = kerberosUserConfiguration23.getAppConfigurationEntry("hi!");
        java.util.HashMap<java.lang.String, java.lang.String> strMap38 = kerberosUserConfiguration23.getoptions();
        java.security.Provider provider39 = kerberosUserConfiguration23.getProvider();
        java.lang.String str40 = kerberosUserConfiguration23.getType();
        java.util.HashMap<java.lang.String, java.lang.String> strMap41 = kerberosUserConfiguration23.getoptions();
        javax.security.auth.login.Configuration.Parameters parameters42 = kerberosUserConfiguration23.getParameters();
        java.security.Provider provider43 = kerberosUserConfiguration23.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap44 = kerberosUserConfiguration23.getDEFAULT_KERBEROS_OPTIONS();
        java.util.HashMap<java.lang.String, java.lang.String> strMap45 = kerberosUserConfiguration23.getoptions();
        kerberosUserConfiguration0.options = strMap45;
        java.util.HashMap<java.lang.String, java.lang.String> strMap47 = kerberosUserConfiguration0.getoptions();
        java.security.Provider provider48 = kerberosUserConfiguration0.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap49 = kerberosUserConfiguration0.getoptions();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray19);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray22);
        org.junit.Assert.assertNull(strMap26);
        org.junit.Assert.assertNull(strMap31);
        org.junit.Assert.assertNull(strMap32);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertNull(parameters35);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray37);
        org.junit.Assert.assertNotNull(strMap38);
        org.junit.Assert.assertNull(provider39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(strMap41);
        org.junit.Assert.assertNull(parameters42);
        org.junit.Assert.assertNull(provider43);
        org.junit.Assert.assertNotNull(strMap44);
        org.junit.Assert.assertNotNull(strMap45);
        org.junit.Assert.assertNotNull(strMap47);
        org.junit.Assert.assertNull(provider48);
        org.junit.Assert.assertNotNull(strMap49);
    }

    @Test
    public void test13578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13578");
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "", "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters9 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray8, true);
        tSSLTransportParameters11.setKeyStore("", "");
        tSSLTransportParameters11.setKeyStore("hi!", "");
        tSSLTransportParameters11.requireClientAuth(false);
        tSSLTransportParameters11.setTrustStore("", "");
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test13579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13579");
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "", "", "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        tSSLTransportParameters22.setKeyStore("", "hi!", "", "");
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test13580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13580");
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "", "", "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test13581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13581");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap1 = null;
        kerberosUserConfiguration0.setoptions(strMap1);
        java.util.HashMap<java.lang.String, java.lang.String> strMap3 = kerberosUserConfiguration0.options;
        kerberosUserConfiguration0.refresh();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration5 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap6 = null;
        kerberosUserConfiguration5.setoptions(strMap6);
        java.util.HashMap<java.lang.String, java.lang.String> strMap8 = kerberosUserConfiguration5.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap9 = kerberosUserConfiguration5.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap10 = kerberosUserConfiguration5.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration0.options = strMap10;
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.util.HashMap<java.lang.String, java.lang.String> strMap15 = kerberosUserConfiguration0.getDEFAULT_KERBEROS_OPTIONS();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration17 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration17.refresh();
        java.security.Provider provider19 = kerberosUserConfiguration17.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap20 = kerberosUserConfiguration17.getDEFAULT_KERBEROS_OPTIONS();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration22 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration22.refresh();
        java.security.Provider provider24 = kerberosUserConfiguration22.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap25 = kerberosUserConfiguration22.getDEFAULT_KERBEROS_OPTIONS();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration27 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration27.refresh();
        java.util.HashMap<java.lang.String, java.lang.String> strMap29 = kerberosUserConfiguration27.getoptions();
        kerberosUserConfiguration22.options = strMap29;
        kerberosUserConfiguration17.options = strMap29;
        javax.security.auth.login.Configuration.Parameters parameters32 = kerberosUserConfiguration17.getParameters();
        java.util.HashMap<java.lang.String, java.lang.String> strMap33 = kerberosUserConfiguration17.options;
        kerberosUserConfiguration0.setoptions(strMap33);
        java.security.Provider provider35 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration37 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap38 = kerberosUserConfiguration37.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap39 = null;
        kerberosUserConfiguration37.options = strMap39;
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration41 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap42 = kerberosUserConfiguration41.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration37.setoptions(strMap42);
        kerberosUserConfiguration0.options = strMap42;
        java.lang.String str45 = kerberosUserConfiguration0.getType();
        java.util.HashMap<java.lang.String, java.lang.String> strMap46 = kerberosUserConfiguration0.options;
        javax.security.auth.login.Configuration.Parameters parameters47 = kerberosUserConfiguration0.getParameters();
        java.lang.Class<?> wildcardClass48 = kerberosUserConfiguration0.getClass();
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(provider19);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNull(provider24);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertNull(parameters32);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertNull(provider35);
        org.junit.Assert.assertNull(strMap38);
        org.junit.Assert.assertNotNull(strMap42);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(strMap46);
        org.junit.Assert.assertNull(parameters47);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test13582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13582");
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!", "", "", "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray17);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray17);
        tSSLTransportParameters32.requireClientAuth(true);
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test13583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13583");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration6 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.util.HashMap<java.lang.String, java.lang.String> strMap7 = kerberosUserConfiguration6.getoptions();
        java.security.Provider provider8 = kerberosUserConfiguration6.getProvider();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration10 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration10.refresh();
        java.util.HashMap<java.lang.String, java.lang.String> strMap12 = kerberosUserConfiguration10.getoptions();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration10);
        java.util.HashMap<java.lang.String, java.lang.String> strMap14 = kerberosUserConfiguration10.options;
        java.security.Provider provider15 = kerberosUserConfiguration10.getProvider();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration16 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap17 = null;
        kerberosUserConfiguration16.setoptions(strMap17);
        java.util.HashMap<java.lang.String, java.lang.String> strMap19 = kerberosUserConfiguration16.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap20 = kerberosUserConfiguration16.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap21 = kerberosUserConfiguration16.getDEFAULT_KERBEROS_OPTIONS();
        java.util.HashMap<java.lang.String, java.lang.String> strMap22 = kerberosUserConfiguration16.getDEFAULT_KERBEROS_OPTIONS();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration23 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap24 = null;
        kerberosUserConfiguration23.setoptions(strMap24);
        java.util.HashMap<java.lang.String, java.lang.String> strMap26 = kerberosUserConfiguration23.options;
        java.lang.String str27 = kerberosUserConfiguration23.getType();
        java.util.HashMap<java.lang.String, java.lang.String> strMap28 = kerberosUserConfiguration23.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration16.setoptions(strMap28);
        kerberosUserConfiguration10.setoptions(strMap28);
        kerberosUserConfiguration10.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray33 = kerberosUserConfiguration10.getAppConfigurationEntry("hi!");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration34 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap35 = kerberosUserConfiguration34.getDEFAULT_KERBEROS_OPTIONS();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration34);
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration38 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration38.refresh();
        java.security.Provider provider40 = kerberosUserConfiguration38.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap41 = kerberosUserConfiguration38.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration34.setoptions(strMap41);
        java.util.HashMap<java.lang.String, java.lang.String> strMap43 = kerberosUserConfiguration34.options;
        java.lang.String str44 = kerberosUserConfiguration34.getType();
        kerberosUserConfiguration34.refresh();
        java.util.HashMap<java.lang.String, java.lang.String> strMap46 = kerberosUserConfiguration34.getDEFAULT_KERBEROS_OPTIONS();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray48 = kerberosUserConfiguration34.getAppConfigurationEntry("hi!");
        java.util.HashMap<java.lang.String, java.lang.String> strMap49 = kerberosUserConfiguration34.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration10.options = strMap49;
        java.util.HashMap<java.lang.String, java.lang.String> strMap51 = kerberosUserConfiguration10.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap52 = kerberosUserConfiguration10.getoptions();
        kerberosUserConfiguration6.setoptions(strMap52);
        kerberosUserConfiguration1.options = strMap52;
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(strMap19);
        org.junit.Assert.assertNull(strMap20);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNull(strMap26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray33);
        org.junit.Assert.assertNotNull(strMap35);
        org.junit.Assert.assertNull(provider40);
        org.junit.Assert.assertNotNull(strMap41);
        org.junit.Assert.assertNotNull(strMap43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(strMap46);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray48);
        org.junit.Assert.assertNotNull(strMap49);
        org.junit.Assert.assertNotNull(strMap51);
        org.junit.Assert.assertNotNull(strMap52);
    }

    @Test
    public void test13584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13584");
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "", "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test13585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13585");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap1 = null;
        kerberosUserConfiguration0.setoptions(strMap1);
        java.util.HashMap<java.lang.String, java.lang.String> strMap3 = kerberosUserConfiguration0.options;
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration0.getParameters();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration9 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration9.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration9.getAppConfigurationEntry("");
        java.util.HashMap<java.lang.String, java.lang.String> strMap14 = kerberosUserConfiguration9.options;
        kerberosUserConfiguration0.options = strMap14;
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test13586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13586");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap1 = null;
        kerberosUserConfiguration0.setoptions(strMap1);
        java.util.HashMap<java.lang.String, java.lang.String> strMap3 = kerberosUserConfiguration0.options;
        kerberosUserConfiguration0.refresh();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration5 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap6 = null;
        kerberosUserConfiguration5.setoptions(strMap6);
        java.util.HashMap<java.lang.String, java.lang.String> strMap8 = kerberosUserConfiguration5.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap9 = kerberosUserConfiguration5.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap10 = kerberosUserConfiguration5.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration0.options = strMap10;
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.util.HashMap<java.lang.String, java.lang.String> strMap15 = kerberosUserConfiguration0.getDEFAULT_KERBEROS_OPTIONS();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration17 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration17.refresh();
        java.security.Provider provider19 = kerberosUserConfiguration17.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap20 = kerberosUserConfiguration17.getDEFAULT_KERBEROS_OPTIONS();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration22 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration22.refresh();
        java.security.Provider provider24 = kerberosUserConfiguration22.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap25 = kerberosUserConfiguration22.getDEFAULT_KERBEROS_OPTIONS();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration27 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration27.refresh();
        java.util.HashMap<java.lang.String, java.lang.String> strMap29 = kerberosUserConfiguration27.getoptions();
        kerberosUserConfiguration22.options = strMap29;
        kerberosUserConfiguration17.options = strMap29;
        javax.security.auth.login.Configuration.Parameters parameters32 = kerberosUserConfiguration17.getParameters();
        java.util.HashMap<java.lang.String, java.lang.String> strMap33 = kerberosUserConfiguration17.options;
        kerberosUserConfiguration0.setoptions(strMap33);
        java.security.Provider provider35 = kerberosUserConfiguration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters36 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray38 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray40 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.util.HashMap<java.lang.String, java.lang.String> strMap41 = kerberosUserConfiguration0.getDEFAULT_KERBEROS_OPTIONS();
        java.util.HashMap<java.lang.String, java.lang.String> strMap42 = kerberosUserConfiguration0.options;
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration44 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration44.refresh();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration46 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap47 = kerberosUserConfiguration46.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration44.setoptions(strMap47);
        java.util.HashMap<java.lang.String, java.lang.String> strMap49 = kerberosUserConfiguration44.options;
        kerberosUserConfiguration0.options = strMap49;
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray52 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray54 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(provider19);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNull(provider24);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertNull(parameters32);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertNull(provider35);
        org.junit.Assert.assertNull(parameters36);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray38);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray40);
        org.junit.Assert.assertNotNull(strMap41);
        org.junit.Assert.assertNotNull(strMap42);
        org.junit.Assert.assertNotNull(strMap47);
        org.junit.Assert.assertNotNull(strMap49);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray52);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray54);
    }

    @Test
    public void test13587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13587");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap1 = null;
        kerberosUserConfiguration0.setoptions(strMap1);
        java.util.HashMap<java.lang.String, java.lang.String> strMap3 = kerberosUserConfiguration0.options;
        kerberosUserConfiguration0.refresh();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration5 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap6 = null;
        kerberosUserConfiguration5.setoptions(strMap6);
        java.util.HashMap<java.lang.String, java.lang.String> strMap8 = kerberosUserConfiguration5.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap9 = kerberosUserConfiguration5.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap10 = kerberosUserConfiguration5.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration0.options = strMap10;
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.util.HashMap<java.lang.String, java.lang.String> strMap15 = kerberosUserConfiguration0.options;
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration19 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap20 = kerberosUserConfiguration19.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration0.options = strMap20;
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration22 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap23 = null;
        kerberosUserConfiguration22.setoptions(strMap23);
        javax.security.auth.login.Configuration.Parameters parameters25 = kerberosUserConfiguration22.getParameters();
        java.util.HashMap<java.lang.String, java.lang.String> strMap26 = kerberosUserConfiguration22.getDEFAULT_KERBEROS_OPTIONS();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration22);
        java.util.HashMap<java.lang.String, java.lang.String> strMap28 = kerberosUserConfiguration22.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration0.options = strMap28;
        java.util.HashMap<java.lang.String, java.lang.String> strMap30 = null;
        kerberosUserConfiguration0.setoptions(strMap30);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNull(parameters25);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNotNull(strMap28);
    }

    @Test
    public void test13588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13588");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration7 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration7.getParameters();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration9 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap10 = null;
        kerberosUserConfiguration9.setoptions(strMap10);
        java.util.HashMap<java.lang.String, java.lang.String> strMap12 = kerberosUserConfiguration9.options;
        kerberosUserConfiguration9.refresh();
        kerberosUserConfiguration9.refresh();
        java.util.HashMap<java.lang.String, java.lang.String> strMap15 = kerberosUserConfiguration9.getoptions();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration16 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap17 = kerberosUserConfiguration16.getDEFAULT_KERBEROS_OPTIONS();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration16);
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration20 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration20.refresh();
        java.security.Provider provider22 = kerberosUserConfiguration20.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap23 = kerberosUserConfiguration20.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration16.setoptions(strMap23);
        kerberosUserConfiguration9.options = strMap23;
        kerberosUserConfiguration7.options = strMap23;
        java.util.HashMap<java.lang.String, java.lang.String> strMap27 = kerberosUserConfiguration7.getoptions();
        kerberosUserConfiguration1.setoptions(strMap27);
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration29 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap30 = kerberosUserConfiguration29.options;
        java.lang.String str31 = kerberosUserConfiguration29.getType();
        java.util.HashMap<java.lang.String, java.lang.String> strMap32 = kerberosUserConfiguration29.options;
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration33 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap34 = null;
        kerberosUserConfiguration33.setoptions(strMap34);
        java.util.HashMap<java.lang.String, java.lang.String> strMap36 = kerberosUserConfiguration33.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap37 = kerberosUserConfiguration33.getoptions();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration38 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap39 = kerberosUserConfiguration38.getDEFAULT_KERBEROS_OPTIONS();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration38);
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration42 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration42.refresh();
        java.security.Provider provider44 = kerberosUserConfiguration42.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap45 = kerberosUserConfiguration42.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration38.setoptions(strMap45);
        kerberosUserConfiguration33.setoptions(strMap45);
        kerberosUserConfiguration29.options = strMap45;
        java.util.HashMap<java.lang.String, java.lang.String> strMap49 = kerberosUserConfiguration29.options;
        kerberosUserConfiguration1.options = strMap49;
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray52 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNull(provider22);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNull(strMap30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(strMap32);
        org.junit.Assert.assertNull(strMap36);
        org.junit.Assert.assertNull(strMap37);
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertNull(provider44);
        org.junit.Assert.assertNotNull(strMap45);
        org.junit.Assert.assertNotNull(strMap49);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray52);
    }

    @Test
    public void test13589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13589");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap1 = kerberosUserConfiguration0.options;
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration3 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration3.refresh();
        java.security.Provider provider5 = kerberosUserConfiguration3.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap6 = kerberosUserConfiguration3.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration0.setoptions(strMap6);
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        java.util.HashMap<java.lang.String, java.lang.String> strMap10 = kerberosUserConfiguration0.getDEFAULT_KERBEROS_OPTIONS();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration12 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration12.refresh();
        java.security.Provider provider14 = kerberosUserConfiguration12.getProvider();
        java.security.Provider provider15 = kerberosUserConfiguration12.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap16 = kerberosUserConfiguration12.options;
        kerberosUserConfiguration0.setoptions(strMap16);
        javax.security.auth.login.Configuration.Parameters parameters18 = kerberosUserConfiguration0.getParameters();
        java.util.HashMap<java.lang.String, java.lang.String> strMap19 = kerberosUserConfiguration0.getoptions();
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(parameters18);
        org.junit.Assert.assertNotNull(strMap19);
    }

    @Test
    public void test13590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13590");
        java.lang.String[] strArray19 = new java.lang.String[] { "", "hi!", "", "", "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray19, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters39 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters40 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19);
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test13591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13591");
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "", "", "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        tSSLTransportParameters21.setKeyStore("hi!", "");
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test13592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13592");
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "", "", "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray16, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray16);
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test13593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13593");
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!", "", "", "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test13594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13594");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap1 = null;
        kerberosUserConfiguration0.setoptions(strMap1);
        java.util.HashMap<java.lang.String, java.lang.String> strMap3 = kerberosUserConfiguration0.options;
        kerberosUserConfiguration0.refresh();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration5 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap6 = null;
        kerberosUserConfiguration5.setoptions(strMap6);
        java.util.HashMap<java.lang.String, java.lang.String> strMap8 = kerberosUserConfiguration5.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap9 = kerberosUserConfiguration5.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap10 = kerberosUserConfiguration5.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration0.options = strMap10;
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.util.HashMap<java.lang.String, java.lang.String> strMap15 = kerberosUserConfiguration0.options;
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration19 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap20 = kerberosUserConfiguration19.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration0.options = strMap20;
        java.lang.String str22 = kerberosUserConfiguration0.getType();
        java.util.HashMap<java.lang.String, java.lang.String> strMap23 = null;
        kerberosUserConfiguration0.setoptions(strMap23);
        java.util.HashMap<java.lang.String, java.lang.String> strMap25 = kerberosUserConfiguration0.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap26 = null;
        kerberosUserConfiguration0.options = strMap26;
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(strMap25);
    }

    @Test
    public void test13595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13595");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration1.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap4 = kerberosUserConfiguration1.getDEFAULT_KERBEROS_OPTIONS();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration6 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration6.refresh();
        java.util.HashMap<java.lang.String, java.lang.String> strMap8 = kerberosUserConfiguration6.getoptions();
        kerberosUserConfiguration1.options = strMap8;
        java.util.HashMap<java.lang.String, java.lang.String> strMap10 = kerberosUserConfiguration1.getDEFAULT_KERBEROS_OPTIONS();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.util.HashMap<java.lang.String, java.lang.String> strMap13 = kerberosUserConfiguration1.options;
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test13596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13596");
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "", "", "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters10 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray8, false);
        tSSLTransportParameters12.setKeyStore("hi!", "hi!");
        tSSLTransportParameters12.requireClientAuth(true);
        tSSLTransportParameters12.requireClientAuth(true);
        tSSLTransportParameters12.setKeyStore("hi!", "", "hi!", "");
        tSSLTransportParameters12.setTrustStore("", "");
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test13597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13597");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap1 = kerberosUserConfiguration0.getoptions();
        kerberosUserConfiguration0.refresh();
        java.util.HashMap<java.lang.String, java.lang.String> strMap3 = kerberosUserConfiguration0.getDEFAULT_KERBEROS_OPTIONS();
        java.security.Provider provider4 = kerberosUserConfiguration0.getProvider();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration6 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration6.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration6.getAppConfigurationEntry("");
        java.util.HashMap<java.lang.String, java.lang.String> strMap10 = kerberosUserConfiguration6.options;
        kerberosUserConfiguration0.options = strMap10;
        java.security.Provider provider12 = kerberosUserConfiguration0.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap13 = kerberosUserConfiguration0.options;
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test13598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13598");
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "", "", "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        tSSLTransportParameters24.requireClientAuth(true);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test13599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13599");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap1 = null;
        kerberosUserConfiguration0.setoptions(strMap1);
        java.util.HashMap<java.lang.String, java.lang.String> strMap3 = kerberosUserConfiguration0.options;
        kerberosUserConfiguration0.refresh();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration5 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap6 = null;
        kerberosUserConfiguration5.setoptions(strMap6);
        java.util.HashMap<java.lang.String, java.lang.String> strMap8 = kerberosUserConfiguration5.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap9 = kerberosUserConfiguration5.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap10 = kerberosUserConfiguration5.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration0.options = strMap10;
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.util.HashMap<java.lang.String, java.lang.String> strMap15 = kerberosUserConfiguration0.getoptions();
        java.security.Provider provider16 = kerberosUserConfiguration0.getProvider();
        java.lang.String str17 = kerberosUserConfiguration0.getType();
        java.lang.String str18 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test13600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13600");
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!", "", "", "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test13601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13601");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration1.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap4 = kerberosUserConfiguration1.getDEFAULT_KERBEROS_OPTIONS();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration6 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration6.refresh();
        java.security.Provider provider8 = kerberosUserConfiguration6.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap9 = kerberosUserConfiguration6.getDEFAULT_KERBEROS_OPTIONS();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration11 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration11.refresh();
        java.util.HashMap<java.lang.String, java.lang.String> strMap13 = kerberosUserConfiguration11.getoptions();
        kerberosUserConfiguration6.options = strMap13;
        kerberosUserConfiguration1.options = strMap13;
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration19 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap20 = null;
        kerberosUserConfiguration19.setoptions(strMap20);
        java.util.HashMap<java.lang.String, java.lang.String> strMap22 = kerberosUserConfiguration19.options;
        kerberosUserConfiguration19.refresh();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration24 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap25 = null;
        kerberosUserConfiguration24.setoptions(strMap25);
        java.util.HashMap<java.lang.String, java.lang.String> strMap27 = kerberosUserConfiguration24.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap28 = kerberosUserConfiguration24.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap29 = kerberosUserConfiguration24.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration19.options = strMap29;
        javax.security.auth.login.Configuration.Parameters parameters31 = kerberosUserConfiguration19.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray33 = kerberosUserConfiguration19.getAppConfigurationEntry("hi!");
        java.util.HashMap<java.lang.String, java.lang.String> strMap34 = kerberosUserConfiguration19.getDEFAULT_KERBEROS_OPTIONS();
        java.lang.String str35 = kerberosUserConfiguration19.getType();
        java.lang.String str36 = kerberosUserConfiguration19.getType();
        java.util.HashMap<java.lang.String, java.lang.String> strMap37 = kerberosUserConfiguration19.getoptions();
        kerberosUserConfiguration1.setoptions(strMap37);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray40 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters41 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNull(strMap22);
        org.junit.Assert.assertNull(strMap27);
        org.junit.Assert.assertNull(strMap28);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertNull(parameters31);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray33);
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(strMap37);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray40);
        org.junit.Assert.assertNull(parameters41);
    }

    @Test
    public void test13602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13602");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap1 = null;
        kerberosUserConfiguration0.setoptions(strMap1);
        java.util.HashMap<java.lang.String, java.lang.String> strMap3 = kerberosUserConfiguration0.options;
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration5 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration5.refresh();
        kerberosUserConfiguration5.refresh();
        java.util.HashMap<java.lang.String, java.lang.String> strMap8 = kerberosUserConfiguration5.getoptions();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration9 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap10 = null;
        kerberosUserConfiguration9.setoptions(strMap10);
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration9.getParameters();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration14 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration14.refresh();
        java.security.Provider provider16 = kerberosUserConfiguration14.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap17 = kerberosUserConfiguration14.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration9.setoptions(strMap17);
        kerberosUserConfiguration5.options = strMap17;
        kerberosUserConfiguration0.options = strMap17;
        kerberosUserConfiguration0.refresh();
        java.lang.String str22 = kerberosUserConfiguration0.getType();
        java.util.HashMap<java.lang.String, java.lang.String> strMap23 = kerberosUserConfiguration0.options;
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration24 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap25 = null;
        kerberosUserConfiguration24.setoptions(strMap25);
        java.util.HashMap<java.lang.String, java.lang.String> strMap27 = kerberosUserConfiguration24.options;
        kerberosUserConfiguration24.refresh();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration29 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap30 = null;
        kerberosUserConfiguration29.setoptions(strMap30);
        java.util.HashMap<java.lang.String, java.lang.String> strMap32 = kerberosUserConfiguration29.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap33 = kerberosUserConfiguration29.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap34 = kerberosUserConfiguration29.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration24.options = strMap34;
        javax.security.auth.login.Configuration.Parameters parameters36 = kerberosUserConfiguration24.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray38 = kerberosUserConfiguration24.getAppConfigurationEntry("hi!");
        java.util.HashMap<java.lang.String, java.lang.String> strMap39 = kerberosUserConfiguration24.getoptions();
        java.security.Provider provider40 = kerberosUserConfiguration24.getProvider();
        java.lang.String str41 = kerberosUserConfiguration24.getType();
        java.util.HashMap<java.lang.String, java.lang.String> strMap42 = kerberosUserConfiguration24.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap43 = kerberosUserConfiguration24.options;
        kerberosUserConfiguration0.options = strMap43;
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray46 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        kerberosUserConfiguration0.refresh();
        java.util.HashMap<java.lang.String, java.lang.String> strMap48 = kerberosUserConfiguration0.getoptions();
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNull(strMap27);
        org.junit.Assert.assertNull(strMap32);
        org.junit.Assert.assertNull(strMap33);
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertNull(parameters36);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray38);
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertNull(provider40);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(strMap42);
        org.junit.Assert.assertNotNull(strMap43);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray46);
        org.junit.Assert.assertNotNull(strMap48);
    }

    @Test
    public void test13603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13603");
        java.lang.String[] strArray10 = new java.lang.String[] { "", "", "", "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        tSSLTransportParameters18.setKeyStore("", "hi!");
        tSSLTransportParameters18.requireClientAuth(false);
        java.lang.Class<?> wildcardClass24 = tSSLTransportParameters18.getClass();
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test13604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13604");
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "", "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, true);
        tSSLTransportParameters26.setTrustStore("", "", "", "");
        tSSLTransportParameters26.setTrustStore("", "hi!", "hi!", "hi!");
        tSSLTransportParameters26.setTrustStore("", "hi!", "hi!", "hi!");
        tSSLTransportParameters26.setTrustStore("hi!", "hi!", "", "");
        tSSLTransportParameters26.setKeyStore("hi!", "");
        tSSLTransportParameters26.setKeyStore("hi!", "hi!");
        tSSLTransportParameters26.requireClientAuth(false);
        tSSLTransportParameters26.setKeyStore("", "hi!");
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test13605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13605");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        java.util.HashMap<java.lang.String, java.lang.String> strMap2 = kerberosUserConfiguration0.getDEFAULT_KERBEROS_OPTIONS();
        java.util.HashMap<java.lang.String, java.lang.String> strMap3 = kerberosUserConfiguration0.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap4 = kerberosUserConfiguration0.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap5 = kerberosUserConfiguration0.options;
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(strMap5);
    }

    @Test
    public void test13606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13606");
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!", "", "", "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15);
        tSSLTransportParameters30.requireClientAuth(false);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test13607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13607");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration3 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration3.refresh();
        kerberosUserConfiguration3.refresh();
        java.util.HashMap<java.lang.String, java.lang.String> strMap6 = kerberosUserConfiguration3.getoptions();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration7 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap8 = null;
        kerberosUserConfiguration7.setoptions(strMap8);
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration7.getParameters();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration12 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration12.refresh();
        java.security.Provider provider14 = kerberosUserConfiguration12.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap15 = kerberosUserConfiguration12.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration7.setoptions(strMap15);
        kerberosUserConfiguration3.options = strMap15;
        kerberosUserConfiguration1.setoptions(strMap15);
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration19 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap20 = null;
        kerberosUserConfiguration19.setoptions(strMap20);
        java.util.HashMap<java.lang.String, java.lang.String> strMap22 = kerberosUserConfiguration19.options;
        kerberosUserConfiguration19.refresh();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration24 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap25 = null;
        kerberosUserConfiguration24.setoptions(strMap25);
        java.util.HashMap<java.lang.String, java.lang.String> strMap27 = kerberosUserConfiguration24.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap28 = kerberosUserConfiguration24.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap29 = kerberosUserConfiguration24.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration19.options = strMap29;
        javax.security.auth.login.Configuration.Parameters parameters31 = kerberosUserConfiguration19.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray33 = kerberosUserConfiguration19.getAppConfigurationEntry("hi!");
        java.util.HashMap<java.lang.String, java.lang.String> strMap34 = kerberosUserConfiguration19.getDEFAULT_KERBEROS_OPTIONS();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration36 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration36.refresh();
        java.security.Provider provider38 = kerberosUserConfiguration36.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap39 = kerberosUserConfiguration36.getDEFAULT_KERBEROS_OPTIONS();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration41 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration41.refresh();
        java.security.Provider provider43 = kerberosUserConfiguration41.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap44 = kerberosUserConfiguration41.getDEFAULT_KERBEROS_OPTIONS();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration46 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration46.refresh();
        java.util.HashMap<java.lang.String, java.lang.String> strMap48 = kerberosUserConfiguration46.getoptions();
        kerberosUserConfiguration41.options = strMap48;
        kerberosUserConfiguration36.options = strMap48;
        javax.security.auth.login.Configuration.Parameters parameters51 = kerberosUserConfiguration36.getParameters();
        java.util.HashMap<java.lang.String, java.lang.String> strMap52 = kerberosUserConfiguration36.options;
        kerberosUserConfiguration19.setoptions(strMap52);
        kerberosUserConfiguration1.setoptions(strMap52);
        java.util.HashMap<java.lang.String, java.lang.String> strMap55 = kerberosUserConfiguration1.getDEFAULT_KERBEROS_OPTIONS();
        java.util.HashMap<java.lang.String, java.lang.String> strMap56 = kerberosUserConfiguration1.getoptions();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.util.HashMap<java.lang.String, java.lang.String> strMap58 = kerberosUserConfiguration1.getDEFAULT_KERBEROS_OPTIONS();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray60 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(strMap22);
        org.junit.Assert.assertNull(strMap27);
        org.junit.Assert.assertNull(strMap28);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertNull(parameters31);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray33);
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertNull(provider38);
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertNull(provider43);
        org.junit.Assert.assertNotNull(strMap44);
        org.junit.Assert.assertNotNull(strMap48);
        org.junit.Assert.assertNull(parameters51);
        org.junit.Assert.assertNotNull(strMap52);
        org.junit.Assert.assertNotNull(strMap55);
        org.junit.Assert.assertNotNull(strMap56);
        org.junit.Assert.assertNotNull(strMap58);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray60);
    }

    @Test
    public void test13608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13608");
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "", "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, false);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test13609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13609");
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "", "", "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18, false);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test13610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13610");
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "", "", "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, false);
        tSSLTransportParameters22.setKeyStore("", "hi!");
        tSSLTransportParameters22.setTrustStore("hi!", "");
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test13611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13611");
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!", "", "", "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15);
        tSSLTransportParameters28.setKeyStore("", "hi!");
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test13612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13612");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap1 = kerberosUserConfiguration0.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap2 = null;
        kerberosUserConfiguration0.options = strMap2;
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration4 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap5 = kerberosUserConfiguration4.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration0.setoptions(strMap5);
        java.util.HashMap<java.lang.String, java.lang.String> strMap7 = kerberosUserConfiguration0.getDEFAULT_KERBEROS_OPTIONS();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration8 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap9 = kerberosUserConfiguration8.options;
        java.lang.String str10 = kerberosUserConfiguration8.getType();
        java.util.HashMap<java.lang.String, java.lang.String> strMap11 = kerberosUserConfiguration8.options;
        kerberosUserConfiguration8.refresh();
        java.util.HashMap<java.lang.String, java.lang.String> strMap13 = kerberosUserConfiguration8.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration0.setoptions(strMap13);
        java.lang.String str15 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.util.HashMap<java.lang.String, java.lang.String> strMap17 = kerberosUserConfiguration0.getDEFAULT_KERBEROS_OPTIONS();
        java.lang.String str18 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test13613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13613");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.util.HashMap<java.lang.String, java.lang.String> strMap4 = kerberosUserConfiguration1.options;
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.util.HashMap<java.lang.String, java.lang.String> strMap7 = kerberosUserConfiguration1.options;
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration10 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap11 = null;
        kerberosUserConfiguration10.setoptions(strMap11);
        java.util.HashMap<java.lang.String, java.lang.String> strMap13 = kerberosUserConfiguration10.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap14 = kerberosUserConfiguration10.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap15 = kerberosUserConfiguration10.getDEFAULT_KERBEROS_OPTIONS();
        java.util.HashMap<java.lang.String, java.lang.String> strMap16 = kerberosUserConfiguration10.getDEFAULT_KERBEROS_OPTIONS();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration18 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration18.refresh();
        java.security.Provider provider20 = kerberosUserConfiguration18.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap21 = kerberosUserConfiguration18.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration10.setoptions(strMap21);
        java.util.HashMap<java.lang.String, java.lang.String> strMap23 = kerberosUserConfiguration10.getDEFAULT_KERBEROS_OPTIONS();
        java.util.HashMap<java.lang.String, java.lang.String> strMap24 = kerberosUserConfiguration10.getoptions();
        kerberosUserConfiguration1.setoptions(strMap24);
        java.lang.String str26 = kerberosUserConfiguration1.getType();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration27 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap28 = null;
        kerberosUserConfiguration27.setoptions(strMap28);
        java.util.HashMap<java.lang.String, java.lang.String> strMap30 = kerberosUserConfiguration27.options;
        kerberosUserConfiguration27.refresh();
        kerberosUserConfiguration27.refresh();
        java.security.Provider provider33 = kerberosUserConfiguration27.getProvider();
        java.lang.String str34 = kerberosUserConfiguration27.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration27);
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration37 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration37.refresh();
        java.util.HashMap<java.lang.String, java.lang.String> strMap39 = kerberosUserConfiguration37.getoptions();
        java.security.Provider provider40 = kerberosUserConfiguration37.getProvider();
        java.lang.String str41 = kerberosUserConfiguration37.getType();
        java.lang.String str42 = kerberosUserConfiguration37.getType();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration44 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration44.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray47 = kerberosUserConfiguration44.getAppConfigurationEntry("");
        java.util.HashMap<java.lang.String, java.lang.String> strMap48 = kerberosUserConfiguration44.options;
        kerberosUserConfiguration37.setoptions(strMap48);
        java.util.HashMap<java.lang.String, java.lang.String> strMap50 = kerberosUserConfiguration37.getoptions();
        kerberosUserConfiguration27.options = strMap50;
        kerberosUserConfiguration1.options = strMap50;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNull(strMap14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(provider20);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(strMap30);
        org.junit.Assert.assertNull(provider33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertNull(provider40);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray47);
        org.junit.Assert.assertNotNull(strMap48);
        org.junit.Assert.assertNotNull(strMap50);
    }

    @Test
    public void test13614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13614");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider9 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider9);
    }

    @Test
    public void test13615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13615");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters11 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, true);
        tSSLTransportParameters18.setKeyStore("", "hi!");
        tSSLTransportParameters18.setTrustStore("hi!", "");
        tSSLTransportParameters18.requireClientAuth(false);
        tSSLTransportParameters18.setTrustStore("", "hi!");
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test13616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13616");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.util.HashMap<java.lang.String, java.lang.String> strMap3 = kerberosUserConfiguration1.getoptions();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration6 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap7 = kerberosUserConfiguration6.getDEFAULT_KERBEROS_OPTIONS();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration9 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration9.refresh();
        java.security.Provider provider11 = kerberosUserConfiguration9.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap12 = kerberosUserConfiguration9.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration6.setoptions(strMap12);
        java.util.HashMap<java.lang.String, java.lang.String> strMap14 = kerberosUserConfiguration6.getoptions();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration6);
        java.util.HashMap<java.lang.String, java.lang.String> strMap16 = kerberosUserConfiguration6.options;
        kerberosUserConfiguration1.options = strMap16;
        java.security.Provider provider18 = kerberosUserConfiguration1.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap19 = kerberosUserConfiguration1.getoptions();
        java.lang.String str20 = kerberosUserConfiguration1.getType();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration22 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration22.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration22);
        java.util.HashMap<java.lang.String, java.lang.String> strMap25 = kerberosUserConfiguration22.options;
        javax.security.auth.login.Configuration.Parameters parameters26 = kerberosUserConfiguration22.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters27 = kerberosUserConfiguration22.getParameters();
        java.util.HashMap<java.lang.String, java.lang.String> strMap28 = kerberosUserConfiguration22.options;
        kerberosUserConfiguration22.refresh();
        java.util.HashMap<java.lang.String, java.lang.String> strMap30 = kerberosUserConfiguration22.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration1.setoptions(strMap30);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(provider18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNull(parameters26);
        org.junit.Assert.assertNull(parameters27);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNotNull(strMap30);
    }

    @Test
    public void test13617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13617");
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "", "", "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, true);
        java.lang.Class<?> wildcardClass21 = strArray11.getClass();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test13618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13618");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.util.HashMap<java.lang.String, java.lang.String> strMap6 = kerberosUserConfiguration1.getoptions();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.util.HashMap<java.lang.String, java.lang.String> strMap8 = kerberosUserConfiguration1.getDEFAULT_KERBEROS_OPTIONS();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap8);
    }

    @Test
    public void test13619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13619");
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "", "", "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test13620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13620");
        java.lang.String[] strArray19 = new java.lang.String[] { "", "hi!", "", "", "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters38 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19, true);
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test13621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13621");
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "", "", "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray10, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray10, false);
        tSSLTransportParameters16.setTrustStore("hi!", "hi!");
        tSSLTransportParameters16.setKeyStore("hi!", "");
        tSSLTransportParameters16.setKeyStore("", "hi!", "", "hi!");
        tSSLTransportParameters16.setTrustStore("hi!", "");
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test13622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13622");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap1 = kerberosUserConfiguration0.getDEFAULT_KERBEROS_OPTIONS();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration3 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration3.refresh();
        java.security.Provider provider5 = kerberosUserConfiguration3.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap6 = kerberosUserConfiguration3.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration0.setoptions(strMap6);
        java.util.HashMap<java.lang.String, java.lang.String> strMap8 = kerberosUserConfiguration0.getoptions();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.util.HashMap<java.lang.String, java.lang.String> strMap12 = null;
        kerberosUserConfiguration0.setoptions(strMap12);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration16 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration16.refresh();
        java.security.Provider provider18 = kerberosUserConfiguration16.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap19 = kerberosUserConfiguration16.getDEFAULT_KERBEROS_OPTIONS();
        java.security.Provider provider20 = kerberosUserConfiguration16.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray22 = kerberosUserConfiguration16.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray24 = kerberosUserConfiguration16.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters25 = kerberosUserConfiguration16.getParameters();
        java.security.Provider provider26 = kerberosUserConfiguration16.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray28 = kerberosUserConfiguration16.getAppConfigurationEntry("hi!");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration30 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration30.refresh();
        java.security.Provider provider32 = kerberosUserConfiguration30.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap33 = kerberosUserConfiguration30.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration30.refresh();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration35 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap36 = kerberosUserConfiguration35.options;
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration37 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap38 = null;
        kerberosUserConfiguration37.setoptions(strMap38);
        java.util.HashMap<java.lang.String, java.lang.String> strMap40 = kerberosUserConfiguration37.options;
        kerberosUserConfiguration37.refresh();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration42 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap43 = null;
        kerberosUserConfiguration42.setoptions(strMap43);
        java.util.HashMap<java.lang.String, java.lang.String> strMap45 = kerberosUserConfiguration42.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap46 = kerberosUserConfiguration42.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap47 = kerberosUserConfiguration42.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration37.options = strMap47;
        javax.security.auth.login.Configuration.Parameters parameters49 = kerberosUserConfiguration37.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray51 = kerberosUserConfiguration37.getAppConfigurationEntry("hi!");
        java.util.HashMap<java.lang.String, java.lang.String> strMap52 = kerberosUserConfiguration37.options;
        kerberosUserConfiguration35.options = strMap52;
        kerberosUserConfiguration30.setoptions(strMap52);
        kerberosUserConfiguration16.setoptions(strMap52);
        kerberosUserConfiguration0.options = strMap52;
        java.util.HashMap<java.lang.String, java.lang.String> strMap57 = kerberosUserConfiguration0.getDEFAULT_KERBEROS_OPTIONS();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.Parameters parameters59 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(provider18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNull(provider20);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray22);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray24);
        org.junit.Assert.assertNull(parameters25);
        org.junit.Assert.assertNull(provider26);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray28);
        org.junit.Assert.assertNull(provider32);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertNull(strMap36);
        org.junit.Assert.assertNull(strMap40);
        org.junit.Assert.assertNull(strMap45);
        org.junit.Assert.assertNull(strMap46);
        org.junit.Assert.assertNotNull(strMap47);
        org.junit.Assert.assertNull(parameters49);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray51);
        org.junit.Assert.assertNotNull(strMap52);
        org.junit.Assert.assertNotNull(strMap57);
        org.junit.Assert.assertNull(parameters59);
    }

    @Test
    public void test13623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13623");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap1 = kerberosUserConfiguration0.options;
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration3 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration3.refresh();
        java.security.Provider provider5 = kerberosUserConfiguration3.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap6 = kerberosUserConfiguration3.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration0.setoptions(strMap6);
        java.lang.String str8 = kerberosUserConfiguration0.getType();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        java.util.HashMap<java.lang.String, java.lang.String> strMap10 = kerberosUserConfiguration0.getDEFAULT_KERBEROS_OPTIONS();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration12 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration12.refresh();
        java.security.Provider provider14 = kerberosUserConfiguration12.getProvider();
        java.security.Provider provider15 = kerberosUserConfiguration12.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap16 = kerberosUserConfiguration12.options;
        kerberosUserConfiguration0.setoptions(strMap16);
        java.util.HashMap<java.lang.String, java.lang.String> strMap18 = kerberosUserConfiguration0.getDEFAULT_KERBEROS_OPTIONS();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration20 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration20.refresh();
        java.security.Provider provider22 = kerberosUserConfiguration20.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap23 = kerberosUserConfiguration20.getDEFAULT_KERBEROS_OPTIONS();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration25 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration25.refresh();
        java.security.Provider provider27 = kerberosUserConfiguration25.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap28 = kerberosUserConfiguration25.getDEFAULT_KERBEROS_OPTIONS();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration30 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration30.refresh();
        java.util.HashMap<java.lang.String, java.lang.String> strMap32 = kerberosUserConfiguration30.getoptions();
        kerberosUserConfiguration25.options = strMap32;
        kerberosUserConfiguration20.options = strMap32;
        java.security.Provider provider35 = kerberosUserConfiguration20.getProvider();
        java.security.Provider provider36 = kerberosUserConfiguration20.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray38 = kerberosUserConfiguration20.getAppConfigurationEntry("");
        java.util.HashMap<java.lang.String, java.lang.String> strMap39 = kerberosUserConfiguration20.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap40 = kerberosUserConfiguration20.options;
        kerberosUserConfiguration0.setoptions(strMap40);
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNull(provider22);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNull(provider27);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNull(provider35);
        org.junit.Assert.assertNull(provider36);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray38);
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertNotNull(strMap40);
    }

    @Test
    public void test13624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13624");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.util.HashMap<java.lang.String, java.lang.String> strMap7 = kerberosUserConfiguration1.getDEFAULT_KERBEROS_OPTIONS();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration9 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider10 = kerberosUserConfiguration9.getProvider();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration11 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration11.refresh();
        kerberosUserConfiguration11.refresh();
        java.util.HashMap<java.lang.String, java.lang.String> strMap14 = kerberosUserConfiguration11.getoptions();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration15 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap16 = null;
        kerberosUserConfiguration15.setoptions(strMap16);
        javax.security.auth.login.Configuration.Parameters parameters18 = kerberosUserConfiguration15.getParameters();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration20 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration20.refresh();
        java.security.Provider provider22 = kerberosUserConfiguration20.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap23 = kerberosUserConfiguration20.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration15.setoptions(strMap23);
        kerberosUserConfiguration11.options = strMap23;
        kerberosUserConfiguration9.setoptions(strMap23);
        java.security.Provider provider27 = kerberosUserConfiguration9.getProvider();
        java.lang.String str28 = kerberosUserConfiguration9.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray30 = kerberosUserConfiguration9.getAppConfigurationEntry("hi!");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration32 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration32.refresh();
        java.util.HashMap<java.lang.String, java.lang.String> strMap34 = kerberosUserConfiguration32.getoptions();
        java.security.Provider provider35 = kerberosUserConfiguration32.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters36 = kerberosUserConfiguration32.getParameters();
        java.util.HashMap<java.lang.String, java.lang.String> strMap37 = kerberosUserConfiguration32.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap38 = kerberosUserConfiguration32.options;
        kerberosUserConfiguration9.options = strMap38;
        java.lang.String str40 = kerberosUserConfiguration9.getType();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration41 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap42 = kerberosUserConfiguration41.getDEFAULT_KERBEROS_OPTIONS();
        java.util.HashMap<java.lang.String, java.lang.String> strMap43 = kerberosUserConfiguration41.options;
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration44 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap45 = null;
        kerberosUserConfiguration44.setoptions(strMap45);
        javax.security.auth.login.Configuration.Parameters parameters47 = kerberosUserConfiguration44.getParameters();
        java.util.HashMap<java.lang.String, java.lang.String> strMap48 = kerberosUserConfiguration44.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration41.setoptions(strMap48);
        kerberosUserConfiguration9.setoptions(strMap48);
        kerberosUserConfiguration1.setoptions(strMap48);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray53 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider54 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(strMap14);
        org.junit.Assert.assertNull(parameters18);
        org.junit.Assert.assertNull(provider22);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNull(provider27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray30);
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertNull(provider35);
        org.junit.Assert.assertNull(parameters36);
        org.junit.Assert.assertNotNull(strMap37);
        org.junit.Assert.assertNotNull(strMap38);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(strMap42);
        org.junit.Assert.assertNull(strMap43);
        org.junit.Assert.assertNull(parameters47);
        org.junit.Assert.assertNotNull(strMap48);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray53);
        org.junit.Assert.assertNull(provider54);
    }

    @Test
    public void test13625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13625");
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!", "", "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, false);
        tSSLTransportParameters28.setKeyStore("hi!", "", "hi!", "hi!");
        tSSLTransportParameters28.setTrustStore("", "hi!", "", "");
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test13626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13626");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration4 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap5 = null;
        kerberosUserConfiguration4.setoptions(strMap5);
        java.util.HashMap<java.lang.String, java.lang.String> strMap7 = kerberosUserConfiguration4.options;
        kerberosUserConfiguration4.refresh();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration9 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap10 = null;
        kerberosUserConfiguration9.setoptions(strMap10);
        java.util.HashMap<java.lang.String, java.lang.String> strMap12 = kerberosUserConfiguration9.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap13 = kerberosUserConfiguration9.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap14 = kerberosUserConfiguration9.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration4.options = strMap14;
        kerberosUserConfiguration1.setoptions(strMap14);
        kerberosUserConfiguration1.refresh();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration18 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration18.refresh();
        kerberosUserConfiguration18.refresh();
        java.util.HashMap<java.lang.String, java.lang.String> strMap21 = kerberosUserConfiguration18.getoptions();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration22 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap23 = kerberosUserConfiguration22.getDEFAULT_KERBEROS_OPTIONS();
        java.lang.String str24 = kerberosUserConfiguration22.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration22);
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration27 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration27.refresh();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration29 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap30 = kerberosUserConfiguration29.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration27.setoptions(strMap30);
        kerberosUserConfiguration22.setoptions(strMap30);
        java.util.HashMap<java.lang.String, java.lang.String> strMap33 = kerberosUserConfiguration22.getoptions();
        kerberosUserConfiguration18.options = strMap33;
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration36 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration36.refresh();
        java.util.HashMap<java.lang.String, java.lang.String> strMap38 = kerberosUserConfiguration36.getoptions();
        java.security.Provider provider39 = kerberosUserConfiguration36.getProvider();
        java.lang.String str40 = kerberosUserConfiguration36.getType();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration41 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap42 = kerberosUserConfiguration41.getDEFAULT_KERBEROS_OPTIONS();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration44 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration44.refresh();
        java.security.Provider provider46 = kerberosUserConfiguration44.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap47 = kerberosUserConfiguration44.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration41.setoptions(strMap47);
        java.util.HashMap<java.lang.String, java.lang.String> strMap49 = kerberosUserConfiguration41.getoptions();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration41);
        java.util.HashMap<java.lang.String, java.lang.String> strMap51 = kerberosUserConfiguration41.options;
        kerberosUserConfiguration36.options = strMap51;
        kerberosUserConfiguration18.options = strMap51;
        java.lang.String str54 = kerberosUserConfiguration18.getType();
        java.util.HashMap<java.lang.String, java.lang.String> strMap55 = kerberosUserConfiguration18.getoptions();
        javax.security.auth.login.Configuration.Parameters parameters56 = kerberosUserConfiguration18.getParameters();
        java.util.HashMap<java.lang.String, java.lang.String> strMap57 = kerberosUserConfiguration18.getoptions();
        kerberosUserConfiguration1.setoptions(strMap57);
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration60 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration60.refresh();
        java.security.Provider provider62 = kerberosUserConfiguration60.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap63 = kerberosUserConfiguration60.getDEFAULT_KERBEROS_OPTIONS();
        java.security.Provider provider64 = kerberosUserConfiguration60.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap65 = kerberosUserConfiguration60.getDEFAULT_KERBEROS_OPTIONS();
        java.util.HashMap<java.lang.String, java.lang.String> strMap66 = kerberosUserConfiguration60.getDEFAULT_KERBEROS_OPTIONS();
        java.security.Provider provider67 = kerberosUserConfiguration60.getProvider();
        java.lang.String str68 = kerberosUserConfiguration60.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray70 = kerberosUserConfiguration60.getAppConfigurationEntry("");
        java.security.Provider provider71 = kerberosUserConfiguration60.getProvider();
        java.lang.String str72 = kerberosUserConfiguration60.getType();
        java.security.Provider provider73 = kerberosUserConfiguration60.getProvider();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration75 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray77 = kerberosUserConfiguration75.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray79 = kerberosUserConfiguration75.getAppConfigurationEntry("");
        java.util.HashMap<java.lang.String, java.lang.String> strMap80 = kerberosUserConfiguration75.getDEFAULT_KERBEROS_OPTIONS();
        java.util.HashMap<java.lang.String, java.lang.String> strMap81 = kerberosUserConfiguration75.getoptions();
        kerberosUserConfiguration75.refresh();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration84 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration84.refresh();
        java.security.Provider provider86 = kerberosUserConfiguration84.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration84);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray89 = kerberosUserConfiguration84.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters90 = kerberosUserConfiguration84.getParameters();
        java.util.HashMap<java.lang.String, java.lang.String> strMap91 = kerberosUserConfiguration84.getoptions();
        kerberosUserConfiguration75.options = strMap91;
        kerberosUserConfiguration60.setoptions(strMap91);
        kerberosUserConfiguration1.options = strMap91;
        java.util.HashMap<java.lang.String, java.lang.String> strMap95 = kerberosUserConfiguration1.getoptions();
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(strMap21);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertNotNull(strMap38);
        org.junit.Assert.assertNull(provider39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(strMap42);
        org.junit.Assert.assertNull(provider46);
        org.junit.Assert.assertNotNull(strMap47);
        org.junit.Assert.assertNotNull(strMap49);
        org.junit.Assert.assertNotNull(strMap51);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(strMap55);
        org.junit.Assert.assertNull(parameters56);
        org.junit.Assert.assertNotNull(strMap57);
        org.junit.Assert.assertNull(provider62);
        org.junit.Assert.assertNotNull(strMap63);
        org.junit.Assert.assertNull(provider64);
        org.junit.Assert.assertNotNull(strMap65);
        org.junit.Assert.assertNotNull(strMap66);
        org.junit.Assert.assertNull(provider67);
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray70);
        org.junit.Assert.assertNull(provider71);
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertNull(provider73);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray77);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray79);
        org.junit.Assert.assertNotNull(strMap80);
        org.junit.Assert.assertNotNull(strMap81);
        org.junit.Assert.assertNull(provider86);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray89);
        org.junit.Assert.assertNull(parameters90);
        org.junit.Assert.assertNotNull(strMap91);
        org.junit.Assert.assertNotNull(strMap95);
    }

    @Test
    public void test13627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13627");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap1 = null;
        kerberosUserConfiguration0.setoptions(strMap1);
        java.util.HashMap<java.lang.String, java.lang.String> strMap3 = kerberosUserConfiguration0.options;
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration9 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration9.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration9);
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration12 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap13 = null;
        kerberosUserConfiguration12.setoptions(strMap13);
        java.util.HashMap<java.lang.String, java.lang.String> strMap15 = kerberosUserConfiguration12.options;
        kerberosUserConfiguration12.refresh();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration17 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap18 = null;
        kerberosUserConfiguration17.setoptions(strMap18);
        java.util.HashMap<java.lang.String, java.lang.String> strMap20 = kerberosUserConfiguration17.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap21 = kerberosUserConfiguration17.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap22 = kerberosUserConfiguration17.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration12.options = strMap22;
        kerberosUserConfiguration9.setoptions(strMap22);
        java.util.HashMap<java.lang.String, java.lang.String> strMap25 = kerberosUserConfiguration9.getDEFAULT_KERBEROS_OPTIONS();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration26 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap27 = kerberosUserConfiguration26.getDEFAULT_KERBEROS_OPTIONS();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration29 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration29.refresh();
        java.security.Provider provider31 = kerberosUserConfiguration29.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap32 = kerberosUserConfiguration29.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration26.setoptions(strMap32);
        java.util.HashMap<java.lang.String, java.lang.String> strMap34 = kerberosUserConfiguration26.getoptions();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration26);
        java.util.HashMap<java.lang.String, java.lang.String> strMap36 = kerberosUserConfiguration26.options;
        kerberosUserConfiguration9.setoptions(strMap36);
        kerberosUserConfiguration0.setoptions(strMap36);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters41 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray43 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.security.Provider provider45 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap20);
        org.junit.Assert.assertNull(strMap21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNull(provider31);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertNotNull(strMap36);
        org.junit.Assert.assertNull(parameters41);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray43);
        org.junit.Assert.assertNull(provider45);
    }

    @Test
    public void test13628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13628");
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "", "", "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, true);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test13629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13629");
        java.lang.String[] strArray13 = new java.lang.String[] { "", "", "hi!", "hi!", "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, true);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test13630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13630");
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "", "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, false);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test13631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13631");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        java.util.HashMap<java.lang.String, java.lang.String> strMap6 = kerberosUserConfiguration1.getDEFAULT_KERBEROS_OPTIONS();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration8 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration8.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration8);
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration8.getParameters();
        kerberosUserConfiguration8.refresh();
        kerberosUserConfiguration8.refresh();
        java.util.HashMap<java.lang.String, java.lang.String> strMap14 = kerberosUserConfiguration8.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration8.refresh();
        java.lang.String str16 = kerberosUserConfiguration8.getType();
        java.util.HashMap<java.lang.String, java.lang.String> strMap17 = kerberosUserConfiguration8.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap18 = kerberosUserConfiguration8.options;
        kerberosUserConfiguration1.options = strMap18;
        java.lang.String str20 = kerberosUserConfiguration1.getType();
        java.util.HashMap<java.lang.String, java.lang.String> strMap21 = kerberosUserConfiguration1.getDEFAULT_KERBEROS_OPTIONS();
        java.lang.String str22 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test13632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13632");
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        tSSLTransportParameters22.setTrustStore("hi!", "");
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test13633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13633");
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "", "", "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        tSSLTransportParameters25.setKeyStore("", "hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test13634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13634");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap1 = null;
        kerberosUserConfiguration0.setoptions(strMap1);
        java.util.HashMap<java.lang.String, java.lang.String> strMap3 = kerberosUserConfiguration0.options;
        kerberosUserConfiguration0.refresh();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration5 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap6 = null;
        kerberosUserConfiguration5.setoptions(strMap6);
        java.util.HashMap<java.lang.String, java.lang.String> strMap8 = kerberosUserConfiguration5.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap9 = kerberosUserConfiguration5.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap10 = kerberosUserConfiguration5.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration0.options = strMap10;
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.util.HashMap<java.lang.String, java.lang.String> strMap15 = kerberosUserConfiguration0.getoptions();
        java.security.Provider provider16 = kerberosUserConfiguration0.getProvider();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration17 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap18 = kerberosUserConfiguration17.options;
        javax.security.auth.login.Configuration.Parameters parameters19 = kerberosUserConfiguration17.getParameters();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration20 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap21 = null;
        kerberosUserConfiguration20.setoptions(strMap21);
        java.util.HashMap<java.lang.String, java.lang.String> strMap23 = kerberosUserConfiguration20.options;
        kerberosUserConfiguration20.refresh();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration25 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap26 = null;
        kerberosUserConfiguration25.setoptions(strMap26);
        java.util.HashMap<java.lang.String, java.lang.String> strMap28 = kerberosUserConfiguration25.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap29 = kerberosUserConfiguration25.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap30 = kerberosUserConfiguration25.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration20.options = strMap30;
        javax.security.auth.login.Configuration.Parameters parameters32 = kerberosUserConfiguration20.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray34 = kerberosUserConfiguration20.getAppConfigurationEntry("hi!");
        java.util.HashMap<java.lang.String, java.lang.String> strMap35 = kerberosUserConfiguration20.getDEFAULT_KERBEROS_OPTIONS();
        java.lang.String str36 = kerberosUserConfiguration20.getType();
        java.util.HashMap<java.lang.String, java.lang.String> strMap37 = kerberosUserConfiguration20.getoptions();
        kerberosUserConfiguration17.options = strMap37;
        kerberosUserConfiguration0.options = strMap37;
        java.util.HashMap<java.lang.String, java.lang.String> strMap40 = kerberosUserConfiguration0.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap41 = kerberosUserConfiguration0.getoptions();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration42 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap43 = kerberosUserConfiguration42.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap44 = kerberosUserConfiguration42.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration0.options = strMap44;
        java.util.HashMap<java.lang.String, java.lang.String> strMap46 = kerberosUserConfiguration0.getoptions();
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(parameters19);
        org.junit.Assert.assertNull(strMap23);
        org.junit.Assert.assertNull(strMap28);
        org.junit.Assert.assertNull(strMap29);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertNull(parameters32);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray34);
        org.junit.Assert.assertNotNull(strMap35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(strMap37);
        org.junit.Assert.assertNotNull(strMap40);
        org.junit.Assert.assertNotNull(strMap41);
        org.junit.Assert.assertNull(strMap43);
        org.junit.Assert.assertNotNull(strMap44);
        org.junit.Assert.assertNotNull(strMap46);
    }

    @Test
    public void test13635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13635");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap1 = null;
        kerberosUserConfiguration0.setoptions(strMap1);
        java.util.HashMap<java.lang.String, java.lang.String> strMap3 = kerberosUserConfiguration0.options;
        kerberosUserConfiguration0.refresh();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration5 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap6 = null;
        kerberosUserConfiguration5.setoptions(strMap6);
        java.util.HashMap<java.lang.String, java.lang.String> strMap8 = kerberosUserConfiguration5.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap9 = kerberosUserConfiguration5.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap10 = kerberosUserConfiguration5.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration0.options = strMap10;
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.util.HashMap<java.lang.String, java.lang.String> strMap15 = kerberosUserConfiguration0.getDEFAULT_KERBEROS_OPTIONS();
        java.lang.String str16 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.util.HashMap<java.lang.String, java.lang.String> strMap18 = kerberosUserConfiguration0.options;
        kerberosUserConfiguration0.refresh();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration21 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray23 = kerberosUserConfiguration21.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration21);
        java.lang.String str25 = kerberosUserConfiguration21.getType();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration27 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration27.refresh();
        java.security.Provider provider29 = kerberosUserConfiguration27.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap30 = kerberosUserConfiguration27.getDEFAULT_KERBEROS_OPTIONS();
        java.util.HashMap<java.lang.String, java.lang.String> strMap31 = kerberosUserConfiguration27.getoptions();
        kerberosUserConfiguration21.options = strMap31;
        java.util.HashMap<java.lang.String, java.lang.String> strMap33 = kerberosUserConfiguration21.getoptions();
        kerberosUserConfiguration21.refresh();
        javax.security.auth.login.Configuration.Parameters parameters35 = kerberosUserConfiguration21.getParameters();
        java.util.HashMap<java.lang.String, java.lang.String> strMap36 = kerberosUserConfiguration21.getoptions();
        kerberosUserConfiguration0.setoptions(strMap36);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(provider29);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertNull(parameters35);
        org.junit.Assert.assertNotNull(strMap36);
    }

    @Test
    public void test13636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13636");
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "", "", "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, true);
        tSSLTransportParameters24.setTrustStore("hi!", "", "", "");
        tSSLTransportParameters24.setKeyStore("hi!", "", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test13637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13637");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap1 = null;
        kerberosUserConfiguration0.setoptions(strMap1);
        java.util.HashMap<java.lang.String, java.lang.String> strMap3 = kerberosUserConfiguration0.options;
        kerberosUserConfiguration0.refresh();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration5 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap6 = null;
        kerberosUserConfiguration5.setoptions(strMap6);
        java.util.HashMap<java.lang.String, java.lang.String> strMap8 = kerberosUserConfiguration5.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap9 = kerberosUserConfiguration5.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap10 = kerberosUserConfiguration5.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration0.options = strMap10;
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.util.HashMap<java.lang.String, java.lang.String> strMap15 = kerberosUserConfiguration0.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap16 = kerberosUserConfiguration0.getoptions();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration17 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap18 = null;
        kerberosUserConfiguration17.setoptions(strMap18);
        java.util.HashMap<java.lang.String, java.lang.String> strMap20 = kerberosUserConfiguration17.options;
        kerberosUserConfiguration17.refresh();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration22 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap23 = null;
        kerberosUserConfiguration22.setoptions(strMap23);
        java.util.HashMap<java.lang.String, java.lang.String> strMap25 = kerberosUserConfiguration22.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap26 = kerberosUserConfiguration22.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap27 = kerberosUserConfiguration22.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration17.options = strMap27;
        javax.security.auth.login.Configuration.Parameters parameters29 = kerberosUserConfiguration17.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray31 = kerberosUserConfiguration17.getAppConfigurationEntry("hi!");
        java.util.HashMap<java.lang.String, java.lang.String> strMap32 = kerberosUserConfiguration17.getDEFAULT_KERBEROS_OPTIONS();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration34 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration34.refresh();
        java.security.Provider provider36 = kerberosUserConfiguration34.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap37 = kerberosUserConfiguration34.getDEFAULT_KERBEROS_OPTIONS();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration39 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration39.refresh();
        java.security.Provider provider41 = kerberosUserConfiguration39.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap42 = kerberosUserConfiguration39.getDEFAULT_KERBEROS_OPTIONS();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration44 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration44.refresh();
        java.util.HashMap<java.lang.String, java.lang.String> strMap46 = kerberosUserConfiguration44.getoptions();
        kerberosUserConfiguration39.options = strMap46;
        kerberosUserConfiguration34.options = strMap46;
        javax.security.auth.login.Configuration.Parameters parameters49 = kerberosUserConfiguration34.getParameters();
        java.util.HashMap<java.lang.String, java.lang.String> strMap50 = kerberosUserConfiguration34.options;
        kerberosUserConfiguration17.setoptions(strMap50);
        java.security.Provider provider52 = kerberosUserConfiguration17.getProvider();
        java.lang.String str53 = kerberosUserConfiguration17.getType();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration55 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration55.refresh();
        java.util.HashMap<java.lang.String, java.lang.String> strMap57 = kerberosUserConfiguration55.getoptions();
        java.security.Provider provider58 = kerberosUserConfiguration55.getProvider();
        java.lang.String str59 = kerberosUserConfiguration55.getType();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration60 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap61 = kerberosUserConfiguration60.getDEFAULT_KERBEROS_OPTIONS();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration63 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration63.refresh();
        java.security.Provider provider65 = kerberosUserConfiguration63.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap66 = kerberosUserConfiguration63.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration60.setoptions(strMap66);
        java.util.HashMap<java.lang.String, java.lang.String> strMap68 = kerberosUserConfiguration60.getoptions();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration60);
        java.util.HashMap<java.lang.String, java.lang.String> strMap70 = kerberosUserConfiguration60.options;
        kerberosUserConfiguration55.options = strMap70;
        javax.security.auth.login.Configuration.Parameters parameters72 = kerberosUserConfiguration55.getParameters();
        java.util.HashMap<java.lang.String, java.lang.String> strMap73 = kerberosUserConfiguration55.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration17.setoptions(strMap73);
        kerberosUserConfiguration0.setoptions(strMap73);
        java.lang.String str76 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(strMap20);
        org.junit.Assert.assertNull(strMap25);
        org.junit.Assert.assertNull(strMap26);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNull(parameters29);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray31);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNull(provider36);
        org.junit.Assert.assertNotNull(strMap37);
        org.junit.Assert.assertNull(provider41);
        org.junit.Assert.assertNotNull(strMap42);
        org.junit.Assert.assertNotNull(strMap46);
        org.junit.Assert.assertNull(parameters49);
        org.junit.Assert.assertNotNull(strMap50);
        org.junit.Assert.assertNull(provider52);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(strMap57);
        org.junit.Assert.assertNull(provider58);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNotNull(strMap61);
        org.junit.Assert.assertNull(provider65);
        org.junit.Assert.assertNotNull(strMap66);
        org.junit.Assert.assertNotNull(strMap68);
        org.junit.Assert.assertNotNull(strMap70);
        org.junit.Assert.assertNull(parameters72);
        org.junit.Assert.assertNotNull(strMap73);
        org.junit.Assert.assertNull(str76);
    }

    @Test
    public void test13638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13638");
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "", "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray14, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray14, true);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test13639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13639");
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15, false);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test13640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13640");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.util.HashMap<java.lang.String, java.lang.String> strMap3 = kerberosUserConfiguration0.getoptions();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration4 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap5 = null;
        kerberosUserConfiguration4.setoptions(strMap5);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration4.getParameters();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration9 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration9.refresh();
        java.security.Provider provider11 = kerberosUserConfiguration9.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap12 = kerberosUserConfiguration9.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration4.setoptions(strMap12);
        kerberosUserConfiguration0.options = strMap12;
        java.util.HashMap<java.lang.String, java.lang.String> strMap15 = kerberosUserConfiguration0.getoptions();
        kerberosUserConfiguration0.refresh();
        java.util.HashMap<java.lang.String, java.lang.String> strMap17 = kerberosUserConfiguration0.getoptions();
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(strMap17);
    }

    @Test
    public void test13641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13641");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(parameters5);
    }

    @Test
    public void test13642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13642");
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!", "", "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters8 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray7);
        tSSLTransportParameters8.setTrustStore("hi!", "hi!");
        tSSLTransportParameters8.requireClientAuth(true);
        tSSLTransportParameters8.setKeyStore("hi!", "hi!", "hi!", "");
        tSSLTransportParameters8.setTrustStore("", "", "", "");
        tSSLTransportParameters8.setTrustStore("hi!", "hi!");
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test13643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13643");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap1 = null;
        kerberosUserConfiguration0.setoptions(strMap1);
        java.util.HashMap<java.lang.String, java.lang.String> strMap3 = kerberosUserConfiguration0.options;
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration5 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration5.refresh();
        kerberosUserConfiguration5.refresh();
        java.util.HashMap<java.lang.String, java.lang.String> strMap8 = kerberosUserConfiguration5.getoptions();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration9 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap10 = null;
        kerberosUserConfiguration9.setoptions(strMap10);
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration9.getParameters();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration14 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration14.refresh();
        java.security.Provider provider16 = kerberosUserConfiguration14.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap17 = kerberosUserConfiguration14.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration9.setoptions(strMap17);
        kerberosUserConfiguration5.options = strMap17;
        kerberosUserConfiguration0.options = strMap17;
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration21 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap22 = null;
        kerberosUserConfiguration21.setoptions(strMap22);
        java.util.HashMap<java.lang.String, java.lang.String> strMap24 = kerberosUserConfiguration21.options;
        kerberosUserConfiguration21.refresh();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration26 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap27 = null;
        kerberosUserConfiguration26.setoptions(strMap27);
        java.util.HashMap<java.lang.String, java.lang.String> strMap29 = kerberosUserConfiguration26.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap30 = kerberosUserConfiguration26.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap31 = kerberosUserConfiguration26.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration21.options = strMap31;
        javax.security.auth.login.Configuration.Parameters parameters33 = kerberosUserConfiguration21.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray35 = kerberosUserConfiguration21.getAppConfigurationEntry("hi!");
        java.util.HashMap<java.lang.String, java.lang.String> strMap36 = kerberosUserConfiguration21.getDEFAULT_KERBEROS_OPTIONS();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration38 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration38.refresh();
        java.security.Provider provider40 = kerberosUserConfiguration38.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap41 = kerberosUserConfiguration38.getDEFAULT_KERBEROS_OPTIONS();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration43 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration43.refresh();
        java.security.Provider provider45 = kerberosUserConfiguration43.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap46 = kerberosUserConfiguration43.getDEFAULT_KERBEROS_OPTIONS();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration48 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration48.refresh();
        java.util.HashMap<java.lang.String, java.lang.String> strMap50 = kerberosUserConfiguration48.getoptions();
        kerberosUserConfiguration43.options = strMap50;
        kerberosUserConfiguration38.options = strMap50;
        javax.security.auth.login.Configuration.Parameters parameters53 = kerberosUserConfiguration38.getParameters();
        java.util.HashMap<java.lang.String, java.lang.String> strMap54 = kerberosUserConfiguration38.options;
        kerberosUserConfiguration21.setoptions(strMap54);
        kerberosUserConfiguration0.setoptions(strMap54);
        javax.security.auth.login.Configuration.Parameters parameters57 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.lang.String str59 = kerberosUserConfiguration0.getType();
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNull(strMap24);
        org.junit.Assert.assertNull(strMap29);
        org.junit.Assert.assertNull(strMap30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNull(parameters33);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray35);
        org.junit.Assert.assertNotNull(strMap36);
        org.junit.Assert.assertNull(provider40);
        org.junit.Assert.assertNotNull(strMap41);
        org.junit.Assert.assertNull(provider45);
        org.junit.Assert.assertNotNull(strMap46);
        org.junit.Assert.assertNotNull(strMap50);
        org.junit.Assert.assertNull(parameters53);
        org.junit.Assert.assertNotNull(strMap54);
        org.junit.Assert.assertNull(parameters57);
        org.junit.Assert.assertNull(str59);
    }

    @Test
    public void test13644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13644");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap1 = kerberosUserConfiguration0.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap2 = null;
        kerberosUserConfiguration0.options = strMap2;
        java.util.HashMap<java.lang.String, java.lang.String> strMap4 = kerberosUserConfiguration0.getDEFAULT_KERBEROS_OPTIONS();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration5 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap6 = null;
        kerberosUserConfiguration5.setoptions(strMap6);
        java.util.HashMap<java.lang.String, java.lang.String> strMap8 = kerberosUserConfiguration5.options;
        kerberosUserConfiguration5.refresh();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration10 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap11 = null;
        kerberosUserConfiguration10.setoptions(strMap11);
        java.util.HashMap<java.lang.String, java.lang.String> strMap13 = kerberosUserConfiguration10.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap14 = kerberosUserConfiguration10.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap15 = kerberosUserConfiguration10.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration5.options = strMap15;
        java.lang.String str17 = kerberosUserConfiguration5.getType();
        java.util.HashMap<java.lang.String, java.lang.String> strMap18 = kerberosUserConfiguration5.options;
        kerberosUserConfiguration0.options = strMap18;
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration20 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap21 = null;
        kerberosUserConfiguration20.setoptions(strMap21);
        java.util.HashMap<java.lang.String, java.lang.String> strMap23 = kerberosUserConfiguration20.options;
        kerberosUserConfiguration20.refresh();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration25 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap26 = null;
        kerberosUserConfiguration25.setoptions(strMap26);
        java.util.HashMap<java.lang.String, java.lang.String> strMap28 = kerberosUserConfiguration25.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap29 = kerberosUserConfiguration25.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap30 = kerberosUserConfiguration25.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration20.options = strMap30;
        javax.security.auth.login.Configuration.Parameters parameters32 = kerberosUserConfiguration20.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray34 = kerberosUserConfiguration20.getAppConfigurationEntry("hi!");
        java.util.HashMap<java.lang.String, java.lang.String> strMap35 = kerberosUserConfiguration20.getDEFAULT_KERBEROS_OPTIONS();
        java.security.Provider provider36 = kerberosUserConfiguration20.getProvider();
        java.security.Provider provider37 = kerberosUserConfiguration20.getProvider();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration39 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration39.refresh();
        java.security.Provider provider41 = kerberosUserConfiguration39.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration39);
        javax.security.auth.login.Configuration.Parameters parameters43 = kerberosUserConfiguration39.getParameters();
        kerberosUserConfiguration39.refresh();
        java.util.HashMap<java.lang.String, java.lang.String> strMap45 = kerberosUserConfiguration39.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration20.setoptions(strMap45);
        kerberosUserConfiguration0.options = strMap45;
        java.security.Provider provider48 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNull(strMap14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNull(strMap23);
        org.junit.Assert.assertNull(strMap28);
        org.junit.Assert.assertNull(strMap29);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertNull(parameters32);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray34);
        org.junit.Assert.assertNotNull(strMap35);
        org.junit.Assert.assertNull(provider36);
        org.junit.Assert.assertNull(provider37);
        org.junit.Assert.assertNull(provider41);
        org.junit.Assert.assertNull(parameters43);
        org.junit.Assert.assertNotNull(strMap45);
        org.junit.Assert.assertNull(provider48);
    }

    @Test
    public void test13645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13645");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap1 = null;
        kerberosUserConfiguration0.setoptions(strMap1);
        java.util.HashMap<java.lang.String, java.lang.String> strMap3 = kerberosUserConfiguration0.options;
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration7 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration7.getParameters();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration9 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap10 = null;
        kerberosUserConfiguration9.setoptions(strMap10);
        java.util.HashMap<java.lang.String, java.lang.String> strMap12 = kerberosUserConfiguration9.options;
        kerberosUserConfiguration9.refresh();
        kerberosUserConfiguration9.refresh();
        java.util.HashMap<java.lang.String, java.lang.String> strMap15 = kerberosUserConfiguration9.getoptions();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration16 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap17 = kerberosUserConfiguration16.getDEFAULT_KERBEROS_OPTIONS();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration16);
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration20 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration20.refresh();
        java.security.Provider provider22 = kerberosUserConfiguration20.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap23 = kerberosUserConfiguration20.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration16.setoptions(strMap23);
        kerberosUserConfiguration9.options = strMap23;
        kerberosUserConfiguration7.options = strMap23;
        java.util.HashMap<java.lang.String, java.lang.String> strMap27 = kerberosUserConfiguration7.getoptions();
        kerberosUserConfiguration0.setoptions(strMap27);
        java.util.HashMap<java.lang.String, java.lang.String> strMap29 = kerberosUserConfiguration0.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration0.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray32 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        java.util.HashMap<java.lang.String, java.lang.String> strMap33 = kerberosUserConfiguration0.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration0.refresh();
        java.util.HashMap<java.lang.String, java.lang.String> strMap35 = kerberosUserConfiguration0.getoptions();
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNull(provider22);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray32);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertNotNull(strMap35);
    }

    @Test
    public void test13646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13646");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.util.HashMap<java.lang.String, java.lang.String> strMap3 = kerberosUserConfiguration1.getoptions();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.util.HashMap<java.lang.String, java.lang.String> strMap6 = kerberosUserConfiguration1.options;
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration9 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap10 = null;
        kerberosUserConfiguration9.setoptions(strMap10);
        java.util.HashMap<java.lang.String, java.lang.String> strMap12 = kerberosUserConfiguration9.options;
        kerberosUserConfiguration9.refresh();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration14 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap15 = null;
        kerberosUserConfiguration14.setoptions(strMap15);
        java.util.HashMap<java.lang.String, java.lang.String> strMap17 = kerberosUserConfiguration14.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap18 = kerberosUserConfiguration14.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap19 = kerberosUserConfiguration14.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration9.options = strMap19;
        javax.security.auth.login.Configuration.Parameters parameters21 = kerberosUserConfiguration9.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration9);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray24 = kerberosUserConfiguration9.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration9);
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration26 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap27 = kerberosUserConfiguration26.options;
        java.lang.String str28 = kerberosUserConfiguration26.getType();
        java.util.HashMap<java.lang.String, java.lang.String> strMap29 = kerberosUserConfiguration26.options;
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration30 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap31 = null;
        kerberosUserConfiguration30.setoptions(strMap31);
        java.util.HashMap<java.lang.String, java.lang.String> strMap33 = kerberosUserConfiguration30.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap34 = kerberosUserConfiguration30.getoptions();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration35 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap36 = kerberosUserConfiguration35.getDEFAULT_KERBEROS_OPTIONS();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration35);
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration39 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration39.refresh();
        java.security.Provider provider41 = kerberosUserConfiguration39.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap42 = kerberosUserConfiguration39.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration35.setoptions(strMap42);
        kerberosUserConfiguration30.setoptions(strMap42);
        kerberosUserConfiguration26.options = strMap42;
        kerberosUserConfiguration9.options = strMap42;
        kerberosUserConfiguration1.options = strMap42;
        javax.security.auth.login.Configuration.Parameters parameters48 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(strMap12);
        org.junit.Assert.assertNull(strMap17);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNull(parameters21);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray24);
        org.junit.Assert.assertNull(strMap27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(strMap29);
        org.junit.Assert.assertNull(strMap33);
        org.junit.Assert.assertNull(strMap34);
        org.junit.Assert.assertNotNull(strMap36);
        org.junit.Assert.assertNull(provider41);
        org.junit.Assert.assertNotNull(strMap42);
        org.junit.Assert.assertNull(parameters48);
    }

    @Test
    public void test13647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13647");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.util.HashMap<java.lang.String, java.lang.String> strMap3 = kerberosUserConfiguration0.getoptions();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration0.getParameters();
        java.lang.String str5 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        java.util.HashMap<java.lang.String, java.lang.String> strMap7 = kerberosUserConfiguration0.options;
        java.security.Provider provider8 = kerberosUserConfiguration0.getProvider();
        java.lang.String str9 = kerberosUserConfiguration0.getType();
        // The following exception was thrown during execution in test generation
        try {
            javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration0.getAppConfigurationEntry("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test13648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13648");
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "", "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test13649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13649");
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!", "", "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray15, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray15);
        tSSLTransportParameters25.setKeyStore("hi!", "hi!", "", "");
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test13650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13650");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration1.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap4 = kerberosUserConfiguration1.getDEFAULT_KERBEROS_OPTIONS();
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap6 = kerberosUserConfiguration1.getDEFAULT_KERBEROS_OPTIONS();
        java.util.HashMap<java.lang.String, java.lang.String> strMap7 = kerberosUserConfiguration1.getDEFAULT_KERBEROS_OPTIONS();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration14 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration14.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration14);
        java.lang.String str18 = kerberosUserConfiguration14.getType();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration20 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration20.refresh();
        java.security.Provider provider22 = kerberosUserConfiguration20.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap23 = kerberosUserConfiguration20.getDEFAULT_KERBEROS_OPTIONS();
        java.util.HashMap<java.lang.String, java.lang.String> strMap24 = kerberosUserConfiguration20.getoptions();
        kerberosUserConfiguration14.options = strMap24;
        kerberosUserConfiguration1.setoptions(strMap24);
        java.util.HashMap<java.lang.String, java.lang.String> strMap27 = kerberosUserConfiguration1.options;
        java.lang.String str28 = kerberosUserConfiguration1.getType();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration30 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray32 = kerberosUserConfiguration30.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration30);
        java.lang.String str34 = kerberosUserConfiguration30.getType();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration36 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration36.refresh();
        java.security.Provider provider38 = kerberosUserConfiguration36.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap39 = kerberosUserConfiguration36.getDEFAULT_KERBEROS_OPTIONS();
        java.util.HashMap<java.lang.String, java.lang.String> strMap40 = kerberosUserConfiguration36.getoptions();
        kerberosUserConfiguration30.options = strMap40;
        java.util.HashMap<java.lang.String, java.lang.String> strMap42 = kerberosUserConfiguration30.getoptions();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration43 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap44 = kerberosUserConfiguration43.getDEFAULT_KERBEROS_OPTIONS();
        java.lang.String str45 = kerberosUserConfiguration43.getType();
        java.util.HashMap<java.lang.String, java.lang.String> strMap46 = kerberosUserConfiguration43.getoptions();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration47 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap48 = kerberosUserConfiguration47.getDEFAULT_KERBEROS_OPTIONS();
        java.lang.String str49 = kerberosUserConfiguration47.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration47);
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration52 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration52.refresh();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration54 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap55 = kerberosUserConfiguration54.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration52.setoptions(strMap55);
        kerberosUserConfiguration47.setoptions(strMap55);
        kerberosUserConfiguration43.options = strMap55;
        javax.security.auth.login.Configuration.Parameters parameters59 = kerberosUserConfiguration43.getParameters();
        java.util.HashMap<java.lang.String, java.lang.String> strMap60 = kerberosUserConfiguration43.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration30.options = strMap60;
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration30);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray64 = kerberosUserConfiguration30.getAppConfigurationEntry("hi!");
        java.util.HashMap<java.lang.String, java.lang.String> strMap65 = kerberosUserConfiguration30.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap66 = kerberosUserConfiguration30.getoptions();
        kerberosUserConfiguration1.setoptions(strMap66);
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration69 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration69.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration69);
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration72 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap73 = null;
        kerberosUserConfiguration72.setoptions(strMap73);
        java.util.HashMap<java.lang.String, java.lang.String> strMap75 = kerberosUserConfiguration72.options;
        kerberosUserConfiguration72.refresh();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration77 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap78 = null;
        kerberosUserConfiguration77.setoptions(strMap78);
        java.util.HashMap<java.lang.String, java.lang.String> strMap80 = kerberosUserConfiguration77.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap81 = kerberosUserConfiguration77.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap82 = kerberosUserConfiguration77.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration72.options = strMap82;
        kerberosUserConfiguration69.setoptions(strMap82);
        java.security.Provider provider85 = kerberosUserConfiguration69.getProvider();
        java.security.Provider provider86 = kerberosUserConfiguration69.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap87 = kerberosUserConfiguration69.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap88 = kerberosUserConfiguration69.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration1.setoptions(strMap88);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(provider22);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray32);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(provider38);
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertNotNull(strMap40);
        org.junit.Assert.assertNotNull(strMap42);
        org.junit.Assert.assertNotNull(strMap44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(strMap46);
        org.junit.Assert.assertNotNull(strMap48);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(strMap55);
        org.junit.Assert.assertNull(parameters59);
        org.junit.Assert.assertNotNull(strMap60);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray64);
        org.junit.Assert.assertNotNull(strMap65);
        org.junit.Assert.assertNotNull(strMap66);
        org.junit.Assert.assertNull(strMap75);
        org.junit.Assert.assertNull(strMap80);
        org.junit.Assert.assertNull(strMap81);
        org.junit.Assert.assertNotNull(strMap82);
        org.junit.Assert.assertNull(provider85);
        org.junit.Assert.assertNull(provider86);
        org.junit.Assert.assertNotNull(strMap87);
        org.junit.Assert.assertNotNull(strMap88);
    }

    @Test
    public void test13651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13651");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap1 = kerberosUserConfiguration0.getDEFAULT_KERBEROS_OPTIONS();
        java.security.Provider provider2 = kerberosUserConfiguration0.getProvider();
        java.lang.String str3 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        java.util.HashMap<java.lang.String, java.lang.String> strMap5 = kerberosUserConfiguration0.options;
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strMap5);
    }

    @Test
    public void test13652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13652");
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!", "", "", "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray20, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray20, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray20, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray20, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray20);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray20, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray20, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray20, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters39 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray20, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters41 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray20, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters43 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray20, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters44 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray20);
        java.lang.Class<?> wildcardClass45 = strArray20.getClass();
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test13653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13653");
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "", "", "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters37 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test13654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13654");
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "", "", "hi!", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18, false);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test13655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13655");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap1 = null;
        kerberosUserConfiguration0.setoptions(strMap1);
        java.util.HashMap<java.lang.String, java.lang.String> strMap3 = kerberosUserConfiguration0.options;
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration9 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration9.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration9);
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration12 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap13 = null;
        kerberosUserConfiguration12.setoptions(strMap13);
        java.util.HashMap<java.lang.String, java.lang.String> strMap15 = kerberosUserConfiguration12.options;
        kerberosUserConfiguration12.refresh();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration17 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap18 = null;
        kerberosUserConfiguration17.setoptions(strMap18);
        java.util.HashMap<java.lang.String, java.lang.String> strMap20 = kerberosUserConfiguration17.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap21 = kerberosUserConfiguration17.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap22 = kerberosUserConfiguration17.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration12.options = strMap22;
        kerberosUserConfiguration9.setoptions(strMap22);
        java.util.HashMap<java.lang.String, java.lang.String> strMap25 = kerberosUserConfiguration9.getDEFAULT_KERBEROS_OPTIONS();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration26 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap27 = kerberosUserConfiguration26.getDEFAULT_KERBEROS_OPTIONS();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration29 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration29.refresh();
        java.security.Provider provider31 = kerberosUserConfiguration29.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap32 = kerberosUserConfiguration29.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration26.setoptions(strMap32);
        java.util.HashMap<java.lang.String, java.lang.String> strMap34 = kerberosUserConfiguration26.getoptions();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration26);
        java.util.HashMap<java.lang.String, java.lang.String> strMap36 = kerberosUserConfiguration26.options;
        kerberosUserConfiguration9.setoptions(strMap36);
        kerberosUserConfiguration0.setoptions(strMap36);
        javax.security.auth.login.Configuration.Parameters parameters39 = kerberosUserConfiguration0.getParameters();
        java.lang.String str40 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray42 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters43 = kerberosUserConfiguration0.getParameters();
        java.util.HashMap<java.lang.String, java.lang.String> strMap44 = kerberosUserConfiguration0.getoptions();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration45 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap46 = null;
        kerberosUserConfiguration45.setoptions(strMap46);
        java.util.HashMap<java.lang.String, java.lang.String> strMap48 = kerberosUserConfiguration45.options;
        kerberosUserConfiguration45.refresh();
        kerberosUserConfiguration45.refresh();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration51 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap52 = kerberosUserConfiguration51.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap53 = null;
        kerberosUserConfiguration51.options = strMap53;
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration55 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap56 = kerberosUserConfiguration55.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration51.setoptions(strMap56);
        kerberosUserConfiguration45.options = strMap56;
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray60 = kerberosUserConfiguration45.getAppConfigurationEntry("");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration62 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration62.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration62);
        java.util.HashMap<java.lang.String, java.lang.String> strMap65 = kerberosUserConfiguration62.options;
        javax.security.auth.login.Configuration.Parameters parameters66 = kerberosUserConfiguration62.getParameters();
        java.util.HashMap<java.lang.String, java.lang.String> strMap67 = kerberosUserConfiguration62.getoptions();
        kerberosUserConfiguration45.options = strMap67;
        java.util.HashMap<java.lang.String, java.lang.String> strMap69 = kerberosUserConfiguration45.getoptions();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray71 = kerberosUserConfiguration45.getAppConfigurationEntry("hi!");
        java.util.HashMap<java.lang.String, java.lang.String> strMap72 = kerberosUserConfiguration45.getoptions();
        kerberosUserConfiguration0.options = strMap72;
        javax.security.auth.login.Configuration.Parameters parameters74 = kerberosUserConfiguration0.getParameters();
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap20);
        org.junit.Assert.assertNull(strMap21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNull(provider31);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertNotNull(strMap36);
        org.junit.Assert.assertNull(parameters39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray42);
        org.junit.Assert.assertNull(parameters43);
        org.junit.Assert.assertNotNull(strMap44);
        org.junit.Assert.assertNull(strMap48);
        org.junit.Assert.assertNull(strMap52);
        org.junit.Assert.assertNotNull(strMap56);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray60);
        org.junit.Assert.assertNotNull(strMap65);
        org.junit.Assert.assertNull(parameters66);
        org.junit.Assert.assertNotNull(strMap67);
        org.junit.Assert.assertNotNull(strMap69);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray71);
        org.junit.Assert.assertNotNull(strMap72);
        org.junit.Assert.assertNull(parameters74);
    }

    @Test
    public void test13656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13656");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        kerberosUserConfiguration0.refresh();
        java.util.HashMap<java.lang.String, java.lang.String> strMap2 = null;
        kerberosUserConfiguration0.setoptions(strMap2);
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration4 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap5 = kerberosUserConfiguration4.getDEFAULT_KERBEROS_OPTIONS();
        java.lang.String str6 = kerberosUserConfiguration4.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration4);
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration9 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration9.refresh();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration11 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap12 = kerberosUserConfiguration11.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration9.setoptions(strMap12);
        kerberosUserConfiguration4.setoptions(strMap12);
        java.util.HashMap<java.lang.String, java.lang.String> strMap15 = kerberosUserConfiguration4.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap16 = kerberosUserConfiguration4.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap17 = kerberosUserConfiguration4.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration0.setoptions(strMap17);
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider20 = kerberosUserConfiguration0.getProvider();
        java.lang.String str21 = kerberosUserConfiguration0.getType();
        java.util.HashMap<java.lang.String, java.lang.String> strMap22 = kerberosUserConfiguration0.getDEFAULT_KERBEROS_OPTIONS();
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNull(provider20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(strMap22);
    }

    @Test
    public void test13657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13657");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration1.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap4 = kerberosUserConfiguration1.getDEFAULT_KERBEROS_OPTIONS();
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        java.util.HashMap<java.lang.String, java.lang.String> strMap13 = kerberosUserConfiguration1.getoptions();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test13658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13658");
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "", "", "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters13 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        tSSLTransportParameters21.setTrustStore("hi!", "hi!");
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test13659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13659");
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "", "", "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray13);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray13);
        tSSLTransportParameters23.setTrustStore("", "", "hi!", "hi!");
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test13660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13660");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap1 = null;
        kerberosUserConfiguration0.setoptions(strMap1);
        java.util.HashMap<java.lang.String, java.lang.String> strMap3 = kerberosUserConfiguration0.options;
        kerberosUserConfiguration0.refresh();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration5 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap6 = null;
        kerberosUserConfiguration5.setoptions(strMap6);
        java.util.HashMap<java.lang.String, java.lang.String> strMap8 = kerberosUserConfiguration5.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap9 = kerberosUserConfiguration5.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap10 = kerberosUserConfiguration5.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration0.options = strMap10;
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration0.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.util.HashMap<java.lang.String, java.lang.String> strMap15 = kerberosUserConfiguration0.getDEFAULT_KERBEROS_OPTIONS();
        java.security.Provider provider16 = kerberosUserConfiguration0.getProvider();
        java.lang.String str17 = kerberosUserConfiguration0.getType();
        java.lang.String str18 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(strMap9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test13661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13661");
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "", "", "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test13662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13662");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap1 = null;
        kerberosUserConfiguration0.setoptions(strMap1);
        java.util.HashMap<java.lang.String, java.lang.String> strMap3 = kerberosUserConfiguration0.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap4 = kerberosUserConfiguration0.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap5 = kerberosUserConfiguration0.getDEFAULT_KERBEROS_OPTIONS();
        java.util.HashMap<java.lang.String, java.lang.String> strMap6 = kerberosUserConfiguration0.getDEFAULT_KERBEROS_OPTIONS();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration7 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap8 = null;
        kerberosUserConfiguration7.setoptions(strMap8);
        java.util.HashMap<java.lang.String, java.lang.String> strMap10 = kerberosUserConfiguration7.options;
        kerberosUserConfiguration7.refresh();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration12 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap13 = kerberosUserConfiguration12.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap14 = null;
        kerberosUserConfiguration12.options = strMap14;
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration16 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap17 = kerberosUserConfiguration16.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration12.setoptions(strMap17);
        kerberosUserConfiguration7.setoptions(strMap17);
        kerberosUserConfiguration0.options = strMap17;
        java.util.HashMap<java.lang.String, java.lang.String> strMap21 = kerberosUserConfiguration0.getDEFAULT_KERBEROS_OPTIONS();
        java.lang.String str22 = kerberosUserConfiguration0.getType();
        kerberosUserConfiguration0.refresh();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration24 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap25 = null;
        kerberosUserConfiguration24.setoptions(strMap25);
        java.util.HashMap<java.lang.String, java.lang.String> strMap27 = kerberosUserConfiguration24.options;
        kerberosUserConfiguration24.refresh();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration29 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap30 = kerberosUserConfiguration29.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap31 = null;
        kerberosUserConfiguration29.options = strMap31;
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration33 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap34 = kerberosUserConfiguration33.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration29.setoptions(strMap34);
        kerberosUserConfiguration24.setoptions(strMap34);
        kerberosUserConfiguration0.setoptions(strMap34);
        java.security.Provider provider38 = kerberosUserConfiguration0.getProvider();
        java.lang.String str39 = kerberosUserConfiguration0.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray41 = kerberosUserConfiguration0.getAppConfigurationEntry("hi!");
        java.lang.String str42 = kerberosUserConfiguration0.getType();
        java.security.Provider provider43 = kerberosUserConfiguration0.getProvider();
        kerberosUserConfiguration0.refresh();
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(strMap13);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(strMap27);
        org.junit.Assert.assertNull(strMap30);
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertNull(provider38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray41);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(provider43);
    }

    @Test
    public void test13663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13663");
        java.lang.String[] strArray19 = new java.lang.String[] { "", "hi!", "", "", "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters22 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters29 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters31 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray19, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters33 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters35 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray19, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters38 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray19, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters39 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray19);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters41 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray19, true);
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test13664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13664");
        java.lang.String[] strArray22 = new java.lang.String[] { "", "hi!", "", "", "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray22, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters25 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray22);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters27 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray22, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray22);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray22, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray22, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray22, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray22, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters38 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray22, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters39 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray22);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters41 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray22, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters42 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray22);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters43 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray22);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters44 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray22);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters46 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray22, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters48 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray22, false);
        org.junit.Assert.assertNotNull(strArray22);
    }

    @Test
    public void test13665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13665");
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "", "", "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters20 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters23 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters24 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters26 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters28 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters30 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters32 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters34 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters36 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray18, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters38 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18, true);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters40 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray18, true);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test13666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13666");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap1 = kerberosUserConfiguration0.options;
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration2 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap3 = null;
        kerberosUserConfiguration2.setoptions(strMap3);
        java.util.HashMap<java.lang.String, java.lang.String> strMap5 = kerberosUserConfiguration2.options;
        kerberosUserConfiguration2.refresh();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration7 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap8 = null;
        kerberosUserConfiguration7.setoptions(strMap8);
        java.util.HashMap<java.lang.String, java.lang.String> strMap10 = kerberosUserConfiguration7.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap11 = kerberosUserConfiguration7.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap12 = kerberosUserConfiguration7.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration2.options = strMap12;
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration2.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration2.getAppConfigurationEntry("hi!");
        java.util.HashMap<java.lang.String, java.lang.String> strMap17 = kerberosUserConfiguration2.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration0.setoptions(strMap17);
        javax.security.auth.login.Configuration.Parameters parameters19 = kerberosUserConfiguration0.getParameters();
        kerberosUserConfiguration0.refresh();
        java.util.HashMap<java.lang.String, java.lang.String> strMap21 = kerberosUserConfiguration0.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration0.refresh();
        java.util.HashMap<java.lang.String, java.lang.String> strMap23 = kerberosUserConfiguration0.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap24 = kerberosUserConfiguration0.getDEFAULT_KERBEROS_OPTIONS();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(strMap1);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNull(parameters19);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNotNull(strMap24);
    }

    @Test
    public void test13667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13667");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "hi!" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters12 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray11, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray11);
        tSSLTransportParameters19.setTrustStore("", "");
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test13668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13668");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap1 = null;
        kerberosUserConfiguration0.setoptions(strMap1);
        java.util.HashMap<java.lang.String, java.lang.String> strMap3 = kerberosUserConfiguration0.options;
        kerberosUserConfiguration0.refresh();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration5 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap6 = kerberosUserConfiguration5.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap7 = null;
        kerberosUserConfiguration5.options = strMap7;
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration9 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap10 = kerberosUserConfiguration9.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration5.setoptions(strMap10);
        kerberosUserConfiguration0.setoptions(strMap10);
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration0.getParameters();
        java.util.HashMap<java.lang.String, java.lang.String> strMap14 = kerberosUserConfiguration0.getDEFAULT_KERBEROS_OPTIONS();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration15 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap16 = null;
        kerberosUserConfiguration15.setoptions(strMap16);
        java.util.HashMap<java.lang.String, java.lang.String> strMap18 = kerberosUserConfiguration15.getDEFAULT_KERBEROS_OPTIONS();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration19 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap20 = kerberosUserConfiguration19.options;
        java.lang.String str21 = kerberosUserConfiguration19.getType();
        java.util.HashMap<java.lang.String, java.lang.String> strMap22 = kerberosUserConfiguration19.options;
        kerberosUserConfiguration19.refresh();
        java.util.HashMap<java.lang.String, java.lang.String> strMap24 = kerberosUserConfiguration19.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration15.options = strMap24;
        java.security.Provider provider26 = kerberosUserConfiguration15.getProvider();
        java.lang.String str27 = kerberosUserConfiguration15.getType();
        kerberosUserConfiguration15.refresh();
        java.util.HashMap<java.lang.String, java.lang.String> strMap29 = kerberosUserConfiguration15.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration0.setoptions(strMap29);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNull(strMap20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(strMap22);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNull(provider26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(strMap29);
    }

    @Test
    public void test13669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13669");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap1 = null;
        kerberosUserConfiguration0.setoptions(strMap1);
        java.util.HashMap<java.lang.String, java.lang.String> strMap3 = kerberosUserConfiguration0.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap4 = kerberosUserConfiguration0.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap5 = kerberosUserConfiguration0.getoptions();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration7 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration7.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration7.getAppConfigurationEntry("");
        java.util.HashMap<java.lang.String, java.lang.String> strMap12 = kerberosUserConfiguration7.getDEFAULT_KERBEROS_OPTIONS();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration14 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration14.refresh();
        java.security.Provider provider16 = kerberosUserConfiguration14.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap17 = kerberosUserConfiguration14.getDEFAULT_KERBEROS_OPTIONS();
        java.security.Provider provider18 = kerberosUserConfiguration14.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap19 = kerberosUserConfiguration14.getoptions();
        kerberosUserConfiguration7.setoptions(strMap19);
        kerberosUserConfiguration0.options = strMap19;
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration23 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration23.refresh();
        java.security.Provider provider25 = kerberosUserConfiguration23.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap26 = kerberosUserConfiguration23.getDEFAULT_KERBEROS_OPTIONS();
        java.security.Provider provider27 = kerberosUserConfiguration23.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration23);
        java.util.HashMap<java.lang.String, java.lang.String> strMap29 = kerberosUserConfiguration23.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration0.options = strMap29;
        java.security.Provider provider31 = kerberosUserConfiguration0.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap32 = kerberosUserConfiguration0.options;
        java.lang.Class<?> wildcardClass33 = strMap32.getClass();
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNull(provider18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNull(provider25);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNull(provider27);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertNull(provider31);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test13670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13670");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration0 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap1 = null;
        kerberosUserConfiguration0.setoptions(strMap1);
        java.util.HashMap<java.lang.String, java.lang.String> strMap3 = kerberosUserConfiguration0.options;
        kerberosUserConfiguration0.refresh();
        kerberosUserConfiguration0.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration0.getProvider();
        java.lang.String str7 = kerberosUserConfiguration0.getType();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration9 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration9.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration9);
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration12 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap13 = null;
        kerberosUserConfiguration12.setoptions(strMap13);
        java.util.HashMap<java.lang.String, java.lang.String> strMap15 = kerberosUserConfiguration12.options;
        kerberosUserConfiguration12.refresh();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration17 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap18 = null;
        kerberosUserConfiguration17.setoptions(strMap18);
        java.util.HashMap<java.lang.String, java.lang.String> strMap20 = kerberosUserConfiguration17.options;
        java.util.HashMap<java.lang.String, java.lang.String> strMap21 = kerberosUserConfiguration17.getoptions();
        java.util.HashMap<java.lang.String, java.lang.String> strMap22 = kerberosUserConfiguration17.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration12.options = strMap22;
        kerberosUserConfiguration9.setoptions(strMap22);
        java.util.HashMap<java.lang.String, java.lang.String> strMap25 = kerberosUserConfiguration9.getDEFAULT_KERBEROS_OPTIONS();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration26 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration();
        java.util.HashMap<java.lang.String, java.lang.String> strMap27 = kerberosUserConfiguration26.getDEFAULT_KERBEROS_OPTIONS();
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration29 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration29.refresh();
        java.security.Provider provider31 = kerberosUserConfiguration29.getProvider();
        java.util.HashMap<java.lang.String, java.lang.String> strMap32 = kerberosUserConfiguration29.getDEFAULT_KERBEROS_OPTIONS();
        kerberosUserConfiguration26.setoptions(strMap32);
        java.util.HashMap<java.lang.String, java.lang.String> strMap34 = kerberosUserConfiguration26.getoptions();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration26);
        java.util.HashMap<java.lang.String, java.lang.String> strMap36 = kerberosUserConfiguration26.options;
        kerberosUserConfiguration9.setoptions(strMap36);
        kerberosUserConfiguration0.setoptions(strMap36);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray40 = kerberosUserConfiguration0.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration0);
        kerberosUserConfiguration0.refresh();
        java.util.HashMap<java.lang.String, java.lang.String> strMap43 = kerberosUserConfiguration0.getoptions();
        java.security.Provider provider44 = kerberosUserConfiguration0.getProvider();
        java.security.Provider provider45 = kerberosUserConfiguration0.getProvider();
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNull(strMap20);
        org.junit.Assert.assertNull(strMap21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNull(provider31);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertNotNull(strMap36);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray40);
        org.junit.Assert.assertNotNull(strMap43);
        org.junit.Assert.assertNull(provider44);
        org.junit.Assert.assertNull(provider45);
    }

    @Test
    public void test13671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13671");
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "", "", "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters21 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        tSSLTransportParameters21.setKeyStore("", "hi!", "hi!", "");
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test13672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13672");
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "", "", "", "" };
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters14 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12, false);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters15 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters16 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("hi!", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters17 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters18 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters tSSLTransportParameters19 = new org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters("", strArray12);
        tSSLTransportParameters19.setKeyStore("", "", "hi!", "hi!");
        tSSLTransportParameters19.setKeyStore("hi!", "", "", "");
        tSSLTransportParameters19.setKeyStore("", "hi!");
        org.junit.Assert.assertNotNull(strArray12);
    }
}

