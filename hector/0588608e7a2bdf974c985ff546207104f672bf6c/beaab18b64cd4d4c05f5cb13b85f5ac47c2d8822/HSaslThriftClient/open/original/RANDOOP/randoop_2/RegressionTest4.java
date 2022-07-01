import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test02001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02001");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test02002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02002");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration1.getParameters();
        java.lang.Class<?> wildcardClass18 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNull(parameters17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test02003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02003");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test02004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02004");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        java.lang.Class<?> wildcardClass16 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test02005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02005");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass17 = appConfigurationEntryArray16.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test02006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02006");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass14 = appConfigurationEntryArray13.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test02007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02007");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test02008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02008");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test02009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02009");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        java.lang.String str16 = kerberosUserConfiguration1.getType();
        java.lang.String str17 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test02010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02010");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider19 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
        org.junit.Assert.assertNull(provider19);
    }

    @Test
    public void test02011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02011");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass11 = appConfigurationEntryArray10.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test02012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02012");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test02013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02013");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test02014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02014");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test02015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02015");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        java.lang.Class<?> wildcardClass15 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test02016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02016");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(parameters16);
    }

    @Test
    public void test02017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02017");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test02018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02018");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str19 = kerberosUserConfiguration1.getType();
        java.security.Provider provider20 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters21 = kerberosUserConfiguration1.getParameters();
        java.lang.Class<?> wildcardClass22 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(provider20);
        org.junit.Assert.assertNull(parameters21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test02019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02019");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test02020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02020");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration1.getParameters();
        java.lang.String str18 = kerberosUserConfiguration1.getType();
        java.lang.Class<?> wildcardClass19 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(parameters15);
        org.junit.Assert.assertNull(parameters17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test02021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02021");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = parameters13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test02022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02022");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test02023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02023");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider20 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNull(provider20);
    }

    @Test
    public void test02024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02024");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str16 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test02025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02025");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test02026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02026");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
    }

    @Test
    public void test02027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02027");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test02028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02028");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass17 = appConfigurationEntryArray16.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test02029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02029");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test02030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02030");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider18 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNull(provider18);
    }

    @Test
    public void test02031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02031");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test02032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02032");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test02033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02033");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        java.lang.String str16 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.lang.String str18 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters20 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(parameters20);
    }

    @Test
    public void test02034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02034");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass18 = appConfigurationEntryArray17.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test02035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02035");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test02036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02036");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider5);
    }

    @Test
    public void test02037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02037");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test02038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02038");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test02039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02039");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = provider10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test02040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02040");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test02041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02041");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test02042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02042");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = parameters14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test02043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02043");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = provider11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider11);
    }

    @Test
    public void test02044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02044");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test02045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02045");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
    }

    @Test
    public void test02046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02046");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider9);
    }

    @Test
    public void test02047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02047");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
    }

    @Test
    public void test02048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02048");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test02049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02049");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test02050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02050");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test02051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02051");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.Class<?> wildcardClass16 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test02052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02052");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test02053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02053");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
    }

    @Test
    public void test02054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02054");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test02055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02055");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider19 = kerberosUserConfiguration1.getProvider();
        java.lang.Class<?> wildcardClass20 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
        org.junit.Assert.assertNull(provider19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test02056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02056");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray21 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray21);
    }

    @Test
    public void test02057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02057");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration1.getParameters();
        java.lang.Class<?> wildcardClass18 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNull(parameters17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test02058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02058");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration1.getParameters();
        java.lang.String str18 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters19 = kerberosUserConfiguration1.getParameters();
        java.lang.String str20 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters22 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass24 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNull(parameters17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(parameters19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(parameters22);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test02059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02059");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(provider15);
    }

    @Test
    public void test02060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02060");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test02061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02061");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
    }

    @Test
    public void test02062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02062");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        java.security.Provider provider1 = configuration0.getProvider();
        java.security.Provider provider2 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        configuration0.refresh();
        java.security.Provider provider5 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.Parameters parameters7 = configuration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.lang.Class<?> wildcardClass10 = configuration0.getClass();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test02063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02063");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test02064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02064");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = parameters8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test02065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02065");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test02066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02066");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
    }

    @Test
    public void test02067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02067");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test02068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02068");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass16 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test02069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02069");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test02070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02070");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test02071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02071");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test02072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02072");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass15 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test02073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02073");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        java.security.Provider provider1 = configuration0.getProvider();
        java.security.Provider provider2 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        configuration0.refresh();
        java.security.Provider provider5 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.Parameters parameters7 = configuration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.lang.String str9 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters10 = configuration0.getParameters();
        configuration0.refresh();
        java.lang.Class<?> wildcardClass12 = configuration0.getClass();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test02074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02074");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
    }

    @Test
    public void test02075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02075");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
    }

    @Test
    public void test02076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02076");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test02077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02077");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test02078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02078");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = parameters13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test02079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02079");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = provider9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider9);
    }

    @Test
    public void test02080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02080");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = parameters13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test02081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02081");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass16 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test02082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02082");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        java.lang.Class<?> wildcardClass15 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test02083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02083");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(parameters16);
    }

    @Test
    public void test02084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02084");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test02085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02085");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider18 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray20 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass21 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNull(provider18);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test02086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02086");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test02087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02087");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test02088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02088");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test02089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02089");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = parameters9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test02090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02090");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
    }

    @Test
    public void test02091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02091");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass10 = appConfigurationEntryArray9.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test02092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02092");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
    }

    @Test
    public void test02093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02093");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test02094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02094");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test02095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02095");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = provider10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test02096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02096");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        java.security.Provider provider1 = configuration0.getProvider();
        java.security.Provider provider2 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        configuration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(provider2);
    }

    @Test
    public void test02097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02097");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
    }

    @Test
    public void test02098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02098");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        java.security.Provider provider1 = configuration0.getProvider();
        java.security.Provider provider2 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.lang.String str5 = configuration0.getType();
        java.lang.String str6 = configuration0.getType();
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters8 = configuration0.getParameters();
        java.security.Provider provider9 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.lang.String str11 = configuration0.getType();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test02099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02099");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.Class<?> wildcardClass17 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test02100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02100");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test02101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02101");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test02102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02102");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass15 = appConfigurationEntryArray14.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test02103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02103");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass19 = appConfigurationEntryArray18.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test02104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02104");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test02105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02105");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test02106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02106");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        java.lang.String str16 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray19 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider20 = kerberosUserConfiguration1.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass21 = provider20.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray19);
        org.junit.Assert.assertNull(provider20);
    }

    @Test
    public void test02107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02107");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test02108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02108");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
    }

    @Test
    public void test02109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02109");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test02110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02110");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test02111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02111");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.Class<?> wildcardClass7 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test02112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02112");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        java.security.Provider provider1 = configuration0.getProvider();
        configuration0.refresh();
        java.lang.String str3 = configuration0.getType();
        java.security.Provider provider4 = configuration0.getProvider();
        java.security.Provider provider5 = configuration0.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = provider5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(provider5);
    }

    @Test
    public void test02113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02113");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test02114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02114");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
    }

    @Test
    public void test02115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02115");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.Class<?> wildcardClass16 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test02116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02116");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        java.security.Provider provider1 = configuration0.getProvider();
        java.security.Provider provider2 = configuration0.getProvider();
        java.lang.Class<?> wildcardClass3 = configuration0.getClass();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test02117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02117");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
    }

    @Test
    public void test02118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02118");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test02119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02119");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test02120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02120");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = provider9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider9);
    }

    @Test
    public void test02121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02121");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(parameters4);
    }

    @Test
    public void test02122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02122");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
    }

    @Test
    public void test02123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02123");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        java.security.Provider provider1 = configuration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters2 = configuration0.getParameters();
        configuration0.refresh();
        java.security.Provider provider4 = configuration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters5 = configuration0.getParameters();
        configuration0.refresh();
        configuration0.refresh();
        configuration0.refresh();
        java.lang.Class<?> wildcardClass9 = configuration0.getClass();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test02124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02124");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
    }

    @Test
    public void test02125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02125");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
    }

    @Test
    public void test02126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02126");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test02127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02127");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test02128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02128");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
    }

    @Test
    public void test02129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02129");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = provider11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider11);
    }

    @Test
    public void test02130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02130");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test02131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02131");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
    }

    @Test
    public void test02132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02132");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test02133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02133");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.lang.Class<?> wildcardClass8 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test02134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02134");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str17 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters18 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass20 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(parameters18);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test02135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02135");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass17 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test02136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02136");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test02137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02137");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = parameters9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test02138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02138");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test02139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02139");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test02140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02140");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(provider12);
    }

    @Test
    public void test02141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02141");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass16 = appConfigurationEntryArray15.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test02142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02142");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        java.security.Provider provider1 = configuration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters2 = configuration0.getParameters();
        configuration0.refresh();
        java.security.Provider provider4 = configuration0.getProvider();
        java.security.Provider provider5 = configuration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters6 = configuration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.lang.Class<?> wildcardClass8 = configuration0.getClass();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test02143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02143");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test02144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02144");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test02145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02145");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
    }

    @Test
    public void test02146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02146");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(provider14);
    }

    @Test
    public void test02147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02147");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
    }

    @Test
    public void test02148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02148");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass11 = appConfigurationEntryArray10.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test02149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02149");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass8 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test02150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02150");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test02151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02151");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test02152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02152");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.Class<?> wildcardClass6 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test02153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02153");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters18 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider19 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters20 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider21 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNull(parameters17);
        org.junit.Assert.assertNull(parameters18);
        org.junit.Assert.assertNull(provider19);
        org.junit.Assert.assertNull(parameters20);
        org.junit.Assert.assertNull(provider21);
    }

    @Test
    public void test02154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02154");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test02155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02155");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass16 = appConfigurationEntryArray15.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test02156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02156");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test02157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02157");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        java.security.Provider provider1 = configuration0.getProvider();
        java.security.Provider provider2 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        configuration0.refresh();
        java.security.Provider provider5 = configuration0.getProvider();
        java.security.Provider provider6 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        configuration0.refresh();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
    }

    @Test
    public void test02158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02158");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
    }

    @Test
    public void test02159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02159");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test02160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02160");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.Class<?> wildcardClass15 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test02161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02161");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
    }

    @Test
    public void test02162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02162");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass14 = appConfigurationEntryArray13.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test02163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02163");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test02164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02164");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str19 = kerberosUserConfiguration1.getType();
        java.security.Provider provider20 = kerberosUserConfiguration1.getProvider();
        java.lang.String str21 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(provider20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test02165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02165");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass8 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test02166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02166");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider3 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        java.lang.Class<?> wildcardClass5 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test02167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02167");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass16 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test02168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02168");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass12 = appConfigurationEntryArray11.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test02169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02169");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test02170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02170");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test02171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02171");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
    }

    @Test
    public void test02172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02172");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider3 = kerberosUserConfiguration1.getProvider();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
    }

    @Test
    public void test02173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02173");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test02174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02174");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str17 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray19 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters20 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray19);
        org.junit.Assert.assertNull(parameters20);
    }

    @Test
    public void test02175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02175");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = provider10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test02176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02176");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass17 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test02177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02177");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        java.lang.String str16 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray19 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider20 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters21 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray19);
        org.junit.Assert.assertNull(provider20);
        org.junit.Assert.assertNull(parameters21);
    }

    @Test
    public void test02178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02178");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test02179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02179");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        java.security.Provider provider1 = configuration0.getProvider();
        java.security.Provider provider2 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.lang.String str4 = configuration0.getType();
        java.lang.String str5 = configuration0.getType();
        java.security.Provider provider6 = configuration0.getProvider();
        java.security.Provider provider7 = configuration0.getProvider();
        java.lang.String str8 = configuration0.getType();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test02180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02180");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
    }

    @Test
    public void test02181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02181");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.Class<?> wildcardClass7 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test02182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02182");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass19 = appConfigurationEntryArray18.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test02183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02183");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test02184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02184");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider16 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(provider16);
    }

    @Test
    public void test02185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02185");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test02186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02186");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
    }

    @Test
    public void test02187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02187");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(provider14);
    }

    @Test
    public void test02188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02188");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
    }

    @Test
    public void test02189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02189");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test02190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02190");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = parameters7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters7);
    }

    @Test
    public void test02191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02191");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
    }

    @Test
    public void test02192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02192");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass17 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test02193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02193");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass19 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test02194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02194");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
    }

    @Test
    public void test02195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02195");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test02196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02196");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        java.security.Provider provider1 = configuration0.getProvider();
        java.security.Provider provider2 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.Parameters parameters5 = configuration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.lang.String str8 = configuration0.getType();
        configuration0.refresh();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test02197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02197");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider3 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.lang.Class<?> wildcardClass6 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test02198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02198");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test02199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02199");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider17 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray19 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray21 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray19);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray21);
    }

    @Test
    public void test02200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02200");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test02201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02201");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test02202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02202");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass10 = appConfigurationEntryArray9.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test02203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02203");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test02204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02204");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
    }

    @Test
    public void test02205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02205");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
    }

    @Test
    public void test02206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02206");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray21 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters22 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray21);
        org.junit.Assert.assertNull(parameters22);
    }

    @Test
    public void test02207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02207");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
    }

    @Test
    public void test02208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02208");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test02209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02209");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test02210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02210");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test02211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02211");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test02212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02212");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test02213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02213");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider3 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider12);
    }

    @Test
    public void test02214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02214");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test02215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02215");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test02216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02216");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider3 = kerberosUserConfiguration1.getProvider();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test02217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02217");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass13 = appConfigurationEntryArray12.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test02218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02218");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test02219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02219");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        java.lang.Class<?> wildcardClass15 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test02220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02220");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider3 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test02221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02221");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test02222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02222");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider7);
    }

    @Test
    public void test02223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02223");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test02224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02224");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters19 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider20 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(parameters15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
        org.junit.Assert.assertNull(parameters19);
        org.junit.Assert.assertNull(provider20);
    }

    @Test
    public void test02225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02225");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(parameters16);
    }

    @Test
    public void test02226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02226");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test02227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02227");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
    }

    @Test
    public void test02228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02228");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(provider11);
    }

    @Test
    public void test02229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02229");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
    }

    @Test
    public void test02230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02230");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
    }

    @Test
    public void test02231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02231");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test02232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02232");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        java.security.Provider provider1 = configuration0.getProvider();
        java.security.Provider provider2 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        configuration0.refresh();
        java.security.Provider provider5 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.Parameters parameters7 = configuration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.security.Provider provider9 = configuration0.getProvider();
        java.security.Provider provider10 = configuration0.getProvider();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test02233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02233");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider17 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray19 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray21 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass22 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray19);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test02234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02234");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test02235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02235");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test02236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02236");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str18 = kerberosUserConfiguration1.getType();
        java.lang.Class<?> wildcardClass19 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test02237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02237");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test02238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02238");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray19 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str20 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray22 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray22);
    }

    @Test
    public void test02239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02239");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(provider15);
    }

    @Test
    public void test02240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02240");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        java.lang.String str16 = kerberosUserConfiguration1.getType();
        java.lang.String str17 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(parameters15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test02241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02241");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
    }

    @Test
    public void test02242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02242");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test02243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02243");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters6);
    }

    @Test
    public void test02244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02244");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test02245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02245");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str19 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider21 = kerberosUserConfiguration1.getProvider();
        java.lang.Class<?> wildcardClass22 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(provider21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test02246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02246");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
    }

    @Test
    public void test02247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02247");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider9);
    }

    @Test
    public void test02248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02248");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test02249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02249");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test02250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02250");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test02251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02251");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass12 = appConfigurationEntryArray11.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test02252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02252");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(provider11);
    }

    @Test
    public void test02253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02253");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        java.security.Provider provider1 = configuration0.getProvider();
        java.security.Provider provider2 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.lang.String str5 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters6 = configuration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.security.Provider provider8 = configuration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = configuration0.getParameters();
        java.security.Provider provider10 = configuration0.getProvider();
        java.security.Provider provider11 = configuration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters12 = configuration0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = parameters12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test02254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02254");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test02255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02255");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider16 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass19 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test02256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02256");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test02257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02257");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass15 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test02258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02258");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test02259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02259");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test02260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02260");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test02261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02261");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
        java.lang.Class<?> wildcardClass17 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test02262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02262");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test02263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02263");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test02264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02264");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider17 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray19 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray21 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider22 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray19);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray21);
        org.junit.Assert.assertNull(provider22);
    }

    @Test
    public void test02265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02265");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = provider10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test02266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02266");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test02267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02267");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test02268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02268");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = provider12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(provider12);
    }

    @Test
    public void test02269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02269");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass16 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test02270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02270");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        java.security.Provider provider1 = configuration0.getProvider();
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters4 = configuration0.getParameters();
        configuration0.refresh();
        java.security.Provider provider6 = configuration0.getProvider();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider6);
    }

    @Test
    public void test02271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02271");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test02272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02272");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
    }

    @Test
    public void test02273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02273");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass16 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test02274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02274");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test02275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02275");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        configuration0.refresh();
        java.security.Provider provider2 = configuration0.getProvider();
        java.security.Provider provider3 = configuration0.getProvider();
        java.security.Provider provider4 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.lang.Class<?> wildcardClass6 = configuration0.getClass();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test02276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02276");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass6 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test02277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02277");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test02278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02278");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test02279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02279");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(provider14);
    }

    @Test
    public void test02280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02280");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test02281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02281");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass17 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test02282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02282");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = parameters10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test02283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02283");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test02284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02284");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test02285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02285");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test02286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02286");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str17 = kerberosUserConfiguration1.getType();
        java.security.Provider provider18 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray20 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass21 = appConfigurationEntryArray20.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(provider18);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test02287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02287");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test02288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02288");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass13 = appConfigurationEntryArray12.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test02289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02289");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test02290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02290");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass17 = appConfigurationEntryArray16.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test02291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02291");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test02292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02292");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider17 = kerberosUserConfiguration1.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = provider17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(parameters15);
        org.junit.Assert.assertNull(provider17);
    }

    @Test
    public void test02293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02293");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test02294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02294");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass15 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test02295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02295");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test02296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02296");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
    }

    @Test
    public void test02297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02297");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(provider12);
    }

    @Test
    public void test02298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02298");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test02299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02299");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test02300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02300");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        java.security.Provider provider1 = configuration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters2 = configuration0.getParameters();
        java.lang.String str3 = configuration0.getType();
        java.lang.String str4 = configuration0.getType();
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = configuration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.security.Provider provider8 = configuration0.getProvider();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider8);
    }

    @Test
    public void test02301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02301");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test02302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02302");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
    }

    @Test
    public void test02303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02303");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass11 = appConfigurationEntryArray10.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test02304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02304");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
    }

    @Test
    public void test02305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02305");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test02306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02306");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider16 = kerberosUserConfiguration1.getProvider();
        java.lang.Class<?> wildcardClass17 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test02307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02307");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test02308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02308");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test02309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02309");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test02310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02310");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test02311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02311");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test02312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02312");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNull(parameters17);
    }

    @Test
    public void test02313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02313");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test02314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02314");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test02315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02315");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass16 = appConfigurationEntryArray15.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test02316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02316");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test02317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02317");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass15 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test02318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02318");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.lang.String str20 = kerberosUserConfiguration1.getType();
        java.security.Provider provider21 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters22 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(provider21);
        org.junit.Assert.assertNull(parameters22);
    }

    @Test
    public void test02319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02319");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test02320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02320");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        java.security.Provider provider1 = configuration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters2 = configuration0.getParameters();
        configuration0.refresh();
        java.security.Provider provider4 = configuration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters5 = configuration0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = parameters5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters5);
    }

    @Test
    public void test02321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02321");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test02322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02322");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = parameters13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test02323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02323");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
    }

    @Test
    public void test02324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02324");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass14 = appConfigurationEntryArray13.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test02325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02325");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test02326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02326");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test02327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02327");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = provider13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test02328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02328");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test02329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02329");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = parameters16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(parameters16);
    }

    @Test
    public void test02330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02330");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = provider8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
    }

    @Test
    public void test02331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02331");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test02332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02332");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(provider14);
    }

    @Test
    public void test02333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02333");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        java.lang.Class<?> wildcardClass16 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test02334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02334");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        configuration0.refresh();
        java.lang.String str2 = configuration0.getType();
        java.security.Provider provider3 = configuration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters4 = configuration0.getParameters();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters4);
    }

    @Test
    public void test02335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02335");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider20 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
        org.junit.Assert.assertNull(provider20);
    }

    @Test
    public void test02336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02336");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test02337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02337");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass13 = appConfigurationEntryArray12.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test02338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02338");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test02339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02339");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider16 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass19 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test02340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02340");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test02341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02341");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
    }

    @Test
    public void test02342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02342");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test02343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02343");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        java.security.Provider provider1 = configuration0.getProvider();
        configuration0.refresh();
        java.lang.String str3 = configuration0.getType();
        java.lang.String str4 = configuration0.getType();
        java.lang.String str5 = configuration0.getType();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test02344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02344");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider9);
    }

    @Test
    public void test02345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02345");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters18 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters20 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNull(parameters18);
        org.junit.Assert.assertNull(parameters20);
    }

    @Test
    public void test02346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02346");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = parameters8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test02347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02347");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
    }

    @Test
    public void test02348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02348");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test02349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02349");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test02350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02350");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider11);
    }

    @Test
    public void test02351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02351");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass15 = appConfigurationEntryArray14.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test02352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02352");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
    }

    @Test
    public void test02353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02353");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass12 = appConfigurationEntryArray11.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test02354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02354");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str17 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test02355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02355");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test02356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02356");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
    }

    @Test
    public void test02357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02357");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test02358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02358");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test02359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02359");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test02360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02360");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass17 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test02361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02361");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.Class<?> wildcardClass15 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test02362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02362");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test02363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02363");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
    }

    @Test
    public void test02364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02364");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
    }

    @Test
    public void test02365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02365");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str16 = kerberosUserConfiguration1.getType();
        java.security.Provider provider17 = kerberosUserConfiguration1.getProvider();
        java.lang.String str18 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test02366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02366");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray19 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str20 = kerberosUserConfiguration1.getType();
        java.security.Provider provider21 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass23 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(provider21);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test02367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02367");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = provider13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test02368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02368");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test02369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02369");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        java.security.Provider provider1 = configuration0.getProvider();
        java.security.Provider provider2 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        configuration0.refresh();
        java.security.Provider provider5 = configuration0.getProvider();
        java.security.Provider provider6 = configuration0.getProvider();
        java.security.Provider provider7 = configuration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters8 = configuration0.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = parameters8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test02370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02370");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test02371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02371");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
    }

    @Test
    public void test02372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02372");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider17 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray19 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass20 = appConfigurationEntryArray19.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test02373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02373");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test02374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02374");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test02375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02375");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test02376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02376");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
    }

    @Test
    public void test02377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02377");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test02378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02378");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(provider11);
    }

    @Test
    public void test02379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02379");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test02380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02380");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass18 = appConfigurationEntryArray17.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test02381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02381");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test02382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02382");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
    }

    @Test
    public void test02383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02383");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass15 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test02384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02384");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(parameters16);
    }

    @Test
    public void test02385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02385");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test02386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02386");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(provider12);
    }

    @Test
    public void test02387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02387");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test02388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02388");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = parameters12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test02389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02389");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass15 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test02390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02390");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test02391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02391");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test02392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02392");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.Class<?> wildcardClass8 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test02393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02393");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test02394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02394");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
    }

    @Test
    public void test02395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02395");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test02396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02396");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        java.lang.String str16 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(parameters15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test02397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02397");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test02398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02398");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test02399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02399");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        java.lang.String str16 = kerberosUserConfiguration1.getType();
        java.lang.String str17 = kerberosUserConfiguration1.getType();
        java.lang.String str18 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test02400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02400");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
    }

    @Test
    public void test02401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02401");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(parameters15);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
    }

    @Test
    public void test02402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02402");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test02403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02403");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = provider8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
    }

    @Test
    public void test02404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02404");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test02405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02405");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass15 = appConfigurationEntryArray14.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test02406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02406");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test02407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02407");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass18 = appConfigurationEntryArray17.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test02408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02408");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(parameters4);
    }

    @Test
    public void test02409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02409");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test02410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02410");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test02411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02411");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test02412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02412");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test02413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02413");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test02414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02414");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test02415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02415");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test02416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02416");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test02417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02417");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        java.lang.Class<?> wildcardClass15 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test02418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02418");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider11);
    }

    @Test
    public void test02419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02419");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str16 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass18 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test02420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02420");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test02421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02421");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(provider12);
    }

    @Test
    public void test02422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02422");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters18 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters19 = kerberosUserConfiguration1.getParameters();
        java.lang.String str20 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(parameters15);
        org.junit.Assert.assertNull(parameters17);
        org.junit.Assert.assertNull(parameters18);
        org.junit.Assert.assertNull(parameters19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test02423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02423");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test02424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02424");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        java.security.Provider provider1 = configuration0.getProvider();
        configuration0.refresh();
        java.lang.String str3 = configuration0.getType();
        java.security.Provider provider4 = configuration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters5 = configuration0.getParameters();
        java.lang.String str6 = configuration0.getType();
        java.lang.Class<?> wildcardClass7 = configuration0.getClass();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test02425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02425");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray19 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray21 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str22 = kerberosUserConfiguration1.getType();
        java.security.Provider provider23 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNull(parameters17);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray19);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(provider23);
    }

    @Test
    public void test02426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02426");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider17 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray19 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass20 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test02427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02427");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(parameters16);
    }

    @Test
    public void test02428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02428");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider3 = kerberosUserConfiguration1.getProvider();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test02429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02429");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test02430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02430");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(provider15);
    }

    @Test
    public void test02431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02431");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        java.lang.Class<?> wildcardClass16 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test02432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02432");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass9 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test02433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02433");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        java.security.Provider provider1 = configuration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters2 = configuration0.getParameters();
        java.lang.String str3 = configuration0.getType();
        java.security.Provider provider4 = configuration0.getProvider();
        java.security.Provider provider5 = configuration0.getProvider();
        configuration0.refresh();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(provider5);
    }

    @Test
    public void test02434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02434");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
    }

    @Test
    public void test02435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02435");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test02436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02436");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test02437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02437");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass12 = appConfigurationEntryArray11.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test02438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02438");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        java.security.Provider provider1 = configuration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters2 = configuration0.getParameters();
        configuration0.refresh();
        configuration0.refresh();
        java.security.Provider provider5 = configuration0.getProvider();
        java.lang.String str6 = configuration0.getType();
        java.lang.Class<?> wildcardClass7 = configuration0.getClass();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test02439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02439");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters18 = kerberosUserConfiguration1.getParameters();
        java.lang.String str19 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(parameters18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test02440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02440");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test02441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02441");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test02442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02442");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass7 = appConfigurationEntryArray6.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test02443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02443");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        java.lang.Class<?> wildcardClass8 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test02444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02444");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test02445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02445");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        java.lang.Class<?> wildcardClass6 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test02446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02446");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test02447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02447");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test02448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02448");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test02449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02449");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        java.lang.String str16 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.Class<?> wildcardClass18 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test02450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02450");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test02451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02451");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(parameters16);
    }

    @Test
    public void test02452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02452");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = provider14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(provider14);
    }

    @Test
    public void test02453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02453");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test02454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02454");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters18 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNull(parameters18);
    }

    @Test
    public void test02455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02455");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
    }

    @Test
    public void test02456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02456");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
    }

    @Test
    public void test02457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02457");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass13 = appConfigurationEntryArray12.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test02458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02458");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters18 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider21 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.Class<?> wildcardClass23 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNull(parameters18);
        org.junit.Assert.assertNull(provider21);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test02459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02459");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider18 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNull(provider18);
    }

    @Test
    public void test02460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02460");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        java.security.Provider provider1 = configuration0.getProvider();
        configuration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.security.Provider provider4 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.lang.String str6 = configuration0.getType();
        javax.security.auth.login.Configuration.Parameters parameters7 = configuration0.getParameters();
        java.security.Provider provider8 = configuration0.getProvider();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
    }

    @Test
    public void test02461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02461");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test02462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02462");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = provider8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
    }

    @Test
    public void test02463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02463");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider18 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters19 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(parameters17);
        org.junit.Assert.assertNull(provider18);
        org.junit.Assert.assertNull(parameters19);
    }

    @Test
    public void test02464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02464");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
    }

    @Test
    public void test02465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02465");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        java.security.Provider provider1 = configuration0.getProvider();
        java.security.Provider provider2 = configuration0.getProvider();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        configuration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.Parameters parameters7 = configuration0.getParameters();
        java.security.Provider provider8 = configuration0.getProvider();
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters10 = configuration0.getParameters();
        java.lang.Class<?> wildcardClass11 = configuration0.getClass();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(provider1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test02466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02466");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test02467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02467");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test02468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02468");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass7 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test02469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02469");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
    }

    @Test
    public void test02470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02470");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray20 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray20);
    }

    @Test
    public void test02471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02471");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(parameters17);
    }

    @Test
    public void test02472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02472");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray19 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters21 = kerberosUserConfiguration1.getParameters();
        java.lang.String str22 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray19);
        org.junit.Assert.assertNull(parameters21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test02473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02473");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test02474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02474");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test02475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02475");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
    }

    @Test
    public void test02476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02476");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration1.getParameters();
        java.lang.String str18 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters19 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray21 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass22 = appConfigurationEntryArray21.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNull(parameters17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(parameters19);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test02477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02477");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration1.getParameters();
        java.lang.String str18 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters19 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters20 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray22 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str23 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters24 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNull(parameters17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(parameters19);
        org.junit.Assert.assertNull(parameters20);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(parameters24);
    }

    @Test
    public void test02478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02478");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(provider11);
    }

    @Test
    public void test02479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02479");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test02480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02480");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider17 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNull(provider17);
    }

    @Test
    public void test02481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02481");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test02482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02482");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = parameters8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test02483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02483");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test02484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02484");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.lang.String str16 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test02485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02485");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        java.lang.String str16 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters19 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
        org.junit.Assert.assertNull(parameters19);
    }

    @Test
    public void test02486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02486");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test02487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02487");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        java.security.Provider provider16 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(provider16);
    }

    @Test
    public void test02488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02488");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test02489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02489");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test02490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02490");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test02491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02491");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.Class<?> wildcardClass7 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test02492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02492");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test02493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02493");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
    }

    @Test
    public void test02494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02494");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.Class<?> wildcardClass17 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test02495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02495");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test02496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02496");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(parameters15);
        org.junit.Assert.assertNull(parameters16);
    }

    @Test
    public void test02497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02497");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        java.lang.Class<?> wildcardClass8 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test02498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02498");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.lang.String str2 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
    }

    @Test
    public void test02499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02499");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test02500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02500");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        java.lang.Class<?> wildcardClass15 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }
}

