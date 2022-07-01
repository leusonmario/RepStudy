import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest33 {

    public static boolean debug = false;

    @Test
    public void test16501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16501");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray19 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray19);
    }

    @Test
    public void test16502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16502");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test16503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16503");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray19 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider20 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters21 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray19);
        org.junit.Assert.assertNull(provider20);
        org.junit.Assert.assertNull(parameters21);
    }

    @Test
    public void test16504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16504");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider3 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test16505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16505");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
    }

    @Test
    public void test16506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16506");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test16507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16507");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider3 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
    }

    @Test
    public void test16508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16508");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider3 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
    }

    @Test
    public void test16509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16509");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider18 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNull(provider18);
    }

    @Test
    public void test16510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16510");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test16511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16511");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test16512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16512");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test16513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16513");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider17 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider19 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNull(provider19);
    }

    @Test
    public void test16514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16514");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
        java.lang.Class<?> wildcardClass17 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test16515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16515");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test16516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16516");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider16 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(provider16);
    }

    @Test
    public void test16517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16517");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test16518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16518");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str16 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test16519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16519");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test16520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16520");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters19 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(parameters19);
    }

    @Test
    public void test16521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16521");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider16 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
    }

    @Test
    public void test16522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16522");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass9 = appConfigurationEntryArray8.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test16523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16523");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
    }

    @Test
    public void test16524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16524");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test16525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16525");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray19 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str20 = kerberosUserConfiguration1.getType();
        java.lang.String str21 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(parameters17);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test16526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16526");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test16527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16527");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test16528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16528");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test16529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16529");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test16530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16530");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(provider14);
    }

    @Test
    public void test16531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16531");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
    }

    @Test
    public void test16532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16532");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider18 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNull(provider18);
    }

    @Test
    public void test16533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16533");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider16 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.Class<?> wildcardClass18 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test16534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16534");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test16535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16535");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration1.getParameters();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test16536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16536");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test16537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16537");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test16538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16538");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
    }

    @Test
    public void test16539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16539");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test16540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16540");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters20 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider21 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
        org.junit.Assert.assertNull(parameters20);
        org.junit.Assert.assertNull(provider21);
    }

    @Test
    public void test16541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16541");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration1.getParameters();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test16542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16542");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
    }

    @Test
    public void test16543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16543");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test16544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16544");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test16545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16545");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test16546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16546");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test16547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16547");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
    }

    @Test
    public void test16548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16548");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
    }

    @Test
    public void test16549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16549");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider16 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(provider16);
    }

    @Test
    public void test16550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16550");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test16551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16551");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
    }

    @Test
    public void test16552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16552");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(provider15);
    }

    @Test
    public void test16553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16553");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider17 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(provider17);
    }

    @Test
    public void test16554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16554");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider17 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(provider17);
    }

    @Test
    public void test16555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16555");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider3 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
    }

    @Test
    public void test16556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16556");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
    }

    @Test
    public void test16557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16557");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider16 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider17 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNull(provider17);
    }

    @Test
    public void test16558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16558");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test16559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16559");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test16560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16560");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
    }

    @Test
    public void test16561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16561");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters18 = kerberosUserConfiguration1.getParameters();
        java.lang.String str19 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray23 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters24 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNull(parameters18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray23);
        org.junit.Assert.assertNull(parameters24);
    }

    @Test
    public void test16562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16562");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
    }

    @Test
    public void test16563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16563");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray19 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(parameters17);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray19);
    }

    @Test
    public void test16564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16564");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        java.lang.String str16 = kerberosUserConfiguration1.getType();
        java.lang.String str17 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray19 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray19);
    }

    @Test
    public void test16565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16565");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test16566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16566");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test16567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16567");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider17 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray21 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray21);
    }

    @Test
    public void test16568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16568");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test16569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16569");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider16 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(provider16);
    }

    @Test
    public void test16570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16570");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test16571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16571");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass17 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test16572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16572");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test16573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16573");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
    }

    @Test
    public void test16574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16574");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test16575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16575");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test16576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16576");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider3 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test16577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16577");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test16578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16578");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test16579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16579");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = provider7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
    }

    @Test
    public void test16580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16580");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider11);
    }

    @Test
    public void test16581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16581");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
    }

    @Test
    public void test16582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16582");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test16583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16583");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass16 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test16584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16584");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test16585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16585");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test16586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16586");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test16587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16587");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider20 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider21 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray23 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider24 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray28 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
        org.junit.Assert.assertNull(provider20);
        org.junit.Assert.assertNull(provider21);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray23);
        org.junit.Assert.assertNull(provider24);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray28);
    }

    @Test
    public void test16588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16588");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test16589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16589");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider17 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters18 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray21 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNull(parameters18);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray21);
    }

    @Test
    public void test16590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16590");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
    }

    @Test
    public void test16591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16591");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNull(parameters17);
    }

    @Test
    public void test16592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16592");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        java.lang.String str16 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration1.getParameters();
        java.lang.String str18 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(parameters17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test16593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16593");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test16594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16594");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test16595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16595");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test16596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16596");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test16597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16597");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(provider14);
    }

    @Test
    public void test16598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16598");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test16599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16599");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
    }

    @Test
    public void test16600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16600");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
    }

    @Test
    public void test16601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16601");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters19 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters21 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(parameters17);
        org.junit.Assert.assertNull(parameters19);
        org.junit.Assert.assertNull(parameters21);
    }

    @Test
    public void test16602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16602");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters18 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNull(parameters18);
    }

    @Test
    public void test16603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16603");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test16604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16604");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test16605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16605");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider3 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test16606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16606");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider16 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(provider16);
    }

    @Test
    public void test16607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16607");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
    }

    @Test
    public void test16608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16608");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
    }

    @Test
    public void test16609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16609");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test16610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16610");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
    }

    @Test
    public void test16611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16611");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider11);
    }

    @Test
    public void test16612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16612");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
    }

    @Test
    public void test16613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16613");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test16614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16614");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(provider12);
    }

    @Test
    public void test16615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16615");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(provider15);
    }

    @Test
    public void test16616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16616");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNull(parameters17);
    }

    @Test
    public void test16617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16617");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider11);
    }

    @Test
    public void test16618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16618");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = parameters13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test16619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16619");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test16620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16620");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters19 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider20 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
        org.junit.Assert.assertNull(parameters19);
        org.junit.Assert.assertNull(provider20);
    }

    @Test
    public void test16621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16621");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test16622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16622");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration1.getParameters();
        java.lang.Class<?> wildcardClass18 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(parameters17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test16623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16623");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNull(parameters17);
    }

    @Test
    public void test16624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16624");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test16625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16625");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test16626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16626");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider16 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(provider16);
    }

    @Test
    public void test16627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16627");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test16628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16628");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
    }

    @Test
    public void test16629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16629");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test16630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16630");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.lang.String str20 = kerberosUserConfiguration1.getType();
        java.security.Provider provider21 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray23 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(provider21);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray23);
    }

    @Test
    public void test16631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16631");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass15 = appConfigurationEntryArray14.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test16632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16632");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider17 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray19 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray21 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray19);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray21);
    }

    @Test
    public void test16633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16633");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters2 = configuration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.lang.String str4 = configuration0.getType();
        java.security.Provider provider5 = configuration0.getProvider();
        configuration0.refresh();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.security.Provider provider8 = configuration0.getProvider();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider8);
    }

    @Test
    public void test16634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16634");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test16635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16635");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
    }

    @Test
    public void test16636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16636");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray19 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass20 = appConfigurationEntryArray19.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test16637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16637");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
        java.lang.String str17 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray19 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(parameters15);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray19);
    }

    @Test
    public void test16638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16638");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str18 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters19 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider21 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(parameters19);
        org.junit.Assert.assertNull(provider21);
    }

    @Test
    public void test16639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16639");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test16640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16640");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test16641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16641");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test16642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16642");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(provider14);
    }

    @Test
    public void test16643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16643");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test16644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16644");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider3 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider7);
    }

    @Test
    public void test16645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16645");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str17 = kerberosUserConfiguration1.getType();
        java.security.Provider provider18 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(provider18);
    }

    @Test
    public void test16646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16646");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider19 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNull(provider19);
    }

    @Test
    public void test16647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16647");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str16 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters18 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray21 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters22 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider23 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters24 = kerberosUserConfiguration1.getParameters();
        java.lang.String str25 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(parameters17);
        org.junit.Assert.assertNull(parameters18);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray21);
        org.junit.Assert.assertNull(parameters22);
        org.junit.Assert.assertNull(provider23);
        org.junit.Assert.assertNull(parameters24);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test16648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16648");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
    }

    @Test
    public void test16649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16649");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        java.lang.String str16 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider19 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(parameters15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(provider19);
    }

    @Test
    public void test16650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16650");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.lang.String str16 = kerberosUserConfiguration1.getType();
        java.lang.String str17 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray19 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray19);
    }

    @Test
    public void test16651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16651");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test16652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16652");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.Class<?> wildcardClass17 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test16653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16653");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration1.getParameters();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test16654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16654");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test16655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16655");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str16 = kerberosUserConfiguration1.getType();
        java.lang.String str17 = kerberosUserConfiguration1.getType();
        java.lang.String str18 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters19 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(parameters19);
    }

    @Test
    public void test16656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16656");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider3 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test16657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16657");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.lang.String str17 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test16658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16658");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test16659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16659");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
    }

    @Test
    public void test16660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16660");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
    }

    @Test
    public void test16661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16661");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
    }

    @Test
    public void test16662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16662");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(provider15);
    }

    @Test
    public void test16663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16663");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray19 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str20 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider22 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(parameters17);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(provider22);
    }

    @Test
    public void test16664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16664");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test16665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16665");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider9);
    }

    @Test
    public void test16666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16666");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
    }

    @Test
    public void test16667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16667");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
    }

    @Test
    public void test16668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16668");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test16669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16669");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str16 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test16670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16670");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
    }

    @Test
    public void test16671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16671");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(provider12);
    }

    @Test
    public void test16672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16672");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str17 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider19 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(provider19);
    }

    @Test
    public void test16673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16673");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider16 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(provider16);
    }

    @Test
    public void test16674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16674");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(provider15);
    }

    @Test
    public void test16675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16675");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test16676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16676");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
    }

    @Test
    public void test16677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16677");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str16 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray20 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters22 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider24 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider25 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(parameters17);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray20);
        org.junit.Assert.assertNull(parameters22);
        org.junit.Assert.assertNull(provider24);
        org.junit.Assert.assertNull(provider25);
    }

    @Test
    public void test16678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16678");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider16 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNull(parameters17);
    }

    @Test
    public void test16679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16679");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test16680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16680");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str17 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test16681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16681");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
    }

    @Test
    public void test16682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16682");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test16683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16683");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = parameters13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test16684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16684");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str16 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters19 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray21 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(parameters19);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray21);
    }

    @Test
    public void test16685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16685");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
    }

    @Test
    public void test16686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16686");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test16687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16687");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider11);
    }

    @Test
    public void test16688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16688");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test16689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16689");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = parameters10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test16690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16690");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider18 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider19 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str21 = kerberosUserConfiguration1.getType();
        java.lang.String str22 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(parameters17);
        org.junit.Assert.assertNull(provider18);
        org.junit.Assert.assertNull(provider19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test16691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16691");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass16 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test16692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16692");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test16693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16693");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test16694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16694");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str17 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray19 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray19);
    }

    @Test
    public void test16695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16695");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        java.lang.String str16 = kerberosUserConfiguration1.getType();
        java.lang.String str17 = kerberosUserConfiguration1.getType();
        java.lang.String str18 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters20 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(parameters15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(parameters20);
    }

    @Test
    public void test16696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16696");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(parameters15);
        org.junit.Assert.assertNull(parameters16);
    }

    @Test
    public void test16697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16697");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test16698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16698");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
    }

    @Test
    public void test16699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16699");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
    }

    @Test
    public void test16700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16700");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters5);
    }

    @Test
    public void test16701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16701");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(parameters17);
    }

    @Test
    public void test16702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16702");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider12);
    }

    @Test
    public void test16703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16703");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test16704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16704");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(parameters16);
    }

    @Test
    public void test16705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16705");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test16706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16706");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider9);
    }

    @Test
    public void test16707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16707");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider18 = kerberosUserConfiguration1.getProvider();
        java.lang.String str19 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str21 = kerberosUserConfiguration1.getType();
        java.lang.String str22 = kerberosUserConfiguration1.getType();
        java.security.Provider provider23 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider24 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNull(provider18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(provider23);
        org.junit.Assert.assertNull(provider24);
    }

    @Test
    public void test16708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16708");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(provider14);
    }

    @Test
    public void test16709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16709");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
    }

    @Test
    public void test16710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16710");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test16711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16711");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test16712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16712");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider17 = kerberosUserConfiguration1.getProvider();
        java.lang.String str18 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider20 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(provider20);
    }

    @Test
    public void test16713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16713");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test16714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16714");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(parameters15);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNull(parameters17);
    }

    @Test
    public void test16715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16715");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test16716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16716");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
    }

    @Test
    public void test16717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16717");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
    }

    @Test
    public void test16718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16718");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test16719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16719");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test16720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16720");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test16721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16721");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test16722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16722");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test16723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16723");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test16724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16724");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test16725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16725");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters18 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNull(parameters18);
    }

    @Test
    public void test16726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16726");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test16727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16727");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider3 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test16728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16728");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(provider15);
    }

    @Test
    public void test16729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16729");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(provider15);
    }

    @Test
    public void test16730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16730");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider16 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters19 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
        org.junit.Assert.assertNull(parameters19);
    }

    @Test
    public void test16731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16731");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test16732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16732");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test16733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16733");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(provider6);
    }

    @Test
    public void test16734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16734");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        java.lang.Class<?> wildcardClass16 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test16735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16735");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider16 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
    }

    @Test
    public void test16736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16736");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters19 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(parameters19);
    }

    @Test
    public void test16737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16737");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider17 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(provider17);
    }

    @Test
    public void test16738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16738");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider9);
    }

    @Test
    public void test16739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16739");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters18 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNull(parameters18);
    }

    @Test
    public void test16740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16740");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        java.lang.String str16 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters18 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(parameters15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(parameters18);
    }

    @Test
    public void test16741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16741");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(provider14);
    }

    @Test
    public void test16742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16742");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test16743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16743");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.lang.String str17 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters18 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(parameters18);
    }

    @Test
    public void test16744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16744");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test16745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16745");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass10 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test16746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16746");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        java.lang.String str16 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str18 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test16747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16747");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider16 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters19 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
        org.junit.Assert.assertNull(parameters19);
    }

    @Test
    public void test16748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16748");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
    }

    @Test
    public void test16749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16749");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
    }

    @Test
    public void test16750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16750");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass19 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(parameters15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test16751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16751");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(parameters7);
    }

    @Test
    public void test16752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16752");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
    }

    @Test
    public void test16753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16753");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
    }

    @Test
    public void test16754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16754");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider3 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str16 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test16755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16755");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str16 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray21 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(parameters17);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray21);
    }

    @Test
    public void test16756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16756");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str16 = kerberosUserConfiguration1.getType();
        java.lang.String str17 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray19 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters20 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray19);
        org.junit.Assert.assertNull(parameters20);
    }

    @Test
    public void test16757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16757");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test16758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16758");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test16759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16759");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test16760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16760");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test16761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16761");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test16762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16762");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.lang.String str20 = kerberosUserConfiguration1.getType();
        java.security.Provider provider21 = kerberosUserConfiguration1.getProvider();
        java.lang.String str22 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(provider21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test16763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16763");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider3 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test16764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16764");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test16765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16765");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = parameters13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test16766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16766");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test16767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16767");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test16768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16768");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
    }

    @Test
    public void test16769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16769");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test16770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16770");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider3 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test16771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16771");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test16772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16772");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass17 = appConfigurationEntryArray16.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test16773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16773");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider18 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters19 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNull(provider18);
        org.junit.Assert.assertNull(parameters19);
    }

    @Test
    public void test16774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16774");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters18 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters19 = kerberosUserConfiguration1.getParameters();
        java.lang.String str20 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters21 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(parameters15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNull(parameters18);
        org.junit.Assert.assertNull(parameters19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(parameters21);
    }

    @Test
    public void test16775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16775");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider16 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(provider16);
    }

    @Test
    public void test16776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16776");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test16777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16777");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str16 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
    }

    @Test
    public void test16778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16778");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(parameters16);
    }

    @Test
    public void test16779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16779");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test16780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16780");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
    }

    @Test
    public void test16781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16781");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test16782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16782");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test16783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16783");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.lang.String str17 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters18 = kerberosUserConfiguration1.getParameters();
        java.lang.String str19 = kerberosUserConfiguration1.getType();
        java.security.Provider provider20 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(parameters18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(provider20);
    }

    @Test
    public void test16784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16784");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test16785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16785");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
    }

    @Test
    public void test16786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16786");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration1.getProvider();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider9);
    }

    @Test
    public void test16787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16787");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration1.getProvider();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test16788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16788");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str18 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test16789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16789");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str16 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray20 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters22 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.lang.String str24 = kerberosUserConfiguration1.getType();
        java.lang.String str25 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters26 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(parameters17);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray20);
        org.junit.Assert.assertNull(parameters22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(parameters26);
    }

    @Test
    public void test16790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16790");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(provider12);
    }

    @Test
    public void test16791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16791");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test16792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16792");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray19 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(parameters17);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray19);
    }

    @Test
    public void test16793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16793");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test16794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16794");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test16795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16795");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
    }

    @Test
    public void test16796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16796");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test16797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16797");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider3 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test16798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16798");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test16799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16799");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(parameters16);
    }

    @Test
    public void test16800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16800");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
    }

    @Test
    public void test16801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16801");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test16802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16802");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass18 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test16803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16803");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider17 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray19 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray19);
    }

    @Test
    public void test16804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16804");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str16 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test16805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16805");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider19 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters21 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNull(provider19);
        org.junit.Assert.assertNull(parameters21);
    }

    @Test
    public void test16806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16806");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test16807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16807");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test16808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16808");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
    }

    @Test
    public void test16809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16809");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider3 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters18 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNull(parameters18);
    }

    @Test
    public void test16810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16810");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test16811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16811");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(provider15);
    }

    @Test
    public void test16812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16812");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test16813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16813");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider18 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider19 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters20 = kerberosUserConfiguration1.getParameters();
        java.lang.String str21 = kerberosUserConfiguration1.getType();
        java.lang.String str22 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray25 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray27 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNull(provider18);
        org.junit.Assert.assertNull(provider19);
        org.junit.Assert.assertNull(parameters20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray25);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray27);
    }

    @Test
    public void test16814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16814");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider16 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters19 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
        org.junit.Assert.assertNull(parameters19);
    }

    @Test
    public void test16815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16815");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
    }

    @Test
    public void test16816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16816");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(provider14);
    }

    @Test
    public void test16817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16817");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters19 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNull(parameters17);
        org.junit.Assert.assertNull(parameters19);
    }

    @Test
    public void test16818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16818");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test16819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16819");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration1.getParameters();
        java.lang.String str18 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(parameters17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test16820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16820");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test16821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16821");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(provider12);
    }

    @Test
    public void test16822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16822");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider12);
    }

    @Test
    public void test16823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16823");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test16824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16824");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(provider15);
    }

    @Test
    public void test16825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16825");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider20 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider21 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNull(parameters17);
        org.junit.Assert.assertNull(provider20);
        org.junit.Assert.assertNull(provider21);
    }

    @Test
    public void test16826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16826");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test16827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16827");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test16828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16828");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
    }

    @Test
    public void test16829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16829");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(provider14);
    }

    @Test
    public void test16830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16830");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
    }

    @Test
    public void test16831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16831");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = parameters12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test16832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16832");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = parameters13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test16833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16833");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test16834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16834");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test16835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16835");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider17 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(provider17);
    }

    @Test
    public void test16836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16836");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test16837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16837");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test16838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16838");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(parameters16);
    }

    @Test
    public void test16839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16839");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test16840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16840");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test16841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16841");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass12 = appConfigurationEntryArray11.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test16842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16842");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
    }

    @Test
    public void test16843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16843");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test16844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16844");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str19 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters20 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(parameters20);
    }

    @Test
    public void test16845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16845");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test16846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16846");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider18 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider19 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider20 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider21 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(parameters17);
        org.junit.Assert.assertNull(provider18);
        org.junit.Assert.assertNull(provider19);
        org.junit.Assert.assertNull(provider20);
        org.junit.Assert.assertNull(provider21);
    }

    @Test
    public void test16847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16847");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray20 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters21 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray20);
        org.junit.Assert.assertNull(parameters21);
    }

    @Test
    public void test16848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16848");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.Class<?> wildcardClass8 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test16849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16849");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str16 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters18 = kerberosUserConfiguration1.getParameters();
        java.lang.Class<?> wildcardClass19 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(parameters17);
        org.junit.Assert.assertNull(parameters18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test16850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16850");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(parameters16);
    }

    @Test
    public void test16851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16851");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
    }

    @Test
    public void test16852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16852");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str18 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters19 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(parameters19);
    }

    @Test
    public void test16853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16853");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str17 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test16854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16854");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        configuration0.refresh();
        javax.security.auth.login.Configuration.Parameters parameters2 = configuration0.getParameters();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        java.lang.String str4 = configuration0.getType();
        java.security.Provider provider5 = configuration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters6 = configuration0.getParameters();
        java.lang.String str7 = configuration0.getType();
        java.lang.String str8 = configuration0.getType();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test16855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16855");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters18 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray20 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider22 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNull(parameters17);
        org.junit.Assert.assertNull(parameters18);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray20);
        org.junit.Assert.assertNull(provider22);
    }

    @Test
    public void test16856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16856");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test16857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16857");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test16858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16858");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test16859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16859");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
    }

    @Test
    public void test16860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16860");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters18 = kerberosUserConfiguration1.getParameters();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = parameters18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNull(parameters17);
        org.junit.Assert.assertNull(parameters18);
    }

    @Test
    public void test16861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16861");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test16862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16862");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test16863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16863");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test16864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16864");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test16865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16865");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider3 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
    }

    @Test
    public void test16866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16866");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
    }

    @Test
    public void test16867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16867");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
    }

    @Test
    public void test16868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16868");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test16869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16869");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str18 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test16870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16870");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str18 = kerberosUserConfiguration1.getType();
        java.lang.Class<?> wildcardClass19 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test16871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16871");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test16872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16872");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider16 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray20 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray20);
    }

    @Test
    public void test16873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16873");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters8);
    }

    @Test
    public void test16874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16874");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test16875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16875");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
    }

    @Test
    public void test16876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16876");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider16 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters19 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
        org.junit.Assert.assertNull(parameters19);
    }

    @Test
    public void test16877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16877");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration1.getParameters();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test16878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16878");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray3 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(parameters7);
    }

    @Test
    public void test16879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16879");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass19 = appConfigurationEntryArray18.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test16880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16880");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters12);
    }

    @Test
    public void test16881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16881");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(provider14);
    }

    @Test
    public void test16882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16882");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str17 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test16883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16883");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
    }

    @Test
    public void test16884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16884");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str16 = kerberosUserConfiguration1.getType();
        java.security.Provider provider17 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str19 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test16885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16885");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.lang.String str19 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(parameters15);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNull(parameters17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test16886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16886");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        java.lang.String str16 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(parameters17);
    }

    @Test
    public void test16887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16887");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration1.getParameters();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
    }

    @Test
    public void test16888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16888");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test16889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16889");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider3 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test16890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16890");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str16 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters18 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters20 = kerberosUserConfiguration1.getParameters();
        java.lang.String str21 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(parameters17);
        org.junit.Assert.assertNull(parameters18);
        org.junit.Assert.assertNull(parameters20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test16891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16891");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters18 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray20 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNull(parameters17);
        org.junit.Assert.assertNull(parameters18);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray20);
    }

    @Test
    public void test16892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16892");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray20 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters21 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray23 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray25 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray20);
        org.junit.Assert.assertNull(parameters21);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray23);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray25);
    }

    @Test
    public void test16893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16893");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test16894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16894");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        java.lang.String str16 = kerberosUserConfiguration1.getType();
        java.lang.String str17 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(parameters15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test16895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16895");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider19 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider20 = kerberosUserConfiguration1.getProvider();
        java.lang.Class<?> wildcardClass21 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(provider19);
        org.junit.Assert.assertNull(provider20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test16896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16896");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str18 = kerberosUserConfiguration1.getType();
        java.security.Provider provider19 = kerberosUserConfiguration1.getProvider();
        java.lang.String str20 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray22 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(provider19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray22);
    }

    @Test
    public void test16897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16897");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test16898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16898");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass17 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test16899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16899");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test16900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16900");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration1.getParameters();
        java.lang.Class<?> wildcardClass4 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test16901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16901");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
    }

    @Test
    public void test16902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16902");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        java.security.Provider provider16 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(provider16);
    }

    @Test
    public void test16903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16903");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider3 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
    }

    @Test
    public void test16904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16904");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider18 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray20 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNull(provider18);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray20);
    }

    @Test
    public void test16905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16905");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test16906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16906");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
    }

    @Test
    public void test16907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16907");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
    }

    @Test
    public void test16908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16908");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        java.lang.Class<?> wildcardClass16 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test16909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16909");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test16910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16910");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test16911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16911");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(parameters13);
    }

    @Test
    public void test16912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16912");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(parameters16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
    }

    @Test
    public void test16913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16913");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass15 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test16914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16914");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = provider8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
    }

    @Test
    public void test16915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16915");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
    }

    @Test
    public void test16916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16916");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str16 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str19 = kerberosUserConfiguration1.getType();
        java.lang.String str20 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(parameters17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test16917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16917");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider8);
    }

    @Test
    public void test16918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16918");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test16919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16919");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray19 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str20 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test16920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16920");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test16921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16921");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters19 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNull(parameters19);
    }

    @Test
    public void test16922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16922");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test16923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16923");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str16 = kerberosUserConfiguration1.getType();
        java.security.Provider provider17 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(provider17);
    }

    @Test
    public void test16924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16924");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass18 = appConfigurationEntryArray17.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test16925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16925");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass14 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test16926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16926");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
    }

    @Test
    public void test16927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16927");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test16928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16928");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
    }

    @Test
    public void test16929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16929");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(provider12);
    }

    @Test
    public void test16930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16930");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test16931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16931");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test16932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16932");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters18 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNull(parameters18);
    }

    @Test
    public void test16933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16933");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test16934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16934");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
    }

    @Test
    public void test16935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16935");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test16936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16936");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration1.getParameters();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass17 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test16937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16937");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test16938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16938");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test16939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16939");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters18 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider19 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNull(parameters18);
        org.junit.Assert.assertNull(provider19);
    }

    @Test
    public void test16940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16940");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters3 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
    }

    @Test
    public void test16941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16941");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider3 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test16942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16942");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test16943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16943");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.Class<?> wildcardClass11 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test16944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16944");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(provider15);
    }

    @Test
    public void test16945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16945");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        java.lang.String str16 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters17 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider19 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(parameters15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(parameters17);
        org.junit.Assert.assertNull(provider19);
    }

    @Test
    public void test16946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16946");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider5 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
    }

    @Test
    public void test16947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16947");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test16948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16948");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider18 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNull(provider18);
    }

    @Test
    public void test16949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16949");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(provider15);
    }

    @Test
    public void test16950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16950");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider16 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNull(provider16);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
    }

    @Test
    public void test16951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16951");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
    }

    @Test
    public void test16952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16952");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
    }

    @Test
    public void test16953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16953");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        java.lang.String str16 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters20 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters21 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(parameters20);
        org.junit.Assert.assertNull(parameters21);
    }

    @Test
    public void test16954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16954");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNull(provider14);
    }

    @Test
    public void test16955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16955");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
    }

    @Test
    public void test16956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16956");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters16 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(parameters15);
        org.junit.Assert.assertNull(parameters16);
    }

    @Test
    public void test16957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16957");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test16958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16958");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(parameters9);
    }

    @Test
    public void test16959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16959");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
    }

    @Test
    public void test16960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16960");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.Parameters parameters4 = configuration0.getParameters();
        java.lang.String str5 = configuration0.getType();
        java.security.Provider provider6 = configuration0.getProvider();
        configuration0.refresh();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(provider6);
    }

    @Test
    public void test16961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16961");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
    }

    @Test
    public void test16962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16962");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
    }

    @Test
    public void test16963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16963");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
    }

    @Test
    public void test16964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16964");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(parameters14);
    }

    @Test
    public void test16965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16965");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test16966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16966");
        javax.security.auth.login.Configuration configuration0 = javax.security.auth.login.Configuration.getConfiguration();
        configuration0.refresh();
        java.security.Provider provider2 = configuration0.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters3 = configuration0.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters4 = configuration0.getParameters();
        java.lang.String str5 = configuration0.getType();
        javax.security.auth.login.Configuration.setConfiguration(configuration0);
        javax.security.auth.login.Configuration.Parameters parameters7 = configuration0.getParameters();
        java.lang.String str8 = configuration0.getType();
        java.security.Provider provider9 = configuration0.getProvider();
        org.junit.Assert.assertNotNull(configuration0);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(parameters3);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider9);
    }

    @Test
    public void test16967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16967");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str17 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test16968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16968");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(provider15);
    }

    @Test
    public void test16969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16969");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
    }

    @Test
    public void test16970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16970");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(provider11);
    }

    @Test
    public void test16971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16971");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider19 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNull(provider19);
    }

    @Test
    public void test16972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16972");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters4 = kerberosUserConfiguration1.getParameters();
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider15 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(parameters4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(parameters11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(provider15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
    }

    @Test
    public void test16973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16973");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider3 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
    }

    @Test
    public void test16974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16974");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider3 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str14 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(provider3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test16975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16975");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.lang.String str8 = kerberosUserConfiguration1.getType();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test16976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16976");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        javax.security.auth.login.Configuration.Parameters parameters2 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters11 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(parameters2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(parameters11);
    }

    @Test
    public void test16977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16977");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str5 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test16978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16978");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray16 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray16);
    }

    @Test
    public void test16979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16979");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
    }

    @Test
    public void test16980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16980");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test16981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16981");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray7 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider10);
    }

    @Test
    public void test16982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16982");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass13 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test16983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16983");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray13 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray13);
    }

    @Test
    public void test16984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16984");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider14 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str16 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(provider14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test16985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16985");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test16986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16986");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test16987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16987");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.Class<?> wildcardClass11 = appConfigurationEntryArray10.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test16988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16988");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
    }

    @Test
    public void test16989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16989");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters10 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider12 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters14 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters15 = kerberosUserConfiguration1.getParameters();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(parameters10);
        org.junit.Assert.assertNull(provider12);
        org.junit.Assert.assertNull(parameters14);
        org.junit.Assert.assertNull(parameters15);
    }

    @Test
    public void test16990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16990");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
    }

    @Test
    public void test16991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16991");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters5 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider6 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNull(parameters5);
        org.junit.Assert.assertNull(provider6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
    }

    @Test
    public void test16992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16992");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str4 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray12 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.Class<?> wildcardClass13 = appConfigurationEntryArray12.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test16993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16993");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.security.Provider provider7 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.Parameters parameters9 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(provider7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(parameters9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNull(provider13);
    }

    @Test
    public void test16994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16994");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray4 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters8 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        org.junit.Assert.assertNotNull(appConfigurationEntryArray4);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(parameters8);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test16995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16995");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.Parameters parameters6 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray10 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str11 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.Parameters parameters12 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.Configuration.Parameters parameters13 = kerberosUserConfiguration1.getParameters();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.Class<?> wildcardClass17 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(parameters6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(parameters12);
        org.junit.Assert.assertNull(parameters13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test16996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16996");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        kerberosUserConfiguration1.refresh();
        java.lang.Class<?> wildcardClass12 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test16997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16997");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        java.lang.String str3 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        java.lang.String str7 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray9 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider10 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        java.lang.String str13 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray9);
        org.junit.Assert.assertNull(provider10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
    }

    @Test
    public void test16998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16998");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("");
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider4 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.Configuration.Parameters parameters7 = kerberosUserConfiguration1.getParameters();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        java.lang.String str9 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray11 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str12 = kerberosUserConfiguration1.getType();
        java.security.Provider provider13 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray17 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.security.Provider provider18 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(provider4);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(parameters7);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(provider13);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray17);
        org.junit.Assert.assertNull(provider18);
    }

    @Test
    public void test16999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16999");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray5 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str6 = kerberosUserConfiguration1.getType();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray8 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider9 = kerberosUserConfiguration1.getProvider();
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray15 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider17 = kerberosUserConfiguration1.getProvider();
        java.security.Provider provider18 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.Class<?> wildcardClass20 = kerberosUserConfiguration1.getClass();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray8);
        org.junit.Assert.assertNull(provider9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray15);
        org.junit.Assert.assertNull(provider17);
        org.junit.Assert.assertNull(provider18);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test17000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test17000");
        me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration kerberosUserConfiguration1 = new me.prettyprint.cassandra.connection.client.HSaslThriftClient.KerberosUserConfiguration("hi!");
        java.security.Provider provider2 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray6 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        kerberosUserConfiguration1.refresh();
        java.security.Provider provider8 = kerberosUserConfiguration1.getProvider();
        javax.security.auth.login.Configuration.setConfiguration((javax.security.auth.login.Configuration) kerberosUserConfiguration1);
        java.lang.String str10 = kerberosUserConfiguration1.getType();
        java.security.Provider provider11 = kerberosUserConfiguration1.getProvider();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray14 = kerberosUserConfiguration1.getAppConfigurationEntry("");
        java.lang.String str15 = kerberosUserConfiguration1.getType();
        kerberosUserConfiguration1.refresh();
        javax.security.auth.login.AppConfigurationEntry[] appConfigurationEntryArray18 = kerberosUserConfiguration1.getAppConfigurationEntry("hi!");
        java.security.Provider provider19 = kerberosUserConfiguration1.getProvider();
        org.junit.Assert.assertNull(provider2);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray6);
        org.junit.Assert.assertNull(provider8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(provider11);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(appConfigurationEntryArray18);
        org.junit.Assert.assertNull(provider19);
    }
}

